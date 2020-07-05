package menu;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import gameListener.HangmanListener;

public class MenuScreen extends JFrame {
	JPanel north = new JPanel();
	JPanel center = new JPanel();
	JPanel west = new JPanel();
	JPanel east = new JPanel();
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	BevelBorder raisedBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.RAISED);
	BevelBorder loweredBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.LOWERED);

	Border border = BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);
	
	//게임 난이도
	String[] gameLevel = {"EASY", "MEDIUM", "HARD"};
	JButton[] jb = new JButton[3];
	
	//게임 주제
	String[] theme = {"Occuptations", "Animals & Insects", "Books & Movies", "Countries & Cities", "Vehicles", "Colors", "Famous People"};
	
	JList<Object> list;

	public MenuScreen() {
		setLayout(null);

		// North
		JLabel gameTitle = new JLabel("HANGMAN");
		gameTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 70));
		north.setLayout(new FlowLayout(FlowLayout.CENTER));
		//north.setLayout(new GridLayout());
		north.setBorder(border);
		north.setBackground(Color.WHITE);
		north.setBounds(150, 40, 400, 100);
		north.add(gameTitle);
		// setContentPane(north);

		// Center
		for (int i = 0; i < gameLevel.length; i++) {
			jb[i] = new JButton(gameLevel[i]);
			jb[i].setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			jb[i].setBorder(border);
			center.add(jb[i]);	
		}
		//center.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
		center.setLayout(new GridLayout(1, 3, 50, 0));
		//center.setBorder(border);
		center.setBounds(150, 150, 400, 45);
		
		//West
		Vector<String> themeList = new Vector<>();
		for (int i = 0; i < theme.length; i++) {
			themeList.add(theme[i]);
		}
		list = new JList<>(themeList);
		list.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		list.setBorder(border);
		list.setVisibleRowCount(3);
		
		west.add(new JScrollPane(list));
		west.setLayout(new GridLayout());
		west.setBounds(50, 220, 300, 150);
		
		//East
		JButton start = new JButton("START");
		JButton exit = new JButton("EXIT");
		start.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		exit.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		start.setBorder(border);
		exit.setBorder(border);
		east.add(start);
		east.add(exit);
		east.setBorder(border);
		east.setLayout(new GridLayout(2,0, 50, 0));
		east.setBounds(west.getX()+west.getWidth()+60, west.getY(), 200, 150);
		
		
		//JFrame
		add(north);
		add(center);
		add(west);
		add(east);
		setTitle("HANGMAN Ver1.0");
		setVisible(true);
		setSize(700, 450);
		//모니터 해상도 찾기
		Dimension di = tk.getScreenSize();
		int mWidth = di.width;
		int mHeight = di.height;
		
		//모니터 중앙 위치 찾기
		int x = mWidth/2 - getWidth()/2;
		int y = mHeight/2 - getHeight()/2;
		
		setLocation(x, y);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트 처리
		start.addActionListener(new HangmanListener());
		exit.addActionListener(new HangmanListener());
		
	}

}
