package arrayEx;

import java.util.Random;

public class Array05_02_백성민 {

	public static void main(String[] args) {
//	문제2)
//	10개의 정수를 난수로 입력받아 배열에 저장한 후 
//	짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 
//	출력하는 프로그램을 작성하시오. 
//	평균은 반올림하여 소수첫째자리까지 출력한다.
//
//	* String.format("서식문자", 값)
//
//	저장된 값 :  99, 45, 34, 67, ...  10개입력
//	짝수 인덱스 값 : 0, 2, 4, 6, 8번째 값
//		        (99+34+...n) / 갯수 = 56.789  56.7
//	홀수 인덱스 값 : 1, 3, 5, 7, 9
//		        (45+67+...) / 갯수 = 5.6777   5.6
	Random r = new Random();	
	int[]arNum = new int[10];
	int sum = 0;
	double avg = 0.0;
	for (int i = 0; i < arNum.length; i++) {
		arNum[i] = r.nextInt(100);

	}
	System.out.println("저장된 값");
	for (int i = 0; i < arNum.length; i++) {
		System.out.print(arNum[i] + " ");
	}
	
	System.out.println("\n");
	
	System.out.println("짝수 인덱스 값");
	for (int i = 0; i < arNum.length; i++) {
		if(i % 2 == 0) { // i가 짝수일때만 출력한다
		sum += arNum[i];
		System.out.print(arNum[i] + " ");
		}
	}
	System.out.println();
	avg = (sum + 0.0) / 5;
	System.out.println("짝수 인덱스 평균 값" + String.format("%.1f", avg));
	
	
	System.out.println("\n");
	sum = 0;
	System.out.println("홀수 인덱스 값");
	for (int i = 0; i < arNum.length; i++) {
		if(i % 2 == 1) { // i가 홀수일때만 출력한다
		sum += arNum[i];
		System.out.print(arNum[i] + " ");
		}
	}
	System.out.println();
	avg = (sum + 0.0) / 5;
	System.out.println("홀수 인덱스 평균 값" + String.format("%.1f", avg));
	
	
	
	
	//String msg = String.format("%d %.1f %c", 10, 1.32, 'A');	
	//System.out.println(msg);  	
		
	}

}
