package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyInfo extends JFrame {

	JPanel backP = new JPanel() {
		Image background = new ImageIcon("src/image/myInfo.png").getImage();

		public void paint(Graphics g) {// �׸��� �Լ�
			g.drawImage(background, 0, 0, null);
		}
	};
	private ImageIcon btnBackImg = new ImageIcon("src/image/btnBack.png");
	private ImageIcon btnEditImg = new ImageIcon("src/image/btnEdit.png");
	private JButton btnEdit = new JButton(btnEditImg);
	private JButton btnBack = new JButton(btnBackImg);

	public MyInfo() {

		backP.setLayout(null);
		backP.setBounds(0, 0, 560, 560);
		setSize(580, 613);
		setLocationRelativeTo(null);
		setLayout(null);

		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);
		btnBack.setBounds(32, 17, 65, 65);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Menu();
			}
		});

		add(btnBack);
		
		JTextArea hangPlayTF = new JTextArea();
		JTextField hunminPlayTF = new JTextField(10);
		JTextField nickTF = new JTextField(10);
		add(nickTF);
		add(hangPlayTF);
		add(hunminPlayTF);

		nickTF.setText(Login.nickname + "���� ����");
		nickTF.setFont(new Font("����", Font.BOLD, 25));
		nickTF.setForeground(Color.WHITE);
		nickTF.setBorder(null);
		nickTF.setOpaque(false);
		nickTF.setEditable(false);
		String [] hangmanRecord = Member.hangman_record.split("/");
		String str = "";
		for (int j = 0; j < hangmanRecord.length; j++) {
			str += hangmanRecord[j]+"\n";
		}
		hangPlayTF.setText(str);
		hunminPlayTF.setText(
				Member.hunmin_play + "�� " + Member.hunmin_win + "�� " + (Member.hunmin_play - Member.hunmin_win) + "��");
		hangPlayTF.setFont(new Font("����", Font.PLAIN, 15));
		hangPlayTF.setBorder(null);
		hangPlayTF.setOpaque(false);
		hangPlayTF.setEditable(false);
		hunminPlayTF.setFont(new Font("����", Font.PLAIN, 20));
		hunminPlayTF.setBorder(null);
		hunminPlayTF.setOpaque(false);
		hunminPlayTF.setEditable(false);

		nickTF.setBounds(130, 30, 200, 50);
		hangPlayTF.setBounds(100, 200, 350, 100);
		hunminPlayTF.setBounds(100, 400, 300, 30);

		JButton btnClose = new JButton("�ݱ�");
		btnClose.setBounds(350, 600, 100, 50);
		btnEdit.setBounds(450, 30, 60, 60);
		btnEdit.setContentAreaFilled(false);
		btnEdit.setBorderPainted(false);
		btnEdit.setFocusPainted(false);
		add(btnEdit);
		// �����ϱ� ��ư ������ ����
		btnEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ChangeInfo();
			}
		});
		// �ݱ� ��ư ������ ����
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Menu();
			}
		});

		backP.add(btnClose);
//		backP.add(btnEdit);

		add(backP);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}

@SuppressWarnings("serial")
class ChangeInfo extends JFrame {

	JPanel backP = new JPanel() {
		Image background = new ImageIcon("src/image/editBack.jpg").getImage();

		public void paint(Graphics g) {// �׸��� �Լ�
			g.drawImage(background, 0, 0, null);
		}
	};
	
	private ImageIcon btnNickChangeImg = new ImageIcon("src/image/btnEditNick.jpg");
	private ImageIcon btnPWChangeImg = new ImageIcon("src/image/btnChangePW.jpg");
	private ImageIcon btnBackImg = new ImageIcon("src/image/btnBack.png");

