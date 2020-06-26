package singleEx;

import java.awt.Toolkit;
import java.util.Calendar;

/*
 	싱글턴 패턴
 	1. 생성자는 private
 	2. static 필드 객체
 	3. 내부 메서드 하나를 static public 으로 만들어 놓자!!!
 	
 */
class Singleton{
	
	private static Singleton single; //이 변수를 통해 getInstance 메서드에서 객체 유무를 판단하게 된다!
									 //single의 초기값은 null 이다
	private Singleton() {}
	
	public static Singleton getInstance() {
		//클래스 변수, single에 있는 값이 null 이라면, 한번도 인스턴스를 생성한 적이 없는 거다!
		//그래서 생성자를 통해 인스턴스를 대입시켜 주자!
		
		//그런데 그 이후에 다시 getInstance()를 호출하게 되면,
		//더이상 single은 null이 아니게 될 것이다(처음 만들어 놨기 때문에)
		//그래서 처음 만들어 놓은 single을 그대로 리턴시키자!
		if(single == null) {
			single = new Singleton();
		}
		return single;
	}
}
public class SingleTest2 {

	public static void main(String[] args) {
		
		//new Singleton();  //에러
		Singleton single = Singleton.getInstance();
		System.out.println(single);
		
		Singleton single2 = Singleton.getInstance();
		System.out.println(single2);
		
		Singleton single3 = Singleton.getInstance();
		System.out.println(single2);
		
		Singleton single4 = Singleton.getInstance();
		System.out.println(single2);
		
	}

}


























