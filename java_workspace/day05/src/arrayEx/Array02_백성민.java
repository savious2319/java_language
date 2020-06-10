package arrayEx;

import java.util.Scanner;

public class Array02_백성민 {

	public static void main(String[] args) {
		/*//배열 선언 및 값입력
		int[]ar = new int[5];
		Scanner sc = new Scanner(System.in);
		//1. 원하는 값을 입력받아서 배열에 넣어 보세요
		//  출력해 보세요.
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			System.out.print(i+1 + "번 값 입력	: "); ar[i] = sc.nextInt();
			sum += ar[i]; //처리
		}
		
		// alt + shift + z  --> 자동으로 for문을 만들어줌
		
		System.out.println("출력값");
		for (int i = 0; i < ar.length; i++) {
//			System.out.println(i+1 + "번 값 : " + ar[i]);
			System.out.println("ar["+i+"] : " + ar[i] + "점");
		}
		System.out.println("총점 : "+ sum + "점");
		*/
		
		
		
		Scanner sc = new Scanner(System.in);
		//2.
		String [] arStr = {"이순신", "박문수", "강감찬", "을지문덕"};
		
		//arStr 선언을 수정하고 각각의 요소를 출력하세요.
		System.out.println("arStr의 갯수(부분집합) : " + arStr.length);
		//System.out.println("arStr[0] 갯수 : " + arStr[0].length() + "개");  // arStr[0]은 String 타입이기때문에 length()로 갯수를 알아야 한다
		
		for (int i = 0; i < arStr.length; i++) {
			//System.out.println("arStr[" + "\'"+ i + "\'" + "] 갯수 : " + arStr[i].length() + "개");
			System.out.println("arStr['"+ i + "'] 갯수 : " + arStr[i].length() + "개");
		}
		
		
		System.out.println();
		
		
		
//		 int [] ar = new int [3] {10,20, 30}; //<-- 에러!  
//		    int [] ar = new int [ ] {10,20, 30};  //<-- 이렇게 해야함
//		   int ar1[] = {10,20,30};
		
		
		
		
		
		//3.
		arStr = new String [] {"abc", "dEf", "GHi"};
		
		//arStr에서 소문자만 대문자로 변경해 보세요
		//(대문자는 그래도 대문자)
		for (int i = 0; i < arStr.length; i++) {
			for (int j = 0; j < arStr[i].length(); j++) {
				if(arStr[i].charAt(j) <= 'z' && arStr[i].charAt(j) >= 'a') { // 문자가 소문자안에 들어가면
					System.out.print((char)(arStr[i].charAt(j) - 32) + ""); // 소문자에서 대문자로 출력한다
				}else {
					System.out.print(arStr[i].charAt(j));  // 문자가 대문자이면
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		//3-1. 영어단어로 문자열을 입력받은 후,
		//	   대문자 -> 소문자로 변경해 보세요.
		//sc.nextLine();
		System.out.print("문자열을 입력하세요 : "); String str1 = sc.nextLine();
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) <= 'z' && str1.charAt(i) >= 'a') {
				System.out.print((char)(str1.charAt(i) - 32));
			}else {
				System.out.print(str1.charAt(i));
			}
				
		}
		System.out.println();
		//sc.nextLine();
		//3-2. 소문자<->		소문자: 97 ~ 122 -> 알파벳 -32
		System.out.print("문자열을 입력하세요 : ");  
		String str2 = sc.nextLine();
//		for (int i = 0; i < str2.length(); i++) {
//			if(str2.charAt(i) <= 90 && str2.charAt(i) >= 65) {
//				System.out.print((char)(str2.charAt(i) + 32));
//			}else {
//				System.out.print(str2.charAt(i));
//			}
//				
//		}
		String result = "";
		for (int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			if(c <= 'Z' && c >= 'A') {
				result += (char)(c+ 32)+"";
			}else {
				result += c;
			}
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
