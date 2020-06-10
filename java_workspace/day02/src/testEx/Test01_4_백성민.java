package testEx;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test01_4_백성민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		//문4) 1~100까지 중 3과 5의 공백수 (예 15, 30, 45, 60...)를 출력
		//     조건: 조건식은 2개를 사용할 것, continue를 사용할 것
		
//		for (int i = 0; i < 100; i++) {
//			if((i+1) % 3 == 0) {
//				if((i+1) % 5 == 0) {
//					System.out.println((i+1));
//				}else {
//					continue;
//				}
//			}else {
//				continue;
//			}
//			
//		}

		
		for (int i = 0; i < 100; i++) {
			if((i+1) % 3 != 0) {
				continue;
			}
			if((i+1) % 5 != 0) {
				continue;
				}
				System.out.println((i+1));
		}
	}

}
