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
	JPanel north = new JPanel(); // ���� ������ ���� �г�
	JPanel south1 = new JPanel(); // Ű���� ���� A~R���� ���� �г�
	JPanel south2 = new JPanel(); // Ű���� ���� S~Z���� ���� �г�
	JPanel south3 = new JPanel(); // �ڷΰ��� ��ư�� ���� �г�
	JPanel south4 = new JPanel(); // ���� �ܾ ������ ��ư�� ���� �г�
	JPanel wordPanel; // �ܾ��� ����ŭ ������ ���� �г�
	JPanel gameImage = new JPanel(); // Ʋ���ų� ������ ���߶� ����� ���� ���� �г�
	JPanel east1 = new JPanel(); // �ܾ� ���ĺ� ��Ʈ�� �˷��� ���̺��� ���� �г�
	JPanel east2 = new JPanel(); // �ܾ� ��Ʈ�� ������ ��ư�� ���� �г�

	JButton next = new JButton("Next Word");
	JButton backToMain = new JButton("Go Back"); // �ڷΰ��� ��ư ����
	JButton hint = new JButton("Hint");
	JButton[] jb1 = new JButton[18]; // Ű���� ���� A~R���� ���� ��ư
	JButton[] jb2 = new JButton[8]; // Ű���� ���� S~Z���� ���� ��ư
	JLabel[] lineLabel; // �ܾ� �� ��ŭ ������ ���� ���̺�
	JLabel imgBox; // Ʋ���ų� ������ �������� ���� ���̺�
	JLabel themeLabel; // ���� ������ ���� ���̺�
	JLabel wordHint;
	JLabel hintCount;
	JLabel countdown;

	ImageIcon[] img; // Ʋ�������� ������ ���� ���� �̹��������� �迭
	ImageIcon gameBackground; // ����â ����� ���� �̹���������
	ImageIcon diamond; // �ܾ� ���ĺ� ��Ʈ �˷��ִ� �̹���������

	Toolkit tk = Toolkit.getDefaultToolkit(); // ����� �ػ� �˱����� Ŭ����

	String[] alphabet1 = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R" };
	String[] alphabet2 = { "S", "T", "U", "V", "W", "X", "Y", "Z" };

	// �׵θ� ����
	BevelBorder raisedBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.RAISED);
	BevelBorder loweredBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.LOWERED);

	Border border = BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);

	String word; // ���� �ܾ�
	String selectedTheme;
	int cnt; // cnt�� 0�̸� �ܾ �ִ� ���ĺ��� ���õ��� �ʾҴ�
	int imageCnt; // Ʋ�� ���ĺ� ���ý� �����Ǵ� ī��Ʈ
	int rNum; // ������ �ܾ� �ε��� ��ȣ�� ���� ����
	Random r = new Random(); // Random() �޼��� ��ü
	static int questionNum; // �� ���� �ܾ �ε��� ��ȣ�� ���� �� �ְ� �ϴ� ����
	static int hintNum = 3; // ��Ʈ ��ȸ�� 3��
	int[] rHintNum = new int[hintNum]; // hintNum ����ŭ rNum �迭�� ����


	public HangmanPlayScreen2(String[] gameWords, String theme) {

		System.out.println("Hangman playScreen �����ڿ� ����\n");

		for (int i = 0; i < gameWords.length; i++) {
			System.out.println("gameWords : " + gameWords[i]);
		}

		// ������ ���� ���� �������� selectedTheme�� �����ϱ�
		selectedTheme = theme;

		System.out.println("Hangman playScreen ������ questionNuM : " + questionNum);
		word = gameWords[questionNum];

		// set�� ��ġ���ʰ� ����3�� �߰��ϴ� �۾�
		HashSet<Integer> set = new HashSet<>();

		// set�� ��ġ���ʴ� ���� 3���� �������� �����Ѵ�
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

		// ����â ���ȭ�� ����
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

		// �̹����� ���� ���̺� �ν��Ͻ�
		imgBox = new JLabel();

		// Ʋ���� ���� �̹��� img�迭 �ν��Ͻ�
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

		// background �гο� �ٸ� ��� �г� �ֱ�
		background.add(north); // ������ �����ִ� �г�
		// background.add(new TimerTest2()); // Ÿ�̸Ӹ� �����ִ� �г�
		background.add(south1); // A ~ R Ű���� ����
		background.add(south2); // S ~ Z Ű���� ����
		background.add(south3); // �ڷΰ��� ��ư
		background.add(south4); // ���� �ܾ���� �� ��ư
		background.add(east1); // �ܾ� ��Ʈ ���̾Ƹ��
		background.add(east2); // �ܾ� ��Ʈ���� ������ ������ ��ư
		background.add(wordPanel); // _ _ _ _ �ܾ� �г�

		add(background);
		// setBounds(100, 100, icon.getIconWidth(), icon.getIconHeight());
		int mainFrameWidth = wordPanel.getX() + wordPanel.getWidth() + 5;
		int space = mainFrameWidth - (wordPanel.getWidth());
		setSize(mainFrameWidth + space, 950);

		// ����� �ػ� ã��
		Dimension di = tk.getScreenSize();
		int mWidth = di.width;
		int mHeight = di.height;
		// ����� �߾� ��ġ ã��
		int x = mWidth / 2 - getWidth() / 2;
		int y = mHeight / 2 - getHeight() / 2;

		// JFrame ��ġ
		setLocation(x, y);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Go Back ��ư �������� �̺�Ʈ ó��
		backToMain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new HangmanMainScreen();
			}
		});

		// Next ��ư �������� �̺�Ʈ ó��
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
				} else if (questionNum == gameWords.length) { // �׸��� questionNum�� �ܾ� ������ ������ �ٽ� 0���� �ʱ�ȭ ��Ų��
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
				System.out.println("�޼��忡 ������ �� hintNum : " + hintNum);
				System.out.println("hint ActionListener word: " + word);

				hintNum--;

				if (hintNum >= 0) {
					hintCount.setText(String.format("%d", hintNum));
					System.out.println("if���� ������ �� hintNum : " + hintNum);
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
		System.out.println("refreshGameImage()�� ����");
		gameImage.removeAll();
		gameImage.setVisible(false);
	}

	public void showEndOfWordsMessage() {
		JOptionPane.showMessageDialog(this,
				"You've reached the end of "+ selectedTheme + " words.\n Please click Ȯ�� to return to the main screen");

	}

	public void getRandomHintNumber() {

		// set�� ��ġ���ʰ� ����3�� �߰��ϴ� �۾�
		HashSet<Integer> set = new HashSet<>();

		System.out.println("getRandomHintNumber()�� hintNum : " + hintNum);
		System.out.println("getRandomHintNumber()�� word : " + word);
		// set�� ��ġ���ʴ� ���� 3���� �������� �����Ѵ�
		while (true) {
			if (!set.add(r.nextInt(word.length()))) {
			}
			if (set.size() == 3) {
				break;
			}
		}
		// �߰��� ���� 3���� rNum�迭�� �ִ´�
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
		System.out.println("setWordPanel()�� ����");
		System.out.println("setWordPanel() word : " + word);

		// figure out how to update the old wordPanel!!!!

		wordPanel = new JPanel();
		// �ܾ� ����ŭ ������ ���� �� �ִ� �г� ��ġ
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
		// �ܾ ���� �г�
		// wordPanel.setLayout(null);
		wordPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		wordPanel.setBackground(Color.WHITE);
		wordPanel.setBounds(100, 660, 1200, 70);
		wordPanel.setBorder(border);

	}

	public void setThemePanel() {
		// �׸� �����ִ� �г� ��ġ
		themeLabel = new JLabel(selectedTheme);
		themeLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		north.add(themeLabel);
		north.setBackground(Color.WHITE);
		north.setBorder(border);
		north.setLayout(new GridBagLayout());
		north.setBounds(wordPanel.getX(), 20, 270, 40);

	}

	public void setAlphabetPanel() {
		// ���ĺ� A~R Ű���� ��ġ
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

		// ���ĺ� S~Z Ű���� ��ġ
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
		// �ڷ� ���� ��ư �߰�
		backToMain.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		backToMain.setBorder(border);
		south3.add(backToMain);
		south3.setBorder(border);
		south3.setLayout(new GridLayout(1, 0, 0, 0));
		south3.setBounds(south1.getX() + south1.getWidth() + 80, south2.getY(), 300, 50);
	}

	public void setNextButton() {
		// ���� �ܾ�� ���� ��ư �߰�
		next.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		next.setBorder(border);
		south4.add(next);
		south4.setBorder(border);
		south4.setLayout(new GridLayout(1, 0, 0, 0));
		south4.setBounds(south3.getX() + south3.getWidth(), south2.getY(), 300, 50);
	}

	public void setDiamondPanel() {
		// �ܾ� ��Ʈ
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
		// �ܾ� ��Ʈ �ҷ����� ��ư
		hint.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		hint.setBorder(border);
		east2.add(hint);
		east2.setBorder(border);
		east2.setLayout(new GridLayout(1, 0, 0, 0));
		east2.setBounds(south3.getX() + south3.getWidth(), east1.getY() + 10, 300, 50);
	}

	// ���ĺ� A ~ R������ �̺�Ʈ ó�����ִ� �޼���
	public void jButton1(int index, String alphabet) {
		boolean checkSpelling = false;
		jb1[index].setEnabled(false);
		for (int i = 0; i < word.length(); i++) {
			if (String.valueOf(word.charAt(i)).equalsIgnoreCase(alphabet)) {
				checkSpelling = true;
				playSound("correct_alphabet_sound.wav");
				lineLabel[i].setText(alphabet);
				cnt++; // ����ڰ� ������ ���ĺ��� �ܾ �ִ� ���ĺ��� ���ٸ� cnt�� ++�ȴ�
						// �׷��� if(cnt == 0)�� �ȵ�. �׷��Ƿ� Ʋ������ �������� ������ �ȳ���
			}
		}
		if (!checkSpelling) {
			playSound("wrong_alphabet_sound.wav");
		}
	}

	// ���ĺ� S ~ Z������ �̺�Ʈ ó�����ִ� �޼���
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

	@Override // ����ڰ� ���ĺ��� �������� �� �޼��尡 ȣ��ȴ�!
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) { // e.getActionCommand()�� ���ĺ� ���̴�
		case "A":
			jButton1(0, "A"); // �ܾ �ִ� ���ĺ����� �ƴ��� ó�����ִ� �޼��带 ȣ���Ѵ�
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

		// total�� ����ڰ� ������ ���ĺ��� ������ ���ڿ�
		boolean checkWordSpace = false; // total�� ������ ���ٸ� if (total.contains(" "))�� �ȵ�
		String total = "";
		for (int i = 0; i < word.length(); i++) {
			total += lineLabel[i].getText();
		}

		// total�� ������ " " ������ ���ڿ��� �и��ؼ� �ٽ� ������� ���̴� �۾�
		String[] partsOfTotal = {};
		String newTotal = " ";
		if (total.contains("   ")) {
			checkWordSpace = true;
			partsOfTotal = total.split("   ");
			for (int i = 0; i < partsOfTotal.length; i++) {
				newTotal += partsOfTotal[i];
			}
		}

		// word�߿� ������ �ִ� �ܾ�� ������ �������� �и��ؼ� �ٽ� ������� ���̴� �۾�
		String[] partsOfWord = {};
		String newWord = " ";
		if (word.contains(" ")) {
			partsOfWord = word.split(" ");
			for (int i = 0; i < partsOfWord.length; i++) {
				newWord += partsOfWord[i];
			}
		}
		// �׽�Ʈ��
		System.out.println("newTotal : " + newTotal);
		System.out.println("newWord : " + newWord);
		System.out.println("newTotal�� newWord�� " + (newTotal.equalsIgnoreCase(newWord) ? "����" : "Ʋ����"));
		System.out.println();
		System.out.println("total : " + total);
		System.out.println("word : " + word);
		System.out.println("total�� word�� " + (total.equalsIgnoreCase(word) ? "����" : "Ʋ����"));

		// �ܾ ������ ������ ����ڰ� ������ ������ ���ĺ� total�� ���� �ܾ� word�� ����
		if (total.equalsIgnoreCase(word)) {
			// �ܾ �������� ������ ����
			imgBox.setIcon(img[9]); // �󺧿� �̹����� �ִ�
			gameImage.add(imgBox); // ��ο� ���� �ִ�
			background.add(gameImage); // �����ӿ� ����� �ִ�
			gameImage.setLayout(new FlowLayout(FlowLayout.CENTER));
			gameImage.setBounds(100, 80, wordPanel.getWidth(), 550);
			gameImage.setBackground(Color.WHITE);
			gameImage.setBorder(border);
			gameImage.setVisible(true);
			setVisible(true);
			JOptionPane.showMessageDialog(this, "Good Job!");
			// ���� �Ȱ��� ����â���� �ܾ���� �������� �� ������...
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
//				// ������ Ǯ�� ���������� �׳� ����â�� ������� ����â�� ��...
//				dispose();
//				new HangmanMainScreen();
//			}

			// �ܾ ������ ������ ����
		} else if (checkWordSpace && newTotal.equalsIgnoreCase(newWord)) {
			// �ܾ �������� ������ ����
			imgBox.setIcon(img[9]); // �󺧿� �̹����� �ִ�
			gameImage.add(imgBox); // ��ο� ���� �ִ�
			background.add(gameImage); // �����ӿ� ����� �ִ�
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
			// �ܾ ���������� ����ִ� ����
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
//				dispose(); // � ������ ���������� ����â�� �ȴ���....
//				new HangmanMainScreen();
//			}

		}
		// cnt�� 0�̸� ����ڰ� ������ ���ĺ��� �ܾ�� ������������
		// �׷��� �� if������ ����. �׸��� Ʋ������ �������� �������� ȭ�鿡 ����
		if (cnt == 0) {
			System.out.println("���� ���ĺ�");
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
		cnt = 0; // �ٽ� 0���� �ʱ�ȭ�� �ؾ���. �ȱ׷��� ����ڰ� Ʋ�� ���ĺ��� ����������
					// �׸��� ������ ���ǽ� if(cnt == 0)�� �� ����

	}
}
