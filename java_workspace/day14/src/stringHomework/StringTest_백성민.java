package stringHomework;

import java.util.Scanner;

/*
 	�������� �� ���ڿ��� �Է¹��� ��,
 	�Է¹��� ���ڿ����� ���� �ϳ��� ã�ƺ���.
 	���� �ش� ���ڰ� ������,
 	
 	throw�� ����ؼ�
 	����ó���� �غ���
 	"���ڰ� �����"		<--- ����� Exception�� ����!!!
 	 
 	 ����1-1)
 	 �ּҸ� ���� �� �ִ� �迭�� ���� ��,,
 	 �ش� ���� �ִ��� ������ �迭���� �˻��� ����!
 	 
 	 �迭 5��
 	 (x)�ּ� �Է� - �� ������ �Է� ��) ������ ���ﵿ 111-1
 	                                   ������ ��ġ�� 222-2
 	                                   ���ʱ� ���ʵ� 333-3
 	                                   ���ʱ� ��赿 444-4
 	                                   ������ �Ͽ��� 555-5
 	                              
 	              ��Ī           : ã���� �ϴ� ���� �Է��ϼ��� : ���
 	              ��� ���      : ��赿�� �ּҴ� 123-1 �Դϴ�.
 	 
 	 
 	 ����2)
 	 D:\GB_0900_05_BSM(�ٸ� ������ ���� ���������ּ���)\java_language\java_worksapce\day14\src\stringHomework\StringTest_�鼺��.java
 	 �ش� �ڹ� ���� ��ġ�� ���丮/����/���� ������ ������ ������.
 	 ��� D:
 	 	  GB_0900_05_gangsa
 	 	  java_language
 	 	  java_workspace
 	 	  ...
 	 �׸��� ������ ��ü�� �ڹ� �������� Ȯ���� �ּ���!
 	 
 	 ����2-1)
 	 	��ü ���ϰ�ο��� ������ �ڹ� ���ϸ� ����� �ּ���.
 	 	�ڹ� ������ ������ ���ڿ��� ����� �ּ���.
 */
class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}

public class StringTest_�鼺�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg = "";
		
		//����1)
		
//		try {
//		System.out.println("���� ���ڿ��� �Է��ϼ��� : ");
//		msg = sc.next();
//		
//		
//		String word = "";
//		System.out.println("���ڸ� �Է��ؼ� ã�ƺ���: ");
//		word = sc.next();
//		
//		
//		if(msg.contains(word)) {
//			System.out.println("���ڰ� �ֽ��ϴ�");
//		}else {
//			throw new MyException("���ڰ� �����");
//		}
//		
//		}catch(MyException e) {
//			System.out.println(e.getMessage());
//		}
		
		String filePath = " D:\\GB_0900_05_BSM(�ٸ� ������ ���� ���������ּ���)\\java_language\\java_worksapce\\day14\\src\\stringHomework\\StringTest_�鼺��.java";
		
		filePath = "D:/GB_0900_05_BSM(�ٸ� ������ ���� ���������ּ���)/java_language/java_worksapce/day14/src\\stringHomework\\StringTest_�鼺��.java";
		
		//����2)
		String tmp = filePath.substring(filePath.indexOf('D'), filePath.indexOf('/'));
		System.out.println(tmp);
		
	}

}
