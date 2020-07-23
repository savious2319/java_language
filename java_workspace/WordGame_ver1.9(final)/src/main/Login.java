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

		public void paint(Graphics g) {// 그리는 함수
			g.drawImage(background, 0, 0, null);
		}
	};

	private ImageIcon btnLoginImg = new ImageIcon("src/image/btnLogin.png");
	private ImageIcon btnLoginEnteredImg = new ImageIcon("src/image/btnLoginEntered.png");
	private ImageIcon btnJoinImg = new ImageIcon("src/image/btnJoin.png");
	private ImageIcon btnJoinEnteredImg = new ImageIcon("src/image/btnJoinEntered.png");

	private JButton btnLogin = new JButton(btnLoginImg); // 로그인 버튼
	private JButton btnJoin = new JButton(btnJoinImg); // 가입 버튼

	public static String nickname = "";

	void start() {

		setLayout(null);

		backP.setLayout(null);
		backP.setBounds(0, 0, 395, 360);
		setSize(395, 360);
		setLocationRelativeTo(null);

		JTextField inputId = new JTextField("ID", 10) {
			@Override
			public void setBorder(Border border) { // 텍스트필드 테두리 없애기
			}
		};
		inputId.setBounds(90, 87, 200, 50);
		inputId.setFont(new Font("돋움", Font.PLAIN, 18));
		add(inputId);
		inputId.setForeground(Color.GRAY);

		inputId.addKeyListener(new KeyAdapter() { // inputId에 입력이 되면 원래 입력되어 있던 ID가 없어지고 새로운 글자 검정색으로 입력되게
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
		inputPw.setFont(new Font("돋움", Font.PLAIN, 18));
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
				if (e.getKeyChar() == KeyEvent.VK_ENTER) { // 패스워드 입력창에서 엔터치면 로그인
					String password = new String(inputPw.getPassword());
					login(inputId.getText(), password);
				}
			}
		});

		btnLogin.setBounds(42, 217, 300, 50); // 로그인 버튼

		btnLogin.setContentAreaFilled(false); // 그냥 배경색이랑 테두리 없앤거
		btnLogin.setBorderPainted(false);
		btnLogin.setFocusPainted(false);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogin.setIcon(btnLoginEnteredImg); // 로그인 버튼에 마우스 들어가면 버튼 색 바뀌고 마우스 커서 손모양
				btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) { // 로그인 버튼에 마우스 빠지면 원래 버튼 이미지
				btnLogin.setIcon(btnLoginImg);
			}

			@Override
			public void mouseClicked(MouseEvent e) { // 로그인 버튼 클릭하면 로그인 메서드 실행
				String password = new String(inputPw.getPassword());
				login(inputId.getText(), password);
			}
		});
		add(btnLogin);

		btnJoin.setBounds(140, 290, 100, 35); // 가입 버튼
		btnJoin.setContentAreaFilled(false);
		btnJoin.setBorderPainted(false);
		btnJoin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) { // 조인 버튼에 마우스 들어가면 조인 글자이미지 바뀌게하고 마우스 손모양
				btnJoin.setIcon(btnJoinEnteredImg);
				btnJoin.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) { // 마우스 빠지면 원래 조인버튼 이미지
				btnJoin.setIcon(btnJoinImg);
			}

			@Override
			public void mouseClicked(MouseEvent e) { // 조인 버튼 클릭하면 새로운 가입 창 띄우기
				new Join();
			}

		});
		add(btnJoin);

		add(backP);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void login(String id, String pw) { // 로그인 함수

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
					JOptionPane.showMessageDialog(null, m.nickname + "님 환영합니다.");
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
			JOptionPane.showMessageDialog(null, "ID or PW를 확인해주세요");
		}

	}

//	String decrypt(String pw) { // 안썼음
//
//		String dec_pw = "";
//		for (int i = 0; i < pw.length(); i++) {
//			dec_pw += (char) (pw.charAt(i) * 2);
//		}
//
//		return dec_pw;
//	}

}