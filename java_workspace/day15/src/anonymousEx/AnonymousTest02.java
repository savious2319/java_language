package anonymousEx;
/*
 	익명 클래스
 	
 	생성할 때만, 생성자에게 붙여서 쓴다!
 	이름 없는 1회용 클래스이다.
 	클래스 바디에 재정의할 메서드만 정의하면 된다!
 	
 	
 	단순이 메서드 하나만 재정의 해야 할 때는 익명클래스로 즉시성을 부여할 수 있다.
 		("즉시성 - 그 자리에서 바로 재정의 해서 쓰자!")
 		
 	그런데, 재정의할 메서드가 많을 경우에는, 익명클래스로 처리하기에 부담이 된다!
 	그래서, 상속받아서 관리하는 게 유리할 때가 많다!
 	
 	
 */
abstract class Test{	//추상 클래스 - 혼자서 인스턴스를 만들 수 없다!

	abstract void fct();
}
class T extends Test{
	
	@Override
	void fct() {
		// TODO Auto-generated method stub
		
	}
	
	void some(Test t) { //추상 클래스 - 객체는 만들 수 있다
		
		
	}
	
}
public class AnonymousTest02 {

	public static void main(String[] args) {
		
		//Test라는 추상클래스에도 인스턴스를 만들 수 있다!!!
		Test t  = new Test() {
			
			@Override
			void fct() {
				
				System.out.println("익명 클래스를 통해서 추상메서드 또는 인터페이스도 재정의를 통해 인스턴스를 만들 수 있구나!!!!");
				
			}
			
			
		};
		
		
		
	
	}

}












