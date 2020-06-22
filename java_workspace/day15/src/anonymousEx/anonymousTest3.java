package anonymousEx;
/*
	익명 클래스
	
	생성할 때만, 생성자에 붙여서 쓴다!
	이름 없는 1회용 클래스이다.
	클래스 바디에 재정의할 메서드만 정의하면 된다!
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
				System.out.println("3번만 필요해");
				
			}

			@Override
			public void fct4(Type t) {}
			
		};
		obj.fct3();
		
		
		MyFunction1 func = new MyFunction1();
		func.fct3();
		func.fct4(new Type() {	});		//인스턴스를 넘길 때, 익명클래스 {} 을 통해서
										//재정의한 메서드를 인자로 넘길 때도 있다!
		
		
		
	}

}















