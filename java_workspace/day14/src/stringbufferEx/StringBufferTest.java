package stringbufferEx;
/*
 	String immutable : �����Ұ�
 				String �� ���ڿ���ü�� �����͸� ������ �� ���� ������̴�!
 				
 	StringBufffer mutable : ����������(���氡��)
 				���� ���ڿ��� heap�� ������ ���� ����!
 				
 	StringBuffer : ���ڿ� �ȿ���..
 		insert()
 		replace()
 */
public class StringBufferTest {

	public static void main(String[] args) {

		String msg = "abc";
		
		
		//StringBuffer msgF = "abc"; //????? String�� ���ڿ� ������ �� ���ο� ���ڿ��� ��������\
										// StringBuffer�� �ڱ� �ڽ��� ���� �����ϱ⶧���� �޸𸮿� ���� ����
										// String�ϰ� ���������, �����ڷ� �ν��Ͻ��� ������ ���� ����
		StringBuffer msgF = new StringBuffer(msg);
		
		StringBuffer tmp = msgF.insert(2, "12"); // index 2 �տ��ٰ� "12"�� �־��
		System.out.println(tmp);
		
		String tmp2 = msgF.insert(2, "12").toString(); // buffer�� �ִ� ���ڿ��� String ���� ������Ű�ڴ�!
		System.out.println(tmp2);
		
		System.out.println(tmp);
		
		tmp =  new StringBuffer("0123456");
		
		tmp = tmp.replace(1, 3, "AB");  // 1 <= "AB" < 3
		System.out.println(tmp);
		
		tmp = tmp.replace(1, 5, "AB");
		System.out.println(tmp);
		
		
		
	}

}




















