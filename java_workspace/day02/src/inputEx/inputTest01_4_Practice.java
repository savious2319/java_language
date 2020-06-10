package inputEx;

import java.util.Scanner;

/*
 	입력받기 예제
 	1) 도서목록 : 변수 4개 이상 만들고 출력하기
 	2) TV : 변수 3개 이상 만들고 출력하기
 	3) 사람 정보 : 변수 3개 이상 만들고 출력하기
 */
public class inputTest01_4_Practice {

	public static void main(String[] args) {
		//스캐너 활용 -> 객체 = 인스턴스
		Scanner sc = new Scanner(System.in);
		System.out.println("3. 몽타주 그리기");
		//변수 선언
		String type_Pace = "";			//얼굴형
		String type_Eye = "";			//눈동자 색깔
		int choice = 0;
		System.out.println("범인의 얼굴을 묘사해주세요.");
		System.out.println("경찰 : 얼굴형은 어떻게 생겼습니까?");
		System.out.println("1.둥근형   2.사각형   3.긴 얼굴형   4.짧은 얼굴형 ");
		choice = sc.nextInt();
		if(choice == 1) { type_Pace = "둥근형";
		}else if(choice == 2) {	type_Pace = "사각형";
		}else if(choice == 3) { type_Pace = "긴 얼굴형";
		}else if(choice == 4) { type_Pace = "짧은 얼굴형";}
		
		System.out.println("나 : 얼굴형은 " + type_Pace +"이었어요.");
	}

}
