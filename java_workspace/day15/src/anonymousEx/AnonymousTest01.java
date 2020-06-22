package anonymousEx;
/*
 	익명 클래스
 	
 	생성할 때만, 생성자에게 붙여서 쓴다!
 	이름 없는 1회용 클래스이다.
 	클래스 바디에 재정의할 메서드만 정의하면 된다!
 	
 */
class Type{

	void fct() {
		System.out.println("Type 클래스의 fct에요");
	}
}

public class AnonymousTest01 {

	public static void main(String[] args) {
		
		Type obj = new Type();
		//fct를 변경하고 싶다!
		
		//Type obj2 = new Type() {};		// {} 블럭이 클래스 body에 해당한다!

		new Type() {
		@Override
			void fct() {		//단 한번만 재정의하고 다음부터는 다시 재정의 해야함!!!
				//super.fct();
				System.out.println("2번. 내가 방금 재정의한 익명클래스의 fct");
			}	
			
			
		}.fct();
		
		Type obj3 = new Type() {
			@Override
			void fct() {
				
				System.out.println("3번. 방금 다시 또 한번 재정의 했음 obj3에 대입시킴!!!");
			}
		};
		
		//obj3.fct(); //obj3는 익명클래스로 재정의한 fct를 갖고 있다
		obj3.fct();
		
		
		
	
	}

}












