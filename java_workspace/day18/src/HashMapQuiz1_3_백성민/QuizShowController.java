package HashMapQuiz1_3_백성민;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class QuizShowController {
	static Scanner sc = new Scanner(System.in);
	private static final String AdminPw = "0000";
	QuizShow quizShow = new QuizShow();
	ArrayList<QuizShow> list = new ArrayList<>();
	HashMap<String, String> word = new HashMap<>();
	
	
	
	void quizMenu() {
		//첫 10문제
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
		
		int choice = -1;
		while(choice != 0) {
		System.out.println("1. 게임 시작하기");
		System.out.println("2. 게임 성적 보기");
		//관리자 메뉴 (사용자에게 안보일 수 있음 -> syso 하지 않음)
		System.out.println("0. 종료");
		switch(choice) {
		case 1:
			createPlayerId();
			startQuiz(); 
			break;
		case 2: 
		
		
		
		}
		}
	}
	
	public void createPlayerId() {
		QuizShow temp = new QuizShow();
		//아이디 입력
		System.out.println("아이디를 입력하세요");
		temp.setId(sc.next());
		
		
		list.add(temp);
	}
	
	
	public void startQuiz() {
		Set<String> set = word.keySet();
		List noun = new ArrayList(set); 
		Collections.shuffle(noun);
		Iterator<String> iter = noun.iterator();
		QuizShow temp = new QuizShow();
		
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

		temp.setScore(score);
		list.add(temp);
		
	}
	
	void displayScore() {
		
		
	}
	
	
	
	void adminMenu() {
		
		
		
	}
	
	void addQuiz() {
		
		
	}
	
	
	void manageScore() {
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
