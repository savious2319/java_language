package threadEx;
/*
 	프로세스 내부에 작업단위
 	최소한 하나의 프로세스(응용프로그램)는 하나의 쓰레드 이상을 갖고 있다.
 	
 	병렬처리
 	- 두 작업(메서드, 또는 객체) 이 동시에 실행될 수 있게 하자!
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
		
		//쓰레드 이름을 붙일 때, 생성자를 통해서, super에게
		//이름을 알려주자!
		//기본 이름은 Thread-0  <--- 쓰레드 객체단위로 숫자가 부여된다!
		System.out.println(getName());
		
	}
}
public class ThreadTest2 {

	public static void main(String[] args) {
		
		ThreadEx1 th = new ThreadEx1("쓰레드-1");
		th.start();
		
		
		
		
		
		
		
		
	}

}






















