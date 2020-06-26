package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 ����� �ܾ� ���߱� #1
	 
HashMapQuiz1_1_�鼺��.java

	   ����   -   �ѱ�
           ����       �亯
  (key)     (value)
   1.      apple -  ���
   2.      rabbit - �䳢
   3.	   ���    -  carrot
   4.	   ��ǻ��   -  computer
   5.      puppy  -  ������  
	��� ��) �ܾ� ���߱� ���� <---> �ѱ�
	    �� 10���� ��
	    ����1)   ���
 		  : carrot
		  ���ƽ��ϴ�. 10��
	�� 0��
 */
public class HashMapQuiz1_1_�鼺�� {

	public static void main(String[] args) {
		
		HashMap<String, String> word = new HashMap<>();
		
		word.put("tiger", "ȣ����");
		word.put("��", "rain");
		word.put("laptop", "��Ʈ��");
		word.put("�Ȱ�", "glasses");
		word.put("bread", "��");
		word.put("�Ź�", "shoes");
		word.put("parasite", "�����");
		word.put("����", "chump");
		word.put("prodigy", "����");
		word.put("�迭", "array");
		
		Set<String> set = word.keySet();
		Iterator<String> iter = set.iterator();
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String answer = ""; // ����� ����
		int score = 0; // ����� ����
		System.out.println("�ܾ� ���߱� Quiz (���� <-> �ѱ�)");
		while(iter.hasNext()) {
		String key = iter.next();	
		System.out.println("����"+ ++cnt+ ") "+ key);
		answer = sc.next();
		if(word.containsValue(answer)) {
			score += 10;
			System.out.println("�����Դϴ�! (���� ���� : " + score+"��)\n");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ� �Ф� (���� ���� : " + score+"��)\n");
		}
		
		
		}
		System.out.println("���� ���� (�� ���� : "+score+"��)");
	}

}













