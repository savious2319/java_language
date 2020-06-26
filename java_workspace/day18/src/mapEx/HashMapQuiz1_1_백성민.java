package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 퀴즈문제 단어 맞추기 #1
	 
HashMapQuiz1_1_백성민.java

	   영어   -   한글
           문제       답변
  (key)     (value)
   1.      apple -  사과
   2.      rabbit - 토끼
   3.	   당근    -  carrot
   4.	   컴퓨터   -  computer
   5.      puppy  -  강아지  
	출력 예) 단어 맞추기 영어 <---> 한글
	    총 10문제 중
	    문제1)   당근
 		  : carrot
		  맞쳤습니다. 10점
	총 0점
 */
public class HashMapQuiz1_1_백성민 {

	public static void main(String[] args) {
		
		HashMap<String, String> word = new HashMap<>();
		
		word.put("tiger", "호랑이");
		word.put("비", "rain");
		word.put("laptop", "노트북");
		word.put("안경", "glasses");
		word.put("bread", "빵");
		word.put("신발", "shoes");
		word.put("parasite", "기생충");
		word.put("얼간이", "chump");
		word.put("prodigy", "영재");
		word.put("배열", "array");
		
		Set<String> set = word.keySet();
		Iterator<String> iter = set.iterator();
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String answer = ""; // 사용자 정답
		int score = 0; // 사용자 점수
		System.out.println("단어 맞추기 Quiz (영어 <-> 한글)");
		while(iter.hasNext()) {
		String key = iter.next();	
		System.out.println("문제"+ ++cnt+ ") "+ key);
		answer = sc.next();
		if(word.containsValue(answer)) {
			score += 10;
			System.out.println("정답입니다! (현재 점수 : " + score+"점)\n");
		}else {
			System.out.println("틀렸습니다 ㅠㅠ (현재 점수 : " + score+"점)\n");
		}
		
		
		}
		System.out.println("퀴즈 종료 (총 점수 : "+score+"점)");
	}

}













