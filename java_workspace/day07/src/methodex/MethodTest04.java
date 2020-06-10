package methodex;

import java.util.Scanner;

public class MethodTest04 {
	/*
	 	1) call by value (������)
	 	
	 		fct(10,20);  <--- �⺻���� �����ϴ� ��
	 	
	 	2) call by reference (������ ����)
	 	
	 		fct(��ü or �ν��Ͻ�) 
	 	
	 		fct(obj)
	 		fct(arr)  //�迭   ���� ���ÿ� ����ȴ�!
	 	
	 */
	/**
	 * This is a method that  the maximum and minimum values of the integers in the arRand array.
	 * @param arRand �迭�� �� �������� �����ϴ�
	 * @param maxMin �ּҰ��� �ִ밪�� ������� ���� �迭�� �����ϴ�.
	 */
	void getMax_minNumber(int[]arRand, int[]values) { // call by reference
		values[0] = arRand[0]; // �ּҰ�
		values[1] = arRand[0]; // �ִ밪
		
		for (int i = 1; i < arRand.length; i++) {
			if(values[0] > arRand[i]) {
				values[0] = arRand[i];
			}
			if(values[1] < arRand[i]) {
				values[1] = arRand[i];
			}
		}
		
		//return�̳� (������) ���̵�, Ÿ �޼����� ������� �����ų �� �ִ�.
		// call by reference
		
	}
	String changeToUpperCaseSentence(String str) {
		//�빮�ڷ� �����ϴ� �˰���
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c <= 'z' && c >= 'a') {
				result += (char)(c - 32)+"";
			}else {
				result += c;
			}
		}
		return result;
	}
	

	public static void main(String[] args) {
		int [] maxMin = {0, 0};
		
		int [] arRand = {23,42,45,454,353,454,54,53,4,54};
		
		MethodTest04 mt = new MethodTest04();
		
		                    // ?  ,  ?
		mt.getMax_minNumber(arRand, maxMin);	//? : ������
									            //? : �ִ밪�� �ּҰ��� ������ �� �ִ� �迭
		
		System.out.println("�ּҰ� : " + maxMin[0]);
		System.out.println("�ִ밪 : " + maxMin[1]);
		
		String msg = "aGc";  // �빮�� �ٲٱ�
		String toUpperMsg = msg.toUpperCase(); //msg�� �ִ� �����ڸ� �빮�ڷ� ��� �����ض�!
		
		System.out.println(msg);
		System.out.println(toUpperMsg);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ҹ��� ���� ������ �Է��ϼ��� : ");
		msg = sc.nextLine();
		System.out.println(msg); // �ҹ���
		
		//toUpperMsg = mt.changeToUpperCaseSentence(new Scanner(System.in).nextLine());
		toUpperMsg = mt.changeToUpperCaseSentence(msg);
		
		System.out.println(toUpperMsg); // �빮��
		
		
		
	}
	
}
