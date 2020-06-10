package randomEx;

import java.util.Random;

/*
 	난수 만들기
 	1) Math 클래스
 		random() 이라는 클래스 메서드(스태틱 메서드) 를 이용한다. (스태틱 메서드(클래스 메서드) : 클래스를 이용해서 호출할 수 있는 메서드)
 		100번 실행해서 출력되는 난수의 형태를 관찰해 보세요
 */
public class Random02 {
	
	static void fct() {
		
	}
	public static void main(String[] args) {
		
		//Random02.fct(); // static method이기 때문에 .을 이용해서 호출할 수 있다.
		
		for (int i = 0; i < 100; i++) {
			System.out.println( (int) (Math.random()*10) + 1 );
											//   시작값   끝값
			
		}
		
		
		
		
	}//end of main

}//end of class
