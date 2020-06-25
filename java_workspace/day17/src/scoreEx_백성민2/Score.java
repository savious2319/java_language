package scoreEx_백성민2;

import java.util.Scanner;

public class Score {
	static int cnt = 20200600;
	private String name;
	private int idNum; 
	private int korScore;
	private int engScore;
	private int mathScore;
	private int totalScore;
	private double avgScore;

	{
		idNum = cnt++;  //인스턴스가 만들어질때마다 idNum을 증가시켜주세요
		
	}
	
	public Score() {}

	public Score(String name, int korScore, int engScore, int mathScore) {

		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getIdNum() {
		return idNum;
	}

	public int getKorScore() {
		return korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private void setIdNum(int idNum) { // 관리자의 경우에만 바꿀 수 있다 (관리자 모드와 일반 학생 모드)
		this.idNum = idNum;
	}
	
	public void adminIdNum(int idNum) {
		setIdNum(idNum);
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void setKorScore() {
		while (true) {
			korScore = sc.nextInt();
			if (korScore >= 0 && korScore <= 100) {
				this.korScore = korScore;
				break;
			} else {
				System.out.println("0~100점수 사이를 입력해 주세요");
			}
		}
		System.out.println("정상적으로 입력되었습니다.");
	}

	public void setEngScore() {
		while(true) {
		engScore = sc.nextInt();
		if (engScore >= 0 && engScore <= 100) {
			this.engScore = engScore;
			break;
		} else {
			System.out.println("0~100점수 사이를 입력해 주세요");
		}
		}
		System.out.println("정상적으로 입력되었습니다.");
	}

	public void setMathScore() {
		while(true) {
			mathScore = sc.nextInt();
		if (mathScore >= 0 && mathScore <= 100) {
			this.mathScore = mathScore;
			break;
		} else {
			System.out.println("0~100점수 사이를 입력해 주세요");

		}
		}
		System.out.println("정상적으로 입력되었습니다.");
	}

	public int getTotalScore() {
		return korScore + engScore + mathScore;
	}

	public double getAvgScore() {
		return Double.parseDouble(String.format("%.1f", getTotalScore() / 3.0));
	}

	@Override
	public String toString() {
		return name + "\t" + idNum + "\t" + korScore + "점\t\t" + engScore + "점\t\t" + mathScore + "점\t\t" + getTotalScore()
				+ "점\t\t" + getAvgScore() + "점";
	}

}
