package arrayEx;

import java.util.Random;

public class Array05_04_백성민 {

	public static void main(String[] args) {
//	문제4) thread.sleep 사용
//	10개 정수형 배열에서 세 자리 이하의 정수를 난수로 입력 받은 후 
//	그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.
//	난수 : 100, 200, 300 ...  10개 입력 완료됐습니다!
//	최대값 : 756입니다.
//	최소값 : 121 입니다.

	int[]arNum = new int[10];
	Random r = new Random();
	
	for (int i = 0; i < arNum.length; i++) {
		arNum[i] = r.nextInt(900) + 100;
	}
	
	for (int i = 0; i < arNum.length; i++) {
		System.out.print(arNum[i] + " ");
	}
	
	int MAX = arNum[0];
	int MIN = arNum[0];
	
	System.out.println();
	for (int i = 1; i < arNum.length; i++) {
		if(arNum[i] > MAX) {
		 MAX = arNum[i];
			
		}
		
		if(arNum[i] < MIN) {
		 MIN = arNum[i];	
		}
	}
	System.out.println("최대값 : " + MAX);
	System.out.println("최소값 : " + MIN);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
