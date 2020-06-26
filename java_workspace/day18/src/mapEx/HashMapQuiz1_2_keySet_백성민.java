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
public class HashMapQuiz1_2_keySet_�鼺�� {

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
		
		//keySet() �޼��带 Ȱ���ؼ� �����ϰ� ������ ����ϰ� ����
		Set<String> set = word.keySet();
		List noun = new ArrayList(set); 
		Collections.shuffle(noun);
		Iterator<String> iter = noun.iterator();
		
		//word�� �ִ� value�� ��������
		//Collection<String> value =  word.values();
		//Iterator<String> iter2 = value.iterator();
		
		Scanner sc = new Scanner(System.in);
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


	}

}