	private JButton btnNickChange = new JButton(btnNickChangeImg);
	private JButton btnPwChange = new JButton(btnPWChangeImg);
	private JButton btnBack = new JButton(btnBackImg);
	
	
	public ChangeInfo() {
		backP.setLayout(null);
		backP.setBounds(0, 0, 565, 570);
		setSize(565, 570);
		setLocationRelativeTo(null);
		setLayout(null);

		JTextField nickTF = new JTextField(Login.nickname, 10);
		JPasswordField pwTF = new JPasswordField(10);
		JPasswordField newPwTF = new JPasswordField(10);
		JPasswordField newPwTF2 = new JPasswordField(10);
		nickTF.setFont(new Font("����", Font.PLAIN, 25));

		btnNickChange.setContentAreaFilled(false);
		btnNickChange.setBorderPainted(false);
		btnNickChange.setFocusPainted(false);
		btnPwChange.setContentAreaFilled(false);
		btnPwChange.setBorderPainted(false);
		btnPwChange.setFocusPainted(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);
		
		btnBack.setBounds(32, 17, 65, 65);
		btnNickChange.setBounds(290, 180, 150, 50);
		btnPwChange.setBounds(300, 400, 150, 50);
		nickTF.setBounds(250, 131, 190, 45);
		pwTF.setBounds(250, 250, 190, 45);
		newPwTF.setBounds(250, 300, 190, 45);
		newPwTF2.setBounds(250, 350, 190, 45);

		//////////////////////////////// �г��Ӹ� �ٲٱ�
		btnNickChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �г��� �ߺ� Ȯ��
				boolean A = checkNick(nickTF.getText());

				if (A) {

					for (Member m : Login.memberList) {
						if (m.nickname.equals(Login.nickname)) {
							newNickWrite(nickTF.getText());
							m.nickname = nickTF.getText();
							Login.nickname = nickTF.getText();
							break;
						}
					}

					JOptionPane.showMessageDialog(null, "�г��� ���� �Ϸ�");
				}

			}
		});

		// ��������ư ������ ����
		btnPwChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// ���� ��й�ȣ �´���
				boolean B = false;
				for (Member m : Login.memberList) {
					if (m.nickname.equals(Login.nickname)) {
						String pw = new String(pwTF.getPassword());
						if (m.pw.equals(pw)) {
							B = true;
						}
					}
				}

				// ���ο� ��й�ȣ �� ����ġ�ϴ���
				String newPw = new String(newPwTF.getPassword());
				String newPw2 = new String(newPwTF2.getPassword());
				boolean C = newPw.equals(newPw2);

				if (!B) {
					JOptionPane.showMessageDialog(null, "���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				} else if (!C) {
					JOptionPane.showMessageDialog(null, "���ο� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}

				if (B && C) {

					for (Member m : Login.memberList) {
						if (m.nickname.equals(Login.nickname)) {
							newPwWrite(newPw);
							m.pw = newPw;
							break;
						}
					}

					JOptionPane.showMessageDialog(null, "��й�ȣ ���� �Ϸ�");
				}

			}
		});

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Menu();
			}
		});

		add(nickTF);
		add(pwTF);
		add(newPwTF);
		add(newPwTF2);
		add(btnBack);
		add(btnNickChange);
		add(btnPwChange);
		add(backP);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	void newPwWrite(String pw) {

		try {
			File f = new File("text.txt");
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);

			byte[] _read = new byte[bis.available()];
			bis.read(_read);
			String strRead = new String(_read);
			String[] arRead = strRead.split("\n");
			FileWriter fw = new FileWriter(f);

			for (int i = 0; i < arRead.length; i++) {
				String[] arrRead = arRead[i].split(" ");
				if (arrRead[0].equals(Login.nickname)) {
					for (Member m : Login.memberList) {
						if (m.nickname.equals(Login.nickname)) {
							arRead[i] = m.nickname + " " + m.id + " " + pw + " " 
									+ "hunmin_win:" + Member.hunmin_win 
									+ "hunmin_play:" + Member.hunmin_play + "/"+Member.hangman_record+"\n";
							fw.write(arRead[i]);
							break;
						}
					}

				} else
					fw.write(arRead[i] + "\n");
				System.out.println("else arRead["+i+"] : "+ arRead[i]);
			}

			fw.close();
			bis.close();
			fis.close();

		} catch (Exception E) {
			E.printStackTrace();
		}

	}

	void newNickWrite(String nick) {

		try {
			File f = new File("text.txt");
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);

			byte[] _read = new byte[bis.available()];
			bis.read(_read);
			String strRead = new String(_read);
			String[] arRead = strRead.split("\n");
			FileWriter fw = new FileWriter(f);

			for (int i = 0; i < arRead.length; i++) {
				String[] arrRead = arRead[i].split(" ");
				if (arrRead[0].equals(Login.nickname)) {
					for (Member m : Login.memberList) {
						if (m.nickname.equals(Login.nickname)) {
							arRead[i] = nick + " " + m.id + " " + m.pw + " " 
									+ "hunmin_win:" + Member.hunmin_win 
									+ "hunmin_play:" + Member.hunmin_play + "/"+Member.hangman_record+"\n";
							fw.write(arRead[i]);
							break;
						}
					}

				} else
					fw.write(arRead[i] + "\n");
			}

			fw.close();
			bis.close();
			fis.close();

		} catch (Exception E) {
			E.printStackTrace();
		}

	}

	boolean checkNick(String nick) {
		boolean bN = true;

		if (nick.contains(" ")) {
			JOptionPane.showMessageDialog(null, "�г��� ���� ��� �Ұ�");
			return false;
		}

		if (nick.length() > 6) {
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
				if (arrRead[0].equals(nick)) {
					JOptionPane.showMessageDialog(null, "�̹� ������� �г����Դϴ�.");
					bN = false;

				}
			}

			bis.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bN;

	}
}
