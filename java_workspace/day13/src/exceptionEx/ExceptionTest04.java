package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 	예외 상황을 만들어 봅시다!
 	이 소스에서 num/num2를 할건데,
 	발생할 수 있는 예외를 모두 찾아서,
 	Exception 처리를 해주자!
 */

public class ExceptionTest04 {

	public static void main(String[] args) {

		int num = 10;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		try {
			num2 = sc.nextInt();
			System.out.println(num / num2);

		}catch(Exception e) {
			
			System.out.println("정수 입력 오류입니다. 다시 입력: ");
			sc.nextLine();
			num2 = sc.nextInt();
		}
		
//		catch (InputMismatchException e) {
//
//			System.out.println("정수 입력 오류입니다. 다시 입력: ");
//			num2 = sc.nextInt();
//		} catch (ArithmeticException e) {
//
//			System.out.println("정수 입력 오류입니다. 다시 입력: ");
//			num2 = sc.nextInt();
//		}

		//System.out.println(num / num2);
		System.out.println("프로그램이 계속 됩니다~~");
		

	}

}
