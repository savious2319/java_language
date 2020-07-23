package hangman2;

import java.awt.Color;
import java.awt.Component;
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

public class HangmanPlayScreen2 extends JFrame implements ActionListener {
	JPanel background;
	JPanel north = new JPanel(); // 게임 주제를 담을 패널
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
	JButton hint = new JButton("Hint");
	JButton[] jb1 = new JButton[18]; // 키보드 문자 A~R까지 담을 버튼
	JButton[] jb2 = new JButton[8]; // 키보드 문자 S~Z까지 담을 버튼
	JLabel[] lineLabel; // 단어 수 만큼 밑줄을 담을 레이블
	JLabel imgBox; // 틀리거나 문제를 맞췄을때 담을 레이블
	JLabel themeLabel; // 게임 주제를 담을 레이블
	JLabel wordHint;
	JLabel hintCount;
	JLabel countdown;

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

	String word; // 문제 단어
	String selectedTheme;
	int cnt; // cnt가 0이면 단어에 있는 알파벳이 선택되지 않았다
	int imageCnt; // 틀린 알파벳 선택시 누적되는 카운트
	int rNum; // 랜덤한 단어 인덱스 번호를 담을 변수
	Random r = new Random(); // Random() 메서드 객체
	static int questionNum; // 그 다음 단어가 인덱스 번호가 나올 수 있게 하는 변수
	static int hintNum = 3; // 힌트 기회는 3번
	int[] rHintNum = new int[hintNum]; // hintNum 수만큼 rNum 배열을 만듬


