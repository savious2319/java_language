package classEx;

import java.util.Scanner;

/*
 	클래스 만들기
 	
 	1) public 클래스는 파일명과 동일한 클래스만 붙인다.
 	2) public 클래스는 한 소스파일에서 단 하나만 존재해야 한다.
 	
 	=============================================================
 	
 	3) 수정자 중에서, 접근 지정라는 것이 있다!
 		private (변수, 메서드) 한 클래스 내부에서만 사용. 다른 클래스에서는 사용할 수 없다
 		protected (변수, 메서드) 상속 받은 클래스에서 사용한다
 		default == package 기본지정   한 패키지 내부에서만 사용 (다른 패키지에서는 사용할 수 없음)
 		public : 프로젝트 내부에서 사용
 		
 		클래스를 만들 때는, 클래스 앞에 public 과 default 만 붙일 수 있다! (private, protected는 붙일 수 없다!)
 		
 */
class A{
	int defaultInt;
	private int privateInt;
}
class B{
	// A 클래스에 있는 defaultInt하고 privateInt에 접근 권한을 알아보려 한다!
	
	// 메서드를 하나 임시로 만들고, 그 메서드에서 A클래스의 인스턴스 변수를 출력해 보자!
	void fctImsi() {
		A obj = new A();
		obj.defaultInt = 100;
		System.out.println(obj.defaultInt);
		
		//obj.privateInt = 111;  privateInt의 접근권한이 private 상태라서 호출할 수 없다. 존재는 하는데 접근할 수 없다
		//왜 private 권한을 만들었을까??
	}
	
}
class C{}
class Score2{ 
	static Scanner sc = new Scanner(System.in);
	String name;
	private int kor;
	private int eng;
	private int math;
	
	/*
	public 메서드Kor(매개변수) {   //매개변수 값을 kor 인스턴스 변수에게 전달하기 위한 메서드를 만들자!
		kor = 매개변수;
	}
	*/
	public void setKor() { // private 인스턴스 변수에게 값을 전달할 때는
		
		while(true) {
			kor = sc.nextInt();
		if(kor >= 0 && kor <= 100) {
		this.kor = kor;                // setter 메서드를 만들어서 전달하자! bean규약 set이란 접두사를 앞에 쓴다
		break;
		}else {
			System.out.println("잘못 입력하셨습니다. 0~100점 사이를 입력하세요");
		}
		}
		System.out.println("입력이 완료되었습니다");
	}
	
	public void setEng(int eng) {
		//this.eng = eng; //this.eng --> 인스턴스 변수
					    // 매개변수와 인스턴스 이름이 같다!
						// 인스턴스 변수앞에 this. 을 붙이자!
		
		while(true) {
			if(eng >= 0 && eng <= 100) {
			this.eng = eng;                // setter 메서드를 만들어서 전달하자! bean규약 set이란 접두사를 앞에 쓴다
			break;
			}else {
				System.out.println("잘못 입력하셨습니다. 0~100점 사이를 입력하세요");
			}
			}
	}
	
	public void setMath(int math) {
		
		while(true) {
		if(math >= 0 && math <= 100) {
			this.math = math;                
			break;
			}else {
				System.out.println("잘못 입력하셨습니다. 0~100점 사이를 입력하세요");
			}
			}
	}
	
	
	
	void printScore() {
		System.out.println("이름 : " + this.name + "\n" + "국어 점수 : " + this.kor+"점\n" + "영어 점수 : " + this.eng+"점\n"
							+"수학 점수 : "+this.math+"점");
		System.out.println();
				
	}
	
}


public class ClassTest02 { // public class 단 하나만 존재! 파일명인 클래스에만 public을 붙일 수 있다!

	public static void main(String[] args) {
		
		Score2 iss = new Score2();
		
		iss.name = "이순신";
		//iss.inputKor(100);
		
		//iss.setKor(100);	//iss.kor = 100;
		System.out.print("국어 점수를 입력하세요 : ");
		iss.setKor();
		
		//iss.setEng(120);	//iss.eng = 120;
		//iss.setMath(-99);	//iss.math = -99;
		
		
		// 직접 변수에 값을 대입하면 실수를 할 수 있는 우려가 있다.
		
	}

}












