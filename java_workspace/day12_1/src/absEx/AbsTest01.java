package absEx;

 /*
 	�߻� Ŭ���� - �߻� �޼��� - �߻�޼���� �������� �ݵ�� ������
 	"�ȱ׷���, �ν��Ͻ��� ���� �� ����"
 */

abstract class A{	// A�� �߻�Ŭ������ ������!
	int kor;
	int eng;
	A(int k, int e){}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	
	abstract public void printScore();
	// �߻�Ŭ������ �Ϲ� Ŭ������ �Ȱ����� �߻�޼��尡 �ϳ��� �־ �ν��Ͻ�ȭ ����Ų��
	// ���� Ŭ�������� ������ ����������� �������� �ο��ϱ� ���� �߻� Ŭ����/�߻� �޼��带 ����
	abstract public void inputScore();
	abstract public void updateScore();
	abstract public void deleteScore();
}
abstract class C extends A{

	C() {
		super(0, 0);
	}
}

class B extends A{
	B(){
		super(0,0);
	}

	@Override
	public void printScore() {
		System.out.println("�߻� �޽��带 ������ �߽��ϴ�!");
	}

	@Override
	public void inputScore() {
		
	}

	@Override
	public void updateScore() {
		
	}

	@Override
	public void deleteScore() {
		
	}
	
}
public class AbsTest01 {

	public static void main(String[] args) {

		
	}

}
