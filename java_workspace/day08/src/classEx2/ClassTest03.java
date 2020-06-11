package classEx2;

import java.util.Scanner;

class Score{  // ctrl + i => indent
	
	private int num;
	private int kor;
	private int eng;
	private int math;
	
	//getter 메서드 만들기
	public int getNum() {
		return this.num;  // this를 명시적으로 쓸 수 있다
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() { // 인스턴스 변수를 치고 ctrl + space를 누르면 getter 자동 완성 기능 옵션을 선택할 수 있다
		return math;
	}
	
	
	

	//setter 메서드 만들기
	public void setNum(int num) {
		this.num = num;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	
	
	
	//출력용 메서드 만들어 보세요
	//출력예) 번호 : 0번 국어 : 10점 영어 : 20점 수학 : 30점 총점 : 00점 평균 : 00점
	
	
	void printScore() {
		
		System.out.println("번호 : " + num + "번\n" + "국어 점수 : " + kor + "점\n" + "영어 점수 : " + eng + "점\n" + "수학 점수 : "
							+ math + "점\n" +"총점 : " + getTotalScore() + "점\n" + "평균 : " + getAvgScore() + "점\n");
		
	}
	
	private int getTotalScore() {
		
		
		return kor + eng + math;
	}
	
	public String getAvgScore() {
		
		return String.format("%.1f", getTotalScore()/3.0) ;
	}
	
}
 
 
public class ClassTest03 {
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		Score std1 = new Score();
		//score.setNum(0);
		
		
		System.out.print("번호를 입력해 주세요 : ");
		std1.setNum(sc.nextInt());
		System.out.print("국어 점수를 입력해 주세요 : ");
		std1.setKor(sc.nextInt());
		System.out.print("영어 점수를 입력해 주세요 : ");
		std1.setEng(sc.nextInt());
		System.out.print("수학 점수를 입력해 주세요 : ");
		std1.setMath(sc.nextInt());
		
		std1.printScore();
		
	
		
		//score 의 국어성적만 보고싶다!
		
		System.out.println(std1.getNum() + "번의 국어 성적 : " + std1.getKor());

	}

}

















