package hangman2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class EasyWords {

	public EasyWords(String theme) {
		String[] gameWords = {}; // 주제에 관련된 단어들을 담는 문자열 배열
		String[] wordDefinitions = {};
		String gameLevel = "EASY";

		try {
			FileInputStream fis1 = new FileInputStream("easyWords.txt");
			BufferedInputStream bis1 = new BufferedInputStream(fis1);
			byte[] b1 = new byte[bis1.available()];
			bis1.read(b1);
			String easyWords = new String(b1);
			String[] arEasyWords = easyWords.split("\n");

			FileInputStream fis2 = new FileInputStream("easyWordsDefs.txt");
			BufferedInputStream bis2 = new BufferedInputStream(fis2);
			byte[] b2 = new byte[bis2.available()];
			bis2.read(b2);
			String easyWordsDefs = new String(b2);
			String[] arEasyWordsDefs = easyWordsDefs.split("\n");
			
			switch (theme) {
			case "Occupations":
				gameWords = arEasyWords[0].split(",");
				for (int i = 0; i < gameWords.length; i++) {
					System.out.println(gameWords[i]);
				}
				wordDefinitions = arEasyWordsDefs[0].split(",");
				for (int i = 0; i < wordDefinitions.length; i++) {
					System.out.println(wordDefinitions[i]);
				}
				break;
			case "Animals & Insects":
				gameWords = arEasyWords[1].split(", ");
				wordDefinitions = arEasyWordsDefs[1].split(", ");
				break;
			case "Movies":
				gameWords = arEasyWords[2].split(", ");
				wordDefinitions = arEasyWordsDefs[2].split(", ");
				break;
			case "Countries & Cities":
				gameWords = arEasyWords[3].split(", ");
				wordDefinitions = arEasyWordsDefs[3].split(", ");
				break;
			case "Vehicles & Transportation":
				gameWords = arEasyWords[4].split(", ");
				wordDefinitions = arEasyWordsDefs[4].split(", ");
				break;
			case "Family":
				gameWords = arEasyWords[5].split(", ");
				wordDefinitions = arEasyWordsDefs[5].split(", ");
				break;
			case "Famous People":
				gameWords = arEasyWords[6].split(", ");
				wordDefinitions = arEasyWordsDefs[6].split(", ");
				break;
			}

			bis2.close();
			fis2.close();
			bis1.close();
			fis1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		new HangmanPlayScreen(gameWords, wordDefinitions, theme, gameLevel);

	}

}
