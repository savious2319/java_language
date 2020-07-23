package hunminGame;

import java.util.HashSet;
import java.util.Random;

public class Question{
	private char [] themes = {'¤¡', '¤¤', '¤§', '¤©', '¤±', '¤²', '¤µ', '¤·', '¤¸', '¤º', /*'¤»', '¤¼', '¤½',*/ '¤¾'};

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
	
	//´äº¯ Ã¼Å© ¸Þ¼­µåµé---------------------
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
		case '¤¡':
			checkResult = '°¡' <= answer && answer <= 'ƒ‰';		break;
		case '¤¤':
			checkResult = '³ª' <= answer && answer <= 'ˆ¢';		break;
		case '¤§':
			checkResult = '´Ù' <= answer && answer <= '‹L';		break;
		case '¤©':
			checkResult = '¶ó' <= answer && answer <= '¡';		break;
		case '¤±':
			checkResult = '¸¶' <= answer && answer <= '“J';		break;
		case '¤²':
			checkResult = '¹Ù' <= answer && answer <= '•½';		break;
		case '¤µ':
			checkResult = '»ç' <= answer && answer <= 'šï';		break;
		case '¤·':
			checkResult = '¾Æ' <= answer && answer <= 'Ÿç';		break;
		case '¤¸':
			checkResult = 'ÀÚ' <= answer && answer <= '£ ';		break;
		case '¤º':
			checkResult = 'Â÷' <= answer && answer <= '¯†';		break;
		case '¤»':
			checkResult = 'Ä«' <= answer && answer <= 'µi';		break;
		case '¤¼':
			checkResult = 'Å¸' <= answer && answer <= '»M';		break;
		case '¤½':
			checkResult = 'ÆÄ' <= answer && answer <= 'À˜';		break;
		case '¤¾':
			checkResult = 'ÇÏ' <= answer && answer <= 'ÆR';		break;
		}//end_switch
		
		
		return checkResult;
		
	}
	
}
