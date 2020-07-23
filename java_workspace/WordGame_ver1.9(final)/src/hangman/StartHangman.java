package hangman;

import java.util.HashMap;

public class StartHangman {
	static HashMap<String, Integer> themes = new HashMap<>(); //������ ���õ� �ܾ��� �ش� �ε��� ��ȣ�� �����ϴ� HashMap
	static HashMap<String, Integer> wordDefinitions = new HashMap<>(); //������ ���õ� �ܾ� Ǯ�̵�� �ش� �ε��� ��ȣ�� �����ϴ� HashMap
	
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
