package anonymousEx;
/*
  	익명 클래스 - 연습하기
  	
  	1) 추상 메서드 1개 있는 추상 클래스를 정의하시오
  	2) 메인에서 인스턴스 생성시, 익명클래스로 재정의 하고,
  		객체를 통해 재정의 한 메서드를 출력하세요
  		
  	익명 클래스 - 연습하기2
  	1) 인터페이스 - 추상메서드 5개 있는 인터페이스 정의
  	2) 각각 상속과 익명클래스를 이용해 재정의 한 후,
  	3) 원하는 메서드를 호출해 보세요
 
 */
abstract class City{
	
	abstract void view();
}

interface Face{
	void face1();
	void face2();
	void face3();
	void face4();
	void face5();
}

class Mask implements Face{

	@Override
	public void face1() {
		System.out.println("face1() 메서드");
		
	}

	@Override
	public void face2() {
		System.out.println("face2() 메서드");
		
	}

	@Override
	public void face3() {
		System.out.println("face3() 메서드");
		
	}

	@Override
	public void face4() {
		System.out.println("face4() 메서드");
		
	}

	@Override
	public void face5() {
		System.out.println("face5() 메서드");
		
	}
	
	
}
public class AnonymousTest04 {

	public static void main(String[] args) {

		City c = new City() {
			
			void view() {
				
				System.out.println("City 클래스의 view() 메서드 재정의한 익명클래스");
				
			}
			
		};
		
		c.view();
		
		Face f = new Face() {

			@Override
			public void face1() {
				System.out.println("face1() 메서드 재정의한 익명클래스");
			}

			@Override
			public void face2() {
				System.out.println("face2() 메서드 재정의한 익명클래스");
				
			}

			@Override
			public void face3() {
				System.out.println("face3() 메서드 재정의한 익명클래스");
				
			}

			@Override
			public void face4() {
				System.out.println("face4() 메서드 재정의한 익명클래스");
				
			}

			@Override
			public void face5() {
				System.out.println("face5() 메서드 재정의한 익명클래스");
				
			}
			
		};
		
		Mask m = new Mask();
		m.face2();
		
		f.face2();
		
		
		
		
		
		
		
		
		
	}

}
