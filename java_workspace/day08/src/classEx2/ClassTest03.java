package classEx2;

import java.util.Scanner;

class Score{  // ctrl + i => indent
	
	private int num;
	private int kor;
	private int eng;
	private int math;
	
	
	
	public Score(int num, int kor, int eng, int math) {
		super();
		this.num = num;
		if(kor >= 0 && kor <=100) {
		setKor(kor);
		}else {
			this.kor = -1;
		}
		
		if(eng >= 0 && eng <=100) {
			setEng(eng);
			}else {
				this.eng = -1;
			}
		
		if(math >= 0 && math <=100) {
			setMath(math);
			}else {
				this.math = -1;
			}
	}
	
	
	
	
	public Score(int num, int kor, int eng) {
		this(num,kor,eng, -1);
	}

	

	public Score(int num, int kor) {
		this(num,kor,-1, -1);
	}

	

	public Score(int num) {
		this(num,-1,-1,-1);
	}



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
		if(num >= 1) {
		this.num = num;
		}else {
			System.out.println("1 또는 1이상 숫자를 입력해주세요");
		}
	}
	public void setKor(int kor){
		if(kor >= 0 && kor <= 100) {
		this.kor = kor;
		}else {
			System.out.println("0~100점수 사이를 입력해주세요");
		}
	}
	public void setEng(int eng){
		if(eng >= 0 && eng <= 100) {
			this.eng = eng;
			}else {
				System.out.println("0~100점수 사이를 입력해주세요");
			}
	}
	public void setMath(int math){
		if(math >= 0 && math <= 100) {
			this.math = math;
			}else {
				System.out.println("0~100점수 사이를 입력해주세요");
			}
	}
	
	
	//출력용 메서드 만들어 보세요
	//출력예) 번호 : 0번 국어 : 10점 영어 : 20점 수학 : 30점 총점 : 00점 평균 : 00점
	
	void printScore() {
		
		
		System.out.println(num+"번\t"+kor+"점\t"+eng+"점\t"+math+"점\t"+getTotalScore()+"점\t"+getAvgScore()+"점");
		
	}
	
	public int getTotalScore() {
		
		return kor + eng + math;
	}
	
	public String getAvgScore() {
		
		return String.format("%.1f", getTotalScore()/3.0) ;
	}
	
}
 
 
public class ClassTest03 {
	static Scanner sc = new Scanner(System.in);
		
	
	public static void main(String[] args) {
		
//		Score[]arStudent = new Score[3];
//		String[]subject = {"국어","영어","수학"};
//		int[]totalScore = new int[3];
		
		
//		for (int i = 0; i < subject.length; i++) {
//			arStudent[i] = new Score();
//		}
//		
//		Score.inputScore(arStudent, subject, totalScore);
//		
//		Score.printScore(arStudent, totalScore);
		
		Score std1 = new Score(1, 150, 57, 64);
		Score std2 = new Score(2, 434, 67);
		Score std3 = new Score(3,87);
		Score std4 = new Score(4);
		
		//score.setNum(0);
		
		
//		System.out.print("번호를 입력해 주세요 : ");
//		std1.setNum(sc.nextInt());
//		System.out.print("국어 점수를 입력해 주세요 : ");
//		std1.setKor(sc.nextInt());
//		System.out.print("영어 점수를 입력해 주세요 : ");
//		std1.setEng(sc.nextInt());
//		System.out.print("수학 점수를 입력해 주세요 : ");
//		std1.setMath(sc.nextInt());
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		std1.printScore();
		std2.printScore();
		std3.printScore();
		std4.printScore();
		
	
		
		//score 의 국어성적만 보고싶다!
		
		//System.out.println(std1.getNum() + "번의 국어 성적 : " + std1.getKor());

	}

}

















