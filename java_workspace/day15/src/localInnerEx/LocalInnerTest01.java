package localInnerEx;
/*
 	���� �̳�Ŭ����
 	(���� == �޼��� ����)
 	-> �޼��� ���ο� Ŭ������ ������!
 	
 	�׷���, �޼��� ���ο� ���� Ŭ������
 	�ܺο��� �θ� �� ����!
 	
 	
 	=> �޼��� ���ο� "�Ǵٸ� �޼��带 ������ �� �ִ�!!!" ��, �ݵ�� ���� Ŭ������ ���ؼ��� �޼��带 ���� �� �ִ�.
 	   �ܺο� �����Ű�� �ʱ� ���ؼ�(���� ������)
 	   �޼��� ���ο� Ŭ������ ���� �������!
  
 */
class Outer{
	void fct() {
		
		//�޼��� ���ο� Ŭ������ �ϳ� ������!
		class Inner{
			
			void innerFct() {
				System.out.println("���� �̳� Ŭ������ ȣ���߽��ϴ�");
				
			}
			
			
		}
		
		//�޼��� �ȿ��� ���� ���� Ŭ������ �ν��Ͻ� ȭ �� �Ŀ�,
		//�� �ν��Ͻ��� ���� �޼��忡 �����ϵ��� ����!
		Inner in = new Inner();
		in.innerFct();
		
		
		System.out.println("�ܺ� fct ȣ��");
		
	}
}
public class LocalInnerTest01 {

	public static void main(String[] args) {
		
		new Outer().fct();
		
		
		

	}

}
















