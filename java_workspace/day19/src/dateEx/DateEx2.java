package dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	날짜 관련 클래스
 	Date 와 Calendar
 	
 	1) Date : jdk 1.0 버전 (구버전)
 		java.util.Date		(java.sql.Date 쓰면 안됨)
 		new Date();
 		간단하게 날짜를 가져올 수 있다 toString() 이 오버라이딩 되어 있다.
 		Date 메서드들은 deprecate 되어 있는 메서드들이 많다 -> repalce 대체하기를  Calendar로 권장한다!
 		
 	2) Calendar : jdk 1.1 버전 (신버전)
 		Calendar.getInstance() : 싱글턴
 		세부적인 날짜 요소를 갖고 있다!
 */
public class DateEx2 {

	public static void main(String[] args) {

		Date today = new Date();
		System.out.println(today);   //간단하게 날짜를 출력할 수 있다
		
		//날짜형식을 지정해 주는 클래스를 이용해 보자
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strToday = sdf.format(today);
		System.out.println(strToday);
		
		strToday = sdf.format(new Date());  // 오늘 날짜를 간단하게 가져와서 바로 문자열로 파싱한다!
		System.out.println(strToday);
		
		sdf.applyPattern("yyyy년도 MM월 dd일 a HH시 mm분 ss초");
		strToday = sdf.format(new Date());
		//System.out.println(strToday);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}



























