package main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class Login extends JFrame {
	static ArrayList<Member> memberList = new ArrayList<>();

	public Login() {
		super("MINI GAME");
	}

	JPanel backP = new JPanel() {
		Image background = new ImageIcon("src/image/background.PNG").getImage();

		public void paint(Graphics g) {// �׸��� �Լ�
			g.drawImage(background, 0, 0, null);
		}
	};

	private ImageIcon btnLoginImg = new ImageIcon("src/image/btnLogin.png");
	private ImageIcon btnLoginEnteredImg = new ImageIcon("src/image/btnLoginEntered.png");
	private ImageIcon btnJoinImg = new ImageIcon("src/image/btnJoin.png");
	private ImageIcon btnJoinEnteredImg = new ImageIcon("src/image/btnJoinEntered.png");

	private JButton btnLogin = new JButton(btnLoginImg); // �α��� ��ư
	private JButton btnJoin = new JButton(btnJoinImg); // ���� ��ư

	public static String nickname = "";

	void start() {

		setLayout(null);

		backP.setLayout(null);
		backP.setBounds(0, 0, 395, 360);
		setSize(395, 360);
		setLocationRelativeTo(null);

		JTextField inputId = new JTextField("ID", 10) {
			@Override
			public void setBorder(Border border) { // �ؽ�Ʈ�ʵ� �׵θ� ���ֱ�
			}
		};
		inputId.setBounds(90, 87, 200, 50);
		inputId.setFont(new Font("����", Font.PLAIN, 18));
		add(inputId);
		inputId.setForeground(Color.GRAY);

		inputId.addKeyListener(new KeyAdapter() { // inputId�� �Է��� �Ǹ� ���� �ԷµǾ� �ִ� ID�� �������� ���ο� ���� ���������� �Էµǰ�
			@Override
			public void keyTyped(KeyEvent e) {
				inputId.setText("");
				inputId.setForeground(Color.BLACK);
				inputId.removeKeyListener(this);
			}
		});
		
		
		
		
		JPasswordField inputPw = new JPasswordField("PASSWORD", 10) {
			@Override
			public void setBorder(Border border) {
			}
		};
		inputPw.setFont(new Font("����", Font.PLAIN, 18));
		inputPw.setBounds(90, 155, 200, 50);
		add(inputPw);
		inputPw.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				inputPw.setForeground(Color.BLACK);
				inputPw.setText("");
				inputPw.removeKeyListener(this);
			}
		});
		inputPw.setForeground(Color.GRAY);

		inputPw.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) { // �н����� �Է�â���� ����ġ�� �α���
					String password = new String(inputPw.getPassword());
					login(inputId.getText(), password);
				}
			}
		});

		btnLogin.setBounds(42, 217, 300, 50); // �α��� ��ư

		btnLogin.setContentAreaFilled(false); // �׳� �����̶� �׵θ� ���ذ�
		btnLogin.setBorderPainted(false);
		btnLogin.setFocusPainted(false);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogin.setIcon(btnLoginEnteredImg); // �α��� ��ư�� ���콺 ���� ��ư �� �ٲ�� ���콺 Ŀ�� �ո��
				btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) { // �α��� ��ư�� ���콺 ������ ���� ��ư �̹���
				btnLogin.setIcon(btnLoginImg);
			}

			@Override
			public void mouseClicked(MouseEvent e) { // �α��� ��ư Ŭ���ϸ� �α��� �޼��� ����
				String password = new String(inputPw.getPassword());
				login(inputId.getText(), password);
			}
		});
		add(btnLogin);

		btnJoin.setBounds(140, 290, 100, 35); // ���� ��ư
		btnJoin.setContentAreaFilled(false);
		btnJoin.setBorderPainted(false);
		btnJoin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) { // ���� ��ư�� ���콺 ���� ���� �����̹��� �ٲ���ϰ� ���콺 �ո��
				btnJoin.setIcon(btnJoinEnteredImg);
				btnJoin.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) { // ���콺 ������ ���� ���ι�ư �̹���
				btnJoin.setIcon(btnJoinImg);
			}

			@Override
			public void mouseClicked(MouseEvent e) { // ���� ��ư Ŭ���ϸ� ���ο� ���� â ����
				new Join();
			}

		});
		add(btnJoin);

		add(backP);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void login(String id, String pw) { // �α��� �Լ�

		boolean login = false;

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
					memberList.add(new Member(arrRead[0], arrRead[1], arrRead[2]));
					break;
				}
			}

			bis.close();
			fis.close();

		} catch (Exception e) {e.printStackTrace();}
		
		for (Member m : memberList) {
			if (m.id.equals(id)) {
				if (m.pw.equals(pw)) {
					JOptionPane.showMessageDialog(null, m.nickname + "�� ȯ���մϴ�.");
					login = true;
					dispose();
					nickname = m.nickname;
					new FileWrite().setNum();
					new Menu();
					break;
				}

			}
		}

		if (!login) {
			JOptionPane.showMessageDialog(null, "ID or PW�� Ȯ�����ּ���");
		}

	}

//	String decrypt(String pw) { // �Ƚ���
//
//		String dec_pw = "";
//		for (int i = 0; i < pw.length(); i++) {
//			dec_pw += (char) (pw.charAt(i) * 2);
//		}
//
//		return dec_pw;
//	}

}