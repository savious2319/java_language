package stringHomework;

import java.io.IOException;
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
class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

public class StringTest_�鼺�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String msg = "";

		// ����1)

//		try {
//			System.out.println("���� ���ڿ��� �Է��ϼ��� : ");
//			msg = sc.next();
//
//			String ch = "";
//			System.out.println("���ڸ� �Է��ؼ� ã�ƺ���: ");
//			ch = sc.next();
//			if(false) {
//				throw new IOException();
//			}
//			if (msg.contains(ch)) {
//				System.out.println(ch + "�� " + msg + "�� ���ԵǾ��ִ� �����Դϴ�");
//			} else {
//				throw new MyException(ch + "�� " + msg + "�� ���ԵǾ������ʴ� �����Դϴ�");
//			}
//
//		} 
//		catch (IOException e) {
//			System.out.println(e.getMessage());
//		}catch(MyException e) {
//			System.out.println(e.getMessage());
//			
//		}

		// ���� 1-1)
		String[] address = { "������ ���ﵿ 736-56", "������ ������ 228-15", "���α� ȿ�ڵ� 60-1", "������ ������ 259-1", "��걸 ���¿��� 137-8" };

//		String[] arAd1 = address[0].split(" ");
//		String[] arAd2 = address[1].split(" ");
//		String[] arAd3 = address[2].split(" ");
//		String[] arAd4 = address[3].split(" ");
//		String[] arAd5 = address[4].split(" ");

		// �̰Ÿ� �ؿ��� 2���� �迭�� ó���� �� �ִ�!

		String[][] addressSplit = { address[0].split(" "), address[1].split(" "), address[2].split(" "),
				address[3].split(" "), address[4].split(" ") };
		// �̰Ÿ� �� �����ϰ� �Ʒ��� ���� ������ �迭�� �ʱ�ȭ �ߴ�!

		String[][] addressSplitv2 = new String[address.length][3];

		// System.out.println(addressSplitv2.length); //5
//		String search = "";
//		System.out.println("ã���� �ϴ� �� �Է� : ");
//		search = sc.next();
//		for (int i = 0; i < addressSplitv2.length; i++) {
//			addressSplitv2[i] = address[i].split(" ");
//		}
//		try {
//		for (int i = 0; i < address.length; i++) {
//			
//			if (address[i].contains(search)) {
//				System.out.println(addressSplitv2[i][1] + "�� �ּҴ� " + addressSplitv2[i][2] + " �Դϴ�");
//			}else {
//				throw new MyException(search +"���� �ּҸ� ã�� �� �����ϴ�");
//			}
//		}
//		}catch(MyException e) {
//			System.out.println(e.getMessage());
//		}
//		for (int i = 0; i < address.length; i++) {
//			for (int j = 0; j < addressSplitv2.length; j++) {
//				addressSplitv2[j] = address[j].split(" ");
//			}
//			if (address[i].contains(search)) {
//				System.out.println(addressSplitv2[i][1] + "�� �ּҴ� " + addressSplitv2[i][2] + " �Դϴ�");
//			}
//		}

		// ����2)
		String filePath = "D:/GB_0900_05_BSM(�ٸ� ������ ���� ���������ּ���)/java_language/java_worksapce/day14/src/stringHomework/StringTest_�鼺��.java";
//		String []str = new String[8];
//		str[0] = filePath.substring(filePath.indexOf('D'), filePath.indexOf('/')); //D:
//		str[1] = filePath.substring(filePath.indexOf('G'), filePath.indexOf(')') + 1); //GB_
//		str[2] = filePath.substring(filePath.indexOf('j'), filePath.indexOf('e') + 1); // java_language
//		str[3] = filePath.substring(filePath.indexOf('e') + 2, filePath.indexOf('c') + 2); //java_workspace
//		str[4] = filePath.substring(filePath.indexOf('d'), filePath.indexOf('4') + 1); //day14
//		str[5] = filePath.substring(filePath.indexOf('1')+3, filePath.indexOf('y') + 7); //src
//		str[6] = filePath.substring(filePath.indexOf('p')+14, filePath.indexOf('m') + 6); //stringHomework
//		str[7] = filePath.substring(filePath.indexOf('H')+9); //StringTest_
//		try {
//		for (int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//			Thread.sleep(1000);
//		}
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}

		String[] arStr = filePath.split("/");
		try {
			System.out.println("filePath�� Split �ϰڽ��ϴ�");
			Thread.sleep(1000);
			for (int i = 0; i < arStr.length-1; i++) {
				System.out.println(arStr[i]);
				Thread.sleep(1000);
				if (i == arStr.length - 1) {
					System.out.println(arStr[i].endsWith("java") ? "java�����Դϴ�" : "java ������ �ƴմϴ�");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		// ����2-1)
		// ��ü ���ϰ�ο��� ������ �ڹ� ���ϸ� ����� �ּ���.
		// �ڹ� ������ ������ ���ڿ��� ����� �ּ���.
		System.out.println("�ڹ� ���ϸ� ����մϴ�");
		for (int i = 0; i < arStr.length; i++) {
			if (i == arStr.length - 1) {
				System.out.println(arStr[i]);
			}
		}
		System.out.println();
		System.out.println("�ڹ� ������ ������ ���ڿ��� ����մϴ�");
		try {
		for (int i = 0; i < arStr.length-1; i++) {
			System.out.println(arStr[i]);
			Thread.sleep(1000);
		}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
