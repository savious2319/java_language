package inputEx;

import java.util.Scanner;

/*
 	입력받기 예제
 	1) 도서목록 : 변수 4개 이상 만들고 출력하기
 	2) TV : 변수 3개 이상 만들고 출력하기
 	3) 사람 정보 : 변수 3개 이상 만들고 출력하기
 */
public class inputTest01_3 {

	public static void main(String[] args) {
		//스캐너 활용 -> 객체 = 인스턴스
		Scanner sc = new Scanner(System.in);
		System.out.println("3. 사람 정보 입력");
		//변수 선언
		String name = "";
		double height = 0.0;
		int age = 0;
		double weight = 0.0;
		//입력
		System.out.println("이름 : "); name = sc.next();
		System.out.println("키(cm) : "); height = sc.nextDouble();
		System.out.println("나이 : "); age = sc.nextInt();
		System.out.println("몸무게(kg) : "); weight = sc.nextDouble();
		//출력
		System.out.println("이름 : " + name);
		System.out.println("키(cm) : " + height);
		System.out.println("나이 : " + age);
		System.out.println("몸무게(kg) : " + weight);
	}

}
