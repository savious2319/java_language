package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 	���� ��Ȳ�� ����� ���ô�!
 	�� �ҽ����� num/num2�� �Ұǵ�,
 	�߻��� �� �ִ� ���ܸ� ��� ã�Ƽ�,
 	Exception ó���� ������!
 */

public class ExceptionTest04 {

	public static void main(String[] args) {

		int num = 10;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		try {
			num2 = sc.nextInt();
			System.out.println(num / num2);

		}catch(Exception e) {
			
			System.out.println("���� �Է� �����Դϴ�. �ٽ� �Է�: ");
			sc.nextLine();
			num2 = sc.nextInt();
		}
		
//		catch (InputMismatchException e) {
//
//			System.out.println("���� �Է� �����Դϴ�. �ٽ� �Է�: ");
//			num2 = sc.nextInt();
//		} catch (ArithmeticException e) {
//
//			System.out.println("���� �Է� �����Դϴ�. �ٽ� �Է�: ");
//			num2 = sc.nextInt();
//		}

		//System.out.println(num / num2);
		System.out.println("���α׷��� ��� �˴ϴ�~~");
		

	}

}
