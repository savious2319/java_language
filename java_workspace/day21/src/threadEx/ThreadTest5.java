package threadEx;

/*
 	����ȭ (synchronized)
 	- lock ���
 	
 	��Ƽ������ -> �����ٷ��� �������� �����带 ���� ó���ϰ� �ȴ�!
 	�̶�, ���������� �ϳ��� �����尡 ����Ǳ� ���� �ٸ� �������� ������ �����ϴ� ������� "����ȭ"�� ���δ�!
 	
 		: �ٸ� �����尡 ���� �� ����
 	
 	1) �޼��� ��ü������ ����ȭ�� �Ǵ�!
 	
 	synchronized �޼���(){
 		//�Ӱ迵�� - �����尡 �����ϴ� �ڿ�(�ν��Ͻ���)
 	}
 	
 	2) �޼��� ���ο��� ����ȭ�� �Ǵ�!
 	
 	�޼���(){
 		synchronized(������ ��ü){
 		//�Ӱ迵�� - �����尡 �����ϴ� �ڿ�(�ν��Ͻ���)
 		
 		}
 	
 	}
 	
 */
//ATM��... ī��� ���� �����Ѵ�!
//ATM��... ī�带 ���� �ִ� ���(��)�� �����ؼ�, ���� �����Ѵ�!
//1. ATM Ŭ������ �����带 �����ؾ� �Ѵ�!
//2. ���� ������ ��, �����ϴ� ������(���)�� ����ȭ�� �����ؾ��Ѵ�.
//		synchronized�� �ɾ�����!
// ��Ȳ, ���� ������1, �Ƶ� ������1
//		���ÿ� 1,000���� ����(�� 5����)
//		�����ڿ�(���±ݾ�)�� 10,000���� ��� �ִ�.
class ATM implements Runnable {
	private long depositMoney = 10000; // �����ڿ�

	@Override
	public void run() {
		//synchronized(Thread.currentThread().getClass()) {
		synchronized (this) {  // this�� Thread ��ü�� �Ű������� �޴´�
			
			// �Ӱ迵�� - �����尡 �����ؾ��� �ҽ��ڵ�!
			for (int i = 0; i < 5; i++) {
				withDraw(1000); // 1000���� �����Ѵ�.
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // end try
				if (depositMoney <= 0)
					break;
				
			} // end for
		}// end synchronized
	}

	private void withDraw(int money) {
		if(money >0) {
			depositMoney -= money;
			System.out.println(Thread.currentThread().getName() + ", �ܾ� : "+depositMoney);
		}else {
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
}

public class ThreadTest5 {

	public static void main(String[] args) {

			//ATM�⸦ �̿��ϴ� ������2 ("����" / "�Ƶ�")
			//start().
			ATM atm = new ATM();
		
			Thread momCard = new Thread(atm, "����ī��");
			Thread sonCard = new Thread(atm, "�Ƶ�ī��");
			
			momCard.start();
			sonCard.start();
		
	}

}

















