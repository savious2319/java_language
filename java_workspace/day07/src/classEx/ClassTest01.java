package classEx;
/*
 	Ŭ���� �����
 	
 	5���� �л��� �ִ�.
 	�� �л����� 3���� ������ ����.
 	�����͸� ����ȭ �ϱ� ���� Ŭ������ ����� ����!
 */

class Score{
	String name;
	int kor;
	int eng;
	int math;
	
	void printScore() {
		System.out.println("�̸� : " + this.name + "\n" + "���� ���� : " + this.kor+"��\n" + "���� ���� : " + this.eng+"��\n"
							+"���� ���� : "+this.math+"��");
		System.out.println();
				
	}
	
}


public class ClassTest01 {

	public static void main(String[] args) {
		//1�� ȫ�浿 10 20 30
		//2�� �ڹ��� 11 21 31
		//3�� �ڹ��� 12 22 32
		
		Score hgd = new Score();
		hgd.name = "ȫ�浿"; hgd.kor = 10; hgd.eng = 20; hgd.math = 30;
		
		Score pms = new Score();
		pms.name = "�ڹ���"; pms.kor = 11; pms.eng = 21; pms.math = 31;
		
		Score iss = new Score();
		iss.name = "�̼���"; iss.kor = 12; iss.eng = 22; iss.math = 32;
		
		//����ϱ�
		hgd.printScore();
		pms.printScore();
		iss.printScore();
		
	}

}












