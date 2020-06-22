package stringHomework;

import java.util.Scanner;

/*
 	  영문으로 된 문자열을 입력받은 후 
 	  입력 받은 문자열에서 문자 하나를 찾아보자
 	  만약 해당 문자가 없으면
 	  throw 를 사용해서
 	  예외처리를 해보자
 	  "문자가 없어요"		<-- 사용자 Exception을 만들어서
 	  
 	  문1-1)
 	  주소를 담을 수 있는 배열을 만든 후
 	  해당 동이 있는지 없는지 배열에서 검색해 보자
 	  배열 5개 
 	 (고정) 주소 입력 - 구 동까지 입력 예) 강남구 역삼동 111-1
 	  									강남구 대치동	123-1
 	  								...
 	  				서칭		찾고자 하는 동을 입력 : 대치
 	  				출력결과 :	대치동의 주소는 123-1 입니다.
 	  				
 	  문2)
 	  ‪D:\GB_0900_05_psh\java_languge\java_workspase\day14\src\stringHomework\StringTest_박상현.java
 	  해당 자바 파일 위치에 디렉토리\폴더\파일 단위로 구분해보자
 	  출력  D:
 	  		GB_0900_05_psh
 	  		java_languge
 	  		java_workspase
 	  		....
 	  	그리고 마지막 개체가 자바 파일인지 확인해 보자
 	  
 	  문2-1) 
 	  전체 파일경로에서 마지막 자바 파일만 출력해 주세요
 	  자바 파일을 제외한 문자열을 출력해 주세요
 */
class MyException extends Exception{
	public MyException(String print) {
		super(print);
	}
}

//문1
class Input{
	String input;
	String choiceAl;

	public void Scan()  {
		System.out.println("문1)");
		Scanner sc = new Scanner(System.in);
		System.out.print("영문을 입력하세요 :");
		input = sc.nextLine();
		
		System.out.print("찾고자하는 문자를 입력하세요 :");
		choiceAl = sc.next();
		
		if (input.contains(choiceAl) == false) {
			try {
				throw new MyException("문자가 없습니다");
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println(choiceAl+"는 "+(input.indexOf(choiceAl)+1)+"번에 있습니다.");
		}
		
	}
}

//문 1-1 
class Home{
	String [] h ={"강남구 역삼동 111-1",
			"강남구 대치동 222-2",
			"강남구 신사동 333-3",
			"강남구 압구정동 444-4",
			"서초구 서초동 555-5" };
	int cnt;
	public void searchdong() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("문 1-1)");
		System.out.print("찾고자하는 주소의 동을 입력하세요 :");
		String name = sc.next();
		for (int i = 0; i < h.length; i++) {
			if (h[i].contains(name) == true) {
				System.out.println(name+"은 "+ h[i].substring(h[i].indexOf("동")+2)+"번지 입니다");
			}else if(h[i].contains(name) == false) {
				cnt++;
			}
			
			if(cnt == h.length){
				try {
					throw new MyException("[ 찾으시는 동이 존재하지 않습니다. ]");
				} catch (MyException e) {
					System.out.println(e.getMessage());
					break;
				}
			}
		}
	}
	
}

//문2
class File{

	String file = "‪D:/GB_0900_05_psh/java_languge/java_workspase/day14/src/stringHomework/StringTest_박상현.java" ;
	public void printFile() {
		System.out.println();
		System.out.println("문2)");
		String[] file2 = file.split("/");
		for (int i = 0; i < file2.length; i++) {
			System.out.println(file2[i]);
		}
		
		boolean check = file.endsWith("java");
		if (check==true) {
			System.out.println("[ 자바 파일입니다. ]");
		}else {
			System.out.println("[ 자바 파일이 아닙니다. ]");
		}
		System.out.println();
		//문2-1
		System.out.println();
		System.out.println("문2-1)");
		System.out.println("마지막 자바파일만 출력");
		String name = file.substring(file.lastIndexOf('/')+1);
		System.out.println(name);
		
		System.out.println();
		System.out.println("자바 파일 제외 문자열 출력");
		name = file.substring(file.indexOf('D'), file.lastIndexOf('/'));
		System.out.println(name);
	}
}

public class StringTest_박상현 {
	public static void main(String[] args) {
		new Input().Scan();		//문1
		new Home().searchdong();	//문1-1
		new File().printFile();		//문2, 문2-1
		
	}
}




























