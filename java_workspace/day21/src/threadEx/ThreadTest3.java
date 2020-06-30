package threadEx;
/*
 	join()
 	- join() ȣ���� �����尡 ������ ������, �����ϴ� �����带 �ߴ��ϰ� �ȴ�!
 */

class MyThreadJoin implements Runnable{
	
	public void run() {
		System.out.println("run �޼��� ����");
		first();
	}
	private void first() {
		System.out.println("first �޼��� ����");
		second();
	}
	private void second() {
		System.out.println("second �޼��� ����");
		
	}
}
public class ThreadTest3 {

	public static void main(String[] args) { //main�� thread�� �ϳ���

		System.out.println(Thread.currentThread().getName()+": main�� ���۵Ǿ����ϴ�");
		
		//join��ų ��ü ����
		Runnable r = new MyThreadJoin();
		Thread th = new Thread(r);
		//th ��ü�� main �����带 �����ϱ� ���� join�� �ȴ�
		//���� �����带 �����Ű�� �ʰ� pause ��Ű�� �ȴ�
		th.start();
		try {
			//join() ��� ��ģ �Ŀ�, ���� thread�� �簳 �ȴ�!
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+": main�� ����Ǿ����ϴ�");
	}

}
