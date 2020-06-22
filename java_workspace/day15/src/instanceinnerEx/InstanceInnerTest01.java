package instanceinnerEx;
/*
 	이너 클래스
 		- 인스턴스 이너 클래스
 		
 		- 이너(내부) 클래스가 있는데, 그 이너 클래스도 멤버이다!
 		- 그 멤버는 필드나 메서드가 아니라, 클래스인 멤버이다.
 		- 따라서 클래스인 멤버(인너 클래스)는 인스턴스를 만든 후, 내부 클래스의 필드에 접근해야한다.
 */
class Outer{
	
	int x = 10; 	// Outer의 x
	
	void fct() {	// Outer의 fct()
		System.out.println(x);
	}
	
	class Inner{
		int y = 10;
		void fct_y() {
			System.out.println(y);
			System.out.println("외부클래스에 있는 멤버 : "+x);
		}
	}
	
	
}

public class InstanceInnerTest01 {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		//객체 = out.new Inner();
		Outer.Inner innerObj = out.new Inner();
		//내부클래스 타입 선언은 .을 통해서 구체화 되어야 한다!
		
		System.out.println(innerObj.y);
		innerObj.fct_y();
		//인스턴스를 해야하는 (외부)클래스안에 있는 (내부)클래스 
		
		
		
		
	}

}
