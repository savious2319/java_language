package myException;

public class MyException extends Exception {

	public MyException(String msg) {
		// 부모에게 msg를 전달해 주자 -> 부모가 갖고 있는 getMessage() 메서드가
		// msg를 출력해 줄수 있다.
		super(msg);
	}

}
