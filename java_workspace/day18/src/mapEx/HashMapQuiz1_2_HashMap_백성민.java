package mapEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 	퀴즈문제 단어 맞추기 #2
	 
HashMapQuiz1_2_백성민.java

	문제를 랜덤하게 내자!

	(1)getKey() -> shuffle()
	(2)entrySet()
	(3)HashMap<Integer, ????>
 */
public class HashMapQuiz1_2_HashMap_백성민 {

	public static void main(String[] args) {
		
		QuizShow quiz1 = new QuizShow("tiger", "호랑이");
		QuizShow quiz2 = new QuizShow("비", "rain");
		QuizShow quiz3 = new QuizShow("laptop", "노트북");
		QuizShow quiz4 = new QuizShow("안경", "glasses");
		QuizShow quiz5 = new QuizShow("bread", "빵");
		QuizShow quiz6 = new QuizShow("신발", "shoes");
		QuizShow quiz7 = new QuizShow("parasite", "기생충");
		QuizShow quiz8 = new QuizShow("여름", "summer");
		QuizShow quiz9 = new QuizShow("prodigy", "영재");
		QuizShow quiz10 = new QuizShow("배열", "array");
		

		HashMap<Integer, QuizShow> word = new HashMap<>();

		word.put(1, quiz1);
		word.put(2, quiz2);
		word.put(3, quiz3);
		word.put(4, quiz4);
		word.put(5, quiz5);
		word.put(6, quiz6);
		word.put(7, quiz7);
		word.put(8, quiz8);
		word.put(9, quiz9);
		word.put(10, quiz10);
		
		Set<Integer> set = word.keySet();
		List quizNum = new ArrayList(set);
		Collections.shuffle(quizNum);
		Iterator<Integer> iter = quizNum.iterator();

		Collection<QuizShow> noun = word.values();
		Iterator<QuizShow> iter2 = noun.iterator();
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String userInput = ""; // 사용자 정답
		int score = 0; // 사용자 점수
		System.out.println("단어 맞추기 Quiz (영어 <-> 한글)");
		while (iter.hasNext()) {
			int index = iter.next();
			String question = word.get(index).word1;
			String answer = word.get(index).word2;
			System.out.println("문제" + ++cnt + ") " + question);
			userInput = sc.next();
			if (answer.equalsIgnoreCase(userInput)) {
				score += 10;
				System.out.println("정답입니다! (현재 점수 : " + score + "점)");
			} else {
				System.out.println("틀렸습니다 ㅠㅠ 정답은" + answer + "입니다 (현재 점수 : " + score + "점)");
			}

		}
		System.out.println("퀴즈 종료 (총 점수 : " + score + ")");

	}

}
