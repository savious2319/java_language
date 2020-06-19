package stringHomework;

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
class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}

public class StringTest_백성민 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg = "";
		
		//문제1)
		
//		try {
//		System.out.println("영문 문자열을 입력하세요 : ");
//		msg = sc.next();
//		
//		
//		String word = "";
//		System.out.println("문자를 입력해서 찾아보기: ");
//		word = sc.next();
//		
//		
//		if(msg.contains(word)) {
//			System.out.println("문자가 있습니다");
//		}else {
//			throw new MyException("문자가 없어요");
//		}
//		
//		}catch(MyException e) {
//			System.out.println(e.getMessage());
//		}
		
		String filePath = " D:\\GB_0900_05_BSM(다른 폴더나 파일 넣지말아주세요)\\java_language\\java_worksapce\\day14\\src\\stringHomework\\StringTest_백성민.java";
		
		filePath = "D:/GB_0900_05_BSM(다른 폴더나 파일 넣지말아주세요)/java_language/java_worksapce/day14/src\\stringHomework\\StringTest_백성민.java";
		
		//문제2)
		String tmp = filePath.substring(filePath.indexOf('D'), filePath.indexOf('/'));
		System.out.println(tmp);
		
	}

}
