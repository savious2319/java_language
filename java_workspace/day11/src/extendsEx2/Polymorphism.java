package extendsEx2;
/*
 	매개변수의 다형성
 */
class Parent{
	
}
class Child extends Parent{
	void playGround() {
		System.out.println("차일드 - 운동장에서 뛰어 논다");
	}
}
class GrandChild extends Child{
	 void kidsCafe() {
		 System.out.println("손자 - 키즈카페에서 논다!");
	 }
	
}
class Control{
//	static void fct(Child one) {
//		System.out.println("Child");
//	}
	
	static void fct(Parent one) {
//		System.out.println("Parent");
//		System.out.println(one.toString());
		/*
		  instanceOf 연산자
		  
		  true, false 리턴해주는 연산자
		  
		  one isntanceOf 타입   그 타입의 객체니? 응, 아니!
		  
		 */
		if(one instanceof Child) { //Grandchild도 Child의 타입중에 하나다! 그래서 true가 나온다
			//((Child)one).playGround();
			Child some = (Child)one; // <--- one은 GrandChild의 인스턴스 인데,
									 // 참조변수 타입은 Parent이다!!!!
									 // 클래스의 형변환은 인스턴스 타입을 따라가는게 아니라...
									 // 참조변수(객체)의 타입을 따라간다!
									 // Parent one = 자식 인스턴스();
									 // one을 형변환 해야지!! 다운캐스팅!!!
									 // one을 자식 타입인 Child로 다운캐스팅 한 후에...
									 // Child의 메서드를 호출 할 수 있게 된다.
									 //Child타입 객체에 대입시키고 있다. (upCasting : 인스턴스가 상위로 변환! X)
			some.playGround();
			
		}
		else if(one instanceof GrandChild) { // 밑에 잇는 비교는 의미가 없다
			((GrandChild)one).kidsCafe();
		}
		
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		//Parent obj = null;
		
		//obj = (Parent)new Child(); //다형성! (업케스팅)
		
		Parent obj = new Child(); //다형성!
		
		/*obj.메서드();  만약 이 메서드가 재정의 되었다면, 자식 타입의 메서드를 실행하게 된다.
					   "동적 결합"이라고 한다."*/
		
		//Control.fct(new Child()); // 자식 타입을 먼저 찾아가게 되있다
		Control.fct(new GrandChild());
		
		
		
		
	}

}

