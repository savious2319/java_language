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



	//getter �޼��� �����
	public int getNum() {
		return this.num;  // this�� ��������� �� �� �ִ�
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() { // �ν��Ͻ� ������ ġ�� ctrl + space�� ������ getter �ڵ� �ϼ� ��� �ɼ��� ������ �� �ִ�
		return math;
	}
	
	
	

	//setter �޼��� �����
	public void setNum(int num) {
		if(num >= 1) {
		this.num = num;
		}else {
			System.out.println("1 �Ǵ� 1�̻� ���ڸ� �Է����ּ���");
		}
	}
	public void setKor(int kor){
		if(kor >= 0 && kor <= 100) {
		this.kor = kor;
		}else {
			System.out.println("0~100���� ���̸� �Է����ּ���");
		}
	}
	public void setEng(int eng){
		if(eng >= 0 && eng <= 100) {
			this.eng = eng;
			}else {
				System.out.println("0~100���� ���̸� �Է����ּ���");
			}
	}
	public void setMath(int math){
		if(math >= 0 && math <= 100) {
			this.math = math;
			}else {
				System.out.println("0~100���� ���̸� �Է����ּ���");
			}
	}
	
	
	//��¿� �޼��� ����� ������
	//��¿�) ��ȣ : 0�� ���� : 10�� ���� : 20�� ���� : 30�� ���� : 00�� ��� : 00��
	
	void printScore() {
		
		
		System.out.println(num+"��\t"+kor+"��\t"+eng+"��\t"+math+"��\t"+getTotalScore()+"��\t"+getAvgScore()+"��");
		
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
//		String[]subject = {"����","����","����"};
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
		
		
//		System.out.print("��ȣ�� �Է��� �ּ��� : ");
//		std1.setNum(sc.nextInt());
//		System.out.print("���� ������ �Է��� �ּ��� : ");
//		std1.setKor(sc.nextInt());
//		System.out.print("���� ������ �Է��� �ּ��� : ");
//		std1.setEng(sc.nextInt());
//		System.out.print("���� ������ �Է��� �ּ��� : ");
//		std1.setMath(sc.nextInt());
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		std1.printScore();
		std2.printScore();
		std3.printScore();
		std4.printScore();
		
	
		
		//score �� ������� ����ʹ�!
		
		//System.out.println(std1.getNum() + "���� ���� ���� : " + std1.getKor());

	}

}

















