package hangman;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class HangmanPlayScreen extends JFrame implements ActionListener {
	JPanel background;
	JPanel north1 = new JPanel(); // 게임 주제를 담을 패널
	JPanel north2 = new JPanel(); // 점수를 담을 패널
	JPanel south1 = new JPanel(); // 키보드 문자 A~R까지 담을 패널
	JPanel south2 = new JPanel(); // 키보드 문자 S~Z까지 담을 패널
	JPanel south3 = new JPanel(); // 뒤로가기 버튼을 담을 패널
	JPanel south4 = new JPanel(); // 다음 단어가 나오는 버튼을 담을 패널
	JPanel wordPanel; // 단어의 수만큼 밑줄을 담을 패널
	JPanel gameImage = new JPanel(); // 틀리거나 문제를 맞추때 띄워줄 사진 담을 패널
	JPanel east1 = new JPanel(); // 단어 알파벳 힌트를 알려줄 레이블을 담을 패널
	JPanel east2 = new JPanel(); // 단어 힌트를 누르는 버튼을 담을 패널

	JButton next = new JButton("Next Word");
	JButton backToMain = new JButton("Go Back"); // 뒤로가기 버튼 생성
	JButton hintBtn = new JButton("Hint");
	JButton[] jb1 = new JButton[18]; // 키보드 문자 A~R까지 담을 버튼
	JButton[] jb2 = new JButton[8]; // 키보드 문자 S~Z까지 담을 버튼
	JLabel[] lineLabel; // 단어 수 만큼 밑줄을 담을 레이블
	JLabel imgBox; // 틀리거나 문제를 맞췄을때 담을 레이블
	JLabel themeLabel; // 게임 주제를 담을 레이블
	JLabel wordHint; // 다이아몬드 이미지를 담을 레이블
	JLabel hintCount; // 다이아몬드 개수를 담을 레이블
	JLabel score; // 점수를 담을 레이블

	ImageIcon[] img; // 틀릴때마다 나오는 사진 담을 이미지아이콘 배열
	ImageIcon gameBackground; // 게임창 배경을 담을 이미지아이콘
	ImageIcon diamond; // 단어 알파벳 힌트 알려주는 이미지아이콘

	Toolkit tk = Toolkit.getDefaultToolkit(); // 모니터 해상도 알기위한 클래스

	String[] alphabet1 = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R" };
	String[] alphabet2 = { "S", "T", "U", "V", "W", "X", "Y", "Z" };

	// 테두리 설정
	BevelBorder raisedBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.RAISED);
	BevelBorder loweredBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.LOWERED);

	Border border = BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);

	String[] definitionList; // 게임 단어풀이 배열
	String[] wordList; // 게임 단어 배열
	String word; // 문제 단어
	String wordMeaning; // 문제 단어 풀이
	static String selectedTheme; // 선택된 게임 주제
	static String selectedLevel; // 선택된 게임 난이도
	int cnt; // 맞는 알파벳을 선택했는지 아닌지 구별하려고 만든 변수. 맞으면 cnt가 증감되고 아니면 계속 0이다
	int imageCnt; // 틀린 알파벳 선택시 누적이되서 순서대로 사진이 보여질 수 있게하기위해 만든 변수
	static int scoreCnt; // 점수를 카운트하는 변수
	Random r = new Random(); // Random() 메서드 객체
	int questionNum; // 그 다음 단어의 인덱스 번호가 나올 수 있게 하는 변수
	int hintNum; // 힌트의 수를 저장하는 변수
	int[] rHintNum; // hintNum 수만큼 저장하는 배열
	public static String playerRecord;
	public static String totalRecord = "";
	
	public HangmanPlayScreen() {}
	
	public HangmanPlayScreen(String[] gameWords, String[] wordDefinitions, String theme, String gameLevel) {
		

		System.out.println("Hangman playScreen 생성자에 들어옴\n");

		// 매개변수로 받은 게임단어 배열 수 만큼 문자열 배열 생성
		wordList  = new String[gameWords.length];

		// 매개변수로 받은 게임 단어 뜻 수 만큼 문자열 배열 생성
		definitionList = new String[wordDefinitions.length];

		// 매개변수로 받은 게임단어 배열을 wordList 배열에 대입
		for (int i = 0; i < gameWords.length; i++) {
			wordList[i] = gameWords[i];
		}

		// 매개변수로 받은 게임단어 뜻 배열을 definitionList 배열에 대입
		for (int i = 0; i < wordDefinitions.length; i++) {
			definitionList[i] = wordDefinitions[i];
		}

		// 사용자가 선택한 주제의 단어들이 잘 넘어왔는지 확인
		for (int i = 0; i < gameWords.length; i++) {
			System.out.println("gameWords : " + gameWords[i]);
		}

		// 선택한 게임 난이도를 전역변수 selectedLevel에 대입하기
		selectedLevel = gameLevel;

		// 선택한 게임 주제를 전역변수 selectedTheme에 대입하기
		selectedTheme = theme;

		System.out.println("Hangman playScreen 생성장 questionNum : " + questionNum);

		// gameWords[인덱스 번호 0] 부터 시작한다
		word = gameWords[questionNum];

		// wordDefinitions[인덱스 번호 0] 부터 시작한다
		wordMeaning = wordDefinitions[questionNum];

		// 게임창 배경화면 설정
		gameBackground = new ImageIcon("src\\image\\gameBackground.jpg");

		background = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {

				g.drawImage(gameBackground.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		background.setLayout(null);

		// 이미지를 담을 레이블 인스턴스
		imgBox = new JLabel();

		// 틀릴때 나올 이미지 img배열 인스턴스
		img = new ImageIcon[10];

		img[0] = new ImageIcon("src\\image\\hangman1.png");

		img[1] = new ImageIcon("src\\image\\hangman2.png");

		img[2] = new ImageIcon("src\\image\\hangman3.png");

		img[3] = new ImageIcon("src\\image\\hangman4.png");

		img[4] = new ImageIcon("src\\image\\hangman5.png");

		img[5] = new ImageIcon("src\\image\\hangman6.png");

		img[6] = new ImageIcon("src\\image\\hangman7.png");

		img[7] = new ImageIcon("src\\image\\hangman8.png");

		img[8] = new ImageIcon("src\\image\\hangman9.png");

		img[9] = new ImageIcon("src\\image\\hangman10.png");

		// 배경화면 위에 추가할 패널 메서드 호출
		setWordPanel(); // 단어를 보여주는 패널
		setThemePanel(); // 난이도와 주제를 보여주는 패널
		setAlphabetPanel(); // 알파벳 키보드 버튼 패널
		setBackButtonPanel(); // 뒤로가기 버튼 패널
		setNextButton(); // 다음 단어 버튼 패널
		setDiamondPanel(); // 몇개 힌트가 있는지 보여주는 패널
		setHintPanel(); // 힌트 버튼 패널
		setScorePanel(); // 점수를 보여주는 패널

		// 배경화면에 위에 호출한 패널들 추가
		background.add(north1); // 주제를 보여주는 패널
		background.add(north2); // 점수를 보여주는 패널
		background.add(south1); // A ~ R 키보드 자판
		background.add(south2); // S ~ Z 키보드 자판
		background.add(south3); // 뒤로가기 버튼
		background.add(south4); // 다음 단어나오게 할 버튼
		background.add(east1); // 단어 힌트 다이아몬드
		background.add(east2); // 단어 힌트보고 싶을때 누르는 버튼
		background.add(wordPanel); // _ _ _ _ 단어 패널

		// 프레임에 배경화면 추가
		add(background);
		int mainFrameWidth = wordPanel.getX() + wordPanel.getWidth() + 5;
		int space = mainFrameWidth - (wordPanel.getWidth());
		setSize(mainFrameWidth + space, 950);

		// 모니터 해상도 찾기
		Dimension di = tk.getScreenSize();
		int mWidth = di.width;
		int mHeight = di.height;

		// 모니터 중앙 위치 찾기
		int x = mWidth / 2 - getWidth() / 2;
		int y = mHeight / 2 - getHeight() / 2;

		// 프레임 위치
		setLocation(x, y);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Go Back 버튼 눌렀을때 이벤트 처리
		backToMain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playerRecord = "난이도: "+selectedLevel + " " + "주제: "+selectedTheme + " " + "점수: "+scoreCnt + "점";
				System.out.println("scoreCnt : " + scoreCnt);
				System.out.println("playerRecord : \n" + playerRecord);
//				totalRecord += playerRecord + "\n";
				totalRecord += playerRecord + "/";
				scoreCnt = 0;
				questionNum = 0;
				hintNum = 0;
				dispose();
				new HangmanMainScreen();
			}
		});

		// Next 버튼 눌렀을때 이벤트 처리
		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				questionNum++;
				if (questionNum < gameWords.length) {
					word = gameWords[questionNum];
					wordMeaning = wordDefinitions[questionNum];
					System.out.println("next button pressed");
					System.out.println("questionNum : " + questionNum);
					getContentPane().removeAll();
					refreshAlphabets();
					setWordPanel();
					if (hintNum != 0) {
						getRandomHintNumber();
						hintBtn.setEnabled(true);
					}
					refreshGameImage();
					setDiamondPanel();
					refreshBackground();
					background.add(south1); // A ~ R
					background.add(south2); // S ~ Z
					background.add(north1); // Theme
					background.add(north2); // Score
					background.add(south3); // Go Back
					background.add(south4); // Next Word
					background.add(east1); // Diamond, Hint Number
					background.add(east2); // Hint Button
					background.add(wordPanel); // _ _ _ _ _ _ 단어
					getContentPane().add(background);
					revalidate();
					repaint();
					imageCnt = 0;
					System.out.println("next ActionListener() word : " + word);
					System.out.println();
				} else if (questionNum == gameWords.length) { // questionNum이 단어 개수와 같을때 questionNum과 hintNum을 0으로 초기화
					showEndOfWordsMessage();
					playerRecord = "난이도: "+selectedLevel + " " + "주제: "+selectedTheme + " " + "점수: "+scoreCnt + "점";
					System.out.println("scoreCnt : " + scoreCnt);
					System.out.println("playerRecord : \n" + playerRecord);
//					totalRecord += playerRecord + "\n";
					totalRecord += playerRecord + "/";
					scoreCnt = 0;
					questionNum = 0;
					hintNum = 0;
					dispose();
					new HangmanMainScreen();
				}
			}
		});

		// Hint 버튼 눌렀을때 이벤트 처리
		hintBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("메서드에 들어왔을 때 hintNum : " + hintNum);
				System.out.println("hint ActionListener word: " + word);

				if (hintNum >= 0) {
					hintNum--;
					hintCount.setText(String.format("%d", hintNum));
					// 단어수가 3개 또는 그 이하면 힌트를 한번만 쓸 수 있다
					if (word.length() <= 3) {
						hintBtn.setEnabled(false);
					}
					System.out.println("if문에 들어왔을 때 hintNum : " + hintNum);
					
					String total = ""; //문제 단어를 누적해서 저장할 문자열 변수
					
					// word.charAt(인덱스 번호)의 문자와 word.charAt(rHintNum[hintNum])의 문자가 매칭되면 lineLable[i]를 그 문자로 바꿔준다
					
					for (int i = 0; i < word.length(); i++) {
						total += (String.valueOf(word.charAt(i)));
						if (String.valueOf(word.charAt(i))
								.equalsIgnoreCase(String.valueOf(word.charAt(rHintNum[hintNum])))) {
							lineLabel[i].setText(String.valueOf(word.charAt(i)));
						}
					}
					
					System.out.println("total : " + total);
					
					String totalLine = ""; //사용자가 선택한 알파벳을 누적할 문자열 변수 
					for (int i = 0; i < lineLabel.length; i++) {
						totalLine += lineLabel[i].getText();
					}
					System.out.println("totalLine : " + totalLine);

					if (total.equalsIgnoreCase(totalLine)) {
						// 단어를 맞췄을때 나오는 사진
						imgBox.setIcon(img[9]); // 라벨에 이미지를 넣다
						gameImage.add(imgBox); // 페널에 라벨을 넣다
						background.add(gameImage); // 프레임에 페널을 넣다
						gameImage.setLayout(new FlowLayout(FlowLayout.CENTER));
						gameImage.setBounds(100, 80, wordPanel.getWidth(), 550);
						gameImage.setBackground(Color.WHITE);
						gameImage.setBorder(border);
						gameImage.setVisible(true);
						setVisible(true);
						hintNum++;
						hintCount.setText(String.format("%d", hintNum));
						scoreCnt++; // 단어를 맞추면 점수가 1점 추가된다
						//playerRecord += " " + scoreCnt;
						score.setText("SCORE " + scoreCnt + "/" + wordList.length);
						if (scoreCnt > 0) {
							hintBtn.setEnabled(false); // 해당 문제를 맞춘 창에서는 Hint 버튼을 비활성화 한다
						}

						// 게임이 종료된 이후 알파벳 키보드 ActionListener 기능 삭제
						for (int i = 0; i < alphabet1.length; i++) {
							jb1[i].removeActionListener(this);
						}

						for (int i = 0; i < alphabet2.length; i++) {
							jb2[i].removeActionListener(this);
						}

						showCorrectWordsMessage();
					}

					// hint를 눌러서 나온 알파벳을 비활성화 한다
					for (int i = 0; i < jb1.length; i++) {
						if (String.valueOf(word.charAt(rHintNum[hintNum]))
								.equalsIgnoreCase(String.valueOf(jb1[i].getText()))) {
							jb1[i].setEnabled(false);
						}
					}
					for (int i = 0; i < jb2.length; i++) {
						if (String.valueOf(word.charAt(rHintNum[hintNum]))
								.equalsIgnoreCase(String.valueOf(jb2[i].getText()))) {
							jb2[i].setEnabled(false);
						}
					}
				}

				if (hintNum == 0) {
					hintBtn.setEnabled(false);
				}
			}
		});

	} // end of constructor


	// 게임 단어를 전부 다 클리어 했을때 나오는 메세지
	public void showEndOfWordsMessage() {
		JOptionPane.showMessageDialog(this, "You've reached the end of " + selectedTheme
				+ " words.\n Please click 확인 to return to the main screen.");
	}

	public void showCorrectWordsMessage() {
		JOptionPane.showMessageDialog(this, "Good Job!\n단어 풀이 : " + wordMeaning);
	}

	// 배경화면 초기화
	public void refreshBackground() {
		background.removeAll();
	}

	// 알파벳 키보드 초기화
	public void refreshAlphabets() {

		// 키보드 패널 삭제
		south1.removeAll();
		south2.removeAll();

		// 키보드 패널 재배치
		for (int i = 0; i < alphabet1.length; i++) {
			jb1[i] = new JButton(alphabet1[i]);
			jb1[i].setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			jb1[i].setBorder(border);
			jb1[i].addActionListener(this);
			south1.add(jb1[i]);
		}
		south1.setLayout(new GridLayout(2, 8, 0, 0));
		south1.setBounds(wordPanel.getX(), 750, 450, 100);

		// 알파벳 S~Z 키보드 배치
		for (int i = 0; i < alphabet2.length; i++) {
			jb2[i] = new JButton(alphabet2[i]);
			jb2[i].setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			jb2[i].setBorder(border);
			jb2[i].addActionListener(this);
			south2.add(jb2[i]);
		}
		int button = (south1.getWidth() / 9) / 2;
		south2.setLayout(new GridLayout(1, 5, 0, 0));
		south2.setBounds(south1.getX() + button, south1.getY() + south1.getHeight(), 400, south1.getHeight() / 2);
	}

	// 게임 사진 초기화
	public void refreshGameImage() {
		System.out.println("refreshGameImage()에 들어옴");

		// 게임 사진 삭제
		gameImage.removeAll();
		gameImage.setVisible(false);
	}

	// 힌트에 들어갈 랜덤한 인덱스 번호 뽑기
	public void getRandomHintNumber() {

		HashSet<Integer> set = new HashSet<>();

		System.out.println("getRandomHintNumber()의 hintNum : " + hintNum);
		System.out.println("getRandomHintNumber()의 word : " + word);

		// 단어의 수중에서 hintNum 갯수만큼 랜덤하게 숫자를 뽑아 set에 추가한다
		while (true) {
			if (hintNum > word.length()) {
				break;
			}
			set.add(r.nextInt(word.length()));
			if (set.size() == hintNum) {
				break;
			}
		}

		// 추가된 숫자를 rNum배열에 넣는다
		Iterator<Integer> iter = set.iterator();

		// hintNum의 수만큼 rHintNum 배열 생성
		rHintNum = new int[hintNum];

		for (int i = 0; i < set.size(); i++) {
			if (iter.hasNext()) {
				rHintNum[i] = iter.next();
			}
			// rHintNum에 들어간 수 확인
			System.out.println("rHintNum : " + rHintNum[i]);
		}
	}

	// 알파벳 키보드 버튼을 눌렀을때 나오는 오디오 메서드
	public void playSound(String soundName) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("audio\\" + soundName));
			// AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new
			// File(soundName).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

	// 단어가 나올 패널
	public void setWordPanel() {
		System.out.println("setWordPanel()에 들어옴");
		System.out.println("setWordPanel() word : " + word);

		wordPanel = new JPanel();

		// 단어 수만큼 밑줄이 나올 수 있는 패널 배치
		lineLabel = new JLabel[word.length()];
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				lineLabel[i] = new JLabel("   ");
				lineLabel[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
				lineLabel[i].setVisible(true);
				wordPanel.add(lineLabel[i]);

			} else {
				lineLabel[i] = new JLabel("__ ");
				lineLabel[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
				lineLabel[i].setVisible(true);
				wordPanel.add(lineLabel[i]);

			}
		}

		wordPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		wordPanel.setBackground(Color.WHITE);
		wordPanel.setBounds(100, 660, 1200, 70);
		wordPanel.setBorder(border);

	}

	// 점수가 나올 패널
	public void setScorePanel() {
		// 점수를 보여주는 패널 배치
		score = new JLabel("SCORE " + scoreCnt + "/" + wordList.length);
		score.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		north2.add(score);
		north2.setBackground(Color.WHITE);
		north2.setBorder(border);
		north2.setLayout(new GridBagLayout());
		north2.setBounds(east2.getX(), north1.getY(), 200, 40);

	}

	// 난이도와 테마가 나올 패널
	public void setThemePanel() {

		themeLabel = new JLabel(selectedLevel + " : " + selectedTheme);
		themeLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		north1.add(themeLabel);
		north1.setBackground(Color.WHITE);
		north1.setBorder(border);
		north1.setLayout(new GridBagLayout());
		north1.setBounds(wordPanel.getX(), 20, 400, 40);

	}

	// 알파벳 키보드가 나올 패널
	public void setAlphabetPanel() {
		// 알파벳 A~R 키보드 배치
		for (int i = 0; i < alphabet1.length; i++) {
			jb1[i] = new JButton(alphabet1[i]);
			jb1[i].setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			jb1[i].setBorder(border);
			jb1[i].addActionListener(this);
			south1.add(jb1[i]);
		}
		south1.setLayout(new GridLayout(2, 8, 0, 0));
		south1.setBounds(wordPanel.getX(), 750, 450, 100);

		// 알파벳 S~Z 키보드 배치
		for (int i = 0; i < alphabet2.length; i++) {
			jb2[i] = new JButton(alphabet2[i]);
			jb2[i].setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			jb2[i].setBorder(border);
			jb2[i].addActionListener(this);
			south2.add(jb2[i]);
		}
		int button = (south1.getWidth() / 9) / 2;
		south2.setLayout(new GridLayout(1, 5, 0, 0));
		south2.setBounds(south1.getX() + button, south1.getY() + south1.getHeight(), 400, south1.getHeight() / 2);
	}

	// 뒤로가기 버튼이 나올 패널
	public void setBackButtonPanel() {

		backToMain.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		backToMain.setBorder(border);
		south3.add(backToMain);
		south3.setBorder(border);
		south3.setLayout(new GridLayout(1, 0, 0, 0));
		south3.setBounds(south1.getX() + south1.getWidth() + 80, south2.getY(), 300, 50);
	}

	// 다음 단어로 가는 버튼이 나올 패널
	public void setNextButton() {

		next.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		next.setBorder(border);
		south4.add(next);
		south4.setBorder(border);
		south4.setLayout(new GridLayout(1, 0, 0, 0));
		south4.setBounds(south3.getX() + south3.getWidth(), south2.getY(), 300, 50);
	}

	// 힌트가 몇개 있는지가 나올 패널
	public void setDiamondPanel() {

		east1 = new JPanel();
		diamond = new ImageIcon("src\\image\\hangman_diamond.gif");
		wordHint = new JLabel(diamond);
		hintCount = new JLabel(String.format("%d", hintNum));
		hintCount.setFont(new Font(Font.DIALOG, Font.BOLD, 70));
		east1.add(wordHint);
		east1.add(hintCount);
		east1.setLayout(new GridLayout(1, 2, 40, 0));
		east1.setBorder(border);
		east1.setBackground(Color.WHITE);
		east1.setBounds(south3.getX() + 50, south1.getY(), south3.getWidth() - 100, south3.getHeight() + 30);
	}

	// 힌트버튼이 나올 패널
	public void setHintPanel() {

		hintBtn.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		hintBtn.setBorder(border);
		hintBtn.setEnabled(false);
		east2.add(hintBtn);
		east2.setBorder(border);
		east2.setLayout(new GridLayout(1, 0, 0, 0));
		east2.setBounds(south3.getX() + south3.getWidth(), east1.getY() + 10, 300, 50);
	}

	// 알파벳 A ~ R까지의 이벤트 처리해주는 메서드
	public void jButton1(int index, String alphabet) {

		boolean checkSpelling = false;

		jb1[index].setEnabled(false);

		for (int i = 0; i < word.length(); i++) {
			if (String.valueOf(word.charAt(i)).equalsIgnoreCase(alphabet)) {
				checkSpelling = true;
				playSound("correct_alphabet_sound.wav"); // 사용자가 선택한 알파벳이 단어에 있으면 그에 해당하는 음악이 나온다
				lineLabel[i].setText(alphabet);
				cnt++; // 사용자가 선택한 알파벳이 단어에 있는 알파벳과 같다면 cnt가 ++된다
						// 그래서 if(cnt == 0)에 안들어감. 그러므로 틀렸을때 보여지는 사진은 안나옴
			}
		}
		if (!checkSpelling) { // 사용자가 선택한 알파벳이 단어에 없으면 그에 해당하는 음악이 나온다
			playSound("wrong_alphabet_sound.wav");
		}
	}

	// 알파벳 S ~ Z까지의 이벤트 처리해주는 메서드
	public void jButton2(int index, String alphabet) {

		boolean checkSpelling = false;

		jb2[index].setEnabled(false);

		for (int i = 0; i < word.length(); i++) {
			if (String.valueOf(word.charAt(i)).equalsIgnoreCase(alphabet)) {
				checkSpelling = true;
				playSound("correct_alphabet_sound.wav");
				lineLabel[i].setText(alphabet);
				cnt++;
			}
		}
		if (!checkSpelling) {
			playSound("wrong_alphabet_sound.wav");
		}
	}

	// 알파벳을 클릭했을때 발생되는 이벤트
	@Override // 사용자가 알파벳을 눌렀을때 이 메서드가 호출된다!
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) { // e.getActionCommand()는 알파벳 값이다
		case "A":
			jButton1(0, "A"); // 사용가가 누른 알파벳이 단어에 있는지 아닌지 처리해주는 메서드를 호출한다
			break;
		case "B":
			jButton1(1, "B");
			break;
		case "C":
			jButton1(2, "C");
			break;
		case "D":
			jButton1(3, "D");
			break;
		case "E":
			jButton1(4, "E");
			break;
		case "F":
			jButton1(5, "F");
			break;
		case "G":
			jButton1(6, "G");
			break;
		case "H":
			jButton1(7, "H");
			break;
		case "I":
			jButton1(8, "I");
			break;
		case "J":
			jButton1(9, "J");
			break;
		case "K":
			jButton1(10, "K");
			break;
		case "L":
			jButton1(11, "L");
			break;
		case "M":
			jButton1(12, "M");
			break;
		case "N":
			jButton1(13, "N");
			break;
		case "O":
			jButton1(14, "O");
			break;
		case "P":
			jButton1(15, "P");
			break;
		case "Q":
			jButton1(16, "Q");
			break;
		case "R":
			jButton1(17, "R");
			break;
		case "S":
			jButton2(0, "S");
			break;
		case "T":
			jButton2(1, "T");
			break;
		case "U":
			jButton2(2, "U");
			break;
		case "V":
			jButton2(3, "V");
			break;
		case "W":
			jButton2(4, "W");
			break;
		case "X":
			jButton2(5, "X");
			break;
		case "Y":
			jButton2(6, "Y");
			break;
		case "Z":
			jButton2(7, "Z");
			break;

		}// end of switch

		boolean checkWordSpace = false; // totalWord에 공백이 있으면 if문에 들어가 true가 되고 공백이 있는 문자끼리 비교하는 if문으로 들어간다

		String userWord = ""; // 문제의 단어에 공백이 없을때 사용자가 선택한 알파벳을 누적시켜 저장하는 문자열 변수

		String userWordWithSpace = " "; // 문제의 단어에 공백이 있을때 사용자가 선택한 알파벳을 누적시켜 저장하는 문자열 변수

		String wordWithSpace = " "; // 문제의 단어에 공백이 있으면 공백없이 다시 붙여서 저장하는 문자열 변수

		// 사용자가 선택한 알파벳이 단어에 있으면 totalWord에 누적시킨다
		for (int i = 0; i < word.length(); i++) {
			userWord += lineLabel[i].getText();
		}

		// total에 공백이 " " 있을때 문자열을 분리해서 다시 공백없이 붙이는 작업
		String[] partsOfTotalWord = {};

		if (userWord.contains("   ")) {
			checkWordSpace = true;
			System.out.println("checkWordSpace가 true가 됨");
			partsOfTotalWord = userWord.split("   ");
			for (int i = 0; i < partsOfTotalWord.length; i++) {
				userWordWithSpace += partsOfTotalWord[i];
			}
		}

		// 문제의 단어 word에 공백이 있으면 공백을 기준으로 분리해서 다시 공백없이 붙이는 작업
		String[] partsOfWord = {};
		if (word.contains(" ")) {
			partsOfWord = word.split(" ");
			for (int i = 0; i < partsOfWord.length; i++) {
				wordWithSpace += partsOfWord[i];
			}
		}

		// 확인용
		System.out.println("totalWordWithSpace : " + userWordWithSpace);
		System.out.println("wordWithSpace : " + wordWithSpace);
		System.out.println("totalWordWithSpace와 wordWithSpace는 "
				+ (userWordWithSpace.equalsIgnoreCase(wordWithSpace) ? "같다" : "틀리다"));
		System.out.println();
		System.out.println("totalWord : " + userWord);
		System.out.println("word : " + word);
		System.out.println("totalWord와 word는 " + (userWord.equalsIgnoreCase(word) ? "같다" : "틀리다"));

		// 단어에 공백이 없을때 userWord와 문제의 단어 word를 비교함
		if (userWord.equalsIgnoreCase(word)) {
			System.out.println("total.equalsIgnoreCase(word)에 들어옴");

			// 단어를 맞췄을때 나오는 사진
			imgBox.setIcon(img[9]); // 라벨에 이미지를 넣다
			gameImage.add(imgBox); // 페널에 라벨을 넣다
			background.add(gameImage); // 프레임에 페널을 넣다
			gameImage.setLayout(new FlowLayout(FlowLayout.CENTER));
			gameImage.setBounds(100, 80, wordPanel.getWidth(), 550);
			gameImage.setBackground(Color.WHITE);
			gameImage.setBorder(border);
			gameImage.setVisible(true);
			setVisible(true);
			if (questionNum != 4) {
				hintNum++;
				hintCount.setText(String.format("%d", hintNum));
			}
			scoreCnt++; // 단어를 맞추면 점수가 1점 추가된다
			//playerRecord += " " + scoreCnt;
			score.setText("SCORE " + scoreCnt + "/" + wordList.length);
			if (scoreCnt > 0) {
				hintBtn.setEnabled(false); // 해당 문제를 맞춘 창에서는 Hint 버튼을 비활성화 한다
			}

			// 게임이 종료된 이후 알파벳 키보드 ActionListener 기능 삭제
			for (int i = 0; i < alphabet1.length; i++) {
				jb1[i].removeActionListener(this);
			}

			for (int i = 0; i < alphabet2.length; i++) {
				jb2[i].removeActionListener(this);
			}

			JOptionPane.showMessageDialog(this, "Good Job!\n단어 풀이 : " + wordMeaning);
		}

		// 단어에 공백이 있을때 비교함
		else if (checkWordSpace && userWordWithSpace.equalsIgnoreCase(wordWithSpace)) {
			System.out.println("checkWordSpace && newTotal.equalsIgnoreCase(newWord)에 들어옴");
			// 단어를 맞췄을때 나오는 사진
			imgBox.setIcon(img[9]); // 라벨에 이미지를 넣다
			gameImage.add(imgBox); // 페널에 라벨을 넣다
			background.add(gameImage); // 프레임에 페널을 넣다
			gameImage.setLayout(new FlowLayout(FlowLayout.CENTER));
			gameImage.setBounds(100, 80, wordPanel.getWidth(), 550);
			gameImage.setBackground(Color.WHITE);
			gameImage.setBorder(border);
			gameImage.setVisible(true);
			setVisible(true);
			if (questionNum != 4) {
				hintNum++;
				hintCount.setText(String.format("%d", hintNum));
			}
			scoreCnt++;
			//playerRecord += " " + scoreCnt;
			score.setText("SCORE " + scoreCnt + "/" + wordList.length);

			// 게임이 종료된 이후 알파벳 키보드 ActionListener 기능 삭제
			for (int i = 0; i < alphabet1.length; i++) {
				jb1[i].removeActionListener(this);
			}

			for (int i = 0; i < alphabet2.length; i++) {
				jb2[i].removeActionListener(this);
			}

			JOptionPane.showMessageDialog(this, "Good Job!\n단어 풀이 : " + wordMeaning);
		}

		if (cnt == 0 && imageCnt == 8) {
			// 단어를 못맞췄을때 띄워주는 사진
			imgBox.setIcon(img[8]);
			gameImage.add(imgBox);
			background.add(gameImage);
			gameImage.setLayout(new FlowLayout(FlowLayout.CENTER));
			gameImage.setBounds(100, 80, wordPanel.getWidth(), 550);
			gameImage.setBackground(Color.WHITE);
			gameImage.setBorder(border);
			gameImage.setVisible(true);
			setVisible(true);
			if (hintNum > 0) {
				hintBtn.setEnabled(false);
			}
			// 게임이 종료된 이후 못 맞춘 알파벳을 사용자에게 보여준다
			for (int i = 0; i < word.length(); i++) {
				if ((lineLabel[i].getText().contains("__ "))) {
					lineLabel[i].setText((String.valueOf(word.charAt(i))));
				}
			}

			// 게임이 종료된 이후 알파벳 키보드 ActionListener 기능 삭제
			for (int i = 0; i < alphabet1.length; i++) {
				jb1[i].removeActionListener(this);
			}

			for (int i = 0; i < alphabet2.length; i++) {
				jb2[i].removeActionListener(this);
			}

			JOptionPane.showMessageDialog(this, "The answer was " + word + "!\n단어 풀이 : " + wordMeaning);

		}

		// cnt가 0이면 사용자가 선택한 알파벳이 단어에는 존재하지않음
		// 그래서 이 if문으로 들어옴. 그리고 틀렸을때 보여지는 사진들이 화면에 나옴
		if (cnt == 0) {
			System.out.println("없는 알파벳");
			System.out.println("imageCnt : \n" + imageCnt);
			imgBox.setIcon(img[imageCnt]);
			gameImage.add(imgBox);
			background.add(gameImage);
			gameImage.setLayout(new FlowLayout(FlowLayout.CENTER));
			gameImage.setBounds(100, 80, wordPanel.getWidth(), 550);
			gameImage.setBackground(Color.WHITE);
			gameImage.setBorder(border);
			gameImage.setVisible(true);
			setVisible(true);
			imageCnt++;
		}
		cnt = 0; // 다시 0으로 초기화를 해야함. 안그러면 사용자가 틀린 알파벳을 선택했을때
					// 그림이 나오는 조건식 if(cnt == 0)에 못 들어옴

	}
}
