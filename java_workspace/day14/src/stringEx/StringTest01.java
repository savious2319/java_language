package stringEx;
/*
 	문자열
 	100, 200, 1.1, 'A'  <--- 리터럴 상수 : 데이터 자체에 형과 크기가 이미 결정되어 있는 값!
 							100 -> 정수라는 모양이야(형), 4byte야 (크기)
 	매크로 상수 #define PI 3.14
 	심볼릭 상수 const int MAX = 5;
 	->자바 final int MAX = 5;
 	
 	"abc"  상수! -> 인스턴스로 처리하는 상수       (내가 뭘 쓸지 몰라서 리터럴 상수가 아니다. 형은 결정되어 있다.)
 	그러다보니, "객체"가 필요해 진다!
 	string msg = "abc";
 	
 	String msg = "abc"; // msg라는 객체가 있어야 "abc"를 담을 수 있다

	--------------------------
 	String msg = new String("abc"); 그런데, 오로지 String 만 생성자 없이 인스턴스를 대입받을 수 있다!
 	그 이유는 간략화, 간소화를 할 수 있었던 이유는 "abc"를 인스턴스로 만들었기 때문에... 간소화를 할 수 있다!
 	
 	그래서 문자열은 리터럴상수에 비해 특별 대우를 받는다!
 	
 	
 */
public class StringTest01 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";
		String s1 = "100";
		String s3 = new String("100");
		
		//str1과 str2 는 같을까?
		System.out.println(str1 == str2 ? "같다" : "다르다");
		System.out.println(str1.equals(str2) ? "같다" : "다르다");
		System.out.println(s1 == s3 ? "같다" : "다르다");
		System.out.println(s1.equals(s3) ? "같다" : "다르다");
		
	}

}



















