package stringHomework;

import java.security.spec.EncodedKeySpec;
import java.util.Scanner;

/*
 	����1)
 	�������� �� ���ڿ��� �Է� ���� ��,
 	�Է¹��� ���ڿ����� ���� �ϳ��� ã�ƺ��ϴ�.
 	���� �ش� ���ڰ� ������, throw�� ����ؼ� ����ó���� �غ��ϴ�.
 	"���ڰ� �����ϴ�"��� ������ ��µǵ��� �մϴ�.		<--����� Exception�� ����ϴ�.
 	����1-1)
 	�ּҸ� ���� �� �ִ� �迭�� ���� ��,
 	�ش� ���� �ִ��� ������ �迭���� �˻��� ���ϴ�.

 	�迭 5��
 	�ּ� �Է� - �� ������ �Է� ��)  ������ ���ﵿ
 									������ ��ġ��
 									....
 	��Ī						ã���� �ϴ� ���� �Է������ : ���
 	��� ���					��赿�� �ּҴ� 123-1�Դϴ�.
 	����2)
 	D:\GB_0900_05_ysh\java_language\java_workspace\day14\src\stringHomework\StringTest.java
 	�ش� �ڹ� ���� ��ġ�� ���丮/����/���� ������ ������ ���ϴ�.
 	��� D:
 		GB_0900_05_gangsa
 		java_language
 		....
 	�׸��� ������ ��ü�� java�������� Ȯ���� �ּ���
 	���� 2-1)
 	��ü ��ο��� ������ �ڹ� ���ϸ� ����� �ּ���
 	�ڹ� ������ ������ ���ڿ��� ����� �ּ���
 */
class MyException extends Exception{
	MyException(String msg) {
		super(msg);
	}
}
public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//���� 1)
		//		String msg = "";
		//		String search = "";
		//		
		//		try {
		//			System.out.println("���ڿ��� �������θ� �Է��� �ּ���.");
		//			System.out.print("���ڿ��� �Է����ּ��� : "); msg = sc.next();
		//			System.out.println("ã�� ���ڸ� �Է����ּ��� : "); search = sc.next();
		//			if(msg.contains(search)) {
		//				System.out.println(msg+"�� "+search+"�� "+(msg.indexOf(search)+1)+"��° ��ġ�� �ֽ��ϴ�.");
		//			}else {
		//				throw new MyException(msg+"�� "+search+"�� �����ϴ�.");
		//			}//end if
		//		}catch(MyException e) {
		//			System.out.println(e.getMessage());
		//		}//end try
	//���� 1-1)
//		String[] arAddress = {
//				"������ ���ﵿ 111-1",
//				"������ ��ġ�� 222-2",
//				"���ʱ� ���ʵ� 333-3",
//				"���ʱ� ��赿 444-4",
//				"������ �Ͽ��� 555-5"
//		};
//		String search = "";
//		String[] arSearch = {};
//		System.out.print("�˻��� ���� �Է��� �ּ��� : "); search = sc.next();
//		try {
//			for(int i = 0;i<arAddress.length;i++) {
//				if(arAddress[i].contains(search) == true) {
//					arSearch = arAddress[i].split(" ");
//					throw new MyException(arSearch[1]+"�� �ּҴ� "+arSearch[2]+"�Դϴ�.");
//				}//end if
//			}//end for(i)
//			System.out.println("�ش� �ּҰ� �����ϴ�.");
//		}catch(MyException e) {
//			System.out.println(e.getMessage());
//		}//end try
	//���� 2)
//				String filePath = "D:/GB_0900_05_ysh/java_language/java_workspace/day14/src/stringHomework/StringTest.java";
//				String[] arFilePath = filePath.split("/");
//				System.out.println("���� ��� ����ϱ�");
//				for(int i = 0;i<arFilePath.length;i++) {
//					System.out.println(arFilePath[i]);
//				}//end for(i)
//				if(arFilePath[arFilePath.length-1].endsWith("java")) 
//					System.out.println("�� ������ java������ �½��ϴ�.");
//				else 
//					System.out.println("�� ������ java������ �ƴմϴ�.");
	//���� 2-1)
		//		System.out.println("java ���ϸ� ����ϱ�");
		//		for(int i = 0;i<arFilePath.length;i++) {
		//			if(arFilePath[i].endsWith("java")) 
		//				System.out.println(arFilePath[i]);
		//		}//end for
		//		System.out.println("java ���� ������ ������ ��� ����ϱ�");
		//		for(int i = 0;i<arFilePath.length;i++) {
		//			if(arFilePath[i].endsWith("java")) 
		//				continue;
		//			else 
		//				System.out.println(arFilePath[i]);
		//		}//end for(i)
		//		
	}//end main
}//end class
