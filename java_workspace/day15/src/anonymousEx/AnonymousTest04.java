package anonymousEx;
/*
  	�͸� Ŭ���� - �����ϱ�
  	
  	1) �߻� �޼��� 1�� �ִ� �߻� Ŭ������ �����Ͻÿ�
  	2) ���ο��� �ν��Ͻ� ������, �͸�Ŭ������ ������ �ϰ�,
  		��ü�� ���� ������ �� �޼��带 ����ϼ���
  		
  	�͸� Ŭ���� - �����ϱ�2
  	1) �������̽� - �߻�޼��� 5�� �ִ� �������̽� ����
  	2) ���� ��Ӱ� �͸�Ŭ������ �̿��� ������ �� ��,
  	3) ���ϴ� �޼��带 ȣ���� ������
 
 */
abstract class City{
	
	abstract void view();
}

interface Face{
	void face1();
	void face2();
	void face3();
	void face4();
	void face5();
}

class Mask implements Face{

	@Override
	public void face1() {
		System.out.println("face1() �޼���");
		
	}

	@Override
	public void face2() {
		System.out.println("face2() �޼���");
		
	}

	@Override
	public void face3() {
		System.out.println("face3() �޼���");
		
	}

	@Override
	public void face4() {
		System.out.println("face4() �޼���");
		
	}

	@Override
	public void face5() {
		System.out.println("face5() �޼���");
		
	}
	
	
}
public class AnonymousTest04 {

	public static void main(String[] args) {

		City c = new City() {
			
			void view() {
				
				System.out.println("City Ŭ������ view() �޼��� �������� �͸�Ŭ����");
				
			}
			
		};
		
		c.view();
		
		Face f = new Face() {

			@Override
			public void face1() {
				System.out.println("face1() �޼��� �������� �͸�Ŭ����");
			}

			@Override
			public void face2() {
				System.out.println("face2() �޼��� �������� �͸�Ŭ����");
				
			}

			@Override
			public void face3() {
				System.out.println("face3() �޼��� �������� �͸�Ŭ����");
				
			}

			@Override
			public void face4() {
				System.out.println("face4() �޼��� �������� �͸�Ŭ����");
				
			}

			@Override
			public void face5() {
				System.out.println("face5() �޼��� �������� �͸�Ŭ����");
				
			}
			
		};
		
		Mask m = new Mask();
		m.face2();
		
		f.face2();
		
		
		
		
		
		
		
		
		
	}

}
