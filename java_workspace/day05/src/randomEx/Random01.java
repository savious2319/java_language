package randomEx;

import java.util.Random;

/*
 	난수 만들기
 	1) Random 클래스
 		nextInt(범위값) : 인스턴스 메서드
 		
 		객체 rand 로 만들자!
 		
 	2) 난수의 범위값 주기
 		범위값(BOUND)은 항상 0 부터 시작한다.
 		10 : 0~9 까지 10개
 		8 : 0~7 까지 8개
 		
 		1부터 가져오게 하려면!
 	
 */
public class Random01 {

	public static void main(String[] args) {

		//0~9까지 난수 하나 출력하기!
		
		//Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//System.out.println(randNum);
		
		for (int i = 0; i < 10; i++) {
			int randNum = rand.nextInt(10);
			System.out.println(randNum);// the upper bound(exclusive) 10 is excluded from the random number
												 // 0~9까지 "10"개 중에 난수 하나!
		}
				
		// 난수 하나만 출력하면된다!
		// new Random() -> 인스턴스 생성
		
		System.out.println(new Random().nextInt(10));
		
		System.out.println("1~100까지 난수 출력");
		for (int i = 0; i < 50; i++) {
			// 난수 가져오기
			int randNum = rand.nextInt(100) + 1; //1부터 라는 뜻	원래 0~99까지였는데,
												//					(0~99)에다가 +1을 하니까
												//  (1~100)까지 중에 난수 하나를 가져오게된다.
			System.out.println(randNum);
		}
		
		
		
		
		
		
		
		
		
		

	}//end of main

}//end of class
