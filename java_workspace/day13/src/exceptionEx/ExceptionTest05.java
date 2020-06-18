package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 	���� ��Ȳ�� ����� ���ô�!
 	
 	�ܺο��� �����͸� �ѱ� �� �ִ�.
 	c:> java A.java 10 20 30 (����) {"10","20", "30"} => main�� args �Ű������� ������ �ȴ�!
 	
 	�׷���, �� cmd â������ �� �� �ִ°� �ƴ϶�... ��Ŭ���� ���ο����� ������ �� �ִ�!
 	arguments �ִ� �� : 
 		1. ���� �������� �ҽ������� �ѹ��� ����������!
 		2. �ڹ� �ҽ����Ͽ��� ������ ���콺 Run As... ����
 	
 */

public class ExceptionTest05 {

	public static void main(String[] args) {
		
		int data = 100;
		int temp = 0;
		try {
			temp = Integer.parseInt(args[0]);
			System.out.println(data/temp);
		}
		catch (NumberFormatException e) {
			 System.out.println("���� ������ �ƴϿ���" + e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ��ҿ� ���� �����ϴ�" + e.getMessage());
		}catch(ArithmeticException e){
			System.out.println("0���� ���� �� �����" + e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ���~~~");
		
		
	}

}
