package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar 
 */

public class CalendarTest5 {

	static String getYoil(int yoil) {
		String strYoil = "";
		switch (yoil) {
		case 1:
			strYoil = "일요일";
			break;
		case 2:
			strYoil = "월요일";
			break;
		case 3:
			strYoil = "화요일";
			break;
		case 4:
			strYoil = "수요일";
			break;
		case 5:
			strYoil = "목요일";
			break;
		case 6:
			strYoil = "금요일";
			break;
		case 7:
			strYoil = "토요일";
			break;
		}

		return strYoil;
	}

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		//cal.get(Calendar.DAY_OF_WEEK) %7 + 1 // 갯수로 갖고 올 수 있다
		
		//               0    1    2    3    4    5    6
//		String[]yoil = {"","일","월","화","수","목","금","토"};  //빈 문자열을 넣어서 인덱스값을 맞춰주자!
//		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)]);
		
		String[]yoil = {"일","월","화","수","목","금","토"};  //빈 문자열을 넣어서 인덱스값을 맞춰주자!
		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
		
		String date1 = "202005";
		String date2 = "201906";
		
		//두 날짜간에 개월수를 계산해 보세요
		//1. 문자열에서 subString()
		//2. 문자열을 int로 parsing 해야 한다.
		//3. 절대값으로 출력하자 : Math.abs()
		
		
		
		int year1 = Integer.parseInt(date1.substring(0, 4))*12;
		int year2 = Integer.parseInt(date2.substring(0, 4))*12;
		
		int month1 = Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(4));
		
		//year1을 개월수로 환산해 보자! year1 * 12
		//year2에 *12를 하면 개월수로 환산
		//각각, month1, month2 를 더해주면 된다
		//그리고 두 값을 빼면 된다!
		
		int monthDiff =Math.abs((year2 + month2) - (year1 + month1));
		System.out.println(date1+"과"+date2+"는"+monthDiff+"개월 차입니다");
		
//		System.out.println(Math.abs(d2-d1)+"개월 차이가 납니다");
		
		//특정 년도가 윤년인지 판단해 보기
		// 윤년 366일 있다는 뜻 -> 2월 29일까지 있는 년도
		// leapYear
		// 특정 년도가...
		// 1. 4로 나누어 떨어지는 년도
		// 2. 그런데 그 년도 중에서 100으로 나누어 떨어지면 그 년도는 제외 해야 한다.
		// 3. 그러면서 동시에 400으로 나누어 떨어지면 그 해는 윤년이 된다!
		int year = 2020;
		
		System.out.println(year+"는"+(year % 4 == 0 && year % 100 != 0 ? "윤년" : "윤년이 아닙니다"));
		
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year+"는" +"윤CalendarTest4.java년입니다");
		}else {
			System.out.println(year+"는"+"윤년이 아닙니다");
		}
		
		
		//year는 윤년입니다!
	}

}












































