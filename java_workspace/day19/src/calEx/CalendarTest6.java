package calEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 	Calendar               <->     Date 간단하게 변환시켜 보자
 	setTime(Date)                  생성자(long milliseconds)
 */

public class CalendarTest6 {



	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2000, Calendar.AUGUST, 15); //8.15 넣음
		System.out.println(cal);
		
		Date date = new Date(cal.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		System.out.println(sdf.format(date));
		//System.out.println(date);
		///////////////////////////////////////////////
		
		//Date로 생성한 날짜(date)를 cal 객체에 대입시키기!
		cal.setTime(date);  
		
		
		
		
		
		
		
		
	}

}












































