package anonymousEx;
/*
	�͸� Ŭ����
	
	������ ����, �����ڿ� �ٿ��� ����!
	�̸� ���� 1ȸ�� Ŭ�����̴�.
	Ŭ���� �ٵ� �������� �޼��常 �����ϸ� �ȴ�!
 */
interface InterA1{
	void fct1();
	void fct2();
	void fct3();
	void fct4(Type t);
}
class MyFunction1 implements InterA1{

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
	public void fct4(Type t) {
		// TODO Auto-generated method stub
		
	}

	
}
public class anonymousTest3 {

	public static void main(String[] args) {
		InterA1 obj = new InterA1() {

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
			public void fct4(Type t) {}
			
		};
		obj.fct3();
		
		
		MyFunction1 func = new MyFunction1();
		func.fct3();
		func.fct4(new Type() {	});		//�ν��Ͻ��� �ѱ� ��, �͸�Ŭ���� {} �� ���ؼ�
										//�������� �޼��带 ���ڷ� �ѱ� ���� �ִ�!
		
		
		
	}

}















