package extendsEx;
/*
 	���
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
class D extends B{	//AŬ������ 2�� ��������̾���, DŬ�����ȿ� ���� �ִ�!
					//DŬ������ AŬ���� �����, BŬ���� ������� ����� �� �ִ�. (private ������ ����)
	
}
public class ExtendsTest01 {

	public static void main(String[] args) {
		//�θ��ν��Ͻ�, �θ� ��ü
		A obj = new A();
		obj.name = "ȫ�浿";
		obj.kor = 100;
		obj.eng = 100;
		obj.printA();
		
		//�ڽİ�ü = �ڽ� �ν��Ͻ�
		B objChild = new B();
		objChild.name = "�ڹ���";
		objChild.kor = 90;
		objChild.eng = 90;
		objChild.printA();
		
		C objC = new C();
		objC.name = "�̼���";
		objC.kor = 80;
		objC.eng = 80;
		objC.printA();
		
		D objD = new D();
		objD.name = "�Ӳ���";
		objD.kor = 70;
		objD.eng = 70;
		objD.printA();
		
	}

}





















