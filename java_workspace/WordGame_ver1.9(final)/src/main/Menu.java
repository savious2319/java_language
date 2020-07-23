package main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

@SuppressWarnings("serial")
public class Menu extends JFrame {

	private ImageIcon btnLogoutImg = new ImageIcon("src/image/btnLogout.png");
	private ImageIcon btnLogoutEnteredImg = new ImageIcon("src/image/btnLogoutEntered.png");
	private ImageIcon btnGameImg = new ImageIcon("src/image/btnGame.png");
	private ImageIcon btnGameEnteredImg = new ImageIcon("src/image/btnGameEntered.jpg");
	private ImageIcon btnMyInfoImg = new ImageIcon("src/image/btnMyInfo.png");
	private ImageIcon btnMyInfoEnteredImg = new ImageIcon("src/image/btnMyInfoEntered.jpg");

	private JButton btnInfo = new JButton(btnMyInfoImg);
	private JButton btnShowGame = new JButton(btnGameImg);
	private JButton btnLogout = new JButton(btnLogoutImg);
	private JTextField nick = new JTextField();

	JPanel backP = new JPanel() {
		Image background = new ImageIcon("src/image/menuBack.png").getImage();

		public void paint(Graphics g) {// 그리는 함수
			g.drawImage(background, 0, 0, null);
		}
	};

	public Menu() {
		backP.setLayout(null);
		backP.setBounds(0, 0, 500, 474);
		setSize(515, 510);
		setLocationRelativeTo(null);
		setLayout(null);

		nick.setText(Login.nickname + "님"); // 화면에 닉네임님이라고 나오게
		nick.setFont(new Font("돋움", Font.BOLD, 25));
		nick.setForeground(Color.WHITE);
		nick.setBorder(null);
		nick.setOpaque(false);
		nick.setBounds(350, 40, 150, 30);
		nick.setEditable(false);

		btnLogout.setBounds(30, 28, 48, 48);
		btnLogout.setContentAreaFilled(false);
		btnLogout.setBorderPainted(false);
		btnLogout.setFocusPainted(false);
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogout.setIcon(btnLogoutEnteredImg);
				btnLogout.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnLogout.setIcon(btnLogoutImg);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "정말 로그아웃 하시겠습니까?", "LOG OUT",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					Member.hangman_record = "";
					Member.hunmin_play = 0;
					dispose();
					new Login().start();
				}
			}

		});

		btnInfo.setBounds(100, 150, 305, 93);
		btnInfo.setContentAreaFilled(false);
		btnInfo.setBorderPainted(false);
		btnInfo.setFocusPainted(false);
		btnInfo.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnInfo.setIcon(btnMyInfoEnteredImg);
				btnInfo.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				btnInfo.setIcon(btnMyInfoImg);
			}
			public void mouseClicked(MouseEvent e) {
				dispose();
				new MyInfo();
			
			}
		});
		
		
		
		btnShowGame.setBounds(100, 280, 305, 93);
		btnShowGame.setContentAreaFilled(false);
		btnShowGame.setBorderPainted(false);
		btnShowGame.setFocusPainted(false);
		btnShowGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnShowGame.setIcon(btnGameEnteredImg);
				btnShowGame.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnShowGame.setIcon(btnGameImg);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new GameMenu("Game Select", Login.nickname);
			}

		});

		add(btnInfo);
		add(btnShowGame);
		add(nick);
		add(btnLogout);
		add(backP);

		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}


}
