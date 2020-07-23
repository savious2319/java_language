package hunminGame;

import java.util.HashSet;
import java.util.Random;

public class Question{
	private char [] themes = {'��', '��', '��', '��', '��', '��', '��', '��', '��', '��', /*'��', '��', '��',*/ '��'};

	HashSet<String> answers = new HashSet<>();

	char consonant_1;
	char consonant_2;
	String theme;

	public void newQuestion() {
		Random randNum = new Random();
		consonant_1 = themes[randNum.nextInt(themes.length)];
		consonant_2 = themes[randNum.nextInt(themes.length)];
		theme = String.valueOf(consonant_1) + consonant_2;
	}
	
	//�亯 üũ �޼����---------------------
	public boolean Check(char consonant_1, char consonant_2, String answer) {
		
		boolean checkResult = false;
		
		if(answer.length() == 2){
			
			checkResult = ThemeCheck(consonant_1, answer.charAt(0)) && ThemeCheck(consonant_2, answer.charAt(1));
			
		}else {
			
			checkResult = false;
		}
		
		return checkResult;
		
	}
	
	private boolean ThemeCheck(char checkT, char answer) {
		
		boolean checkResult = false;
		
		switch (checkT) {
		case '��':
			checkResult = '��' <= answer && answer <= '��';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '��';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '�L';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '��';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '�J';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '��';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '��';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '��';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '��';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '��';		break;
		case '��':
			checkResult = 'ī' <= answer && answer <= '�i';		break;
		case '��':
			checkResult = 'Ÿ' <= answer && answer <= '�M';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '��';		break;
		case '��':
			checkResult = '��' <= answer && answer <= '�R';		break;
		}//end_switch
		
		
		return checkResult;
		
	}
	
}
