package instanceinnerEx;
/*
 	�̳� Ŭ����
 		- �ν��Ͻ� �̳� Ŭ����
 		
 		- �̳�(����) Ŭ������ �ִµ�, �� �̳� Ŭ������ ����̴�!
 		- �� ����� �ʵ峪 �޼��尡 �ƴ϶�, Ŭ������ ����̴�.
 		- ���� Ŭ������ ���(�γ� Ŭ����)�� �ν��Ͻ��� ���� ��, ���� Ŭ������ �ʵ忡 �����ؾ��Ѵ�.
 */
class Outer2{
	
	int x = 10; 	// Outer�� x
	
	Inner myInner = new Inner(); //���� Ŭ������ �ν��Ͻ��� �̸� ������ ����!
	static Inner2 out = new Inner2(); //Inner2 Ŭ������ �Ϲ� �ν��Ͻ� Ŭ�����̴�! 
	//out ���������� �̸� ����� ����(static)
	//�ν��Ͻ� �̳�Ŭ�����ϰ� ���� ��Ű���� �ߴ��� "���� �Ұ�"
	//Inner2�� static���� �����ϸ�, ouot ��ü�� static�� ��ġ�ϱ� ������,
	//���԰���
	//out�� �̸� ����� ���� �ٷ� �ٷ� �ҷ��� ���� �;���! �׷���, static���� ����
	//�Ϸ��� �ߴµ�, ���� Ŭ������ isntance���� Ŭ������ out�ϰ� ������ �ȵ� ���̴�!
	//���� ���� Ŭ������ static ȭ�� �ʿ��� �� �ִ�
	void fct() {	// Outer�� fct()
		System.out.println(x);
	}
	static class Inner2{
		void print() {
			System.out.println("print�޼���");
		}
	}
	class Inner{
		int y = 10;
		void fct_y() {
			System.out.println(y);
			System.out.println("�ܺ�Ŭ������ �ִ� ��� : "+x);
		}
	}
	
	
}

public class InstanceInnerTest02 {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		//��ü = out.new Inner();
		Outer2.Inner innerObj = out.new Inner();
		Outer2.Inner innerObj2 = out.myInner;
		//����Ŭ���� Ÿ�� ������ .�� ���ؼ� ��üȭ �Ǿ�� �Ѵ�!
		
		//System.out.println(innerObj2.y);
		System.out.println(out.myInner.y);
		
		innerObj.fct_y();
		out.myInner.fct_y();
		//�ν��Ͻ��� �ؾ��ϴ� (�ܺ�)Ŭ�����ȿ� �ִ� (����)Ŭ���� 
		
		
		
		
	}

}
