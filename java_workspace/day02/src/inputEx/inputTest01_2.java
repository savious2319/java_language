package inputEx;

import java.util.Scanner;

/*
 	입력받기 예제
 	1) 도서목록 : 변수 4개 이상 만들고 출력하기
 	2) TV : 변수 3개 이상 만들고 출력하기
 	3) 사람 정보 : 변수 3개 이상 만들고 출력하기
 */
public class inputTest01_2 {

	public static void main(String[] args) {
		//스캐너 활용 -> 객체 = 인스턴스
		Scanner sc = new Scanner(System.in);
		System.out.println("2. TV제품 사양 입력");
		//변수 선언
		String tv_Brand = "";	//tv 브랜드
		int tv_Width = 0;		//tv 가로
		int tv_Height = 0;		//tv 높이
		int tv_Price = 0;		//tv 가격
		int tv_ASYear = 0;		//tv as 가능 년수
		int tv_Type = 0;		//tv종류 (벽걸이, 스탠드)
		//입력
		System.out.println("TV 브랜드 : "); tv_Brand = sc.next();
		System.out.println("TV의 가로 크기(cm) : "); tv_Width = sc.nextInt();
		System.out.println("TV의 세로 크기(cm) : "); tv_Height = sc.nextInt();
		System.out.println("TV 가격 : "); tv_Price = sc.nextInt();
		System.out.println("무상 AS 지원 년도(1~5년) : "); tv_ASYear = sc.nextInt();
		System.out.println("TV 종류"); 
		System.out.println("1. 벽걸이    2. 스탠드"); 
		tv_Type = sc.nextInt();
		//출력
		System.out.println("Tv 브랜드 : " + tv_Brand);
		System.out.println("Tv 크기 : " + tv_Width + "cm x " + tv_Height + "cm");
		System.out.println("Tv 가격 : " + tv_Price + "원");
		System.out.println("무상 AS는 \"" + tv_ASYear + "년\" 까지 가능합니다.");
		if(tv_Type == 1) {
			System.out.println("Tv 종류는 \"벽걸이\" 입니다.");			
		}else {
			System.out.println("Tv 종류는 \"스탠드\" 입니다.");
		}
	}

}
