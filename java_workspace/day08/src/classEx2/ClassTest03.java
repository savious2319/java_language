package classEx2;

import java.util.Scanner;

class Score{  // ctrl + i => indent
	
	private int num;
	private int kor;
	private int eng;
	private int math;
	
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
	
	
	
	//��¿� �޼��� ����� ������
	//��¿�) ��ȣ : 0�� ���� : 10�� ���� : 20�� ���� : 30�� ���� : 00�� ��� : 00��
	
	
	void printScore() {
		
		System.out.println("��ȣ : " + num + "��\n" + "���� ���� : " + kor + "��\n" + "���� ���� : " + eng + "��\n" + "���� ���� : "
							+ math + "��\n" +"���� : " + getTotalScore() + "��\n" + "��� : " + getAvgScore() + "��\n");
		
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
		
		
		System.out.print("��ȣ�� �Է��� �ּ��� : ");
		std1.setNum(sc.nextInt());
		System.out.print("���� ������ �Է��� �ּ��� : ");
		std1.setKor(sc.nextInt());
		System.out.print("���� ������ �Է��� �ּ��� : ");
		std1.setEng(sc.nextInt());
		System.out.print("���� ������ �Է��� �ּ��� : ");
		std1.setMath(sc.nextInt());
		
		std1.printScore();
		
	
		
		//score �� ������� ����ʹ�!
		
		System.out.println(std1.getNum() + "���� ���� ���� : " + std1.getKor());

	}

}

















