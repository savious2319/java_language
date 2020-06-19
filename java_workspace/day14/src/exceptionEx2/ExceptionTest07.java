package exceptionEx2;

import java.io.IOException;

/*
 	throw 예외발생(생성)
 	
 	- 메서드 내부에서 예외를 발생시키고자 할 때 사용하는 키워드!
 	- 사용자 정의 예외 클래스를 만들어서 throw의 사용방법 알아보기
 */
//사용자 정의 예외클래스 : Exception으로부터 상속 받아 만든다!

class MyException extends Exception{
	
	public MyException(String msg) {
		//부모에게 msg를 전달해 주자 -> 부모가 갖고 있는 getMessage() 메서드가 
		// msg를 출력해 줄수 있다.
		super(msg);
	}
	
}
public class ExceptionTest07 {

	public static void main(String[] args) /*throws IOException*/ {
		
		
		try {
			
		//예외가 발생할 소스 기재
		int a = -1;
		if(a <= 0) { // 이런 상황이 발생이 되면!!!
			// a가 0이거나 음수라면!! 예외를 발생시켜야 겠다!
			// 인위적으로 상황에 부합되면, 예외를 일부러 발생시키는 것
			throw new MyException("양수가 아니에요!!"); // throw는 내가 예외상황을 발생 시키고 싶을 때 쓴다!
		}else {
			throw new IOException();
		}
			
		}catch(MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}catch(IOException e) {
			
		}
		
		
	}

}
