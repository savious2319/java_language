package extendsEx;

import java.util.Scanner;

/*
 	상속
 	
 	다형성과 동적 결합
 */
class Product{
	private String prod_name;
	private  int price;
	private  int prod_id;
	
//	public Product() {
//		
//	}

	public Product(String prod_name, int price, int prod_id) {
		super();
		this.prod_name = prod_name;
		this.price = price;
		this.prod_id = prod_id;
	}

	

	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	void productInfo() {
		System.out.println("====제품 정보 (부모 클래스)====");
		System.out.println("제품명 : "+prod_name);
		System.out.println("제품가격 : "+price);
		System.out.println("제품번호 : "+prod_id);
	}
	
}
class TV extends Product {
	int width;
	int height;
	boolean isPower;
	int channel;
	
	public TV() {
		super("노네임", 0, -1);
	}
	
	public TV(String prod_name, int price, int prod_id, int width, int height, boolean isPower, int channel) {
		super(prod_name, price, prod_id);
		this.width = width;
		this.height = height;
		this.isPower = isPower;
		if(0<channel && channel<=999) {
		this.channel = channel;
		}else if(channel == 987362) {
			System.out.println("채널 초기화 진행합니다");
			System.out.println("채널입력오류(0~999번까지만 입력) : "+channel);
		}
		
	}

	void isPower() {
//		isPower = true; //on
//		isPower = true; //off
		
		isPower = !isPower;
		System.out.println("전원: "+ (isPower ? "켜짐(on)" : "꺼짐(off)")); //삼항 연산자 사용
		System.out.println("3초뒤에 꺼집니다");
		for (int i = 3; i > 0; i--) {
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i+ "초");
		}
		System.out.println("전원 OFF~~");
	}
	
	String getIsPower(boolean isPower) {
		if(isPower == true) {
			return "켜짐";
		}else {
			return "꺼짐";
		}
	}
	
	void channelUp() {
		channel++;
		System.out.println("현재 채널: " +channel+"번");
	}
	
	void channelDown() {
		channel--;
		System.out.println("현재 채널: "+channel+"번");
	}
	void tvInfo() {
		//super.productInfo();
		//TV만의 고유 정보
		System.out.println("-----TV 정보 출력-----");
		System.out.println("가로 x 세로: "+width+"x"+height);
//		System.out.println("전원: "+ getIsPower(isPower));
		System.out.println("전원: "+ (isPower ? "켜짐(on)" : "꺼짐(off)")); //삼항 연산자 사용
		System.out.println("현재 채널: "+channel+"번");
		System.out.println("----------------------");
	}
	
	@Override
	void productInfo() {
		super.productInfo();
		this.tvInfo();
		
	}
	

}
class Snack extends Product{
	

	boolean sticker; //스티커가 있는지 없는지
	int weight; //과자의 질량
	int rate; //가격대비 질량		10g당 얼마인지
	int discountPrice;
	
	public Snack() {
		super("노네임", 0, -1);
	}
	
	int setDiscount(){
		
		return discountPrice = getPrice() / weight;
	}
	
	public Snack(String prod_name, int price, int prod_id, boolean sticker, int weight, int rate) {
		super(prod_name, price, prod_id);
		this.sticker = sticker; //true 면 스티커 동봉, false면 스티커 없음
		this.weight = weight;
		this.rate = setDiscount();
		
	}
	
	
	
	String getSticker(boolean sticker) {
		if(sticker == true) {
			return "있음";
		}else {
			return "없음";
		}
	}
	
	void snackInfo() {
		super.productInfo();
//		System.out.println("스티커: "+getSticker(sticker));
		System.out.println("스티커: " + (sticker ? "들어있음" : "안들어 있음"));
		System.out.println("과자 질량: "+weight+"g");
		System.out.println("1g당 금액: "+rate+ "원");
		
	}
	
	@Override
	void productInfo() {
		super.productInfo();
		System.out.println("----과자 제품 정보----");
		snackInfo();
	}
}
class Pencil extends Product{
	
	Pencil(){
		super("",-1,-1);
	}
	

	
	
	
}
public class ExtendsTest04 { 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		Pencil pen = new Pencil();
		pen.productInfo();
		
		TV samsung = new TV("삼성", 4500000, 1234, 34, 23, false, 100);
		samsung.productInfo();
		
		Product lg = new TV("LG", 350000, 1235, 49, 34, true, 0);
		
		
		
		Product pro = null;
		
		pro =samsung; // 부모 = 자식  "다형성 대입" 다형성
		pro.productInfo();
		
		pro = lg;
		pro.productInfo();
		
//		Snack banana = new Snack("바나나킥", 4000, 2319, true, 10, 20);
//		Snack chocopie = new Snack("초코파이", 10000, 2356, false, 10, 20);
//		Snack lays = new Snack();
//		
		Snack banana = new Snack();
		
		pro = banana;
		pro.productInfo();
//		
//		
//		//다형적 대입
//		Product pro = null;
//		
//		pro = samsung;
//		
//		pro = banana;
//		pro = chocopie;
		
		
		

	}

}





















