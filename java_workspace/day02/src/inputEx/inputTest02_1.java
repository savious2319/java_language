package inputEx;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	입력받기 : Scanner : 콘솔에서 입력받았습니다.
 	
 	입력받기 2 : GUI 환경에서 Dialog를 이용해 입력받기
 	대화상자에서 입력받기
 	(Dialog)
 	-무조건 "문자열"로 입력합니다.
 	- 10 -> 문자열 10으로 return
 	- "10"을 정수 10으로 추출해야 합니다.
 	- 특정 데이터로 추출하는과정을 파싱(parsing) 이라고 합니다.
 		(형변환은 타입을 바꾸는 것, 파싱은 값을 사용할 수 있는 상태로 추출하는 것)
 		
 	대화상자 showInputDialog(A, B) -> 인자 2개가 필요합니다.
 	JOptionPane 클래스에 있습니다.
 	** 문자열에서 정수값으로 파싱하기
 	나이 : 45 -> "45"
 	정수값으로 추출하려면 Integer.parseInt(문자열)
 	더블값으로 추출하려면 Double.parseDouble(문자열)
 							Boolean.parseBoolean(문자열)
 	....
 	Integer,Double,Boolean은 class입니다.
 */
public class inputTest02_1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "이름을 입력하세요.");
		System.out.println("이름 : "+ name);
	
	}

}
