package main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Scrollbar;
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

public class MainPage extends JFrame {
	JPanel north = new JPanel();
	JPanel center = new JPanel();
	JPanel west = new JPanel();
	JPanel east = new JPanel();
	BevelBorder raisedBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.RAISED);
	BevelBorder loweredBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.LOWERED);

	Border border = BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);
	
	//게임 난이도
	String[] gameLevel = {"EASY", "MEDIUM", "HARD"};
	JButton[] jb = new JButton[3];
	
	//게임 주제
	String[] theme = {"Occuptations", "Animals & Insects", "Books & Movies", "Countries & Cities", "Vehicles", "Colors", "Famous People"};
	
	JList<Object> list;

	public MainPage() {

		// North
		setLayout(null);
		JLabel jTitle = new JLabel("HANGMAN");
		jTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 70));
		// north.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		north.setBorder(border);
		north.setBounds(150, 30, 400, 100);
		north.add(jTitle);
		// setContentPane(north);

		// Center
		for (int i = 0; i < gameLevel.length; i++) {
			jb[i] = new JButton(gameLevel[i]);
			center.add(jb[i]);
		}
		
		center.setBounds(150, 160, 400, 100);
		
		//West
		Vector<String> themeList = new Vector<>();
		for (int i = 0; i < theme.length; i++) {
			themeList.add(theme[i]);
		}
		list = new JList<>(themeList);
		
		list.setVisibleRowCount(3);
		
		west.add(new JScrollPane(list));
		
		
		
		add(north);
		add(center);
		add(west);
		setVisible(true);
		setBounds(500, 300, 700, 500);

		
	}

	public static void main(String[] args) {

		new MainPage();

	}

}
