package exceptionEx2;

import java.io.IOException;

/*
 	throws �����̸�
 	
 	- ���� ������ �޼��� ���� �� ��������
 	- ȣ���ϴ� �ʿ����� ���� �׸� ���� try catch() ���� �����
 	  ��� �޼��带 �����ϰ� ����� �� �ְ� �ȴ�.
 	  
 	- ���� �߻��� ���� �ҽ� ���簡 �ʿ��� ���� try-catch ���� ����
 		catch() �� �ʿ��� �ҽ��� ��������!
 	- ���� �߻��� ��ġ������ �ʿ���� ���� throws �� ���ؼ� ���ܻ����� ������!
 */
class CharInput{
	int nInput = 0;
	public char getInput() throws IOException{
		
		nInput = System.in.read(); // Scanner ��� System.in ��ü�� �̿��� ���� �Է� �޴´�.
		
		return (char)nInput;
	}
}

public class ExceptionTest06 {

	public static void main(String[] args) {

		try {
			System.out.println(new CharInput().getInput());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
