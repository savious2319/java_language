package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar 
 */

public class CalendarTest4 {

	static String getYoil(int yoil) {
		String strYoil = "";
		switch (yoil) {
		case 1:
			strYoil = "�Ͽ���";
			break;
		case 2:
			strYoil = "������";
			break;
		case 3:
			strYoil = "ȭ����";
			break;
		case 4:
			strYoil = "������";
			break;
		case 5:
			strYoil = "�����";
			break;
		case 6:
			strYoil = "�ݿ���";
			break;
		case 7:
			strYoil = "�����";
			break;
		}

		return strYoil;
	}

	public static void main(String[] args) {
		
		//�� ��¥���� ���̸� ���غ���!
		
		Calendar today = Calendar.getInstance();  //���糯¥ ���ذ�
		Calendar inputDate = Calendar.getInstance(); //�Է³�¥
		
		
		// today - inputDate : �� ��¥���� epoch time�� ���ȴ�!
		// 1000���� ������ �ʴ���
		// �� ������ �ٽ� 60���� ������ �д���!
		//...
		//System.out.println(today.getTimeInMillis() - inputDate.getTimeInMillis());
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵ �Է� : "); int userYear = sc.nextInt();
		System.out.println("��   �Է� : "); int userMonth = sc.nextInt()-1;
		System.out.println("��   �Է� : "); int userDay = sc.nextInt();
		
		inputDate.set(userYear, userMonth, userDay);
		
		long diff = (today.getTimeInMillis() - inputDate.getTimeInMillis());
		System.out.println(diff+" millisecond�� �귶���ϴ�");
		
		long sec =  diff/1000; //millisecond�� 1000���� ������ �ʰ� ���´�
		long min = sec/60; // second�� 60�ʷ� ������ ���� ���´�
		long hour = min/60; // minute�� 60������ ������ �ð� ���´�
		long day = hour/24; // hour�� 24�÷� ������ �Ϸ簡 ���´�
		long month = day/30; // day�� 30�Ϸ� ������ ���� ���´�
		long year = month /12; // month�� 12������ ������ ���� ���´�
				
		System.out.println(sec+" �ʰ� �귶���ϴ�");
		System.out.println(min+" ���� �귶���ϴ�");
		System.out.println(hour+" �ð��� �귶���ϴ�");
		System.out.println(day+" ���� �귶���ϴ�");
		System.out.println(month+" ������ �귶���ϴ�");
		System.out.println(year+" ���� �귶���ϴ�");
		
		//�Է��� ���κ��� �������...
		//00 �ʰ� �귶���ϴ�!
		//00 ���� �귶���ϴ�!
		//00 �ð��� �귶���ϴ�!
		//00 ���� �귶���ϴ�!
		//00 ������ �귶���ϴ�!
		//00 ���� �귶���ϴ�!
		
		
		
		
	}

}
































