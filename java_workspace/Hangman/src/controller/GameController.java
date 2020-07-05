package controller;

import java.util.ArrayList;

import themes.Occupations;

public class GameController {
	
	ArrayList<Occupations> list = new ArrayList<>();
	String[]occupations = {"Teacher","Nurse","Policeman","Firefigher"};
	public void menu() {

//		easyWord.add(new Easy(new String[] { "Teacher", "Doctor", "Nurse" }, new String[] { "Aladdin" },
//				new String[] { "Dog" }));
		
		
		for (int i = 0; i < occupations.length; i++) {
			
			list.add(new Occupations(occupations[i]));
		}
		for (Occupations word : list) {
			System.out.println(word);
		}

	}

	public static void main(String[] args) {

		new GameController().menu();
	}

}
