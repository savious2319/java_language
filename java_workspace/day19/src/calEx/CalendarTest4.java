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
		
		//두 날짜간의 차이를 구해보자!
		
		Calendar today = Calendar.getInstance();  //현재날짜 기준값
		Calendar inputDate = Calendar.getInstance(); //입력날짜
		
		
		// today - inputDate : 두 날짜간의 epoch time이 계산된다!
		// 1000으로 나누면 초단위
		// 그 값에서 다시 60으로 나누면 분단위!
		//...
		//System.out.println(today.getTimeInMillis() - inputDate.getTimeInMillis());
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 : "); int userYear = sc.nextInt();
		System.out.println("월   입력 : "); int userMonth = sc.nextInt()-1;
		System.out.println("일   입력 : "); int userDay = sc.nextInt();
		
		inputDate.set(userYear, userMonth, userDay);
		
		long diff = (today.getTimeInMillis() - inputDate.getTimeInMillis());
		System.out.println(diff+" millisecond가 흘렀습니다");
		
		long sec =  diff/1000; //millisecond를 1000으로 나누면 초가 나온다
		long min = sec/60; // second를 60초로 나누면 분이 나온다
		long hour = min/60; // minute를 60분으로 나누면 시가 나온다
		long day = hour/24; // hour를 24시로 나누면 하루가 나온다
		long month = day/30; // day를 30일로 나누면 달이 나온다
		long year = month /12; // month를 12개월로 나누면 년이 나온다
				
		System.out.println(sec+" 초가 흘렀습니다");
		System.out.println(min+" 분이 흘렀습니다");
		System.out.println(hour+" 시간이 흘렀습니다");
		System.out.println(day+" 일이 흘렀습니다");
		System.out.println(month+" 개월이 흘렀습니다");
		System.out.println(year+" 년이 흘렀습니다");
		
		//입력한 날로부터 현재까지...
		//00 초가 흘렀습니다!
		//00 분이 흘렀습니다!
		//00 시간이 흘렀습니다!
		//00 일이 흘렀습니다!
		//00 개월이 흘렀습니다!
		//00 년이 흘렀습니다!
		
		
		
		
	}

}
































