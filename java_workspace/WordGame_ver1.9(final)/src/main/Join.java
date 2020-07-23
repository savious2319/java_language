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

		public void paint(Graphics g) {// 그리는 함수
			g.drawImage(background, 0, 0, null);// background를 그려줌
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
			public void mouseEntered(MouseEvent e) {	//체크버튼에 마우스 들어가면 다른 색깔 이미지
				btnCheck.setIcon(btnCheckEnteredImg);
				btnCheck.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCheck.setIcon(btnCheckImg);
			}

			@Override
			public void mouseClicked(MouseEvent e) {	//닉네임 안입력하고 체크 누르면 닉네임을 입력해주세요 뜨고 아니면 닉네임 중복확인메서드 실행
				if (inputNickname.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "닉네임을 입력해주세요");
					return;
				}
				bNick = checkNickname(inputNickname.getText());
			}

		});
		add(btnCheck);

		inputNickname.addKeyListener(new KeyAdapter() {	//닉네임 입력하는 창에서 엔터 누르면 버튼 누른거랑 똑같이
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					if (inputNickname.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "닉네임을 입력해주세요");
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
					JOptionPane.showMessageDialog(null, "아이디를 입력해주세요");
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
						JOptionPane.showMessageDialog(null, "아이디를 입력해주세요");
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
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {	//비번 두번째 입력하고 엔터누르면 조인 메서드 실행
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
		inputNickname.setFont(new Font("돋움", Font.PLAIN, 20));
		inputId.setFont(new Font("돋움", Font.PLAIN, 20));
		inputPw.setFont(new Font("돋움", Font.PLAIN, 20));
		inputCheckPw.setFont(new Font("돋움", Font.PLAIN, 20));
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

	boolean checkNickname(String nick) { // 닉네임 중복 확인

		boolean bN = true;

		if (nick.contains(" ")) {
			JOptionPane.showMessageDialog(null, "공백 사용 불가");
			return false;
		}
		
		if(nick.length()>6) {
			JOptionPane.showMessageDialog(null, "6자리 이하로 설정해 주세요");
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
				JOptionPane.showMessageDialog(null, "이미 사용중인 닉네임입니다.");
				bN = false;
				
				}
			}

			bis.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (bN) {
			JOptionPane.showMessageDialog(null, "사용가능닉네임");
		}
		return bN;
	}

	boolean checkId(String id) { // id중복확인
		boolean bId = true;

		if (id.contains(" ")) {
			JOptionPane.showMessageDialog(null, "공백 사용 불가");
			return false;
		}
		
		if(id.length()>6) {
			JOptionPane.showMessageDialog(null, "6자리 이하로 설정해 주세요");
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
				JOptionPane.showMessageDialog(null, "이미 사용중인 아이디입니다.");
				bId = false;

				
				}
			}

			bis.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if (bId) {
			JOptionPane.showMessageDialog(null, "사용 가능 아이디");
		}

		return bId;
	}

	void join(String nick, String id, String pw, String pw2) {

		if (!bNick) {
			JOptionPane.showMessageDialog(null, "닉네임 중복확인 해주세요");
			return;
		}
		if (!bId) {
			JOptionPane.showMessageDialog(null, "ID 중복확인 해주세요");
			return;
		}
		if (pw.contains(" ")) {
			JOptionPane.showMessageDialog(null, "비밀번호 공백 사용 불가");
			return;
		}
		if (!nick.isEmpty() && !id.isEmpty() && !pw.isEmpty()) {
			if (pw.equals(pw2)) {

				fileOutput(nick, id, pw);
				JOptionPane.showMessageDialog(null, "회원가입 성공");

				dispose();

			} else {
				JOptionPane.showMessageDialog(null, "비밀번호 확인");
			}
		} else {
			JOptionPane.showMessageDialog(null, "정보를 다 입력해주세요");
		}

	}

//	String encrypt(String pw) {	//안썼음
//		String enc_pw = "";
//		for (int i = 0; i < pw.length(); i++) {
//			enc_pw += (char) (pw.charAt(i) / 2);
//		}
//		return enc_pw;
//	}

	@SuppressWarnings("resource")
	void fileOutput(String nick, String id, String pw) {	//닉네임 아이디 비번 파일에 저장

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
