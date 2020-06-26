package calEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 	Calendar 달력만들기
 	-년도와 월을 입력받으면 그 달의 달력을 출력하자
 	입력 예)
 	년도 : 2020
 	월   : 5
 	
 	   [2020년 5월]
 	   
 	일 월 화 수 목 금 토
 	                1  2
     3  4  5...........
     
    31 	
    
   1. 시작 요일을 알아야 한다! 수요일에 1이 시작된다면.... 일월화 까지 공백을 출력해야한다.
   2. 마지막날을 알아야한다!  getActually~~~() 를 사용
   3. 날짜는 요일의 오른쪽 정렬해야한다.                 
 */

public class CalendarTest7 {
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
		Scanner sc = new Scanner(System.in);
		int year = 2020;
		int month = 6-1;
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, 1);
		
		System.out.println("["+year+"년 "+(month+1)+"월]");
		System.out.println(" 일 월 화 수 목 금 토");    // " 일" 일요일 앞에 공백 하나
		//                  012012012012012012012
//		for (int i = 0; i < 2; i++) {
//			
//			System.out.print("  ");
//			
//		}
//			for (int i = 0; i < 30; i++) {
//				
//				System.out.print((i+1) +" ");
//				if(i % 7 == 0) {
//					System.out.println();
//				}
//			}
		
		
		
//		System.out.println("시작 요일 : "+getYoil(cal.get(Calendar.DAY_OF_WEEK)));
//		int lastDate = cal.getActualMaximum(Calendar.DATE);
//		System.out.println("6월 마지막 일 : "+lastDate);
		
		//시작하는 요일을 구해내자 -> 첫 줄에 공백을 찍어내야 한다.
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(startDay + "요일");
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		
		
		
		//공백 출력갯수
		for (int i = 1; i < startDay; i++) {
			System.out.print("   ");   //최초 공백 만들기 -> 3칸 공백
		}
		int yoil = 1;
		for(int i = 1; i <=lastDay ;i++) {
			
			System.out.print( i<10 ? "  "+i:" "+i); // 1의 자리에는 공백 둘, i값 => 3칸
													// 10의 자리가 되면 공백 1칸 i값은 10의 => 3칸
			if(startDay % 7 == 0) {
			System.out.println();
			}
			startDay++;
		}
		
		
		
		
	}

}












































