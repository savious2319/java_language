package extendsEx;
/*
 	상속
 */

class A{
	String name;
	int kor;
	int eng;
	
	void printA() {
		System.out.println(name+" "+kor+" "+eng);
	
	}
}
class B extends A{
	
}
class C extends A{
	
}
class D extends B{	//A클래스는 2차 상속으로이어져, D클래스안에 들어와 있다!
					//D클래스는 A클래스 멤버들, B클래스 멤버들을 사용할 수 있다. (private 선언멤버 제외)
	
}
public class ExtendsTest01 {

	public static void main(String[] args) {
		//부모인스턴스, 부모 객체
		A obj = new A();
		obj.name = "홍길동";
		obj.kor = 100;
		obj.eng = 100;
		obj.printA();
		
		//자식객체 = 자식 인스턴스
		B objChild = new B();
		objChild.name = "박문수";
		objChild.kor = 90;
		objChild.eng = 90;
		objChild.printA();
		
		C objC = new C();
		objC.name = "이순신";
		objC.kor = 80;
		objC.eng = 80;
		objC.printA();
		
		D objD = new D();
		objD.name = "임꺽정";
		objD.kor = 70;
		objD.eng = 70;
		objD.printA();
		
	}

}





















