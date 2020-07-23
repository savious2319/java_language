package hunminGame;

import java.util.Random;

public class GameStart {

	static boolean whoTurn = true;
	static int tCount = 10;
	static int playerNum = 1;
	
	static Player p1 = new Player();
	static Player p2 = new Player();
	
	public static void main(String[] args) {
		Random rand = new Random();
		int randnum = rand.nextInt(2);
		System.out.println(randnum);
		if(randnum == 0) {
			whoTurn = true;
		}else {
			whoTurn = false;
		}
		
		Question q = new Question();

		q.newQuestion();
		
		new Hun_GameScreen(q);
		
		
	}
	
	
}
