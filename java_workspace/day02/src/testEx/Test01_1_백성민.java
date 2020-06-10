package testEx;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test01_1_백성민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문1) 두 정수를 입력받고, 두 정수의 누적값 출력 (c언어 출제 문제)
		int a = 0, b = 0;
		System.out.print("정수 1 입력 : "); a = sc.nextInt();
		System.out.print("정수 2 입력 : "); b = sc.nextInt();
		System.out.println("정수 1과 정수 2의 누적값 : " + (a + b));
		
		
		
	}

}
