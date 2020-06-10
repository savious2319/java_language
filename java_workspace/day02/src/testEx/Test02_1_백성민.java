package testEx;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test02_1_백성민 {

	public static void main(String[] args) {
		//문제1)
		//구구단 출력
		//단수를 입력받은 후, 해당 단수의 구구단을 출력해 보세요
		//예) 3
		//출력) 3단
		// 3 * 1 = 3  3 * 2 = 6  3 * 3 = 9
		// 3 * 1 = 3  3 * 2 = 6  3 * 3 = 9
		// 3 * 1 = 3  3 * 2 = 6  3 * 3 = 9
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cnt = 0;
		System.out.println("단수 입력 : "); num = sc.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf(" %d * %d = %2d ", num, ++cnt, num * cnt); 
			}
			System.out.println();
		}
	
		
		
		
	}

}
