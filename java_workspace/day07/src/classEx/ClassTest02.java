package classEx;

import java.util.Scanner;

/*
 	Ŭ���� �����
 	
 	1) public Ŭ������ ���ϸ�� ������ Ŭ������ ���δ�.
 	2) public Ŭ������ �� �ҽ����Ͽ��� �� �ϳ��� �����ؾ� �Ѵ�.
 	
 	=============================================================
 	
 	3) ������ �߿���, ���� ������� ���� �ִ�!
 		private (����, �޼���) �� Ŭ���� ���ο����� ���. �ٸ� Ŭ���������� ����� �� ����
 		protected (����, �޼���) ��� ���� Ŭ�������� ����Ѵ�
 		default == package �⺻����   �� ��Ű�� ���ο����� ��� (�ٸ� ��Ű�������� ����� �� ����)
 		public : ������Ʈ ���ο��� ���
 		
 		Ŭ������ ���� ����, Ŭ���� �տ� public �� default �� ���� �� �ִ�! (private, protected�� ���� �� ����!)
 		
 */
class A{
	int defaultInt;
	private int privateInt;
}
class B{
	// A Ŭ������ �ִ� defaultInt�ϰ� privateInt�� ���� ������ �˾ƺ��� �Ѵ�!
	
	// �޼��带 �ϳ� �ӽ÷� �����, �� �޼��忡�� AŬ������ �ν��Ͻ� ������ ����� ����!
	void fctImsi() {
		A obj = new A();
		obj.defaultInt = 100;
		System.out.println(obj.defaultInt);
		
		//obj.privateInt = 111;  privateInt�� ���ٱ����� private ���¶� ȣ���� �� ����. ����� �ϴµ� ������ �� ����
		//�� private ������ ���������??
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
	public �޼���Kor(�Ű�����) {   //�Ű����� ���� kor �ν��Ͻ� �������� �����ϱ� ���� �޼��带 ������!
		kor = �Ű�����;
	}
	*/
	public void setKor() { // private �ν��Ͻ� �������� ���� ������ ����
		
		while(true) {
			kor = sc.nextInt();
		if(kor >= 0 && kor <= 100) {
		this.kor = kor;                // setter �޼��带 ���� ��������! bean�Ծ� set�̶� ���λ縦 �տ� ����
		break;
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0~100�� ���̸� �Է��ϼ���");
		}
		}
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�");
	}
	
	public void setEng(int eng) {
		//this.eng = eng; //this.eng --> �ν��Ͻ� ����
					    // �Ű������� �ν��Ͻ� �̸��� ����!
						// �ν��Ͻ� �����տ� this. �� ������!
		
		while(true) {
			if(eng >= 0 && eng <= 100) {
			this.eng = eng;                // setter �޼��带 ���� ��������! bean�Ծ� set�̶� ���λ縦 �տ� ����
			break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 0~100�� ���̸� �Է��ϼ���");
			}
			}
	}
	
	public void setMath(int math) {
		
		while(true) {
		if(math >= 0 && math <= 100) {
			this.math = math;                
			break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 0~100�� ���̸� �Է��ϼ���");
			}
			}
	}
	
	
	
	void printScore() {
		System.out.println("�̸� : " + this.name + "\n" + "���� ���� : " + this.kor+"��\n" + "���� ���� : " + this.eng+"��\n"
							+"���� ���� : "+this.math+"��");
		System.out.println();
				
	}
	
}


public class ClassTest02 { // public class �� �ϳ��� ����! ���ϸ��� Ŭ�������� public�� ���� �� �ִ�!

	public static void main(String[] args) {
		
		Score2 iss = new Score2();
		
		iss.name = "�̼���";
		//iss.inputKor(100);
		
		//iss.setKor(100);	//iss.kor = 100;
		System.out.print("���� ������ �Է��ϼ��� : ");
		iss.setKor();
		
		//iss.setEng(120);	//iss.eng = 120;
		//iss.setMath(-99);	//iss.math = -99;
		
		
		// ���� ������ ���� �����ϸ� �Ǽ��� �� �� �ִ� ����� �ִ�.
		
	}

}












