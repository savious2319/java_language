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
public class HashMapQuiz1_2_entrySet_백성민 {

	public static void main(String[] args) {
HashMap<String, String> word = new HashMap<>();
		
		word.put("tiger", "호랑이");
		word.put("비", "rain");
		word.put("laptop", "노트북");
		word.put("안경", "glasses");
		word.put("bread", "빵");
		word.put("신발", "shoes");
		word.put("parasite", "기생충");
		word.put("여름", "summer");
		word.put("prodigy", "영재");
		word.put("배열", "array");
		
		
		//entrySet() 메서드를 활용하는 방법
		Set<Map.Entry<String, String>> set =  word.entrySet();
		List<Map.Entry<String, String>> noun = new ArrayList<Map.Entry<String,String>>(set);
		Collections.shuffle(noun);
		Iterator <Map.Entry<String, String>> iter = noun.iterator();
		
		
//		for (Entry<String, String> string : random) {
//			string.g
//		}
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String userInput = ""; // 사용자 정답
		int score = 0; // 사용자 점수
		System.out.println("단어 맞추기 Quiz (영어 <-> 한글)");
		while(iter.hasNext()) {
			String question = iter.next().getKey();
			String answer = word.get(question);
			System.out.println("문제"+ ++cnt+ ") "+ question);
			userInput = sc.next();
			if(answer.equalsIgnoreCase(userInput)) {
				score += 10;
				System.out.println("정답입니다! (현재 점수 : " + score+"점)");
			}else {
				System.out.println("틀렸습니다 ㅠㅠ 정답은 " + answer+"입니다 (현재 점수 : " + score+"점)");
			}


		}
		System.out.println("퀴즈 종료 (총 점수 : "+score+")");


	}

}
