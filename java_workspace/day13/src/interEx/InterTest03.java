package interEx;

class TypeA{
	
}
class TypeB extends TypeA implements InterAA{ //�ڽ� Ŭ�����߿� �˻簡 �ʿ��� ��� 
											  // makrup �������̽�(ǥ�ÿ� �������̽�)�� ����ȴ�!
										      // üũ�� ����Ѵ�
	
}

class TypeC extends TypeA implements InterBB{
	
}

class SomeA{
	void fct(TypeA obj) {
		if(obj instanceof TypeB) {
			System.out.println(obj.getClass().getSimpleName()+"�� TypeB Ŭ�����Դϴ�");
		}
		else if(obj instanceof TypeC) {
			System.out.println(obj.getClass().getSimpleName()+"�� TypeC Ŭ�����Դϴ�");
		
		}
		if(obj instanceof InterAA) {
			System.out.println(obj.getClass().getSimpleName()+"�� InterAA�� ������ �ް� �ֽ��ϴ�");
		}
		if(obj instanceof InterBB) {
			System.out.println(obj.getClass().getSimpleName()+"�� InterBB�� ������ �ް� �ֽ��ϴ�");
		}
	}
}
public class InterTest03 {

	public static void main(String[] args) {
		
		SomeA some = new SomeA();
		
		some.fct(new TypeB());
		some.fct(new TypeC());
		
	}

}






