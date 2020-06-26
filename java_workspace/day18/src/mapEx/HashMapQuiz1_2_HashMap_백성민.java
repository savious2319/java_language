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
 	����� �ܾ� ���߱� #2
	 
HashMapQuiz1_2_�鼺��.java

	������ �����ϰ� ����!

	(1)getKey() -> shuffle()
	(2)entrySet()
	(3)HashMap<Integer, ????>
 */
public class HashMapQuiz1_2_HashMap_�鼺�� {

	public static void main(String[] args) {
		
		QuizShow quiz1 = new QuizShow("tiger", "ȣ����");
		QuizShow quiz2 = new QuizShow("��", "rain");
		QuizShow quiz3 = new QuizShow("laptop", "��Ʈ��");
		QuizShow quiz4 = new QuizShow("�Ȱ�", "glasses");
		QuizShow quiz5 = new QuizShow("bread", "��");
		QuizShow quiz6 = new QuizShow("�Ź�", "shoes");
		QuizShow quiz7 = new QuizShow("parasite", "�����");
		QuizShow quiz8 = new QuizShow("����", "summer");
		QuizShow quiz9 = new QuizShow("prodigy", "����");
		QuizShow quiz10 = new QuizShow("�迭", "array");
		

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
		String userInput = ""; // ����� ����
		int score = 0; // ����� ����
		System.out.println("�ܾ� ���߱� Quiz (���� <-> �ѱ�)");
		while (iter.hasNext()) {
			int index = iter.next();
			String question = word.get(index).word1;
			String answer = word.get(index).word2;
			System.out.println("����" + ++cnt + ") " + question);
			userInput = sc.next();
			if (answer.equalsIgnoreCase(userInput)) {
				score += 10;
				System.out.println("�����Դϴ�! (���� ���� : " + score + "��)");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ� �Ф� ������" + answer + "�Դϴ� (���� ���� : " + score + "��)");
			}

		}
		System.out.println("���� ���� (�� ���� : " + score + ")");

	}

}
