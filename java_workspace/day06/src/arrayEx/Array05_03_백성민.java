package arrayEx;

import java.util.Scanner;

public class Array05_03_백성민 {

	public static void main(String[] args) {
//	문제3)
//	본인의 이름으로 초기화 된 문자배열을 만든다!
//	예) honggildong = {'h' 'o' 'n' 'g' ....  'd', 'o', 'n', 'g'} 으로 초기화
//	문자 한 개를 입력받아 배열에서의 위치를 출력하는 프로그램을 작성하시오.
//	첫 번째 위치는 0번이며 배열에 없는 문자가 입력되면 "none" 라는 
//	메시지를 출력하고 끝내야 합니다.
//	찾는 문자 : o
//	글자 위치 : 2번째, 9번째
	
	Scanner sc = new Scanner(System.in);	
		
	char [] name = {'b','a','e','k','s','e','o','n','g','m','i','n'};
	char input = ' ';
	//int cnt = 0;
	boolean check = false;
	System.out.print("찾는 문자 입력 : ");
	input = sc.next().charAt(0);
	
//	for (int i = 0; i < name.length; i++) {
//		if(name[i] == input) {
//			
//			System.out.println("글자 위치 : " +  (i+1) + "번째");
//		}else {
//			cnt++;
//		}
//	}// end i for
	
//	if(cnt == name.length) {
//		
//		System.out.println("none");
//	}
	String str = "글자 위치 : ";
	for (int i = 0; i < name.length; i++) {
		if(name[i] == input) {
			str +=  + (i+1) + "번째" + " ";
//			System.out.print((i+1) + "번째" + " ");
			check = true;
		}
	}// end i for
	
	if(!check) {
		str = "none";
	}
	
	System.out.println(str);

	}

}
