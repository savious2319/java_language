package wrapperEx;

public class WrapperTest02 {

	public static void main(String[] args) {

		//100, 'A', true, �⺻ �ڷ����� ���ͷ� �����!
		//��üȭ ��ų �� �ִ�!
		//�̶� ����ϴ� Ŭ�������� wrapper Ŭ������� �Ѵ�.
		
		Boolean b = new Boolean(true);
		Boolean b2 = new Boolean("true");
		
		System.out.println("b : " + b); //toString() �� �����Ǿ� �ִ�.
		System.out.println("b2 : "+b2);
		System.out.println("b : " + b.toString()); //toString()�� �������̵� �Ǿ� �ֳ�
		System.out.println("b2 : "+b2.toString());
		
		Byte byte1 = new Byte((byte)10);
		Byte byte2 = new Byte("10");
		
		System.out.println("byte1 : "+byte1);
		System.out.println("byte2 : "+byte2);
		
		float f1 = new Float(10.1);
		float f2 = new Float("10.1"); 
		// �⺻������ ��ü�� ��ȯ��Ű�� �ִ� "����" "wrapping" "boxing"
		
		
		
	}

}
