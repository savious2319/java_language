package singleEx;

import java.awt.Toolkit;
import java.util.Calendar;

/*
 	싱글턴 패턴
 	
 	인스턴스를 하나만 만들어서 사용해야 할 때 적용하는 "인스턴스 생성방법"
 	
 	- 생성자는 외부에 노출시키면 안된다
 		Type type = new Type();  에러!!! (외부에서 new를 시키면 안된다!)
 		-private 접근지정자로 생성자를 만들어야 한다!
 	(2가지 전제 조건)
 	- 동일타입의 인스턴스 객체를 static으로 만들어야 한다
 	- 내부 메서드를 static public으로 노출시켜야 한다!
 	- 내부 메서드(클래스메서드, 스태틱 메서드)에서 객체의 인스턴스 여부를 판단 한 후
 	  인스턴스가 있으면 기존 인스턴스를 리턴시키고, 인스턴스가 없으면(null) 생성자를 통해
 	  생성한 인스턴스를 리턴시켜 주면 된다!
 */
public class SingleTest {

	public static void main(String[] args) {
		//new Toolkit();   //인스턴스를 생성하지 못하도록 생성자를 막아놓는다
						   // abstract 또는 생성자를 private등으로 막는다!
						   // 대신, 특정 메서드 하나를 만들어서
						   // 인스턴스를 생성할 수 있도록 한다!
		
		Toolkit tool = Toolkit.getDefaultToolkit();  //싱글턴 패턴이 적용되었다!!
		//getDefaultToolKit() 메서드를 통해, 인스턴스를 만들어 냈고,
		//tool 객체를 통해, ToolKit 클래스의 메서드를 사용할 수 있게 됐다.
		
		Calendar cal = Calendar.getInstance();
		
		

	}

}


























