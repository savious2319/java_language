package hangman;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import main.FileWrite;
import main.Member;

@SuppressWarnings("serial")
public class HangmanMainScreen extends JFrame {

	JPanel north = new JPanel(); // Hangman ������ ���� �г�
	JPanel center = new JPanel(); // ���� ���̵��� ���� �г�
	JPanel west = new JPanel(); // ���� ���� ��ũ�ѹٸ� ���� �г�
	JPanel east = new JPanel(); // START�� EXIT�� ���� �г�
	JPanel background; // ���ȭ���� ���� �г�
	Toolkit tk = Toolkit.getDefaultToolkit(); // ����� �ػ󵵸� �˱����� Ŭ����
	ImageIcon backImg; // ���ȭ���� ���� �̹��� ������

	JButton start = new JButton("START"); // west �гο� ���� ��ư
	JButton exit = new JButton("EXIT"); // west �гο� ���� ��ư

	// �׵θ� ����
	BevelBorder raisedBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.RAISED);
	BevelBorder loweredBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.LOWERED);

	Border border = BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);

	// ���� ���̵� �迭
	String[] gameLevel = { "EASY", "MEDIUM", "HARD" };
	// ���̵� ����ŭ ���� ��ư ����
	JRadioButton[] jrb = new JRadioButton[gameLevel.length];
	// ���̿� ��ư�� ���� ��ư�׷�
	ButtonGroup bg = new ButtonGroup();

	// ���� ���� �迭
	String[] theme = { "Occupations", "Animals & Insects", "Movies", "Countries & Cities", "Vehicles & Transportation",
			"Family", "Famous People" };
	
	// ������ ���� list
	JList<String> list;

	public HangmanMainScreen() {
		
		
		// ���ȭ�� �̹����� �����Ѵ�
		backImg = new ImageIcon("src\\image\\mainBackground.jpg");

		// ���ȭ���� �гο� �׸���
		background = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(backImg.getImage(), 0, 0, null);
				super.paintComponents(g);
			}
		};

		// North : ��� Ÿ��Ʋ�� ���� �г�
		JLabel gameTitle = new JLabel("HANGMAN");
		gameTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 70));
		north.setLayout(new FlowLayout(FlowLayout.CENTER));
		north.setBorder(border);
		north.setBackground(Color.WHITE);
		north.setBounds((backImg.getIconWidth() / 2) / 2, 40, backImg.getIconWidth() - 500, 100);
		north.add(gameTitle);

		// Center : ���̵��� ���� �г�
		for (int i = 0; i < gameLevel.length; i++) {
			if (i == 0) {
				jrb[i] = new JRadioButton(gameLevel[i], true); // true�϶� Easy���̵��� ������ �Ǽ� ȭ�鿡 ���
			} else {
				jrb[i] = new JRadioButton(gameLevel[i], false);
			}
			jrb[i].setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			jrb[i].setBackground(Color.WHITE);
			bg.add(jrb[i]);
			center.add(jrb[i]);

		}
		center.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0));
		int length = (450 - north.getWidth()) / 2;
		center.setBackground(Color.WHITE);
		center.setBorder(border);
		center.setBounds(((backImg.getIconWidth() / 2) / 2) - length, 150, 450, 45);

		// West : Vector�� ���� ������ ��´�
		Vector<String> themeList = new Vector<>();
		for (int i = 0; i < theme.length; i++) {
			themeList.add(theme[i]);
		}
		list = new JList<>(themeList); // list�� ���� ������ ��´�
		list.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		list.setBorder(border);
		list.setSelectedIndex(0); // ���� ���� �迭�� 0��° �ε��� ��ȣ�� ������ �Ǿ� ȭ�鿡 ���

		west.add(new JScrollPane(list)); // west�гο� ��ũ�ѹٸ� ���Ѵ�
		west.setLayout(new GridLayout());
		west.setBounds(120, 220, 350, 150);
		
		start.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		exit.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		
		// START�� EXIT ��ư �׵θ� ����
		start.setBorder(border);
		exit.setBorder(border);
		
		east.add(start);
		east.add(exit);
		east.setBorder(border);
		east.setBackground(Color.WHITE);
		east.setLayout(new GridLayout(2, 0, 0, 0));
		east.setBounds(west.getX() + west.getWidth() + 20, west.getY(), 250, 150);

		// JFrame�� ��� �гε��� ���Ѵ�
		add(north);
		add(center);
		add(west);
		add(east);
		add(background);

		setTitle("HANGMAN Ver1.0");
		setVisible(true);
		setSize(backImg.getIconWidth(), backImg.getIconHeight() - 100);
		
		// ����� �ػ� ã��
		Dimension di = tk.getScreenSize();
		int mWidth = di.width;
		int mHeight = di.height;

		// ����� �߾� ��ġ ã��
		int x = mWidth / 2 - getWidth() / 2;
		int y = mHeight / 2 - getHeight() / 2;

		setLocation(x, y);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// �̺�Ʈ ó��
		start.addActionListener(new ActionListener() { // START��ư�� ���������� �߻��ϴ� �̺�Ʈ ó��
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // ���� ����â�� ���ش�
				for (int i = 0; i < jrb.length; i++) { // ��ư ����ŭ �ݺ��Ѵ�
					JRadioButton rbtn = jrb[i]; // ��ư ���� ��� �ӽ� ����
					if (rbtn.isSelected()) { // JRadioButton�� ������ ������ if���� ���´�
						if (i == 0) { // 0�̸� EASY
							new EasyWords((String) list.getSelectedValue());
							// list ��Ͽ��� ���õ� ���� ObjectŸ������ �������ش�.
							// ���� ������ ���ڿ��̹Ƿ� String���� ��������ȯ ���Ѽ�
							// ������ ���� ���̵� Ŭ���� ������ ���ڷ� �����ش�
						} else if (i == 1) { // 1�̸� MEDIUM
							new MediumWords((String) list.getSelectedValue());
						} else { // HARD
							new HardWords((String) list.getSelectedValue());
						}
					}
				}
			}
		});

		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("totalRecord : \n" + HangmanPlayScreen.totalRecord);
				String gameRecord = HangmanPlayScreen.totalRecord;
				Member.hangman_record = gameRecord;
				new FileWrite().playWrite();
//				HangmanPlayScreen.totalRecord = "";
				dispose();
				new main.Menu();
			}
		});

	}// end of HangmanMainScreen constructor

}// end of class
