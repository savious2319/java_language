package classEx4;
/*
 	static �ʱ�ȭ ��
 	
 	Ŭ���� ���۽� �� ó�� �ѹ��� �����ϴ� �ʱ�ȭ ��
 	
 	static{
 	
 	
 */
class Score4{
	static int cnt = 0;
	int bun = 0;
	String name;
	int kor;
	int eng;
	int math;
	//static int art;
	
	static{
		
		System.out.println("����ƽ �ʱ�ȭ ��");
		System.out.println("����ƽ �ʱ�ȭ ���� �ν��Ͻ� ��������� Ƚ���� �������,"
							+ "������ �ѹ��� ����ȴ�!");
		System.out.println();
		System.out.println();
		
		//art = 999;
		cnt++;
		
		
	}
	
	{	// �ν��Ͻ� �ʱ�ȭ ��
		// �ν��Ͻ� ������� �� ���� �� ���� �����Ѵ�!
		System.out.println("�ν��Ͻ��ʱ�ȭ ��");
		bun = cnt;
		
		
		name= "����"; //name ="";
		kor = -1;
		eng = -1;
		math = -1;
		
		//��� �ν��Ͻ����� ó���� ���� �ְ��� �� �� ���� ���ϴ�!
		//�ν��Ͻ��� ������ ��, � ���� ���������� ��Ű���� �� �� ����!
		
	}
	
	public Score4() {
		
		name= "�⺻ ������"; 
		kor = -2;
		eng = -2;
		math = -2;
	
	}
	
	
	
	public void print() {
		System.out.println(bun + "�� : "+ name + " // " + kor +" // " + eng +" // " + math + "��");
	}
	
}

public class ClassTest08_2{
	
	public static void main(String[] args) {
		Score4 std1 = new Score4(); // ��� �ν��Ͻ����� �ν��Ͻ� �ʱ�ȭ ���� ��������!
		Score4 std2 = new Score4();
		Score4 std3 = new Score4();
		Score4 std4 = new Score4();
		
		std1.print();
		std2.print();
		std3.print();
		std4.print();
	
		
	}

}
