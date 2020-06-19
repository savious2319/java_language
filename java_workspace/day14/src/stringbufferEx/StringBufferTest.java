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
		StringBuffer mutuableMsg = new StringBuffer(msg);
		
		mutuableMsg.insert(2, "12"); // index 2 �տ��ٰ� "12"�� �־��
		//System.out.println(tmp);
		System.out.println("msgF == "+mutuableMsg.toString());
		mutuableMsg.insert(2, "���¿�");
		String immutableMsg = mutuableMsg.toString(); // buffer�� �ִ� ���ڿ��� String ���� ������Ű�ڴ�!
		
		System.out.println("immutableMsg == " +immutableMsg);
		
		
		StringBuffer mutableMsg2 =  new StringBuffer("Travis");
		
		mutableMsg2.replace(1, 3, "Brian");  // 1 <= "AB" < 3
		System.out.println("mutableMsg2 == " + mutableMsg2);
		
		mutableMsg2.replace(3, 6, "2020");
		System.out.println("mutableMsg2 == "+ mutableMsg2);
		
		
		
	}

}




















