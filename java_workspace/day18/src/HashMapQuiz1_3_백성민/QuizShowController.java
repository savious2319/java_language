package HashMapQuiz1_3_�鼺��;

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
		//���̵� �Է�
		System.out.println("���̵� �Է��ϼ���");
		temp.setId(sc.next());
		
		
		list.add(temp);
	}
	
	
	public void startQuiz() {
		Set<String> set = word.keySet();
		List noun = new ArrayList(set); 
		Collections.shuffle(noun);
		Iterator<String> iter = noun.iterator();
		QuizShow temp = new QuizShow();
		
		int cnt = 0; //���� �� ����
		String userInput = ""; // ����� ����
		int score = 0; // ����� ����
		System.out.println("�ܾ� ���߱� Quiz (���� <-> �ѱ�)");
		while(iter.hasNext()) {
			String question = iter.next(); //iter�� ��ϵ� key���� question������ ��� �д�
			//System.out.println(question);
			String answer = word.get(question);  //iter2�� ��ϵ� value���� answer������ ��� �д�
			//System.out.println(answer);
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
