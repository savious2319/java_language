package hangman;

import java.util.HashMap;

public class StartHangman {
	static HashMap<String, Integer> themes = new HashMap<>(); //주제와 관련된 단어들과 해당 인덱스 번호를 저장하는 HashMap
	static HashMap<String, Integer> wordDefinitions = new HashMap<>(); //주제와 관련된 단어 풀이들과 해당 인덱스 번호를 저장하는 HashMap
	
	public void main(String[] args) {
		
		themes.put("Occupations", 0);
		themes.put("Animals & Insects", 1);
		themes.put("Movies", 2);
		themes.put("Countries & Cities", 3);
		themes.put("Vehicles & Transportation", 4);
		themes.put("Family", 5);
		themes.put("Famous People", 6);
		
		wordDefinitions.put("Occupations", 0);
		wordDefinitions.put("Animals & Insects", 1);
		wordDefinitions.put("Movies", 2);
		wordDefinitions.put("Countries & Cities", 3);
		wordDefinitions.put("Vehicles & Transportation", 4);
		wordDefinitions.put("Family", 5);
		wordDefinitions.put("Famous People", 6);
		

		new HangmanMainScreen();
	}

}
