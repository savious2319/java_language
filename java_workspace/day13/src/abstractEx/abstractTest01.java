package abstractEx;

abstract class A{ //�߻� Ŭ����
	abstract void fct(); //�߻� �޼���
}

class B extends A{
	void fct() {  //������
		System.out.println("�ڽ� Ŭ���� fct() �޼���");
	}
}
public class abstractTest01 {

	public static void main(String[] args) {

		new B().fct();
		
	}

}
