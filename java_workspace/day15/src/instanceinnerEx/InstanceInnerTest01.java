package instanceinnerEx;
/*
 	�̳� Ŭ����
 		- �ν��Ͻ� �̳� Ŭ����
 		
 		- �̳�(����) Ŭ������ �ִµ�, �� �̳� Ŭ������ ����̴�!
 		- �� ����� �ʵ峪 �޼��尡 �ƴ϶�, Ŭ������ ����̴�.
 		- ���� Ŭ������ ���(�γ� Ŭ����)�� �ν��Ͻ��� ���� ��, ���� Ŭ������ �ʵ忡 �����ؾ��Ѵ�.
 */
class Outer{
	
	int x = 10; 	// Outer�� x
	
	void fct() {	// Outer�� fct()
		System.out.println(x);
	}
	
	class Inner{
		int y = 10;
		void fct_y() {
			System.out.println(y);
			System.out.println("�ܺ�Ŭ������ �ִ� ��� : "+x);
		}
	}
	
	
}

public class InstanceInnerTest01 {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		//��ü = out.new Inner();
		Outer.Inner innerObj = out.new Inner();
		//����Ŭ���� Ÿ�� ������ .�� ���ؼ� ��üȭ �Ǿ�� �Ѵ�!
		
		System.out.println(innerObj.y);
		innerObj.fct_y();
		//�ν��Ͻ��� �ؾ��ϴ� (�ܺ�)Ŭ�����ȿ� �ִ� (����)Ŭ���� 
		
		
		
		
	}

}
