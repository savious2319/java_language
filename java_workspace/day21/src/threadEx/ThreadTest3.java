package threadEx;
/*
 	join()
 	- join() 호출한 쓰레드가 종료할 때까지, 진행하던 쓰레드를 중단하게 된다!
 */

class MyThreadJoin implements Runnable{
	
	public void run() {
		System.out.println("run 메서드 실행");
		first();
	}
	private void first() {
		System.out.println("first 메서드 실행");
		second();
	}
	private void second() {
		System.out.println("second 메서드 실행");
		
	}
}
public class ThreadTest3 {

	public static void main(String[] args) { //main도 thread의 하나다

		System.out.println(Thread.currentThread().getName()+": main이 시작되었습니다");
		
		//join시킬 객체 생성
		Runnable r = new MyThreadJoin();
		Thread th = new Thread(r);
		//th 객체가 main 쓰레드를 종료하기 전에 join이 된다
		//기존 쓰레드를 종료시키지 않고 pause 시키게 된다
		th.start();
		try {
			//join() 모두 마친 후에, 기존 thread가 재개 된다!
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+": main이 종료되었습니다");
	}

}
