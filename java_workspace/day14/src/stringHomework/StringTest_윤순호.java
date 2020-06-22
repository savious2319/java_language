package stringHomework;

import java.security.spec.EncodedKeySpec;
import java.util.Scanner;

/*
 	문제1)
 	영문으로 된 문자열을 입력 받은 후,
 	입력받은 문자열에서 문자 하나를 찾아봅니다.
 	만약 해당 문자가 없으면, throw를 사용해서 예외처리를 해봅니다.
 	"문자가 없습니다"라는 문구가 출력되도록 합니다.		<--사용자 Exception을 만듭니다.
 	문제1-1)
 	주소를 담을 수 있는 배열을 만든 후,
 	해당 동이 있는지 없는지 배열에서 검색해 봅니다.

 	배열 5개
 	주소 입력 - 구 동까지 입력 예)  강남구 역삼동
 									강남구 대치동
 									....
 	서칭						찾고자 하는 동을 입려가헷요 : 방배
 	출력 결과					방배동의 주소는 123-1입니다.
 	문제2)
 	D:\GB_0900_05_ysh\java_language\java_workspace\day14\src\stringHomework\StringTest.java
 	해당 자바 파일 위치에 디렉토리/폴더/파일 단위로 구분해 봅니다.
 	출력 D:
 		GB_0900_05_gangsa
 		java_language
 		....
 	그리고 마지막 개체가 java파일인지 확인해 주세요
 	문제 2-1)
 	전체 경로에서 마지막 자바 파일만 출력해 주세요
 	자바 파일을 제외한 문자열을 출력해 주세요
 */
class MyException extends Exception{
	MyException(String msg) {
		super(msg);
	}
}
public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//문제 1)
		//		String msg = "";
		//		String search = "";
		//		
		//		try {
		//			System.out.println("문자열은 영문으로만 입력해 주세요.");
		//			System.out.print("문자열을 입력해주세요 : "); msg = sc.next();
		//			System.out.println("찾을 문자를 입력해주세요 : "); search = sc.next();
		//			if(msg.contains(search)) {
		//				System.out.println(msg+"에 "+search+"가 "+(msg.indexOf(search)+1)+"번째 위치에 있습니다.");
		//			}else {
		//				throw new MyException(msg+"에 "+search+"가 없습니다.");
		//			}//end if
		//		}catch(MyException e) {
		//			System.out.println(e.getMessage());
		//		}//end try
	//문제 1-1)
//		String[] arAddress = {
//				"강남구 역삼동 111-1",
//				"강남구 대치동 222-2",
//				"서초구 서초동 333-3",
//				"서초구 방배동 444-4",
//				"강남구 일원동 555-5"
//		};
//		String search = "";
//		String[] arSearch = {};
//		System.out.print("검색할 동을 입력해 주세요 : "); search = sc.next();
//		try {
//			for(int i = 0;i<arAddress.length;i++) {
//				if(arAddress[i].contains(search) == true) {
//					arSearch = arAddress[i].split(" ");
//					throw new MyException(arSearch[1]+"의 주소는 "+arSearch[2]+"입니다.");
//				}//end if
//			}//end for(i)
//			System.out.println("해당 주소가 없습니다.");
//		}catch(MyException e) {
//			System.out.println(e.getMessage());
//		}//end try
	//문제 2)
//				String filePath = "D:/GB_0900_05_ysh/java_language/java_workspace/day14/src/stringHomework/StringTest.java";
//				String[] arFilePath = filePath.split("/");
//				System.out.println("파일 경로 출력하기");
//				for(int i = 0;i<arFilePath.length;i++) {
//					System.out.println(arFilePath[i]);
//				}//end for(i)
//				if(arFilePath[arFilePath.length-1].endsWith("java")) 
//					System.out.println("이 파일은 java파일이 맞습니다.");
//				else 
//					System.out.println("이 파일은 java파일이 아닙니다.");
	//문제 2-1)
		//		System.out.println("java 파일만 출력하기");
		//		for(int i = 0;i<arFilePath.length;i++) {
		//			if(arFilePath[i].endsWith("java")) 
		//				System.out.println(arFilePath[i]);
		//		}//end for
		//		System.out.println("java 파일 제외한 나머지 경로 출력하기");
		//		for(int i = 0;i<arFilePath.length;i++) {
		//			if(arFilePath[i].endsWith("java")) 
		//				continue;
		//			else 
		//				System.out.println(arFilePath[i]);
		//		}//end for(i)
		//		
	}//end main
}//end class
