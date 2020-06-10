package methodex;

class A{
	
	//인스턴스
	
	//메서드
		
}
//메서드를 선언할 수 없다!


public class MethodTest01 {
	
	// 필드(인스턴스 변수) 영역
	int kor, eng, math;
	
	// 메서드 영역
	// 1)메서드 분류
	//    일반 메서드 (비지니스 메서드)
	//    getter/setter
	//    생성자
	//    추상메서드
	
	// 2) 비지니스 메서드
//	void prinScore(int mK, int mE, int mM) {
//		
//		System.out.println("국어 점수 : " + this.mK + "점");
//		System.out.println("영어 점수 : " + this.mE + "점");
//		System.out.println("수학 점수 : " + this.mM + "점");
//		
//	}
	void printScore() {
		//this 라는 변수를 메서드 내부에 내장하고 있다!!!
		//이 this는 객체에 대응하는 참조변수이다!
		//눈에 보이진 않지만, 메서드 내부에 상주하고 있기 때문에
		//언제든 명시적으로 사용할 수 있다.
			
		//이 this는 상주하고 있기 때문에 생략한다!
		// this는 객체를 대신한다! 그래서 객체가 사용할 수 있는 
		// 인스턴스 변수와 연결된다!
		System.out.println("국어 점수 : " + this.kor + "점");  //this -> hgd 또는 다른 객체로 대체한다
		System.out.println("영어 점수 : " + this.eng + "점");  //     -> 객체가 다를때마다 this는 그 객체를 대신한다
		System.out.println("수학 점수 : " + math + "점"); //this를 생략해도 된다
		System.out.println(this);
	}
	
	void printScoreAr(int [] arScore) {
		
		System.out.println("★홍길동 국영수 점수★");
		String[]sub = {"국어", "영어", "수학"};
		for (int i = 0; i < arScore.length; i++) {
			System.out.println(sub[i] + "점수 : " + arScore[i] + "점");
		}
		
	}
	
	public static void main(String[] args) {
	
	//홍길동의 국어 = 10, 영 = 20, 수 = 30
	//printScore(국영수) 출력	
	MethodTest01 hgd = new MethodTest01();
	
	hgd.kor = 10;
	hgd.eng = 20;
	hgd.math = 30;
	//hgd.printScore(hgd.kor, hgd.eng, hgd.math); kor만 인자로 주면 kor는 static 변수가 아니므로 사용 못한다 
												 // 인자를 보낼 필요가 없다! this가 알아서 대응해주기 때문이다!
	System.out.println("★홍길동 국영수 점수★");
	hgd.printScore(); //kor만 인자로 주면 kor는 static 변수가 아니므로 사용 못한다
	
	MethodTest01 iss = new MethodTest01();
	iss.kor = 11;
	iss.eng = 21;
	iss.math = 31;
	System.out.println("★이순신 국영수 점수★");
	iss.printScore();
	
    System.out.println();
	//int [] arScore = {홍길동 점수}
	//printScoreAr(arScore) 출력하자!
	
	int[] arScore = {hgd.kor, hgd.eng, hgd.math};  //{10,20,30};
	hgd.printScoreAr(arScore); //arScore는 지역변수이다. 그래서 그냥 argument로 보내면 된다
		
		
		
		
		
		
		
		

	}

}
