package arrayEx;

import java.util.Scanner;

public class Array02_�鼺�� {

	public static void main(String[] args) {
		/*//�迭 ���� �� ���Է�
		int[]ar = new int[5];
		Scanner sc = new Scanner(System.in);
		//1. ���ϴ� ���� �Է¹޾Ƽ� �迭�� �־� ������
		//  ����� ������.
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			System.out.print(i+1 + "�� �� �Է�	: "); ar[i] = sc.nextInt();
			sum += ar[i]; //ó��
		}
		
		// alt + shift + z  --> �ڵ����� for���� �������
		
		System.out.println("��°�");
		for (int i = 0; i < ar.length; i++) {
//			System.out.println(i+1 + "�� �� : " + ar[i]);
			System.out.println("ar["+i+"] : " + ar[i] + "��");
		}
		System.out.println("���� : "+ sum + "��");
		*/
		
		
		
		Scanner sc = new Scanner(System.in);
		//2.
		String [] arStr = {"�̼���", "�ڹ���", "������", "��������"};
		
		//arStr ������ �����ϰ� ������ ��Ҹ� ����ϼ���.
		System.out.println("arStr�� ����(�κ�����) : " + arStr.length);
		//System.out.println("arStr[0] ���� : " + arStr[0].length() + "��");  // arStr[0]�� String Ÿ���̱⶧���� length()�� ������ �˾ƾ� �Ѵ�
		
		for (int i = 0; i < arStr.length; i++) {
			//System.out.println("arStr[" + "\'"+ i + "\'" + "] ���� : " + arStr[i].length() + "��");
			System.out.println("arStr['"+ i + "'] ���� : " + arStr[i].length() + "��");
		}
		
		
		System.out.println();
		
		
		
//		 int [] ar = new int [3] {10,20, 30}; //<-- ����!  
//		    int [] ar = new int [ ] {10,20, 30};  //<-- �̷��� �ؾ���
//		   int ar1[] = {10,20,30};
		
		
		
		
		
		//3.
		arStr = new String [] {"abc", "dEf", "GHi"};
		
		//arStr���� �ҹ��ڸ� �빮�ڷ� ������ ������
		//(�빮�ڴ� �׷��� �빮��)
		for (int i = 0; i < arStr.length; i++) {
			for (int j = 0; j < arStr[i].length(); j++) {
				if(arStr[i].charAt(j) <= 'z' && arStr[i].charAt(j) >= 'a') { // ���ڰ� �ҹ��ھȿ� ����
					System.out.print((char)(arStr[i].charAt(j) - 32) + ""); // �ҹ��ڿ��� �빮�ڷ� ����Ѵ�
				}else {
					System.out.print(arStr[i].charAt(j));  // ���ڰ� �빮���̸�
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		//3-1. ����ܾ�� ���ڿ��� �Է¹��� ��,
		//	   �빮�� -> �ҹ��ڷ� ������ ������.
		//sc.nextLine();
		System.out.print("���ڿ��� �Է��ϼ��� : "); String str1 = sc.nextLine();
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) <= 'z' && str1.charAt(i) >= 'a') {
				System.out.print((char)(str1.charAt(i) - 32));
			}else {
				System.out.print(str1.charAt(i));
			}
				
		}
		System.out.println();
		//sc.nextLine();
		//3-2. �ҹ���<->		�ҹ���: 97 ~ 122 -> ���ĺ� -32
		System.out.print("���ڿ��� �Է��ϼ��� : ");  
		String str2 = sc.nextLine();
//		for (int i = 0; i < str2.length(); i++) {
//			if(str2.charAt(i) <= 90 && str2.charAt(i) >= 65) {
//				System.out.print((char)(str2.charAt(i) + 32));
//			}else {
//				System.out.print(str2.charAt(i));
//			}
//				
//		}
		String result = "";
		for (int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			if(c <= 'Z' && c >= 'A') {
				result += (char)(c+ 32)+"";
			}else {
				result += c;
			}
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
