package localInnerEx;
/*
 	로컬 이너클래스
 	(지역 == 메서드 내부)
 	-> 메서드 내부에 클래스를 만들자!
 	
 	그래서, 메서드 내부에 만든 클래스는
 	외부에서 부를 수 없다!
 	
 	
 	=> 메서드 내부에 "또다른 메서드를 선언할 수 있다!!!" 단, 반드시 내부 클래스를 통해서만 메서드를 만들 수 있다.
 	   외부에 노출시키지 않기 위해서(보안 때문에)
 	   메서드 내부에 클래스를 만들어서 사용하자!
  
 */
class Outer{
	void fct() {
		
		//메서드 내부에 클래스를 하나 만들자!
		class Inner{
			
			void innerFct() {
				System.out.println("로컬 이너 클래스를 호출했습니다");
				
			}
			
			
		}
		
		//메서드 안에서 로컬 내부 클래스를 인스턴스 화 한 후에,
		//그 인스턴스로 내부 메서드에 접근하도록 하자!
		Inner in = new Inner();
		in.innerFct();
		
		
		System.out.println("외부 fct 호출");
		
	}
}
public class LocalInnerTest01 {

	public static void main(String[] args) {
		
		new Outer().fct();
		
		
		

	}

}
















