package stringHomework;

import java.io.IOException;
import java.util.Scanner;

/*
 	영문으로 된 문자열을 입력받은 후,
 	입력받은 문자열에서 문자 하나를 찾아보자.
 	만약 해당 문자가 없으면,
 	
 	throw를 사용해서
 	예외처리를 해보자
 	"문자가 없어요"		<--- 사용자 Exception을 만들어서!!!
 	 
 	 문제1-1)
 	 주소를 담을 수 있는 배열을 만든 후,,
 	 해당 동이 있는지 없는지 배열에서 검색해 보자!
 	 
 	 배열 5개
 	 (x)주소 입력 - 구 동까지 입력 예) 강남구 역삼동 111-1
 	                                   강남구 대치동 222-2
 	                                   서초구 서초동 333-3
 	                                   서초구 방배동 444-4
 	                                   강남구 일원동 555-5
 	                              
 	              서칭           : 찾고자 하는 동을 입력하세요 : 방배
 	              출력 결과      : 방배동의 주소는 123-1 입니다.
 	 
 	 
 	 문제2)
 	 D:\GB_0900_05_BSM(다른 폴더나 파일 넣지말아주세요)\java_language\java_worksapce\day14\src\stringHomework\StringTest_백성민.java
 	 해당 자바 파일 위치에 디렉토리/폴더/파일 단위로 구분해 보세요.
 	 출력 D:
 	 	  GB_0900_05_gangsa
 	 	  java_language
 	 	  java_workspace
 	 	  ...
 	 그리고 마지막 개체가 자바 파일인지 확인해 주세요!
 	 
 	 문제2-1)
 	 	전체 파일경로에서 마지막 자바 파일만 출력해 주세요.
 	 	자바 파일을 제외한 문자열을 출력해 주세요.
 */
class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

public class StringTest_백성민 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String msg = "";

		// 문제1)

//		try {
//			System.out.println("영문 문자열을 입력하세요 : ");
//			msg = sc.next();
//
//			String ch = "";
//			System.out.println("문자를 입력해서 찾아보기: ");
//			ch = sc.next();
//			if(false) {
//				throw new IOException();
//			}
//			if (msg.contains(ch)) {
//				System.out.println(ch + "는 " + msg + "에 포함되어있는 문자입니다");
//			} else {
//				throw new MyException(ch + "는 " + msg + "에 포함되어있지않는 문자입니다");
//			}
//
//		} 
//		catch (IOException e) {
//			System.out.println(e.getMessage());
//		}catch(MyException e) {
//			System.out.println(e.getMessage());
//			
//		}

		// 문제 1-1)
		String[] address = { "강남구 역삼동 736-56", "성동구 응봉동 228-15", "종로구 효자동 60-1", "마포구 연남동 259-1", "용산구 이태원동 137-8" };

//		String[] arAd1 = address[0].split(" ");
//		String[] arAd2 = address[1].split(" ");
//		String[] arAd3 = address[2].split(" ");
//		String[] arAd4 = address[3].split(" ");
//		String[] arAd5 = address[4].split(" ");

		// 이거를 밑에서 2차원 배열로 처리할 수 있다!

		String[][] addressSplit = { address[0].split(" "), address[1].split(" "), address[2].split(" "),
				address[3].split(" "), address[4].split(" ") };
		// 이거를 더 간편하게 아래와 같이 이차원 배열로 초기화 했다!

		String[][] addressSplitv2 = new String[address.length][3];

		// System.out.println(addressSplitv2.length); //5
//		String search = "";
//		System.out.println("찾고자 하는 동 입력 : ");
//		search = sc.next();
//		for (int i = 0; i < addressSplitv2.length; i++) {
//			addressSplitv2[i] = address[i].split(" ");
//		}
//		try {
//		for (int i = 0; i < address.length; i++) {
//			
//			if (address[i].contains(search)) {
//				System.out.println(addressSplitv2[i][1] + "의 주소는 " + addressSplitv2[i][2] + " 입니다");
//			}else {
//				throw new MyException(search +"동의 주소를 찾을 수 없습니다");
//			}
//		}
//		}catch(MyException e) {
//			System.out.println(e.getMessage());
//		}
//		for (int i = 0; i < address.length; i++) {
//			for (int j = 0; j < addressSplitv2.length; j++) {
//				addressSplitv2[j] = address[j].split(" ");
//			}
//			if (address[i].contains(search)) {
//				System.out.println(addressSplitv2[i][1] + "의 주소는 " + addressSplitv2[i][2] + " 입니다");
//			}
//		}

		// 문제2)
		String filePath = "D:/GB_0900_05_BSM(다른 폴더나 파일 넣지말아주세요)/java_language/java_worksapce/day14/src/stringHomework/StringTest_백성민.java";
//		String []str = new String[8];
//		str[0] = filePath.substring(filePath.indexOf('D'), filePath.indexOf('/')); //D:
//		str[1] = filePath.substring(filePath.indexOf('G'), filePath.indexOf(')') + 1); //GB_
//		str[2] = filePath.substring(filePath.indexOf('j'), filePath.indexOf('e') + 1); // java_language
//		str[3] = filePath.substring(filePath.indexOf('e') + 2, filePath.indexOf('c') + 2); //java_workspace
//		str[4] = filePath.substring(filePath.indexOf('d'), filePath.indexOf('4') + 1); //day14
//		str[5] = filePath.substring(filePath.indexOf('1')+3, filePath.indexOf('y') + 7); //src
//		str[6] = filePath.substring(filePath.indexOf('p')+14, filePath.indexOf('m') + 6); //stringHomework
//		str[7] = filePath.substring(filePath.indexOf('H')+9); //StringTest_
//		try {
//		for (int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//			Thread.sleep(1000);
//		}
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}

		String[] arStr = filePath.split("/");
		try {
			System.out.println("filePath를 Split 하겠습니다");
			Thread.sleep(1000);
			for (int i = 0; i < arStr.length-1; i++) {
				System.out.println(arStr[i]);
				Thread.sleep(1000);
				if (i == arStr.length - 1) {
					System.out.println(arStr[i].endsWith("java") ? "java파일입니다" : "java 파일이 아닙니다");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		// 문제2-1)
		// 전체 파일경로에서 마지막 자바 파일만 출력해 주세요.
		// 자바 파일을 제외한 문자열을 출력해 주세요.
		System.out.println("자바 파일만 출력합니다");
		for (int i = 0; i < arStr.length; i++) {
			if (i == arStr.length - 1) {
				System.out.println(arStr[i]);
			}
		}
		System.out.println();
		System.out.println("자바 파일을 제외한 문자열을 출력합니다");
		try {
		for (int i = 0; i < arStr.length-1; i++) {
			System.out.println(arStr[i]);
			Thread.sleep(1000);
		}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
