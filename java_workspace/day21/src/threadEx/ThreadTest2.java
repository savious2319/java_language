package threadEx;
/*
 	���μ��� ���ο� �۾�����
 	�ּ��� �ϳ��� ���μ���(�������α׷�)�� �ϳ��� ������ �̻��� ���� �ִ�.
 	
 	����ó��
 	- �� �۾�(�޼���, �Ǵ� ��ü) �� ���ÿ� ����� �� �ְ� ����!
 */
class ThreadEx1 extends Thread{
	String name;
	
	public ThreadEx1(String name) {
		super(name);
		//this.name = name;
	}

	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getName());
		
		//������ �̸��� ���� ��, �����ڸ� ���ؼ�, super����
		//�̸��� �˷�����!
		//�⺻ �̸��� Thread-0  <--- ������ ��ü������ ���ڰ� �ο��ȴ�!
		System.out.println(getName());
		
	}
}
public class ThreadTest2 {

	public static void main(String[] args) {
		
		ThreadEx1 th = new ThreadEx1("������-1");
		th.start();
		
		
		
		
		
		
		
		
	}

}






















