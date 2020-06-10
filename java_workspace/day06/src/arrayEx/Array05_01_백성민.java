package arrayEx;

import java.util.Scanner;

public class Array05_01_백성민 {

	public static void main(String[] args) {
//	문제1)
//	100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가
//	0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 출력하되,
//	가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
//
//	입력 값 : 10, 9, 8, 4, 80, 40, 0   (0누르면 종료)
//	출력 값 : 40 80 4, 8, 9, 10 
		
		int cnt = 0;
		int[]arNum = new int[100];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("입력 값 : ");
		for (int i = 0; i < arNum.length; i++) {
			arNum[i] = sc.nextInt();
			if(arNum[i] != 0) {
				cnt++;
			}
			if(arNum[i] == 0) {
				break;
			}
		}
		System.out.println("출력 값");
		for (int i = 1; i < cnt+1; i++) {
			System.out.print(arNum[cnt - i] + " ");
		}

	}

}
