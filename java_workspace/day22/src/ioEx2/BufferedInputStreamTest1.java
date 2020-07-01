package ioEx2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	FileInputStream : �������� ����ҿ��� ���� read()�� �����Ѵ�!
 	
 	Buffer : ������ �޸� - �ӽ� �����
 			 �������� ����ҿ��� �о�� �����͸� Buffer��� �ӽ� ����ҿ� �ΰ�,
 			 �޸𸮿��� �����͸� �о���� ��Ų��.  (������������ Buffer��� �����ϸ� �ȴ�)
 			 
 		HDD -> ��������ġ(����) -> RAM(��������ġ) ���۵Ǵϱ� �� ������!
 		
 	���
 	
 		FileInputStream fis = ��ü����;
 		BufferedInputStream bis = new BufferedInputStream(fis);
 		
 		bis.read();
 */
public class BufferedInputStreamTest1 {

	public static void main(String[] args) {

		FileInputStream fis = null;  // try {} �ۿ��� (�ʱ�ȭ)�����ؾ��� finally{}�ȿ� bis�� fis�� �ν��� �� �� ��
		BufferedInputStream bis = null;  // fis�� bis�� try{} �ȿ� ������ �� �ȿ����� ȿ���� �ִ�
		//byte[] b = new byte[100]; // 100ĭ�� �����ϸ� �ڿ� ������ �ִ�! �׷��� �ؿ��� String(b).trim()�� ������!

		try {
			fis = new FileInputStream("fileRead3.txt");
			bis = new BufferedInputStream(fis);
			byte[] b = new byte[bis.available()];
			bis.read(b);
			System.out.println(new String(b).trim());
			System.out.println("!!!!!!!!!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		System.out.println("���α׷� ����");

	}

}
