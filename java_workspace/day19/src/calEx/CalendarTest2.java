package calEx;

import java.util.Calendar;

/*
 	Calendar 
 */

public class CalendarTest2 {

	
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
				
		//Date ����ó�� ��-��-�� ��-��-�ʸ�
		//Calendar�� ����� �̿��� ����� ������!
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		PrintCalendar.printCalendar(year, month, day, hour, min, sec);
		
		//���� : �ִ���, int ���ϰ� -> �Ͽ��� : 1, ����� : 7
		int yoil = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("����(�Ͽ��� 1) : "+yoil);
		String strYoil = "";
		switch(yoil) {
		case 1: strYoil = "�Ͽ���";  break;
		case 2: strYoil = "������";  break;
		case 3: strYoil = "ȭ����";  break;
		case 4: strYoil = "������";  break;
		case 5: strYoil = "�����";  break;
		case 6: strYoil = "�ݿ���";  break;
		case 7: strYoil = "�����";  break;
		}
		System.out.println(yoil+" : "+strYoil);
		
		//�̹��� : 6�� �������� 5
		//�� ���� ������ ��!!!
		// 1�� 31��
		// 2�� 28��(29)
		// 3�� 31��	....
		int lastDate = cal.getActualMaximum(Calendar.DATE);  // �� ���� ������ ���� ��ĥ���� �˷��ش�.
		System.out.println(month+"���� ������ �� : " + lastDate);

	}

}




