	public HangmanPlayScreen2(String[] gameWords, String theme) {

		System.out.println("Hangman playScreen 생성자에 들어옴\n");

		for (int i = 0; i < gameWords.length; i++) {
			System.out.println("gameWords : " + gameWords[i]);
		}

		// 선택한 게임 주제 전역변수 selectedTheme에 대입하기
		selectedTheme = theme;

		System.out.println("Hangman playScreen 생성장 questionNuM : " + questionNum);
		word = gameWords[questionNum];

		// set에 겹치지않게 숫자3개 추가하는 작업
		HashSet<Integer> set = new HashSet<>();

		// set에 겹치지않는 숫자 3개가 들어갈때까지 진행한다
		while (true) {
			if (!set.add(r.nextInt(word.length()))) {
			}
			if (set.size() == 3) {
				break;
			}
		}
		Iterator<Integer> iter = set.iterator();

		for (int i = 0; i < set.size(); i++) {
			if (iter.hasNext()) {
				rHintNum[i] = iter.next();
			}
			System.out.println("rHintNum : " + rHintNum[i]);
		}

		// 게임창 배경화면 설정
		gameBackground = new ImageIcon("img/gameBackground.jpg");

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

		img[0] = new ImageIcon("img\\hangman1.png");

		img[1] = new ImageIcon("img\\hangman2.png");

		img[2] = new ImageIcon("img\\hangman3.png");

		img[3] = new ImageIcon("img\\hangman4.png");

		img[4] = new ImageIcon("img\\hangman5.png");

		img[5] = new ImageIcon("img\\hangman6.png");

		img[6] = new ImageIcon("img\\hangman7.png");

		img[7] = new ImageIcon("img\\hangman8.png");

		img[8] = new ImageIcon("img\\hangman9.png");

		img[9] = new ImageIcon("img\\hangman10.png");

		setWordPanel();
		setThemePanel();
		setAlphabetPanel();
		setBackButtonPanel();
		setNextButton();
		setDiamondPanel();
		setHintPanel();

		// background 패널에 다른 모든 패널 넣기
		background.add(north); // 주제를 보여주는 패널
		// background.add(new TimerTest2()); // 타이머를 보여주는 패널
		background.add(south1); // A ~ R 키보드 자판
		background.add(south2); // S ~ Z 키보드 자판
		background.add(south3); // 뒤로가기 버튼
		background.add(south4); // 다음 단어나오게 할 버튼
		background.add(east1); // 단어 힌트 다이아몬드
		background.add(east2); // 단어 힌트보고 싶을때 누르는 버튼
		background.add(wordPanel); // _ _ _ _ 단어 패널

		add(background);
		// setBounds(100, 100, icon.getIconWidth(), icon.getIconHeight());
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

		// JFrame 위치
		setLocation(x, y);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Go Back 버튼 눌렀을때 이벤트 처리
		backToMain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
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
					System.out.println("next button pressed");
					System.out.println("questionNum : " + questionNum);
					getContentPane().removeAll();
					refreshAlphabets();
					setWordPanel();
					getRandomHintNumber();
					refreshGameImage();
					setDiamondPanel();
					hint.setEnabled(true);
					refreshBackground();
					background.add(south1); // A ~ R
					background.add(south2); // S ~ Z
					background.add(north); // Theme
					background.add(south3); // Go Back
					background.add(south4); // Next Word
					background.add(east1); // Diamond, Hint Number
					background.add(east2); // Hint Button
					background.add(wordPanel); // _ _ _ _ _ _
					getContentPane().add(background);
					revalidate();
					repaint();
					imageCnt = 0;
					System.out.println("next ActionListener() word : " + word);
				} else if (questionNum == gameWords.length) { // 그리고 questionNum이 단어 개수와 같을때 다시 0으로 초기화 시킨다
//					questionNum = 0;
//					word = gameWords[questionNum];
					showEndOfWordsMessage();
					questionNum = 0;
					dispose();
					new HangmanMainScreen();
//					hint.setEnabled(false);
//					next.setEnabled(false);
//					wordPanel.setVisible(false);
				}
			}
		});

		hint.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("메서드에 들어왔을 때 hintNum : " + hintNum);
				System.out.println("hint ActionListener word: " + word);

				hintNum--;

				if (hintNum >= 0) {
					hintCount.setText(String.format("%d", hintNum));
					System.out.println("if문에 들어왔을 때 hintNum : " + hintNum);
					for (int i = 0; i < word.length(); i++) {
						if (String.valueOf(word.charAt(i))
								.equalsIgnoreCase(String.valueOf(word.charAt(rHintNum[hintNum])))) {
							lineLabel[i].setText(String.valueOf(word.charAt(i)));
						}
					}

					for (int i = 0; i < jb1.length; i++) {
						if (String.valueOf(word.charAt(rHintNum[hintNum]))
								.equalsIgnoreCase(String.valueOf(jb1[i].getText()))) {
							jb1[i].setEnabled(false);
							// lineLabel[rNum[hintNum]].setText(jb1[i].getText());
						}
					}
					for (int i = 0; i < jb2.length; i++) {
						if (String.valueOf(word.charAt(rHintNum[hintNum]))
								.equalsIgnoreCase(String.valueOf(jb2[i].getText()))) {
							jb2[i].setEnabled(false);
							// lineLabel[rNum[hintNum]].setText(jb2[i].getText());
						}
					}
				}

				if (hintNum == 0) {
					hint.setEnabled(false);
					hintNum = 3;

				}
			}
		});

	} // end of constructor

	public void refreshBackground() {
		background.removeAll();
	}

	public void refreshAlphabets() {
		for (int i = 0; i < alphabet1.length; i++) {
			jb1[i].setEnabled(true);
			south1.add(jb1[i]);
		}
		for (int i = 0; i < alphabet2.length; i++) {
			jb2[i].setEnabled(true);
			south2.add(jb2[i]);
		}

	}

	public void refreshGameImage() {
		System.out.println("refreshGameImage()에 들어옴");
		gameImage.removeAll();
		gameImage.setVisible(false);
	}

	public void showEndOfWordsMessage() {
		JOptionPane.showMessageDialog(this,
				"You've reached the end of "+ selectedTheme + " words.\n Please click 확인 to return to the main screen");

	}

	public void getRandomHintNumber() {

		// set에 겹치지않게 숫자3개 추가하는 작업
		HashSet<Integer> set = new HashSet<>();

		System.out.println("getRandomHintNumber()의 hintNum : " + hintNum);
		System.out.println("getRandomHintNumber()의 word : " + word);
		// set에 겹치지않는 숫자 3개가 들어갈때까지 진행한다
		while (true) {
			if (!set.add(r.nextInt(word.length()))) {
			}
			if (set.size() == 3) {
				break;
			}
		}
		// 추가된 숫자 3개를 rNum배열에 넣는다
		Iterator<Integer> iter = set.iterator();

		for (int i = 0; i < set.size(); i++) {
			if (iter.hasNext()) {
				rHintNum[i] = iter.next();
			}
			System.out.println("rHintNum : " + rHintNum[i]);
		}
	}

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

	public void setWordPanel() {
		System.out.println("setWordPanel()에 들어옴");
		System.out.println("setWordPanel() word : " + word);

		// figure out how to update the old wordPanel!!!!

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
		// 단어가 나올 패널
		// wordPanel.setLayout(null);
		wordPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		wordPanel.setBackground(Color.WHITE);
		wordPanel.setBounds(100, 660, 1200, 70);
		wordPanel.setBorder(border);

	}

	public void setThemePanel() {
		// 테마 보여주는 패널 배치
		themeLabel = new JLabel(selectedTheme);
		themeLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		north.add(themeLabel);
		north.setBackground(Color.WHITE);
		north.setBorder(border);
		north.setLayout(new GridBagLayout());
		north.setBounds(wordPanel.getX(), 20, 270, 40);

	}

	public void setAlphabetPanel() {
		// 알파벳 A~R 키보드 배치
		for (int i = 0; i < alphabet1.length; i++) {
			jb1[i] = new JButton(alphabet1[i]);
			jb1[i].setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			jb1[i].setBorder(border);
			jb1[i].addActionListener(this);
			south1.add(jb1[i]);
		}
		// south1.setLayout(null);
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
		// south2.setLayout(null);
		int button = (south1.getWidth() / 9) / 2;
		south2.setLayout(new GridLayout(1, 5, 0, 0));
		south2.setBounds(south1.getX() + button, south1.getY() + south1.getHeight(), 400, south1.getHeight() / 2);

	}

	public void setBackButtonPanel() {
		// 뒤로 가기 버튼 추가
		backToMain.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		backToMain.setBorder(border);
		south3.add(backToMain);
		south3.setBorder(border);
		south3.setLayout(new GridLayout(1, 0, 0, 0));
		south3.setBounds(south1.getX() + south1.getWidth() + 80, south2.getY(), 300, 50);
	}

	public void setNextButton() {
		// 다음 단어로 가는 버튼 추가
		next.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		next.setBorder(border);
		south4.add(next);
		south4.setBorder(border);
		south4.setLayout(new GridLayout(1, 0, 0, 0));
		south4.setBounds(south3.getX() + south3.getWidth(), south2.getY(), 300, 50);
	}

	public void setDiamondPanel() {
		// 단어 힌트
		east1 = new JPanel();
		diamond = new ImageIcon("img\\hangman_diamond.gif");
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

	public void setHintPanel() {
		// 단어 힌트 불러내는 버튼
		hint.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		hint.setBorder(border);
		east2.add(hint);
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
				playSound("correct_alphabet_sound.wav");
				lineLabel[i].setText(alphabet);
				cnt++; // 사용자가 선택한 알파벳이 단어에 있는 알파벳과 같다면 cnt가 ++된다
						// 그래서 if(cnt == 0)에 안들어감. 그러므로 틀렸을때 보여지는 사진은 안나옴
			}
		}
		if (!checkSpelling) {
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

	@Override // 사용자가 알파벳을 눌렀을때 이 메서드가 호출된다!
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) { // e.getActionCommand()는 알파벳 값이다
		case "A":
			jButton1(0, "A"); // 단어에 있는 알파벳인지 아닌지 처리해주는 메서드를 호출한다
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

		// total은 사용자가 선택한 알파벳을 누적한 문자열
		boolean checkWordSpace = false; // total에 공백이 없다면 if (total.contains(" "))에 안들어감
		String total = "";
		for (int i = 0; i < word.length(); i++) {
			total += lineLabel[i].getText();
		}

		// total에 공백이 " " 있을때 문자열을 분리해서 다시 공백없이 붙이는 작업
		String[] partsOfTotal = {};
		String newTotal = " ";
		if (total.contains("   ")) {
			checkWordSpace = true;
			partsOfTotal = total.split("   ");
			for (int i = 0; i < partsOfTotal.length; i++) {
				newTotal += partsOfTotal[i];
			}
		}

		// word중에 공백이 있는 단어는 공백을 기준으로 분리해서 다시 공백없이 붙이는 작업
		String[] partsOfWord = {};
		String newWord = " ";
		if (word.contains(" ")) {
			partsOfWord = word.split(" ");
			for (int i = 0; i < partsOfWord.length; i++) {
				newWord += partsOfWord[i];
			}
		}
		// 테스트용
		System.out.println("newTotal : " + newTotal);
		System.out.println("newWord : " + newWord);
		System.out.println("newTotal과 newWord는 " + (newTotal.equalsIgnoreCase(newWord) ? "같다" : "틀리다"));
		System.out.println();
		System.out.println("total : " + total);
		System.out.println("word : " + word);
		System.out.println("total과 word는 " + (total.equalsIgnoreCase(word) ? "같다" : "틀리다"));

		// 단어에 공백이 없을때 사용자가 선택한 누적된 알파벳 total과 문제 단어 word를 비교함
		if (total.equalsIgnoreCase(word)) {
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
			JOptionPane.showMessageDialog(this, "Good Job!");
			// 아직 똑같은 게임창에서 단어들을 연속으로 못 보여줌...
//			int choice = JOptionPane.showConfirmDialog(this, "Congratulations!\n Try Another Word?", "MESSAGE",
//					JOptionPane.YES_NO_OPTION);// YES=0,
			// NO=1

//			if (choice == 0) {
//				questionNum++;
//				System.out.println("next button pressed");
//				System.out.println("questionNum : " + questionNum);
//				word = wordList[questionNum];
//				revalidate();
//				System.out.println("revalidate()");
//				repaint();
//				System.out.println("word : " + word);
//				System.out.println("YES");

//				getContentPane().removeAll();
//				revalidate();
//				repaint();
//				getContentPane().add(background);
//			} else {
//				// 문제를 풀고 싶지않으면 그냥 게임창이 사라지고 메인창이 뜸...
//				dispose();
//				new HangmanMainScreen();
//			}

			// 단어에 공백이 있을때 비교함
		} else if (checkWordSpace && newTotal.equalsIgnoreCase(newWord)) {
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
			JOptionPane.showMessageDialog(this, "Good Job!");

//			int choice = JOptionPane.showConfirmDialog(this, "Congratulations!", "MESSAGE", JOptionPane.YES_NO_OPTION);// YES=0,
//																														// NO=1
//			if (choice == 0) {
//
//				System.out.println("YES");
//
//			} else {
//				dispose();
//				new HangmanMainScreen();
//			}

		}

		if (imageCnt == 8) {
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
			JOptionPane.showMessageDialog(this, "Try harder next time!");

//			int choice = JOptionPane.showConfirmDialog(this, "Try Another Word?", "MESSAGE", JOptionPane.YES_NO_OPTION);// YES=0,
//																														// NO=1
//			if (choice == 0) {
//				System.out.println("YES");
//
//			} else {
//				dispose(); // 어떤 주제를 선택했을때 게임창이 안닫힘....
//				new HangmanMainScreen();
//			}

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
