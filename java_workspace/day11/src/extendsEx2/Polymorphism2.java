package extendsEx2;
/*
 	�Ű������� ������
 */
class ParentA{
	void fct() {
		System.out.println("�θ�");
		
	}
	
}

class ChildA extends ParentA{

	@Override
	void fct() {
		System.out.println("Ŭ����A");
	}
	
	void printA() {
		System.out.println("PrintA��");
	}
	
}

class ChildB extends ParentA{

	@Override
	void fct() {
		System.out.println("Ŭ����B");
	}
	
	void printB() {
		System.out.println("PrintB��");
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
