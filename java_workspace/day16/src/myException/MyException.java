package myException;

public class MyException extends Exception {

	public MyException(String msg) {
		// �θ𿡰� msg�� ������ ���� -> �θ� ���� �ִ� getMessage() �޼��尡
		// msg�� ����� �ټ� �ִ�.
		super(msg);
	}

}
