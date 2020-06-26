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
public class HashMapQuiz1_2_keySet_백성민 {

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
		
		//keySet() 메서드를 활용해서 랜덤하게 질문이 출력하게 하자
		Set<String> set = word.keySet();
		List noun = new ArrayList(set); 
		Collections.shuffle(noun);
		Iterator<String> iter = noun.iterator();
		
		//word에 있는 value를 추출하자
		//Collection<String> value =  word.values();
		//Iterator<String> iter2 = value.iterator();
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0; //문제 수 증가
		String userInput = ""; // 사용자 정답
		int score = 0; // 사용자 점수
		System.out.println("단어 맞추기 Quiz (영어 <-> 한글)");
		while(iter.hasNext()) {
			String question = iter.next(); //iter에 등록된 key값을 question변수에 담아 둔다
			//System.out.println(question);
			String answer = word.get(question);  //iter2에 등록된 value값을 answer변수에 담아 둔다
			//System.out.println(answer);
			System.out.println("문제"+ ++cnt+ ") "+ question);
			userInput = sc.next();
			if(answer.equalsIgnoreCase(userInput)) {
				score += 10;
				System.out.println("정답입니다! (현재 점수 : " + score+"점)\n");
			}else {
				System.out.println("틀렸습니다 ㅠㅠ 정답은 " + answer+"입니다 (현재 점수 : " + score+"점)\n");
			}


		}
		System.out.println("퀴즈 종료 (총 점수 : "+score+"점)");


	}

}
