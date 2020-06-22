package mathEx;

import java.util.Random;

public class MathRandomTest {

	public static void main(String[] args) {
		
		String []lucky = {"오늘은 빨강색이 어울립니다.",
						  "행운의 숫자는 6입니다.",
						  "길을 걷다 횡재수가 있겠네요~",
						  "오늘 하루는 피곤한 하루가 될 거예요~"};
		
		
		//난수를 발생시켜,
		//오늘의 운세를 출력해 보자!
		//Math.random()
		int num = 0;
		System.out.println("오늘의 운세");
//		for (int i = 0; i < lucky.length; i++) {
//			num = (int)(Math.random() * 4);
//			System.out.println(lucky[num]);
//			break;
//		}
//		
		num = (int)(Math.random() * 4);
		System.out.println(lucky[num]);
		System.out.println();
		/////////////////////////////////////////////////////////////////
		//Random 클래스 사용
		String []gift = {"TV", "Radio", "냉장고", "꽝"};
		
	
		//Random 클래스를 사용해서 선물하나를 출력해 보세요
		Random r = new Random();
		System.out.println("오늘의 선물");
//		for (int i = 0; i < gift.length; i++) {
//			num = r.nextInt(4);
//			System.out.println(gift[num]);
//			break;
//		}
		
		num = r.nextInt(4);
		System.out.println(gift[num]);

	}

}
