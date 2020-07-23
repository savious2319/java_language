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
	JPanel north1 = new JPanel(); // ���� ������ ���� �г�
	JPanel north2 = new JPanel(); // ������ ���� �г�
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
	JButton hintBtn = new JButton("Hint");
	JButton[] jb1 = new JButton[18]; // Ű���� ���� A~R���� ���� ��ư
	JButton[] jb2 = new JButton[8]; // Ű���� ���� S~Z���� ���� ��ư
	JLabel[] lineLabel; // �ܾ� �� ��ŭ ������ ���� ���̺�
	JLabel imgBox; // Ʋ���ų� ������ �������� ���� ���̺�
	JLabel themeLabel; // ���� ������ ���� ���̺�
	JLabel wordHint; // ���̾Ƹ�� �̹����� ���� ���̺�
	JLabel hintCount; // ���̾Ƹ�� ������ ���� ���̺�
	JLabel score; // ������ ���� ���̺�

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

	String[] definitionList; // ���� �ܾ�Ǯ�� �迭
	String[] wordList; // ���� �ܾ� �迭
	String word; // ���� �ܾ�
	String wordMeaning; // ���� �ܾ� Ǯ��
	static String selectedTheme; // ���õ� ���� ����
	static String selectedLevel; // ���õ� ���� ���̵�
	int cnt; // �´� ���ĺ��� �����ߴ��� �ƴ��� �����Ϸ��� ���� ����. ������ cnt�� �����ǰ� �ƴϸ� ��� 0�̴�
	int imageCnt; // Ʋ�� ���ĺ� ���ý� �����̵Ǽ� ������� ������ ������ �� �ְ��ϱ����� ���� ����
	static int scoreCnt; // ������ ī��Ʈ�ϴ� ����
	Random r = new Random(); // Random() �޼��� ��ü
	int questionNum; // �� ���� �ܾ��� �ε��� ��ȣ�� ���� �� �ְ� �ϴ� ����
	int hintNum; // ��Ʈ�� ���� �����ϴ� ����
	int[] rHintNum; // hintNum ����ŭ �����ϴ� �迭
	public static String playerRecord;
	public static String totalRecord = "";
	
	public HangmanPlayScreen() {}
	
	public HangmanPlayScreen(String[] gameWords, String[] wordDefinitions, String theme, String gameLevel) {
		

		System.out.println("Hangman playScreen �����ڿ� ����\n");

		// �Ű������� ���� ���Ӵܾ� �迭 �� ��ŭ ���ڿ� �迭 ����
		wordList  = new String[gameWords.length];

		// �Ű������� ���� ���� �ܾ� �� �� ��ŭ ���ڿ� �迭 ����
		definitionList = new String[wordDefinitions.length];

		// �Ű������� ���� ���Ӵܾ� �迭�� wordList �迭�� ����
		for (int i = 0; i < gameWords.length; i++) {
			wordList[i] = gameWords[i];
		}

		// �Ű������� ���� ���Ӵܾ� �� �迭�� definitionList �迭�� ����
		for (int i = 0; i < wordDefinitions.length; i++) {
			definitionList[i] = wordDefinitions[i];
		}

		// ����ڰ� ������ ������ �ܾ���� �� �Ѿ�Դ��� Ȯ��
		for (int i = 0; i < gameWords.length; i++) {
			System.out.println("gameWords : " + gameWords[i]);
		}

		// ������ ���� ���̵��� �������� selectedLevel�� �����ϱ�
		selectedLevel = gameLevel;

		// ������ ���� ������ �������� selectedTheme�� �����ϱ�
		selectedTheme = theme;

		System.out.println("Hangman playScreen ������ questionNum : " + questionNum);

		// gameWords[�ε��� ��ȣ 0] ���� �����Ѵ�
		word = gameWords[questionNum];

		// wordDefinitions[�ε��� ��ȣ 0] ���� �����Ѵ�
		wordMeaning = wordDefinitions[questionNum];

		// ����â ���ȭ�� ����
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

		// �̹����� ���� ���̺� �ν��Ͻ�
		imgBox = new JLabel();

		// Ʋ���� ���� �̹��� img�迭 �ν��Ͻ�
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

		// ���ȭ�� ���� �߰��� �г� �޼��� ȣ��
		setWordPanel(); // �ܾ �����ִ� �г�
		setThemePanel(); // ���̵��� ������ �����ִ� �г�
		setAlphabetPanel(); // ���ĺ� Ű���� ��ư �г�
		setBackButtonPanel(); // �ڷΰ��� ��ư �г�
		setNextButton(); // ���� �ܾ� ��ư �г�
		setDiamondPanel(); // � ��Ʈ�� �ִ��� �����ִ� �г�
		setHintPanel(); // ��Ʈ ��ư �г�
		setScorePanel(); // ������ �����ִ� �г�

		// ���ȭ�鿡 ���� ȣ���� �гε� �߰�
		background.add(north1); // ������ �����ִ� �г�
		background.add(north2); // ������ �����ִ� �г�
		background.add(south1); // A ~ R Ű���� ����
		background.add(south2); // S ~ Z Ű���� ����
		background.add(south3); // �ڷΰ��� ��ư
		background.add(south4); // ���� �ܾ���� �� ��ư
		background.add(east1); // �ܾ� ��Ʈ ���̾Ƹ��
		background.add(east2); // �ܾ� ��Ʈ���� ������ ������ ��ư
		background.add(wordPanel); // _ _ _ _ �ܾ� �г�

		// �����ӿ� ���ȭ�� �߰�
		add(background);
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

		// ������ ��ġ
		setLocation(x, y);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Go Back ��ư �������� �̺�Ʈ ó��
		backToMain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playerRecord = "���̵�: "+selectedLevel + " " + "����: "+selectedTheme + " " + "����: "+scoreCnt + "��";
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

		// Next ��ư �������� �̺�Ʈ ó��
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
					background.add(wordPanel); // _ _ _ _ _ _ �ܾ�
					getContentPane().add(background);
					revalidate();
					repaint();
					imageCnt = 0;
					System.out.println("next ActionListener() word : " + word);
					System.out.println();
				} else if (questionNum == gameWords.length) { // questionNum�� �ܾ� ������ ������ questionNum�� hintNum�� 0���� �ʱ�ȭ
					showEndOfWordsMessage();
					playerRecord = "���̵�: "+selectedLevel + " " + "����: "+selectedTheme + " " + "����: "+scoreCnt + "��";
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

		// Hint ��ư �������� �̺�Ʈ ó��
		hintBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�޼��忡 ������ �� hintNum : " + hintNum);
				System.out.println("hint ActionListener word: " + word);

				if (hintNum >= 0) {
					hintNum--;
					hintCount.setText(String.format("%d", hintNum));
					// �ܾ���� 3�� �Ǵ� �� ���ϸ� ��Ʈ�� �ѹ��� �� �� �ִ�
					if (word.length() <= 3) {
						hintBtn.setEnabled(false);
					}
					System.out.println("if���� ������ �� hintNum : " + hintNum);
					
					String total = ""; //���� �ܾ �����ؼ� ������ ���ڿ� ����
					
					// word.charAt(�ε��� ��ȣ)�� ���ڿ� word.charAt(rHintNum[hintNum])�� ���ڰ� ��Ī�Ǹ� lineLable[i]�� �� ���ڷ� �ٲ��ش�
					
					for (int i = 0; i < word.length(); i++) {
						total += (String.valueOf(word.charAt(i)));
						if (String.valueOf(word.charAt(i))
								.equalsIgnoreCase(String.valueOf(word.charAt(rHintNum[hintNum])))) {
							lineLabel[i].setText(String.valueOf(word.charAt(i)));
						}
					}
					
					System.out.println("total : " + total);
					
					String totalLine = ""; //����ڰ� ������ ���ĺ��� ������ ���ڿ� ���� 
					for (int i = 0; i < lineLabel.length; i++) {
						totalLine += lineLabel[i].getText();
					}
					System.out.println("totalLine : " + totalLine);

					if (total.equalsIgnoreCase(totalLine)) {
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
						hintNum++;
						hintCount.setText(String.format("%d", hintNum));
						scoreCnt++; // �ܾ ���߸� ������ 1�� �߰��ȴ�
						//playerRecord += " " + scoreCnt;
						score.setText("SCORE " + scoreCnt + "/" + wordList.length);
						if (scoreCnt > 0) {
							hintBtn.setEnabled(false); // �ش� ������ ���� â������ Hint ��ư�� ��Ȱ��ȭ �Ѵ�
						}

						// ������ ����� ���� ���ĺ� Ű���� ActionListener ��� ����
						for (int i = 0; i < alphabet1.length; i++) {
							jb1[i].removeActionListener(this);
						}

						for (int i = 0; i < alphabet2.length; i++) {
							jb2[i].removeActionListener(this);
						}

						showCorrectWordsMessage();
					}

					// hint�� ������ ���� ���ĺ��� ��Ȱ��ȭ �Ѵ�
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


	// ���� �ܾ ���� �� Ŭ���� ������ ������ �޼���
	public void showEndOfWordsMessage() {
		JOptionPane.showMessageDialog(this, "You've reached the end of " + selectedTheme
				+ " words.\n Please click Ȯ�� to return to the main screen.");
	}

	public void showCorrectWordsMessage() {
		JOptionPane.showMessageDialog(this, "Good Job!\n�ܾ� Ǯ�� : " + wordMeaning);
	}

	// ���ȭ�� �ʱ�ȭ
	public void refreshBackground() {
		background.removeAll();
	}

	// ���ĺ� Ű���� �ʱ�ȭ
	public void refreshAlphabets() {

		// Ű���� �г� ����
		south1.removeAll();
		south2.removeAll();

		// Ű���� �г� ���ġ
		for (int i = 0; i < alphabet1.length; i++) {
			jb1[i] = new JButton(alphabet1[i]);
			jb1[i].setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			jb1[i].setBorder(border);
			jb1[i].addActionListener(this);
			south1.add(jb1[i]);
		}
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
		int button = (south1.getWidth() / 9) / 2;
		south2.setLayout(new GridLayout(1, 5, 0, 0));
		south2.setBounds(south1.getX() + button, south1.getY() + south1.getHeight(), 400, south1.getHeight() / 2);
	}

	// ���� ���� �ʱ�ȭ
	public void refreshGameImage() {
		System.out.println("refreshGameImage()�� ����");

		// ���� ���� ����
		gameImage.removeAll();
		gameImage.setVisible(false);
	}

	// ��Ʈ�� �� ������ �ε��� ��ȣ �̱�
	public void getRandomHintNumber() {

		HashSet<Integer> set = new HashSet<>();

		System.out.println("getRandomHintNumber()�� hintNum : " + hintNum);
		System.out.println("getRandomHintNumber()�� word : " + word);

		// �ܾ��� ���߿��� hintNum ������ŭ �����ϰ� ���ڸ� �̾� set�� �߰��Ѵ�
		while (true) {
			if (hintNum > word.length()) {
				break;
			}
			set.add(r.nextInt(word.length()));
			if (set.size() == hintNum) {
				break;
			}
		}

		// �߰��� ���ڸ� rNum�迭�� �ִ´�
		Iterator<Integer> iter = set.iterator();

		// hintNum�� ����ŭ rHintNum �迭 ����
		rHintNum = new int[hintNum];

		for (int i = 0; i < set.size(); i++) {
			if (iter.hasNext()) {
				rHintNum[i] = iter.next();
			}
			// rHintNum�� �� �� Ȯ��
			System.out.println("rHintNum : " + rHintNum[i]);
		}
	}

	// ���ĺ� Ű���� ��ư�� �������� ������ ����� �޼���
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

	// �ܾ ���� �г�
	public void setWordPanel() {
		System.out.println("setWordPanel()�� ����");
		System.out.println("setWordPanel() word : " + word);

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

		wordPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		wordPanel.setBackground(Color.WHITE);
		wordPanel.setBounds(100, 660, 1200, 70);
		wordPanel.setBorder(border);

	}

	// ������ ���� �г�
	public void setScorePanel() {
		// ������ �����ִ� �г� ��ġ
		score = new JLabel("SCORE " + scoreCnt + "/" + wordList.length);
		score.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		north2.add(score);
		north2.setBackground(Color.WHITE);
		north2.setBorder(border);
		north2.setLayout(new GridBagLayout());
		north2.setBounds(east2.getX(), north1.getY(), 200, 40);

	}

	// ���̵��� �׸��� ���� �г�
	public void setThemePanel() {

		themeLabel = new JLabel(selectedLevel + " : " + selectedTheme);
		themeLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		north1.add(themeLabel);
		north1.setBackground(Color.WHITE);
		north1.setBorder(border);
		north1.setLayout(new GridBagLayout());
		north1.setBounds(wordPanel.getX(), 20, 400, 40);

	}

	// ���ĺ� Ű���尡 ���� �г�
	public void setAlphabetPanel() {
		// ���ĺ� A~R Ű���� ��ġ
		for (int i = 0; i < alphabet1.length; i++) {
			jb1[i] = new JButton(alphabet1[i]);
			jb1[i].setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			jb1[i].setBorder(border);
			jb1[i].addActionListener(this);
			south1.add(jb1[i]);
		}
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
		int button = (south1.getWidth() / 9) / 2;
		south2.setLayout(new GridLayout(1, 5, 0, 0));
		south2.setBounds(south1.getX() + button, south1.getY() + south1.getHeight(), 400, south1.getHeight() / 2);
	}

	// �ڷΰ��� ��ư�� ���� �г�
	public void setBackButtonPanel() {

		backToMain.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		backToMain.setBorder(border);
		south3.add(backToMain);
		south3.setBorder(border);
		south3.setLayout(new GridLayout(1, 0, 0, 0));
		south3.setBounds(south1.getX() + south1.getWidth() + 80, south2.getY(), 300, 50);
	}

	// ���� �ܾ�� ���� ��ư�� ���� �г�
	public void setNextButton() {

		next.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		next.setBorder(border);
		south4.add(next);
		south4.setBorder(border);
		south4.setLayout(new GridLayout(1, 0, 0, 0));
		south4.setBounds(south3.getX() + south3.getWidth(), south2.getY(), 300, 50);
	}

	// ��Ʈ�� � �ִ����� ���� �г�
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

	// ��Ʈ��ư�� ���� �г�
	public void setHintPanel() {

		hintBtn.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		hintBtn.setBorder(border);
		hintBtn.setEnabled(false);
		east2.add(hintBtn);
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
				playSound("correct_alphabet_sound.wav"); // ����ڰ� ������ ���ĺ��� �ܾ ������ �׿� �ش��ϴ� ������ ���´�
				lineLabel[i].setText(alphabet);
				cnt++; // ����ڰ� ������ ���ĺ��� �ܾ �ִ� ���ĺ��� ���ٸ� cnt�� ++�ȴ�
						// �׷��� if(cnt == 0)�� �ȵ�. �׷��Ƿ� Ʋ������ �������� ������ �ȳ���
			}
		}
		if (!checkSpelling) { // ����ڰ� ������ ���ĺ��� �ܾ ������ �׿� �ش��ϴ� ������ ���´�
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

	// ���ĺ��� Ŭ�������� �߻��Ǵ� �̺�Ʈ
	@Override // ����ڰ� ���ĺ��� �������� �� �޼��尡 ȣ��ȴ�!
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) { // e.getActionCommand()�� ���ĺ� ���̴�
		case "A":
			jButton1(0, "A"); // ��밡�� ���� ���ĺ��� �ܾ �ִ��� �ƴ��� ó�����ִ� �޼��带 ȣ���Ѵ�
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

		boolean checkWordSpace = false; // totalWord�� ������ ������ if���� �� true�� �ǰ� ������ �ִ� ���ڳ��� ���ϴ� if������ ����

		String userWord = ""; // ������ �ܾ ������ ������ ����ڰ� ������ ���ĺ��� �������� �����ϴ� ���ڿ� ����

		String userWordWithSpace = " "; // ������ �ܾ ������ ������ ����ڰ� ������ ���ĺ��� �������� �����ϴ� ���ڿ� ����

		String wordWithSpace = " "; // ������ �ܾ ������ ������ ������� �ٽ� �ٿ��� �����ϴ� ���ڿ� ����

		// ����ڰ� ������ ���ĺ��� �ܾ ������ totalWord�� ������Ų��
		for (int i = 0; i < word.length(); i++) {
			userWord += lineLabel[i].getText();
		}

		// total�� ������ " " ������ ���ڿ��� �и��ؼ� �ٽ� ������� ���̴� �۾�
		String[] partsOfTotalWord = {};

		if (userWord.contains("   ")) {
			checkWordSpace = true;
			System.out.println("checkWordSpace�� true�� ��");
			partsOfTotalWord = userWord.split("   ");
			for (int i = 0; i < partsOfTotalWord.length; i++) {
				userWordWithSpace += partsOfTotalWord[i];
			}
		}

		// ������ �ܾ� word�� ������ ������ ������ �������� �и��ؼ� �ٽ� ������� ���̴� �۾�
		String[] partsOfWord = {};
		if (word.contains(" ")) {
			partsOfWord = word.split(" ");
			for (int i = 0; i < partsOfWord.length; i++) {
				wordWithSpace += partsOfWord[i];
			}
		}

		// Ȯ�ο�
		System.out.println("totalWordWithSpace : " + userWordWithSpace);
		System.out.println("wordWithSpace : " + wordWithSpace);
		System.out.println("totalWordWithSpace�� wordWithSpace�� "
				+ (userWordWithSpace.equalsIgnoreCase(wordWithSpace) ? "����" : "Ʋ����"));
		System.out.println();
		System.out.println("totalWord : " + userWord);
		System.out.println("word : " + word);
		System.out.println("totalWord�� word�� " + (userWord.equalsIgnoreCase(word) ? "����" : "Ʋ����"));

		// �ܾ ������ ������ userWord�� ������ �ܾ� word�� ����
		if (userWord.equalsIgnoreCase(word)) {
			System.out.println("total.equalsIgnoreCase(word)�� ����");

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
			if (questionNum != 4) {
				hintNum++;
				hintCount.setText(String.format("%d", hintNum));
			}
			scoreCnt++; // �ܾ ���߸� ������ 1�� �߰��ȴ�
			//playerRecord += " " + scoreCnt;
			score.setText("SCORE " + scoreCnt + "/" + wordList.length);
			if (scoreCnt > 0) {
				hintBtn.setEnabled(false); // �ش� ������ ���� â������ Hint ��ư�� ��Ȱ��ȭ �Ѵ�
			}

			// ������ ����� ���� ���ĺ� Ű���� ActionListener ��� ����
			for (int i = 0; i < alphabet1.length; i++) {
				jb1[i].removeActionListener(this);
			}

			for (int i = 0; i < alphabet2.length; i++) {
				jb2[i].removeActionListener(this);
			}

			JOptionPane.showMessageDialog(this, "Good Job!\n�ܾ� Ǯ�� : " + wordMeaning);
		}

		// �ܾ ������ ������ ����
		else if (checkWordSpace && userWordWithSpace.equalsIgnoreCase(wordWithSpace)) {
			System.out.println("checkWordSpace && newTotal.equalsIgnoreCase(newWord)�� ����");
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
			if (questionNum != 4) {
				hintNum++;
				hintCount.setText(String.format("%d", hintNum));
			}
			scoreCnt++;
			//playerRecord += " " + scoreCnt;
			score.setText("SCORE " + scoreCnt + "/" + wordList.length);

			// ������ ����� ���� ���ĺ� Ű���� ActionListener ��� ����
			for (int i = 0; i < alphabet1.length; i++) {
				jb1[i].removeActionListener(this);
			}

			for (int i = 0; i < alphabet2.length; i++) {
				jb2[i].removeActionListener(this);
			}

			JOptionPane.showMessageDialog(this, "Good Job!\n�ܾ� Ǯ�� : " + wordMeaning);
		}

		if (cnt == 0 && imageCnt == 8) {
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
			if (hintNum > 0) {
				hintBtn.setEnabled(false);
			}
			// ������ ����� ���� �� ���� ���ĺ��� ����ڿ��� �����ش�
			for (int i = 0; i < word.length(); i++) {
				if ((lineLabel[i].getText().contains("__ "))) {
					lineLabel[i].setText((String.valueOf(word.charAt(i))));
				}
			}

			// ������ ����� ���� ���ĺ� Ű���� ActionListener ��� ����
			for (int i = 0; i < alphabet1.length; i++) {
				jb1[i].removeActionListener(this);
			}

			for (int i = 0; i < alphabet2.length; i++) {
				jb2[i].removeActionListener(this);
			}

			JOptionPane.showMessageDialog(this, "The answer was " + word + "!\n�ܾ� Ǯ�� : " + wordMeaning);

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
