package main;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.*;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class Join extends JFrame {

//	Set<String> keyName = Login.user.keySet();

	private ImageIcon btnCheckImg = new ImageIcon("src/image/btnCheck.png");
	private ImageIcon btnCheckEnteredImg = new ImageIcon("src/image/btnCheckEntered.png");
	private ImageIcon btnSignUpImg = new ImageIcon("src/image/btnSignUp.jpg");
	private ImageIcon btnSignUpEnteredImg = new ImageIcon("src/image/btnSignUpEntered.jpg");

	private JButton btnCheck = new JButton(btnCheckImg);
	private JButton btnId = new JButton(btnCheckImg);
	private JButton btnSignUp = new JButton(btnSignUpImg);

	boolean bNick;
	boolean bId;

	JPanel backP = new JPanel() {
		Image background = new ImageIcon("src/image/joinBack2.jpg").getImage();

		public void paint(Graphics g) {// �׸��� �Լ�
			g.drawImage(background, 0, 0, null);// background�� �׷���
		}
	};

	public Join() {
		super("JOIN");
		setLayout(null);
		setBounds(0, 0, 660, 658);
		setLocationRelativeTo(null);
		backP.setLayout(null);
		backP.setBounds(0, 0, 652, 625);

		JTextField inputNickname = new JTextField(10){
			public void setBorder(Border border) {
			}
		};
		
		btnCheck.setContentAreaFilled(false);
		btnCheck.setBorderPainted(false);
		btnCheck.setFocusPainted(false);
		btnCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//üũ��ư�� ���콺 ���� �ٸ� ���� �̹���
				btnCheck.setIcon(btnCheckEnteredImg);
				btnCheck.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCheck.setIcon(btnCheckImg);
			}

			@Override
			public void mouseClicked(MouseEvent e) {	//�г��� ���Է��ϰ� üũ ������ �г����� �Է����ּ��� �߰� �ƴϸ� �г��� �ߺ�Ȯ�θ޼��� ����
				if (inputNickname.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�г����� �Է����ּ���");
					return;
				}
				bNick = checkNickname(inputNickname.getText());
			}

		});
		add(btnCheck);

		inputNickname.addKeyListener(new KeyAdapter() {	//�г��� �Է��ϴ� â���� ���� ������ ��ư �����Ŷ� �Ȱ���
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					if (inputNickname.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "�г����� �Է����ּ���");
						return;
					}
					bNick = checkNickname(inputNickname.getText());
				}
			}
		});

		JTextField inputId = new JTextField(10) {
			public void setBorder(Border border) {
			}
		};

		btnCheck.setBounds(500, 190, 100, 65);	
		btnId.setBounds(500, 260, 100, 65);
		btnId.setContentAreaFilled(false);
		btnId.setBorderPainted(false);
		btnId.setFocusPainted(false);
		btnId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnId.setIcon(btnCheckEnteredImg);
				btnId.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnId.setIcon(btnCheckImg);
				btnId.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (inputId.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���");
					return;
				}
				bId = checkId(inputId.getText());
			}

		});
		add(btnId);

		inputId.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					if (inputId.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���");
						return;
					}
					bId = checkId(inputId.getText());
				}
			}
		});

		JPasswordField inputPw = new JPasswordField(10){
			public void setBorder(Border border) {
			}
		};
		JPasswordField inputCheckPw = new JPasswordField(10) {
			public void setBorder(Border border) {
			}
		};
		
		inputCheckPw.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {	//��� �ι�° �Է��ϰ� ���ʹ����� ���� �޼��� ����
					String passWord = new String(inputPw.getPassword());
					String passWord2 = new String(inputCheckPw.getPassword());
					join(inputNickname.getText(), inputId.getText(), passWord, passWord2);
				}
			}
		});

		btnSignUp.setContentAreaFilled(false);
		btnSignUp.setBorderPainted(false);
		btnSignUp.setFocusPainted(false);
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSignUp.setIcon(btnSignUpEnteredImg);
				btnSignUp.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSignUp.setIcon(btnSignUpImg);
				btnSignUp.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
					String passWord = new String(inputPw.getPassword());
					String passWord2 = new String(inputCheckPw.getPassword());
					join(inputNickname.getText(), inputId.getText(), passWord, passWord2);
			}
		});
		
		add(btnSignUp);
		
		btnSignUp.setBounds(60,480,540,100);
		
		inputNickname.setBounds(230, 212, 250, 40);
		inputId.setBounds(230, 276, 250, 40);
		inputPw.setBounds(230, 341, 250, 40);
		inputCheckPw.setBounds(230, 407, 250, 40);
		inputNickname.setFont(new Font("����", Font.PLAIN, 20));
		inputId.setFont(new Font("����", Font.PLAIN, 20));
		inputPw.setFont(new Font("����", Font.PLAIN, 20));
		inputCheckPw.setFont(new Font("����", Font.PLAIN, 20));
		add(inputNickname);
		add(inputId);
		add(inputPw);
		add(inputCheckPw);
		add(backP);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		new Login();
	}

	boolean checkNickname(String nick) { // �г��� �ߺ� Ȯ��

		boolean bN = true;

		if (nick.contains(" ")) {
			JOptionPane.showMessageDialog(null, "���� ��� �Ұ�");
			return false;
		}
		
		if(nick.length()>6) {
			JOptionPane.showMessageDialog(null, "6�ڸ� ���Ϸ� ������ �ּ���");
			return false;
		}
		
		try {
			FileInputStream fis = new FileInputStream("text.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			byte[] _read = new byte[bis.available()];
			bis.read(_read);
			String strRead = new String(_read);
			String[] arRead = strRead.split("\n"); 
			for (int i = 0; i < arRead.length; i++) {
				String[] arrRead = arRead[i].split(" ");
				if(arrRead[0].equals(nick)) {
				JOptionPane.showMessageDialog(null, "�̹� ������� �г����Դϴ�.");
				bN = false;
				
				}
			}

			bis.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (bN) {
			JOptionPane.showMessageDialog(null, "��밡�ɴг���");
		}
		return bN;
	}

	boolean checkId(String id) { // id�ߺ�Ȯ��
		boolean bId = true;

		if (id.contains(" ")) {
			JOptionPane.showMessageDialog(null, "���� ��� �Ұ�");
			return false;
		}
		
		if(id.length()>6) {
			JOptionPane.showMessageDialog(null, "6�ڸ� ���Ϸ� ������ �ּ���");
			return false;
		}
		
		
		
		try {
			FileInputStream fis = new FileInputStream("text.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			byte[] _read = new byte[bis.available()];
			bis.read(_read);
			String strRead = new String(_read);
			String[] arRead = strRead.split("\n"); 
			for (int i = 0; i < arRead.length; i++) {
				String[] arrRead = arRead[i].split(" ");
				if(arrRead[1].equals(id)) {
				JOptionPane.showMessageDialog(null, "�̹� ������� ���̵��Դϴ�.");
				bId = false;

				
				}
			}

			bis.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if (bId) {
			JOptionPane.showMessageDialog(null, "��� ���� ���̵�");
		}

		return bId;
	}

	void join(String nick, String id, String pw, String pw2) {

		if (!bNick) {
			JOptionPane.showMessageDialog(null, "�г��� �ߺ�Ȯ�� ���ּ���");
			return;
		}
		if (!bId) {
			JOptionPane.showMessageDialog(null, "ID �ߺ�Ȯ�� ���ּ���");
			return;
		}
		if (pw.contains(" ")) {
			JOptionPane.showMessageDialog(null, "��й�ȣ ���� ��� �Ұ�");
			return;
		}
		if (!nick.isEmpty() && !id.isEmpty() && !pw.isEmpty()) {
			if (pw.equals(pw2)) {

				fileOutput(nick, id, pw);
				JOptionPane.showMessageDialog(null, "ȸ������ ����");

				dispose();

			} else {
				JOptionPane.showMessageDialog(null, "��й�ȣ Ȯ��");
			}
		} else {
			JOptionPane.showMessageDialog(null, "������ �� �Է����ּ���");
		}

	}

//	String encrypt(String pw) {	//�Ƚ���
//		String enc_pw = "";
//		for (int i = 0; i < pw.length(); i++) {
//			enc_pw += (char) (pw.charAt(i) / 2);
//		}
//		return enc_pw;
//	}

	@SuppressWarnings("resource")
	void fileOutput(String nick, String id, String pw) {	//�г��� ���̵� ��� ���Ͽ� ����

		try {
			FileOutputStream fos = new FileOutputStream("text.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			String msg = nick + " " + id + " " + pw + " " + "hunmin_win:"+Member.hunmin_win+"hunmin_play:"+Member.hunmin_play+"/"+Member.hangman_record+"\n"; 
			FileInputStream fis = new FileInputStream("text.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			byte[] b = new byte[bis.available()];
			bis.read(b);
			System.out.println(new String(b).trim());
			
			bos.write(msg.getBytes());
			bos.flush();
			bos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
