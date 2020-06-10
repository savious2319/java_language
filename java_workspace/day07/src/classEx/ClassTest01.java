package classEx;
/*
 	클래스 만들기
 	
 	5명의 학생이 있다.
 	이 학생들은 3과목 시험을 본다.
 	데이터를 구조화 하기 위해 클래스로 만들어 보자!
 */

class Score{
	String name;
	int kor;
	int eng;
	int math;
	
	void printScore() {
		System.out.println("이름 : " + this.name + "\n" + "국어 점수 : " + this.kor+"점\n" + "영어 점수 : " + this.eng+"점\n"
							+"수학 점수 : "+this.math+"점");
		System.out.println();
				
	}
	
}


public class ClassTest01 {

	public static void main(String[] args) {
		//1번 홍길동 10 20 30
		//2번 박문수 11 21 31
		//3번 박문수 12 22 32
		
		Score hgd = new Score();
		hgd.name = "홍길동"; hgd.kor = 10; hgd.eng = 20; hgd.math = 30;
		
		Score pms = new Score();
		pms.name = "박문수"; pms.kor = 11; pms.eng = 21; pms.math = 31;
		
		Score iss = new Score();
		iss.name = "이순신"; iss.kor = 12; iss.eng = 22; iss.math = 32;
		
		//출력하기
		hgd.printScore();
		pms.printScore();
		iss.printScore();
		
	}

}












