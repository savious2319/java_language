package threadEx;
/*
 	프로세스 내부에 작업단위
 	최소한 하나의 프로세스(응용프로그램)는 하나의 쓰레드 이상을 갖고 있다.
 	
 	병렬처리
 	- 두 작업(메서드, 또는 객체) 이 동시에 실행될 수 있게 하자!
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
				Thread.sleep(500); //0.2초
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
				System.out.println("- : " + Thread.currentThread().getName()); //Runnable은 Thread가 아니기때문에 
				Thread.sleep(500);												//Thread 클래스의 메서드를 불어와야 한다!
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
		//+ -가 동시에 나와야 한다!
		
		Plus plus = new Plus("플러스");
		plus.start(); // start()를 통해서 작업관리자에 "등록" 되고,
					  // 작업관리자(스케줄러)는 run 메서드를 찾아
					  // run 메서드 내부의 작업을 실행하게 된다.
		
		Minus minus = new Minus();
		//Thread thMinus = new Thread(minus);
		
		Thread thMinus = new Thread(minus,"마이너스"); //Minus는 Runnable이니까 생성자를 통해 Thread에 name을 전달 못함
		thMinus.start();
		
		
	}

}






















