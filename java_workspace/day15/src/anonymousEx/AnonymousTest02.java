package anonymousEx;
/*
 	�͸� Ŭ����
 	
 	������ ����, �����ڿ��� �ٿ��� ����!
 	�̸� ���� 1ȸ�� Ŭ�����̴�.
 	Ŭ���� �ٵ� �������� �޼��常 �����ϸ� �ȴ�!
 	
 	
 	�ܼ��� �޼��� �ϳ��� ������ �ؾ� �� ���� �͸�Ŭ������ ��ü��� �ο��� �� �ִ�.
 		("��ü� - �� �ڸ����� �ٷ� ������ �ؼ� ����!")
 		
 	�׷���, �������� �޼��尡 ���� ��쿡��, �͸�Ŭ������ ó���ϱ⿡ �δ��� �ȴ�!
 	�׷���, ��ӹ޾Ƽ� �����ϴ� �� ������ ���� ����!
 	
 	
 */
abstract class Test{	//�߻� Ŭ���� - ȥ�ڼ� �ν��Ͻ��� ���� �� ����!

	abstract void fct();
}
class T extends Test{
	
	@Override
	void fct() {
		// TODO Auto-generated method stub
		
	}
	
	void some(Test t) { //�߻� Ŭ���� - ��ü�� ���� �� �ִ�
		
		
	}
	
}
public class AnonymousTest02 {

	public static void main(String[] args) {
		
		//Test��� �߻�Ŭ�������� �ν��Ͻ��� ���� �� �ִ�!!!
		Test t  = new Test() {
			
			@Override
			void fct() {
				
				System.out.println("�͸� Ŭ������ ���ؼ� �߻�޼��� �Ǵ� �������̽��� �����Ǹ� ���� �ν��Ͻ��� ���� �� �ֱ���!!!!");
				
			}
			
			
		};
		
		
		
	
	}

}












