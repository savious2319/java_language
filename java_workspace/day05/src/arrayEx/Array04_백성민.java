package arrayEx;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array04_백성민 {

	public static void main(String[] args) {
		//문5) 정수 4자리를 입력받는다
		//     한글로 변경해 보자
		//     1024 -> 일공이사
		//     비밀번호 4 정수 -> 한글로 풀어보자!
		//	   815 팔일오
		// hint) syso("정수 입력 : ");  String strData = sc.next();
		//							인덱스         0 1 2 3 4 5 6 7 8 9
		//		기준문자열!! String hangleToNum = "공일이삼사오육칠팔구";
		//       for( 문자열의 갯수 ) 
		//		       문자열의 요소 (즉, 문자)
		//             예)  "345"   0번방에 있는 인덱스 '3'
		//						    1번방에 있는 요소값 '4'
		//							2번방에 있는 요소값 '5'
		Scanner sc = new Scanner(System.in);
		String strData = "";
		String result = "";
		//System.out.print("정수 4자리 입력 : ");
//		strData = JOptionPane.showInputDialog("정수 4자리 입력 : ");
		strData = JOptionPane.showInputDialog(null, "정수 4자리 입력 : ");
		
		//strData = sc.next();
		
		
		String hangleToNum = "공일이삼사오육칠팔구";
		for (int i = 0; i < strData.length(); i++) {
			result += hangleToNum.charAt(strData.charAt(i) - 48);
		}
		//System.out.println(result);
		JOptionPane.showMessageDialog(null, "비밀번호는 " + result + "입니다");
		
//		String [] hangleToNum = {"공","일","이","삼","사","오","육","칠","팔","구"};
//		for (int i = 0; i < strData.length(); i++) {
//			int index = strData.charAt(i) - 48;
//			System.out.print(hangleToNum[index] + "");
//		}
		
		
		//System.out.println("1" - 48);	// <-문자열이라서 연산 X
		//System.out.println('1' - 48);	// <-자동형변환되서 49 - 48 = 1
		
		
	}

}
