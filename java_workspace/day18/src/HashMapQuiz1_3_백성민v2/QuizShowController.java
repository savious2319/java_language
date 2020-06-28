package HashMapQuiz1_3_�鼺��v2;

import java.util.ArrayList;
import java.util.Calendar;
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
	Calendar start = Calendar.getInstance();
	Calendar end = Calendar.getInstance();
	
	
	void quizMenu() {
		//ù 10����
		word.put("tiger", "ȣ����");
		word.put("��", "rain");
		word.put("laptop", "��Ʈ��");
		word.put("�Ȱ�", "glasses");
		word.put("bread", "��");
		word.put("�Ź�", "shoes");
		word.put("parasite", "�����");
		word.put("����", "summer");
		word.put("prodigy", "����");
		word.put("�迭", "array");
		
		int choice = -1;
		while(choice != 0) {
		System.out.println("1. ���� �����ϱ�");
		System.out.println("2. ���� ���� ����");
		//������ �޴� (����ڿ��� �Ⱥ��� �� ���� -> syso ���� ����)
		System.out.println("0. ����");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			String id = createPlayerId();
			startQuiz(id); 
			break;
		case 2: 
			displayScore();
			break;
		
		}
		}
	}
	
	public String createPlayerId() {
		String id = "";
		//���̵� �Է�
		System.out.println("���̵� �Է��ϼ���");
		id = sc.next();
		
		return id;
	}
	
	
	public void startQuiz(String id) {
		Set<String> set = word.keySet();
		List noun = new ArrayList(set); 
		Collections.shuffle(noun);
		Iterator<String> iter = noun.iterator();
		QuizShow temp = new QuizShow();
		
		long startTime = 0;
		int cnt = 0; //���� �� ����
		String userInput = ""; // ����� ����
		int score = 0; // ����� ����
		System.out.println("�ܾ� ���߱� Quiz (���� <-> �ѱ�)");
		while(iter.hasNext()) {
			String question = iter.next(); //iter�� ��ϵ� key���� question������ ��� �д�
			//System.out.println(question);
			String answer = word.get(question);  //iter2�� ��ϵ� value���� answer������ ��� �д�
			//System.out.println(answer);
			startTime = start.getTimeInMillis();
			System.out.println(startTime);
			System.out.println("����"+ ++cnt+ ") "+ question);
			userInput = sc.next();
			if(answer.equalsIgnoreCase(userInput)) {
				score += 10;
				System.out.println("�����Դϴ�! (���� ���� : " + score+"��)\n");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ� �Ф� ������ " + answer+"�Դϴ� (���� ���� : " + score+"��)\n");
			}


		}
		System.out.println("���� ���� (�� ���� : "+score+"��)");
		long endTime = end.getTimeInMillis();
		System.out.println(endTime);
		String sec = String.format("%.3f", (endTime - startTime) / (double)1000);
//		System.out.printf("%.3f",sec);
		
		temp.setId(id);
		temp.setTime(sec);
		temp.setScore(score);
		
		list.add(temp);
		
	}
	
	void displayScore() {
		System.out.println("�̸�\t����");
		
		Collections.sort(list);
		
		list.get(0).getScore();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		List<Integer> setList = new ArrayList<>(); 
//		Collections.sort(setList);
	}
	
	
	
	void adminMenu() {
		
		
		
	}
	
	void addQuiz() {
		
		
	}
	
	
	void manageScore() {
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
