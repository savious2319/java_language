package threadEx;

/*
 	동기화 (synchronized)
 	- lock 잠금
 	
 	멀티쓰레드 -> 스케줄러가 여러개의 쓰레드를 병렬 처리하게 된다!
 	이때, 순차적으로 하나의 쓰레드가 종료되기 전에 다른 쓰레드의 간섭을 방지하는 방법으로 "동기화"가 쓰인다!
 	
 		: 다른 쓰레드가 들어올 수 없다
 	
 	1) 메서드 전체영역에 동기화를 건다!
 	
 	synchronized 메서드(){
 		//임계영역 - 쓰레드가 공유하는 자원(인스턴스들)
 	}
 	
 	2) 메서드 내부에서 동기화를 건다!
 	
 	메서드(){
 		synchronized(쓰레드 객체){
 		//임계영역 - 쓰레드가 공유하는 자원(인스턴스들)
 		
 		}
 	
 	}
 	
 */
//ATM기... 카드로 돈을 인출한다!
//ATM기... 카드를 갖고 있는 사람(들)이 접속해서, 돈을 인출한다!
//1. ATM 클래스는 쓰레드를 지원해야 한다!
//2. 돈을 인출할 때, 인출하는 쓰레드(사람)는 동기화를 지원해야한다.
//		synchronized를 걸어주자!
// 상황, 엄마 쓰레드1, 아들 쓰레드1
//		동시에 1,000원씩 인출(각 5번씩)
//		공유자원(계좌금액)은 10,000원씩 들어 있다.
class ATM implements Runnable {
	private long depositMoney = 10000; // 공유자원

	@Override
	public void run() {
		//synchronized(Thread.currentThread().getClass()) {
		synchronized (this) {  // this가 Thread 객체를 매개변수로 받는다
			
			// 임계영역 - 쓰레드가 공유해야할 소스코드!
			for (int i = 0; i < 5; i++) {
				withDraw(1000); // 1000원씩 인출한다.
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
			System.out.println(Thread.currentThread().getName() + ", 잔액 : "+depositMoney);
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
}

public class ThreadTest5 {

	public static void main(String[] args) {

			//ATM기를 이용하는 쓰레드2 ("엄마" / "아들")
			//start().
			ATM atm = new ATM();
		
			Thread momCard = new Thread(atm, "엄마카드");
			Thread sonCard = new Thread(atm, "아들카드");
			
			momCard.start();
			sonCard.start();
		
	}

}

















