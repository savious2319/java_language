package calEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 	Calendar               <->     Date �����ϰ� ��ȯ���� ����
 	setTime(Date)                  ������(long milliseconds)
 */

public class CalendarTest6 {



	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2000, Calendar.AUGUST, 15); //8.15 ����
		System.out.println(cal);
		
		Date date = new Date(cal.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		System.out.println(sdf.format(date));
		//System.out.println(date);
		///////////////////////////////////////////////
		
		//Date�� ������ ��¥(date)�� cal ��ü�� ���Խ�Ű��!
		cal.setTime(date);  
		
		
		
		
		
		
		
		
	}

}












































