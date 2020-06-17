package mart;

import buyerEx.Buyer;
import productEx.Phone;
import productEx.Product;
import productEx.TV;
/*
 	기획의도
 	1) 주제 : 제품군을 모델 클래스로 구성한다.
 	2) 모델클래스는 1차 상속을 통해 작성했다.
 	...
 	..
 	
 	프로젝트 목적
 	1) Buyer 타입의 객체를 통해 다형성을 구현함!
 	2) Buyer의 소지금을 출력할 수 있어야 한다!
 */


public class ProductMain {

	public static void main(String[] args) {
		
		Product product = new Product("품목", "품번", "제품명", -1);
		TV samsungTV = new TV("TV", "품번", "제품명", 3600000, "삼성", 42);
		Phone lgPhone = new Phone("품목", "품번", "제품명", 1200000, "엘지", "OLED");
		
		//Buyer hgd = new Buyer(5000000); //소지금
		
		//hgd.buy(samsungTV);
		//hgd.buy(lgPhone);
		//hgd.infor(); //소지금 얼마 남았는지?
		
		
		Buyer hgd = new Buyer(10000000); //천만원
		hgd.startShopping();
		
	}

}
