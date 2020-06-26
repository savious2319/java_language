package calEx;

import java.util.Calendar;

/*
 	Calendar 
 */
class PrintCalendar{
	static void printCalendar(int year, int month, int day, int hour, int min, int sec) {
		
		System.out.println(year+"�� "+month+"�� "+day+"�� "+hour+"�� "+min+"�� "+sec+"��");
		
	}
	
	static String printCalendar(Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		//System.out.println(year+"�� "+month+"�� "+day+"�� "+hour+"�� "+min+"�� "+sec+"��");
		return year+"�� "+month+"�� "+day+"�� "+hour+"�� "+min+"�� "+sec+"��";
	}
}
public class CalendarTest {

	
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
		
		PrintCalendar.printCalendar(cal);
//		System.out.println(cal.get(Calendar.YEAR) + "�� " + cal.get(Calendar.MONTH)+"�� "+cal.get(Calendar.DAY_OF_MONTH)+"�� "+
//						   cal.get(Calendar.HOUR)+"�� "+cal.get(cal.MINUTE) +"�� "+cal.get(cal.SECOND)+"��");
	}

}




















