package instanceinnerEx;
/*
 	이너 클래스
 		- 인스턴스 이너 클래스
 		
 		- 이너(내부) 클래스가 있는데, 그 이너 클래스도 멤버이다!
 		- 그 멤버는 필드나 메서드가 아니라, 클래스인 멤버이다.
 		- 따라서 클래스인 멤버(인너 클래스)는 인스턴스를 만든 후, 내부 클래스의 필드에 접근해야한다.
 */
class Outer2{
	
	int x = 10; 	// Outer의 x
	
	Inner myInner = new Inner(); //내부 클래스의 인스턴스를 미리 선언해 놨다!
	static Inner2 out = new Inner2(); //Inner2 클래스는 일반 인스턴스 클래스이다! 
	//out 참조변수를 미리 만들어 놓고(static)
	//인스턴스 이너클래스하고 연결 시키려고 했더니 "대입 불가"
	//Inner2를 static으로 선언하면, ouot 객체의 static과 일치하기 때문에,
	//대입가능
	//out을 미리 만들어 놓고 바로 바로 불러서 쓰고 싶었다! 그래서, static으로 선언
	//하려고 했는데, 내부 클래스가 isntance내부 클래스라서 out하고 연결이 안된 것이다!
	//따라서 내부 클래스도 static 화가 필요할 수 있다
	void fct() {	// Outer의 fct()
		System.out.println(x);
	}
	static class Inner2{
		void print() {
			System.out.println("print메서드");
		}
	}
	class Inner{
		int y = 10;
		void fct_y() {
			System.out.println(y);
			System.out.println("외부클래스에 있는 멤버 : "+x);
		}
	}
	
	
}

public class InstanceInnerTest02 {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		//객체 = out.new Inner();
		Outer2.Inner innerObj = out.new Inner();
		Outer2.Inner innerObj2 = out.myInner;
		//내부클래스 타입 선언은 .을 통해서 구체화 되어야 한다!
		
		//System.out.println(innerObj2.y);
		System.out.println(out.myInner.y);
		
		innerObj.fct_y();
		out.myInner.fct_y();
		//인스턴스를 해야하는 (외부)클래스안에 있는 (내부)클래스 
		
		
		
		
	}

}
