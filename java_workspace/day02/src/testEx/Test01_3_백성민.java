package testEx;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test01_3_백성민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		//문3) 삼항 연산자 문제
		String msg = "Q. 오늘은 당신의 생일입니다\n" + "친구에게 선물을 받았습니다.\n"
					 + "그 선물 상자 안에는 무엇이 들어있을까요?\n"
					 +"1. 꽃\n"
					 +"2. 손수건\n"
					 +"3. 보석\n"
					 +"4. 목걸이\n"
					 +"5. 게임기\n";
					
		int choice = 0;              //<----번호를 입력받는다.
		String result = "";          //<----삼항 연산자를 이용해서 result에 메세지를 담는다.
		String m1 = "꽃 : 거짓말을 못하는 타입입니다.";
		String m2 = "손수건 : 굉장히 정직한 타입니다.";
		String m3 =  "보석 : 눈하나 깜박이지 않고 거짓말 하는 타입입니다.";
		String m4 = "목걸이 : 다른 사람을 구속하는 타입입니다.";
		String m5 = "게임기 : 즉흥적으로 생각하는 타입입니다.";
//		System.out.println(msg);
		choice = Integer.parseInt(JOptionPane.showInputDialog(msg));
//		choice = sc.nextInt();
		result = (choice == 1) ? m1 :
			(choice == 2 )? m2 :
				(choice == 3) ? m3 :
					(choice == 4) ? m4 : m5; 
		//System.out.println(result);
		JOptionPane.showMessageDialog(null, result);  //<--- result에 담긴 메세지를 다이얼로그에 출력하자!
		// ***메세지 다이얼로그 : 두번째 인자의 내용을 대화상자로 출력해 주는 메서드
		
	// 

	}

}
