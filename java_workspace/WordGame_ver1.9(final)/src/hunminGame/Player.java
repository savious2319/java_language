package hunminGame;

import java.util.ArrayList;

public class Player {
	int num;
	int life = 3;
	ArrayList<String> p_answers = new ArrayList<>();
	
	public Player() {
		this.num = GameStart.playerNum++;
		p_answers.add("");
		p_answers.add("");
	}
	
}
