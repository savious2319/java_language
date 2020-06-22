package staticInnerEx;


class Outer{
	
	class Inner{		//�ν��Ͻ� �̳�
		int num = 99;
		//static int stNum = 11; // static ������ ������ �� ����?
							   // Inner��� Ŭ������ �ν��Ͻ��� ������� �Ŀ��߸� ��밡��!
							   // Outer�� ���� instance�� �ȵ� ��Ȳ!!
		
		
	}
	
	static class StaticInner{		//����ƽ �̳�
		static int stNum = 11;		//���� Ŭ������ static �̾�� �ϰ�, ����� ���� static�̸�,
									//Outer���� �ҷ��ٰ� �� �� �ִ�!
		
		int value = 9999;			// �� value�� ���� �ִ� Ŭ������ �ν��Ͻ�ȭ ���� ������,
									// ����� �� ���� ����
	}
	
	
}

public class StaticInnerTest01 {

	public static void main(String[] args) {
		
		//num ����� ����
		System.out.println(new Outer().new Inner().num);
		
		//stNum ����� ����
		System.out.println(Outer.StaticInner.stNum); //static Ŭ�����̱⶧���� Outer Ŭ������ .�� ������ StaticInnerŬ������ ������ �� �ȿ�
													 //static int stNum�� ������ �� �ִ�
		
		
		//value�� ����� ����! -> �ν��Ͻ� ������! �׷��� �ش� Ŭ������ �ν��Ͻ��� ������ �Ѵ�!
		Outer.StaticInner obj = new Outer.StaticInner();  //StaticInnerŬ������ Outer�� �ҼӵǾ� �ִ� Ŭ�����̱� ������ Outer��(.)StaticInner��� �ؾ��Ѵ�
		System.out.println(obj.value);
		
		
		
		
		
		
		
		
		
	}
}
