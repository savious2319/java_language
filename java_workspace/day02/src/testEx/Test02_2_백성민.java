package testEx;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test02_2_백성민 {

	public static void main(String[] args) {
		//문제2) 구구단 출력2
		// 단수와 행수를 입력받아 출력해 주세요
		// 예) 시작 단수 : 21 (단수)
		// 끝행 :  10 (행)
		
		// 출력) 21단
		// 21 * 1 = 21  21 * 2 = 42  21 * 3 = xx
		// 21 * 4 = 21  21 * 5 = 42  21 * 6 = xx
		// 21 * 7 = 21  21 * 8 = 42  21 * 9 = xx
		// 21 * 10 = 210
		
		// 시작단수는 최소 2부터 시작해야 한다.
		// 행수는 최소 2행이상이어야 한다.
		// 출력은 n행 3열 단위로 출력한다.

		Scanner sc = new Scanner(System.in);
		int dan = 0;
		int row = 0;
		int cnt = 0;
		System.out.print("단수 입력 : "); dan = sc.nextInt();
		System.out.print("행수 입력 : "); row = sc.nextInt();
		
//		for (int i = 0; i < row; i++) {		//i -> 행	-> 줄 수
//			for (int j = 0; j < 3; j++) {	//j -> 열	-> 칸 수
//				System.out.printf("%d * %2d = %2d    ", dan, ++cnt, cnt * dan );
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i< row;i++) {		
			//System.out.print(n1+"*"+i+"="+n1*i+"\t");
			System.out.printf("%d * %d = %d\t", dan, i+1, dan*(i+1));
				if((i+1)%3==0) {
					System.out.println();
			}
		}
		
	
		
		
		
	}

}
