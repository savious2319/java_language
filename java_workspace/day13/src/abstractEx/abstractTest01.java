package abstractEx;

abstract class A{ //추상 클래스
	abstract void fct(); //추상 메서드
}

class B extends A{
	void fct() {  //재정의
		System.out.println("자식 클래스 fct() 메서드");
	}
}
public class abstractTest01 {

	public static void main(String[] args) {

		new B().fct();
		
	}

}
