package methodex;

import java.util.Scanner;

public class MethodTest03 {
	/*
	 	1) call by value (값전달)
	 	
	 		fct(10,20);  <--- 기본값을 전달하는 것
	 	
	 	2) call by reference (참조값 전달)
	 	
	 		fct(객체 or 인스턴스) 
	 	
	 		fct(obj)
	 		fct(arr)  //배열   값이 동시에 변경된다!
	 	
	 */
	
	void changeArray(int []ar) {
		//ar 참조변수엔 arScore의 (데이터와) 참조값이 모두 전달된다.
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		//값 변경
		ar[0] = 100;
		ar[1] = 200;
	}
	
	public static void main(String[] args) {
		int [] arScore = {10, 20};
		
		new MethodTest03().changeArray(arScore); // 메서드에서 데이터의 값을 변경할 수가 있다
		System.out.println(arScore[0]); // =100
		System.out.println(arScore[1]); // =200
		
		
		
		
		
		
	}
	
}
