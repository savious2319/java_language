package testEx;

import java.util.Scanner;

public class Test02_4_백성민 {

	public static void main(String[] args) {
		//은행에서 돈을 인출하고자 한다.
				//현금 화폐 단위로 최소 화폐 매수를 구한다.
				//입력예) 15300
				//출력예) 50000원 권 : 0매
//			              10000원 권 : 1매
//						   5000원 권 : 1매
//						   1000원 권 : 0매
//			                500원 권 : 0매
//			                100원 권 : 3매
			
//			    최소 입력단위는 백원 단위이다.
//				최대 입력단위는 육백만원 이다.
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int remainder = 0;
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
		System.out.print("인출하고자하는 돈 액수 입력: "); money = sc.nextInt();
		
		if(money >= 50000) {
			n1 = money / 50000;
			money = money % 50000; //remainder = money - (50000 * n1);  
			//money = remainder;
		}
		if(money >= 10000) {
			n2 = money / 10000;
			money = money % 10000;//remainder = money - (10000 * n2);
			//money = remainder;
		}
		if(money >= 5000) {
			n3 = money / 5000;
			money = money % 5000;//remainder = money - (5000 * n3);
			//money = remainder;
			
		}
		if(money >= 1000) {
			n4 = money / 1000;
			money = money % 1000;//remainder = money - (1000 * n4);
			//money = remainder;
			
		}
		if(money >= 500) {
			n5 = money / 500;
			money = money % 500;//remainder = money - (500 * n5);
			//money = remainder;
			
		}
		if(money >= 100) {
			n6 = money / 100;
			money = money % 100;//remainder = money - (100 * n6);
			//money = remainder;
			
		}
		
		System.out.printf("50000원 권 : %d매\n", n1);
		System.out.printf("10000원 권 : %d매\n", n2);
		System.out.printf("5000원 권  : %d매\n", n3);
		System.out.printf("1000원 권  : %d매\n", n4);
		System.out.printf("500원 권   : %d매\n", n5);
		System.out.printf("100원 권   : %d매\n", n6);
		
	}

}
