package buyerEx;

import java.util.Scanner;

import productEx.Phone;
import productEx.Product;
import productEx.TV;

public class Buyer {
	static Scanner sc = new Scanner(System.in);
	
	private int money;
	TV tv;
	Phone phone;
	
	public int getMoney() {return money;}
	public void setMoney(int money) {this.money = money;}
	
	public Buyer(int money) {
		this.money = money;
	}
	
	public void startShopping() {
		//쇼핑 품목 보기를 위해 제품정보 초기화
		
		menu();
	}
	
	void menu() {
		int choice = -1; // 쇼핑 메뉴 출력
		int shoppingMenu = 0;
		while(choice != 0) {
		System.out.println("1. 쇼핑 품목 보기");
		System.out.println("2. 구매하기");
		System.out.println("3. 현재 소지금보기");
		System.out.println("0. 종료하기");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			shoppingMenu = showList();
			break;

		case 2:
			if (shoppingMenu != 0) {
				switch (shoppingMenu) {
				//매개변수의 다형적 대입!!!
				case 1:
					buy(tv);
					break;
				case 2:
					buy(phone);
					break;
				}
			}
			break;
		case 3:
			showMoney();
			break;
		}
		}
	
}
		
	private int showList() {
		tv = new TV("가전제품", "123", "TV", 3600000, "삼성", 42);
		phone = new Phone("휴대폰", "456", "V7", 1200000, "엘지", "OLED");
		
		System.out.println("쇼핑 품목 보기");
		System.out.println("1. TV");
		tv.printProductInfo();
		System.out.println("2. Phone");
		phone.printProductInfo();
		System.out.println("어떤 품목을 선택할까요?(0번은 메인메뉴)");
		int choice = sc.nextInt();
//		switch (choice) {
//		case 1:
//			buy(tv);	//매개변수의 다형적 대입!!!
//			break;
//		case 2:
//			buy(phone);	//매개변수의 다형적 대입!!!
//			break;
//		case 3:
//			break;
//		}
		
		return choice;
		
	}
	
	private void showMoney() {
		System.out.println("현재 소지금: " + money + "원");
		
	}
	
	private void buy (Product prod) {
		System.out.println(prod.getItem() + "의  가격은" +
						   prod.getPrice() + "입니다. 구매하시겠습니까?"
						   		+ "1. 네 / 2. 아니오");
		int num = sc.nextInt();
		if(num == 1) {
			money -= prod.getPrice();
		}else {
			
		}
		
	}

}
