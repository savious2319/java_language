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
public class InputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {

			fis = new FileInputStream("fileRead.txt");

			//System.out.println((char)fis.read());
			int tmp = 0;  // fis.read()���� �������� �����͸� ��� �� �ӽ� ����
			while((tmp = fis.read()) != -1) {  // ���� �����͸� �����ϰ� ���� -1���� ���Ѵ�
				System.out.print((char)tmp);
				
			}
			

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

















