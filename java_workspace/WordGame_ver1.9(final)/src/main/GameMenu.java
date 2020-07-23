package main;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

@SuppressWarnings("serial")
public class GameMenu extends JFrame {

	private ImageIcon btnHMImg = new ImageIcon("src/image/btnHang.png");
	private ImageIcon btnHMEnteredImg = new ImageIcon("src/image/btnHangEntered.png");
	private ImageIcon btnHunminImg = new ImageIcon("src/image/btnHun.png");
	private ImageIcon btnHunminEnteredImg = new ImageIcon("src/image/btnHunEntered.png");
	private ImageIcon btnBackImg = new ImageIcon("src/image/btnBack.png");
	private ImageIcon btnBackEnteredImg = new ImageIcon("src/image/btnBackEntered.png");
	private ImageIcon btnStartImg = new ImageIcon("src/image/btnStart.png");
	private ImageIcon btnStartEnteredImg = new ImageIcon("src/image/btnStartEntered.png");

	private JButton btnHM = new JButton(btnHMImg);
	private JButton btnHunmin = new JButton(btnHunminImg);
	private JButton btnBack = new JButton(btnBackImg);
	private JButton btnGameStart = new JButton(btnStartImg);

	JPanel backP = new JPanel() {
		Image background = new ImageIcon("src/image/gameList.png").getImage();

		public void paint(Graphics g) {// �׸��� �Լ�
			g.drawImage(background, 0, 0, null);
		}
	};
	int gameNum;

	public GameMenu(String name, String nick) {
		super(name);
		backP.setLayout(null);
		backP.setBounds(0, 0, 500, 474);
		setSize(515, 510);
		setLocationRelativeTo(null);
		setLayout(null);

		btnHM.setBounds(100, 124, 305, 93);
		btnHM.setContentAreaFilled(false);
		btnHM.setBorderPainted(false);
		btnHM.setFocusPainted(false);
		btnHM.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) { // ��ǹ�ư�� ���콺 ������ ���콺��� �ո��
				btnHM.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				btnHM.setIcon(btnHMEnteredImg); // ��� Ŭ���ϸ� ��� ��ư�� �ٲ��
				btnHunmin.setIcon(btnHunminImg); // �ƹ����� ��ư ������ ���� ������

				gameNum = 1; // �ƹ����� Ŭ���ϸ� ���ӳѿ� 1����
			}

		});

		addMouseListener(new MouseAdapter() { // �ƹ�����, ��� ��ư ���� �ٸ� �� Ŭ���ϸ� �� ��ư �� ���� ������
			@Override
			public void mouseClicked(MouseEvent e) {
				btnHunmin.setIcon(btnHunminImg);
				btnHM.setIcon(btnHMImg);
				gameNum = 0; // ���ӳ��� 0����
			}
		});
		add(btnHM);

		btnHunmin.setBounds(100, 241, 305, 93);
		btnHunmin.setContentAreaFilled(false);
		btnHunmin.setBorderPainted(false);
		btnHunmin.setFocusPainted(false);
		btnHunmin.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnHunmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			public void mouseClicked(MouseEvent e) { // �ƹ� ��ư Ŭ���ϸ� �ƹι�ư ���� �ٲ�� ��� ��ư ���� �������
				btnHunmin.setIcon(btnHunminEnteredImg);
				btnHM.setIcon(btnHMImg);

				gameNum = 2; // �ƹ� Ŭ���ϸ� ���ӳѿ� 2 ����
				
			}

		});
		add(btnHunmin);

		btnBack.setBounds(30, 15, 65, 65);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBack.setIcon(btnBackEnteredImg);
				btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnBack.setIcon(btnBackImg);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); // ���Ӹ޴� â �ݰ�
				new Menu(); // �޴�â ����
			}
		});
		add(btnBack);

		btnGameStart.setBounds(160, 355, 169, 93);
		btnGameStart.setContentAreaFilled(false);
		btnGameStart.setBorderPainted(false);
		btnGameStart.setFocusPainted(false);
		btnGameStart.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnGameStart.setIcon(btnStartEnteredImg);
				btnGameStart.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				btnGameStart.setIcon(btnStartImg);
			}

			public void mouseClicked(MouseEvent e) {
				System.out.println(gameNum);
				switch (gameNum) {
				case 1:
					// ��� ���� ����
					dispose();
					new hangman.StartHangman().main(null);
					
					new FileWrite().playWrite();
					break;

				case 2:
					// �ƹ����� ���� ����
					dispose();
					new hunminGame.Hun_MainScreen();
					new FileWrite().playWrite();
					break;

				default:
					JOptionPane.showMessageDialog(null, "������ �������ּ���");
					break;
				}
			}

		});
		add(btnGameStart);

		add(backP);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
