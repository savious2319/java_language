package anonymousEx;
/*
 	�͸� Ŭ����
 	
 	������ ����, �����ڿ��� �ٿ��� ����!
 	�̸� ���� 1ȸ�� Ŭ�����̴�.
 	Ŭ���� �ٵ� �������� �޼��常 �����ϸ� �ȴ�!
 	
 */
class Type{

	void fct() {
		System.out.println("Type Ŭ������ fct����");
	}
}

public class AnonymousTest01 {

	public static void main(String[] args) {
		
		Type obj = new Type();
		//fct�� �����ϰ� �ʹ�!
		
		//Type obj2 = new Type() {};		// {} ���� Ŭ���� body�� �ش��Ѵ�!

		new Type() {
		@Override
			void fct() {		//�� �ѹ��� �������ϰ� �������ʹ� �ٽ� ������ �ؾ���!!!
				//super.fct();
				System.out.println("2��. ���� ��� �������� �͸�Ŭ������ fct");
			}	
			
			
		}.fct();
		
		Type obj3 = new Type() {
			@Override
			void fct() {
				
				System.out.println("3��. ��� �ٽ� �� �ѹ� ������ ���� obj3�� ���Խ�Ŵ!!!");
			}
		};
		
		//obj3.fct(); //obj3�� �͸�Ŭ������ �������� fct�� ���� �ִ�
		obj3.fct();
		
		
		
	
	}

}












