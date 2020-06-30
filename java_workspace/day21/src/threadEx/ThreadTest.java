package threadEx;
/*
 	���μ��� ���ο� �۾�����
 	�ּ��� �ϳ��� ���μ���(�������α׷�)�� �ϳ��� ������ �̻��� ���� �ִ�.
 	
 	����ó��
 	- �� �۾�(�޼���, �Ǵ� ��ü) �� ���ÿ� ����� �� �ְ� ����!
 */
class Plus extends Thread{
	String name;
	
	
	public Plus(String name) {
		super(name);
		//this.name = name;
	}


	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("+ : " + getName());
				Thread.sleep(500); //0.2��
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Minus implements Runnable{



	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("- : " + Thread.currentThread().getName()); //Runnable�� Thread�� �ƴϱ⶧���� 
				Thread.sleep(500);												//Thread Ŭ������ �޼��带 �Ҿ�;� �Ѵ�!
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		//+,- -,+ +- +-
		//+ -�� ���ÿ� ���;� �Ѵ�!
		
		Plus plus = new Plus("�÷���");
		plus.start(); // start()�� ���ؼ� �۾������ڿ� "���" �ǰ�,
					  // �۾�������(�����ٷ�)�� run �޼��带 ã��
					  // run �޼��� ������ �۾��� �����ϰ� �ȴ�.
		
		Minus minus = new Minus();
		//Thread thMinus = new Thread(minus);
		
		Thread thMinus = new Thread(minus,"���̳ʽ�"); //Minus�� Runnable�̴ϱ� �����ڸ� ���� Thread�� name�� ���� ����
		thMinus.start();
		
		
	}

}






















