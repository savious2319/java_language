package calEx;

import java.util.Calendar;

/*
 	Calendar 
 */
class PrintCalendar{
	static void printCalendar(int year, int month, int day, int hour, int min, int sec) {
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+hour+"시 "+min+"분 "+sec+"초");
		
	}
	
	static String printCalendar(Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		//System.out.println(year+"년 "+month+"월 "+day+"일 "+hour+"시 "+min+"분 "+sec+"초");
		return year+"년 "+month+"월 "+day+"일 "+hour+"시 "+min+"분 "+sec+"초";
	}
}
public class CalendarTest {

	
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
				
		//Date 형식처럼 년-월-일 시-분-초를
		//Calendar의 상수를 이용해 출력해 보세요!
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		PrintCalendar.printCalendar(year, month, day, hour, min, sec);
		
		PrintCalendar.printCalendar(cal);
//		System.out.println(cal.get(Calendar.YEAR) + "년 " + cal.get(Calendar.MONTH)+"월 "+cal.get(Calendar.DAY_OF_MONTH)+"일 "+
//						   cal.get(Calendar.HOUR)+"시 "+cal.get(cal.MINUTE) +"분 "+cal.get(cal.SECOND)+"초");
	}

}




















