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

	JPanel north = new JPanel(); // Hangman 제목을 넣을 패널
	JPanel center = new JPanel(); // 게임 난이도를 넣을 패널
	JPanel west = new JPanel(); // 주제 선택 스크롤바를 넣을 패널
	JPanel east = new JPanel(); // START와 EXIT를 넣을 패널
	JPanel background; // 배경화면을 넣을 패널
	Toolkit tk = Toolkit.getDefaultToolkit(); // 모니터 해상도를 알기위한 클래스
	ImageIcon backImg; // 배경화면을 넣을 이미지 아이콘

	JButton start = new JButton("START"); // west 패널에 넣을 버튼
	JButton exit = new JButton("EXIT"); // west 패널에 넣을 버튼

	// 테두리 설정
	BevelBorder raisedBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.RAISED);
	BevelBorder loweredBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.LOWERED);

	Border border = BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);

	// 게임 난이도 배열
	String[] gameLevel = { "EASY", "MEDIUM", "HARD" };
	// 난이도 수만큼 라디오 버튼 생성
	JRadioButton[] jrb = new JRadioButton[gameLevel.length];
	// 라이오 버튼을 담을 버튼그룹
	ButtonGroup bg = new ButtonGroup();

	// 게임 주제 배열
	String[] theme = { "Occupations", "Animals & Insects", "Movies", "Countries & Cities", "Vehicles & Transportation",
			"Family", "Famous People" };
	
	// 주제를 담을 list
	JList<String> list;

	public HangmanMainScreen() {
		
		
		// 배경화면 이미지를 생성한다
		backImg = new ImageIcon("src\\image\\mainBackground.jpg");

		// 배경화면을 패널에 그린다
		background = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(backImg.getImage(), 0, 0, null);
				super.paintComponents(g);
			}
		};

		// North : 행맨 타이틀이 들어가는 패널
		JLabel gameTitle = new JLabel("HANGMAN");
		gameTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 70));
		north.setLayout(new FlowLayout(FlowLayout.CENTER));
		north.setBorder(border);
		north.setBackground(Color.WHITE);
		north.setBounds((backImg.getIconWidth() / 2) / 2, 40, backImg.getIconWidth() - 500, 100);
		north.add(gameTitle);

		// Center : 난이도가 들어가는 패널
		for (int i = 0; i < gameLevel.length; i++) {
			if (i == 0) {
				jrb[i] = new JRadioButton(gameLevel[i], true); // true일때 Easy난이도에 선택이 되서 화면에 뜬다
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

		// West : Vector에 게임 주제를 담는다
		Vector<String> themeList = new Vector<>();
		for (int i = 0; i < theme.length; i++) {
			themeList.add(theme[i]);
		}
		list = new JList<>(themeList); // list에 게임 주제를 담는다
		list.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		list.setBorder(border);
		list.setSelectedIndex(0); // 게임 주제 배열의 0번째 인덱스 번호가 선택이 되어 화면에 뜬다

		west.add(new JScrollPane(list)); // west패널에 스크롤바를 더한다
		west.setLayout(new GridLayout());
		west.setBounds(120, 220, 350, 150);
		
		start.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		exit.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		
		// START와 EXIT 버튼 테두리 설정
		start.setBorder(border);
		exit.setBorder(border);
		
		east.add(start);
		east.add(exit);
		east.setBorder(border);
		east.setBackground(Color.WHITE);
		east.setLayout(new GridLayout(2, 0, 0, 0));
		east.setBounds(west.getX() + west.getWidth() + 20, west.getY(), 250, 150);

		// JFrame에 모든 패널들을 더한다
		add(north);
		add(center);
		add(west);
		add(east);
		add(background);

		setTitle("HANGMAN Ver1.0");
		setVisible(true);
		setSize(backImg.getIconWidth(), backImg.getIconHeight() - 100);
		
		// 모니터 해상도 찾기
		Dimension di = tk.getScreenSize();
		int mWidth = di.width;
		int mHeight = di.height;

		// 모니터 중앙 위치 찾기
		int x = mWidth / 2 - getWidth() / 2;
		int y = mHeight / 2 - getHeight() / 2;

		setLocation(x, y);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 이벤트 처리
		start.addActionListener(new ActionListener() { // START버튼이 눌러졌을때 발생하는 이벤트 처리
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 게임 메인창을 없앤다
				for (int i = 0; i < jrb.length; i++) { // 버튼 수만큼 반복한다
					JRadioButton rbtn = jrb[i]; // 버튼 값을 담는 임시 변수
					if (rbtn.isSelected()) { // JRadioButton이 선택이 됐으면 if문에 들어온다
						if (i == 0) { // 0이면 EASY
							new EasyWords((String) list.getSelectedValue());
							// list 목록에서 선택된 값을 Object타입으로 리턴해준다.
							// 게임 주제는 문자열이므로 String으로 강제형변환 시켜서
							// 각각의 게임 난이도 클래스 생성자 인자로 보내준다
						} else if (i == 1) { // 1이면 MEDIUM
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
