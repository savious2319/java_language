package anonymousEx;
/*
	�͸� Ŭ����
	
	������ ����, �����ڿ� �ٿ��� ����!
	�̸� ���� 1ȸ�� Ŭ�����̴�.
	Ŭ���� �ٵ� �������� �޼��常 �����ϸ� �ȴ�!
 */
interface InterA{
	void fct1();
	void fct2();
	void fct3();
	void fct4();
}
class MyFunction implements InterA{

	@Override
	public void fct1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fct2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fct3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fct4() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AnonymousTest03 {

	public static void main(String[] args) {
		InterA obj = new InterA() {

			@Override
			public void fct1() {
				
			}

			@Override
			public void fct2() {
				
			}

			@Override
			public void fct3() {
				System.out.println("3���� �ʿ���");
				
			}

			@Override
			public void fct4() {}
			
		};
		obj.fct3();
		
		
		MyFunction func = new MyFunction();
		func.fct3();
		
		
	}

}















