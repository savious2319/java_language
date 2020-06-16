package extendsEx2;
/*
 	매개변수의 다형성
 */
class ParentA{
	void fct() {
		System.out.println("부모");
		
	}
	
}

class ChildA extends ParentA{

	@Override
	void fct() {
		System.out.println("클래스A");
	}
	
	void printA() {
		System.out.println("PrintA야");
	}
	
}

class ChildB extends ParentA{

	@Override
	void fct() {
		System.out.println("클래스B");
	}
	
	void printB() {
		System.out.println("PrintB야");
	}
}

class House{
	static void control(ParentA some) {
		some.fct();
		if(some instanceof ChildA) {
			((ChildA)some).printA();
		}
		else if(some instanceof ChildB) {
			((ChildB)some).printB();
		}
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
	
		ChildA aone = new ChildA();
		ChildB bone = new ChildB();
		
		House.control(aone);
		House.control(bone);
		
		
		
		
	}

}
