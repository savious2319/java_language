package scoreEx_�鼺��2;

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
		idNum = cnt++;  //�ν��Ͻ��� ������������� idNum�� ���������ּ���
		
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
	
	private void setIdNum(int idNum) { // �������� ��쿡�� �ٲ� �� �ִ� (������ ���� �Ϲ� �л� ���)
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
				System.out.println("0~100���� ���̸� �Է��� �ּ���");
			}
		}
		System.out.println("���������� �ԷµǾ����ϴ�.");
	}

	public void setEngScore() {
		while(true) {
		engScore = sc.nextInt();
		if (engScore >= 0 && engScore <= 100) {
			this.engScore = engScore;
			break;
		} else {
			System.out.println("0~100���� ���̸� �Է��� �ּ���");
		}
		}
		System.out.println("���������� �ԷµǾ����ϴ�.");
	}

	public void setMathScore() {
		while(true) {
			mathScore = sc.nextInt();
		if (mathScore >= 0 && mathScore <= 100) {
			this.mathScore = mathScore;
			break;
		} else {
			System.out.println("0~100���� ���̸� �Է��� �ּ���");

		}
		}
		System.out.println("���������� �ԷµǾ����ϴ�.");
	}

	public int getTotalScore() {
		return korScore + engScore + mathScore;
	}

	public double getAvgScore() {
		return Double.parseDouble(String.format("%.1f", getTotalScore() / 3.0));
	}

	@Override
	public String toString() {
		return name + "\t" + idNum + "\t" + korScore + "��\t\t" + engScore + "��\t\t" + mathScore + "��\t\t" + getTotalScore()
				+ "��\t\t" + getAvgScore() + "��";
	}

}
