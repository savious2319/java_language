package methodex;

import java.util.Scanner;

public class MethodTest04 {
	/*
	 	1) call by value (값전달)
	 	
	 		fct(10,20);  <--- 기본값을 전달하는 것
	 	
	 	2) call by reference (참조값 전달)
	 	
	 		fct(객체 or 인스턴스) 
	 	
	 		fct(obj)
	 		fct(arr)  //배열   값이 동시에 변경된다!
	 	
	 */
	/**
	 * This is a method that  the maximum and minimum values of the integers in the arRand array.
	 * @param arRand 배열로 된 정수값을 보냅니다
	 * @param maxMin 최소값과 최대값을 저장시켜 놓을 배열을 보냅니다.
	 */
	void getMax_minNumber(int[]arRand, int[]values) { // call by reference
		values[0] = arRand[0]; // 최소값
		values[1] = arRand[0]; // 최대값
		
		for (int i = 1; i < arRand.length; i++) {
			if(values[0] > arRand[i]) {
				values[0] = arRand[i];
			}
			if(values[1] < arRand[i]) {
				values[1] = arRand[i];
			}
		}
		
		//return이나 (포인터) 없이도, 타 메서드의 결과값을 변경시킬 수 있다.
		// call by reference
		
	}
	String changeToUpperCaseSentence(String str) {
		//대문자로 변경하는 알고리즘
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c <= 'z' && c >= 'a') {
				result += (char)(c - 32)+"";
			}else {
				result += c;
			}
		}
		return result;
	}
	

	public static void main(String[] args) {
		int [] maxMin = {0, 0};
		
		int [] arRand = {23,42,45,454,353,454,54,53,4,54};
		
		MethodTest04 mt = new MethodTest04();
		
		                    // ?  ,  ?
		mt.getMax_minNumber(arRand, maxMin);	//? : 난수들
									            //? : 최대값과 최소값을 저장할 수 있는 배열
		
		System.out.println("최소값 : " + maxMin[0]);
		System.out.println("최대값 : " + maxMin[1]);
		
		String msg = "aGc";  // 대문자 바꾸기
		String toUpperMsg = msg.toUpperCase(); //msg에 있는 영문자를 대문자로 모두 변경해라!
		
		System.out.println(msg);
		System.out.println(toUpperMsg);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("소문자 영어 문장을 입력하세요 : ");
		msg = sc.nextLine();
		System.out.println(msg); // 소문자
		
		//toUpperMsg = mt.changeToUpperCaseSentence(new Scanner(System.in).nextLine());
		toUpperMsg = mt.changeToUpperCaseSentence(msg);
		
		System.out.println(toUpperMsg); // 대문자
		
		
		
	}
	
}
