package instanceinnerEx;

import java.io.File;

class InputOut{
	
	File path = new File("C:\\�ٿ�ε�");
	Input in = new Input();
	Output out = new Output();
		
	//���� Ŭ�������� �޼��常 �� �����Ǿ� ������, �޼��� ������ ������� �ִ�.
	//����, ���� Ŭ������ �̿��� �� ��ɺ��� ������ ������ ������
	//������ InputOut Ŭ������ ���θ� ������ �� �ִ�!
	
	//�ܺο� (InputOut) ����� ���� path�� ���� Ŭ�������� �������� ������ �� �� �ִ� �����̴�!
	
	class Input{
		void �����Է�() {
			System.out.println("InputŬ������ �����Է¸޼��� ȣ��, ��� : "+path);
		}
		
		void ����Char�Է�() {}
		void ����Inter�Է�() {}
	}
	class Output{
		void ����Char���() {
			System.out.println("OutputŬ������ ����Char���()�޼��� : "+path+"����Դϴ�.");
		}
		void ����Integer���() {}
		void ����Writer���() {}
	}
	
}

public class InstanceInnerTest03 {

	public static void main(String[] args) {
		InputOut io = new InputOut();
		io.in.�����Է�(); //���� ���Ÿ� ��ü�� ���� ����
		//io.new Input().�����Է�(); 
		io.out.����Char���();
		
		
		
		
		
	}

}







