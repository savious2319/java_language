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
public class HashMapQuiz1_2_entrySet_�鼺�� {

	public static void main(String[] args) {
HashMap<String, String> word = new HashMap<>();
		
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
		
		
		//entrySet() �޼��带 Ȱ���ϴ� ���
		Set<Map.Entry<String, String>> set =  word.entrySet();
		List<Map.Entry<String, String>> noun = new ArrayList<Map.Entry<String,String>>(set);
		Collections.shuffle(noun);
		Iterator <Map.Entry<String, String>> iter = noun.iterator();
		
		
//		for (Entry<String, String> string : random) {
//			string.g
//		}
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String userInput = ""; // ����� ����
		int score = 0; // ����� ����
		System.out.println("�ܾ� ���߱� Quiz (���� <-> �ѱ�)");
		while(iter.hasNext()) {
			String question = iter.next().getKey();
			String answer = word.get(question);
			System.out.println("����"+ ++cnt+ ") "+ question);
			userInput = sc.next();
			if(answer.equalsIgnoreCase(userInput)) {
				score += 10;
				System.out.println("�����Դϴ�! (���� ���� : " + score+"��)");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ� �Ф� ������ " + answer+"�Դϴ� (���� ���� : " + score+"��)");
			}


		}
		System.out.println("���� ���� (�� ���� : "+score+")");


	}

}
