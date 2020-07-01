package ioEx3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 	 output :
 	 �޸�(RAM) �� �ִ� ������ �ܺ� �����(HDD)�� "���� write()" �Ѵ�.
 	 
 	 �⺻������ ����Ϳ� ����� �� �ִ� ��Ʈ���� 2���� �ִ�. System.out / System.err
 	 		"����"�� ����� ����!
 	 	
 	 	write(����ڵ�)		write(int)		int���� byte�� ��ȯ�ؼ� ���ü(����)�� ���� �ȴ�
 	 	write(byte[])
 	 	flush()			����� �� ��, ���۰� �� ���� �Ǹ�.. �Ѳ����� ���� �ȴ�
 	 				    �׷���, �� flush()�� ������ �Ǹ�, ���۰� �� ���� �ʾƵ�,
 	 				    �ٷ� ��� ���Ͽ� �����͸� ���� �� �ְ� �ȴ�!
 	 	close()
 	 	
 	 	FileOutputStream
 */
public class OutputStreamTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		
		try {
			//�ش� ��ġ�� ������ ���� ���� ������ �����Ѵ�!
			//fos = new FileOutputStream("fileWriter.txt");
			
			//�ι�° �Ű����� append : ������ ������ ������ ��� �̾�� �ϰڴ�!
			fos = new FileOutputStream("fileWriter.txt", true);
			
			String msg = "";
			while(true) {
				if (msg.equals("exit")) {break;}
				System.out.println("�Է� : ");
				msg = sc.nextLine();
				fos.write(msg.getBytes());
				fos.flush();
			}
//			String msg = "Hello, ��ſ� �Ϸ�!!";
//			fos.write(msg.getBytes()); // getBytes() : String�� byte[]�� �������ִ� �޼���
//			msg = "����������?";
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {fos.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}

}
