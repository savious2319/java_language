package classEx4;

class Score{
	static int cnt = 0;
	int bun = 0;
	String name;
	int kor;
	int eng;
	int math;
	{	// �ν��Ͻ� �ʱ�ȭ ��
		// �ν��Ͻ� ������� �� ���� �� ���� �����Ѵ�!
		System.out.println("�ν��Ͻ��ʱ�ȭ ��");
		bun = ++cnt;
		
		
		name= "����"; //name ="";
		kor = -1;
		eng = -1;
		math = -1;
		
		//��� �ν��Ͻ����� ó���� ���� �ְ��� �� �� ���� ���ϴ�!
		//�ν��Ͻ��� ������ ��, � ���� ���������� ��Ű���� �� �� ����!
		
	}
	public void print() {
		System.out.println(bun + "�� : "+ name + " // " + kor +" // " + eng +" // " + math + "��");
	}
	
}

public class ClassTest08{
	
	public static void main(String[] args) {
		Score std1 = new Score(); // ��� �ν��Ͻ����� �ν��Ͻ� �ʱ�ȭ ���� ��������!
		Score std2 = new Score();
		Score std3 = new Score();
		Score std4 = new Score();
		
		std1.print();
		std2.print();
		std3.print();
		std4.print();
	
		
	}

}
