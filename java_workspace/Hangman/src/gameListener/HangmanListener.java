package gameListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import game.GameScreen;
import menu.MenuScreen;

public class HangmanListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		case "START":
			MenuScreen ms = new MenuScreen();
			//ms.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			ms.setVisible(false);
			new GameScreen();
			break;

		case "EXIT":
			System.exit(0);
			break;
		}
		
	}

}
