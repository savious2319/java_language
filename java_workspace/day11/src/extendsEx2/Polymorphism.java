package extendsEx2;
/*
 	�Ű������� ������
 */
class Parent{
	
}
class Child extends Parent{
	void playGround() {
		System.out.println("���ϵ� - ��忡�� �پ� ���");
	}
}
class GrandChild extends Child{
	 void kidsCafe() {
		 System.out.println("���� - Ű��ī�信�� ���!");
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
		  instanceOf ������
		  
		  true, false �������ִ� ������
		  
		  one isntanceOf Ÿ��   �� Ÿ���� ��ü��? ��, �ƴ�!
		  
		 */
		if(one instanceof Child) { //Grandchild�� Child�� Ÿ���߿� �ϳ���! �׷��� true�� ���´�
			//((Child)one).playGround();
			Child some = (Child)one; // <--- one�� GrandChild�� �ν��Ͻ� �ε�,
									 // �������� Ÿ���� Parent�̴�!!!!
									 // Ŭ������ ����ȯ�� �ν��Ͻ� Ÿ���� ���󰡴°� �ƴ϶�...
									 // ��������(��ü)�� Ÿ���� ���󰣴�!
									 // Parent one = �ڽ� �ν��Ͻ�();
									 // one�� ����ȯ �ؾ���!! �ٿ�ĳ����!!!
									 // one�� �ڽ� Ÿ���� Child�� �ٿ�ĳ���� �� �Ŀ�...
									 // Child�� �޼��带 ȣ�� �� �� �ְ� �ȴ�.
									 //ChildŸ�� ��ü�� ���Խ�Ű�� �ִ�. (upCasting : �ν��Ͻ��� ������ ��ȯ! X)
			some.playGround();
			
		}
		else if(one instanceof GrandChild) { // �ؿ� �մ� �񱳴� �ǹ̰� ����
			((GrandChild)one).kidsCafe();
		}
		
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		//Parent obj = null;
		
		//obj = (Parent)new Child(); //������! (���ɽ���)
		
		Parent obj = new Child(); //������!
		
		/*obj.�޼���();  ���� �� �޼��尡 ������ �Ǿ��ٸ�, �ڽ� Ÿ���� �޼��带 �����ϰ� �ȴ�.
					   "���� ����"�̶�� �Ѵ�."*/
		
		//Control.fct(new Child()); // �ڽ� Ÿ���� ���� ã�ư��� ���ִ�
		Control.fct(new GrandChild());
		
		
		
		
	}

}

