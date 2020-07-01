package ioEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	����Ʈ ��Ʈ�� : 1byte ������ ������� �� �� �ִ� ��Ʈ��
 			-������, �̹���, ����, �Ϲ� txt ���� ��
 	Char ��Ʈ�� : ���ڿ� Ưȭ�Ǿ� �ִ� ��Ʈ��
 			-�������� �� ���!
 	
 	��Ʈ�� : InputStream, OutputStream
 				read         write
 	  ram���� �о����     HDD�� ����!
 	  		read()           write()
 	  		read(byte [])		     
 	  		available() : ����Ÿ�� -> int   ���� �� �ִ� ���� byte���� ��ȯ�Ѵ�.
 	  		close() : ��Ʈ���� �������� �ݾƾ� �Ѵ�!
 	  		
 	  		System.in <---- byte input stream�� ��ǥ���� ��
 	  		
 	  		FileInputStream �ش� ���丮�� �ִ� ��� ������ ���� �� �ֵ��� �ϴ� Ŭ����
 	  						���� ���� ��, FileŬ������ ��θ� ��������!
 	  						�ش� ������ ���� ��... ���ܹ߻�(FileNotFoundException)
 */
public class InputStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			// �о�� ���� ���� �߿�, �ѱ��� ���� �ִ�
			fis = new FileInputStream("fileRead2.txt");
			/*
			 �񿵾�� ���ڰ� ���� ���� ���� 2byte ü���� �Ǿ� �־�, (char) ������ ���� ��, ���ڰ� ������ �ȴ�.
			 ����, read�� �� ��, byte[] �� �̸� �������� ���� �� byte[]�� ���ڿ��� "����"�ؼ� ������ ������
			 �ʰ� ó���� �� �ְ� �ȴ�!!
			//System.out.println((char)fis.read());
			int tmp = 0;  // fis.read()���� �������� �����͸� ��� �� �ӽ� ����
			while((tmp = fis.read()) != -1) {  // ���� �����͸� �����ϰ� ���� -1���� ���Ѵ�
				System.out.print((char)tmp);
				
			}
			*/
			
			//read�ؿ� �����͸� ���� byte[] �� ��������
			//�ٵ�... � ������ ����?
			byte [] _read = new byte[fis.available()];
			fis.read(_read);	// _read �迭�� byte�� �о�� byte�� ��� �ȴ�!
			
			//�� byte[]�� String ���������� �ָ�, ���ڿ��� ������ �ش�!
			
			String str_read = new String(_read);
			System.out.println(str_read);
			

		} catch (FileNotFoundException e) { // ������ ��ġ�� ������ ����ó���� �ѱ���!  (�������� Exception���� ��� ���ܸ� ó���ϸ� �ȴ�!!)
			e.printStackTrace();
			
		} catch (IOException e) { //���̻� ���� �����Ͱ� ���� ��, ������ ��������!
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) fis.close();
			} 
			catch (IOException e) {e.printStackTrace();}
		}
		
		System.out.println("\n���α׷� ����!!!");

	}

}

















