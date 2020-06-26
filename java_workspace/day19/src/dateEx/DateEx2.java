package dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	��¥ ���� Ŭ����
 	Date �� Calendar
 	
 	1) Date : jdk 1.0 ���� (������)
 		java.util.Date		(java.sql.Date ���� �ȵ�)
 		new Date();
 		�����ϰ� ��¥�� ������ �� �ִ� toString() �� �������̵� �Ǿ� �ִ�.
 		Date �޼������ deprecate �Ǿ� �ִ� �޼������ ���� -> repalce ��ü�ϱ⸦  Calendar�� �����Ѵ�!
 		
 	2) Calendar : jdk 1.1 ���� (�Ź���)
 		Calendar.getInstance() : �̱���
 		�������� ��¥ ��Ҹ� ���� �ִ�!
 */
public class DateEx2 {

	public static void main(String[] args) {

		Date today = new Date();
		System.out.println(today);   //�����ϰ� ��¥�� ����� �� �ִ�
		
		//��¥������ ������ �ִ� Ŭ������ �̿��� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strToday = sdf.format(today);
		System.out.println(strToday);
		
		strToday = sdf.format(new Date());  // ���� ��¥�� �����ϰ� �����ͼ� �ٷ� ���ڿ��� �Ľ��Ѵ�!
		System.out.println(strToday);
		
		sdf.applyPattern("yyyy�⵵ MM�� dd�� a HH�� mm�� ss��");
		strToday = sdf.format(new Date());
		//System.out.println(strToday);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}



























