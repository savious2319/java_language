package hunminGame;

import java.util.HashSet;
import java.util.Random;

public class Question{
	private char [] themes = {'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', /*'ㅋ', 'ㅌ', 'ㅍ',*/ 'ㅎ'};

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
	
	//답변 체크 메서드들---------------------
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
		case 'ㄱ':
			checkResult = '가' <= answer && answer <= '깋';		break;
		case 'ㄴ':
			checkResult = '나' <= answer && answer <= '닣';		break;
		case 'ㄷ':
			checkResult = '다' <= answer && answer <= '딯';		break;
		case 'ㄹ':
			checkResult = '라' <= answer && answer <= '맇';		break;
		case 'ㅁ':
			checkResult = '마' <= answer && answer <= '밓';		break;
		case 'ㅂ':
			checkResult = '바' <= answer && answer <= '빟';		break;
		case 'ㅅ':
			checkResult = '사' <= answer && answer <= '싷';		break;
		case 'ㅇ':
			checkResult = '아' <= answer && answer <= '잏';		break;
		case 'ㅈ':
			checkResult = '자' <= answer && answer <= '짛';		break;
		case 'ㅊ':
			checkResult = '차' <= answer && answer <= '칳';		break;
		case 'ㅋ':
			checkResult = '카' <= answer && answer <= '킿';		break;
		case 'ㅌ':
			checkResult = '타' <= answer && answer <= '팋';		break;
		case 'ㅍ':
			checkResult = '파' <= answer && answer <= '핗';		break;
		case 'ㅎ':
			checkResult = '하' <= answer && answer <= '힣';		break;
		}//end_switch
		
		
		return checkResult;
		
	}
	
}
