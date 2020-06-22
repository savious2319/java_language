package anonymousEx;
/*
	익명 클래스
	
	생성할 때만, 생성자에 붙여서 쓴다!
	이름 없는 1회용 클래스이다.
	클래스 바디에 재정의할 메서드만 정의하면 된다!
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
				System.out.println("3번만 필요해");
				
			}

			@Override
			public void fct4() {}
			
		};
		obj.fct3();
		
		
		MyFunction func = new MyFunction();
		func.fct3();
		
		
	}

}















