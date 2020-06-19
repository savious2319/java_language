package exceptionEx2;

import java.io.IOException;

/*
 	throw ���ܹ߻�(����)
 	
 	- �޼��� ���ο��� ���ܸ� �߻���Ű���� �� �� ����ϴ� Ű����!
 	- ����� ���� ���� Ŭ������ ���� throw�� ����� �˾ƺ���
 */
//����� ���� ����Ŭ���� : Exception���κ��� ��� �޾� �����!

class MyException extends Exception{
	
	public MyException(String msg) {
		//�θ𿡰� msg�� ������ ���� -> �θ� ���� �ִ� getMessage() �޼��尡 
		// msg�� ����� �ټ� �ִ�.
		super(msg);
	}
	
}
public class ExceptionTest07 {

	public static void main(String[] args) /*throws IOException*/ {
		
		
		try {
			
		//���ܰ� �߻��� �ҽ� ����
		int a = -1;
		if(a <= 0) { // �̷� ��Ȳ�� �߻��� �Ǹ�!!!
			// a�� 0�̰ų� �������!! ���ܸ� �߻����Ѿ� �ڴ�!
			// ���������� ��Ȳ�� ���յǸ�, ���ܸ� �Ϻη� �߻���Ű�� ��
			throw new MyException("����� �ƴϿ���!!"); // throw�� ���� ���ܻ�Ȳ�� �߻� ��Ű�� ���� �� ����!
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
