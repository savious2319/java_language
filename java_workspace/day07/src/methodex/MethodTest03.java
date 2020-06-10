package methodex;

import java.util.Scanner;

public class MethodTest03 {
	/*
	 	1) call by value (������)
	 	
	 		fct(10,20);  <--- �⺻���� �����ϴ� ��
	 	
	 	2) call by reference (������ ����)
	 	
	 		fct(��ü or �ν��Ͻ�) 
	 	
	 		fct(obj)
	 		fct(arr)  //�迭   ���� ���ÿ� ����ȴ�!
	 	
	 */
	
	void changeArray(int []ar) {
		//ar ���������� arScore�� (�����Ϳ�) �������� ��� ���޵ȴ�.
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		//�� ����
		ar[0] = 100;
		ar[1] = 200;
	}
	
	public static void main(String[] args) {
		int [] arScore = {10, 20};
		
		new MethodTest03().changeArray(arScore); // �޼��忡�� �������� ���� ������ ���� �ִ�
		System.out.println(arScore[0]); // =100
		System.out.println(arScore[1]); // =200
		
		
		
		
		
		
	}
	
}
