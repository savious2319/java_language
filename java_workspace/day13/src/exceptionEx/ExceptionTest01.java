package exceptionEx;

import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
		//System.out.println(10/0);
		int num = 10;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		num2 = sc.nextInt();
		
		
		if(num2 != 0) //�� ������ ����ó��
			System.out.println(num/num2);
		
		
		System.out.println("�� ���� �ҽ�");
		System.out.println("�� ���� �ҽ�2");
		System.out.println("�� ���� �ҽ�3");
		
		
	}

}
