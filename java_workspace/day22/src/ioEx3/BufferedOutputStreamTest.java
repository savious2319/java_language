package ioEx3;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("fileWrite2.txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5); //����ũ�Ⱑ 5�� �ȴ�!
			// �ѹ��� ���� �� �ִ� ũ��� 5�� �����͸� ���ۿ� �ӹ��ٰ�...
			// 5���� �� ���� �Ǹ�, �ڵ����� ���Ϸ� ���۵ȴ�!
			// '1' ~ '9' �ϳ��� write()�� �Ұǵ�...
			// '1' ~ '5' ���� ���ۿ� �� ���� �Ǹ�, ���Ϸ� �������� �ǰ�...(�ڵ�)
			// '6' ~ '9' ������ ���ۿ� ���� �ȴ�!
			
			for (int i = '1'; i <= '9'; i++) {
				
				bos.write(i);
				// 1~5������ ���!! -> 6~9������ ���ۿ� ���� �ִ� ��Ȳ�̴�.
			}
			
			
			
			//����Ϳ� ������� ���� -> ���Ͽ� ����� ����!
			//System.out.println("����ũ�⸸ŭ�� 1~5������ ��µƾ��");
			//System.out.println("������ 6~9������ flush�ؼ� ����Ҳ���");
			
			String msg = "����ũ�⸸ŭ�� 1~5������ ��µƾ��";
			bos.write(msg.getBytes());
			
			//String msg2 = "������ 6~9������ flush�ؼ� ����Ҳ���";
			//bos.write(msg2.getBytes());
			
			//bos.flush();
			
			
			
			
			//bos.close();
			//fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
