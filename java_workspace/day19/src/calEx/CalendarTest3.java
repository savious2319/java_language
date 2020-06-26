package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar 
 */

public class CalendarTest3 {

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
		
		Calendar cal1 = Calendar.getInstance();
		
		//원하는 날짜를 입력하면 해당 요일을 출력해 줍니다!
		//내 생일은 1984년 09월 10일 생 입니다.
		cal1.set(1984, 9-1, 10);  //month는 배열이기때문에 set할때는 항상 +1를 해야한다!
		
		System.out.println(cal1);
		
		//무슨 요일에 태어났지?
		System.out.println(getYoil(cal1.get(Calendar.DAY_OF_WEEK)));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도"); int year = sc.nextInt();
		System.out.println("태어난 월"); int month = sc.nextInt()-1; //사용자로부터 월을 입력받을 때, 미리 -1를 해주자!
		System.out.println("태어난 일"); int day = sc.nextInt();

		cal1.set(year, month, day);
		
		System.out.println(getYoil(cal1.get(Calendar.DAY_OF_WEEK)));
	}

}















