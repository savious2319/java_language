package inputEx;

import java.util.Scanner;

/*
 	입력받기 예제
 	1) 도서목록 : 변수 4개 이상 만들고 출력하기
 	2) TV : 변수 3개 이상 만들고 출력하기
 	3) 사람 정보 : 변수 3개 이상 만들고 출력하기
 */
public class inputTest01_1 {

	public static void main(String[] args) {
		//스캐너 활용 -> 객체 = 인스턴스
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 도서목록 입력");
		//변수 선언
		String book_Name = "";			//제목
		String book_Author = "";		//저자
		int book_Page = 0;				//페이지수
		int book_Price = 0;				//가격
		int book_Month = 0;				//출간 월
		int book_Day = 0;				//출간 일
		String book_Pub = "";			//출판사
		//입력
		System.out.println("---------도서 정보 입력---------");
		System.out.println("도서 제목을 입력해 주세요 : "); book_Name = sc.next();
		System.out.println("저자를 입력해 주세요 : "); book_Author = sc.next();
		System.out.println("페이지수를 입력해 주세요 : "); book_Page = sc.nextInt();
		System.out.println("가격을 입력해 주세요 : "); book_Price = sc.nextInt();
		System.out.println("출판 월을 입력해 주세요 : "); book_Month = sc.nextInt();
		System.out.println("출판 일을 입력해 주세요 : "); book_Day = sc.nextInt();
		System.out.println("출판사를 입력해 주세요 : "); book_Pub = sc.next();
		//출력
		System.out.println("---------도서 정보 출력---------");
		System.out.println("도서 제목 : " + book_Name);
		System.out.println("  저자    : " + book_Author);
		System.out.println("페이지 수 : " + book_Page + "장");
		System.out.println("도서 가격 : " + book_Price + "원");
		System.out.println("출간 날짜 : " + book_Month +"월 " + book_Day + "일");
		System.out.println(" 출판사   : " + book_Pub);
	}

}
