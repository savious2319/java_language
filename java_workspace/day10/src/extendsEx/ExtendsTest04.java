package extendsEx;

import java.util.Scanner;

/*
 	���
 	
 	�������� ���� ����
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
		System.out.println("====��ǰ ���� (�θ� Ŭ����)====");
		System.out.println("��ǰ�� : "+prod_name);
		System.out.println("��ǰ���� : "+price);
		System.out.println("��ǰ��ȣ : "+prod_id);
	}
	
}
class TV extends Product {
	int width;
	int height;
	boolean isPower;
	int channel;
	
	public TV() {
		super("�����", 0, -1);
	}
	
	public TV(String prod_name, int price, int prod_id, int width, int height, boolean isPower, int channel) {
		super(prod_name, price, prod_id);
		this.width = width;
		this.height = height;
		this.isPower = isPower;
		if(0<channel && channel<=999) {
		this.channel = channel;
		}else if(channel == 987362) {
			System.out.println("ä�� �ʱ�ȭ �����մϴ�");
			System.out.println("ä���Է¿���(0~999�������� �Է�) : "+channel);
		}
		
	}

	void isPower() {
//		isPower = true; //on
//		isPower = true; //off
		
		isPower = !isPower;
		System.out.println("����: "+ (isPower ? "����(on)" : "����(off)")); //���� ������ ���
		System.out.println("3�ʵڿ� �����ϴ�");
		for (int i = 3; i > 0; i--) {
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i+ "��");
		}
		System.out.println("���� OFF~~");
	}
	
	String getIsPower(boolean isPower) {
		if(isPower == true) {
			return "����";
		}else {
			return "����";
		}
	}
	
	void channelUp() {
		channel++;
		System.out.println("���� ä��: " +channel+"��");
	}
	
	void channelDown() {
		channel--;
		System.out.println("���� ä��: "+channel+"��");
	}
	void tvInfo() {
		//super.productInfo();
		//TV���� ���� ����
		System.out.println("-----TV ���� ���-----");
		System.out.println("���� x ����: "+width+"x"+height);
//		System.out.println("����: "+ getIsPower(isPower));
		System.out.println("����: "+ (isPower ? "����(on)" : "����(off)")); //���� ������ ���
		System.out.println("���� ä��: "+channel+"��");
		System.out.println("----------------------");
	}
	
	@Override
	void productInfo() {
		super.productInfo();
		this.tvInfo();
		
	}
	

}
class Snack extends Product{
	

	boolean sticker; //��ƼĿ�� �ִ��� ������
	int weight; //������ ����
	int rate; //���ݴ�� ����		10g�� ������
	int discountPrice;
	
	public Snack() {
		super("�����", 0, -1);
	}
	
	int setDiscount(){
		
		return discountPrice = getPrice() / weight;
	}
	
	public Snack(String prod_name, int price, int prod_id, boolean sticker, int weight, int rate) {
		super(prod_name, price, prod_id);
		this.sticker = sticker; //true �� ��ƼĿ ����, false�� ��ƼĿ ����
		this.weight = weight;
		this.rate = setDiscount();
		
	}
	
	
	
	String getSticker(boolean sticker) {
		if(sticker == true) {
			return "����";
		}else {
			return "����";
		}
	}
	
	void snackInfo() {
		super.productInfo();
//		System.out.println("��ƼĿ: "+getSticker(sticker));
		System.out.println("��ƼĿ: " + (sticker ? "�������" : "�ȵ�� ����"));
		System.out.println("���� ����: "+weight+"g");
		System.out.println("1g�� �ݾ�: "+rate+ "��");
		
	}
	
	@Override
	void productInfo() {
		super.productInfo();
		System.out.println("----���� ��ǰ ����----");
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
		
		TV samsung = new TV("�Ｚ", 4500000, 1234, 34, 23, false, 100);
		samsung.productInfo();
		
		Product lg = new TV("LG", 350000, 1235, 49, 34, true, 0);
		
		
		
		Product pro = null;
		
		pro =samsung; // �θ� = �ڽ�  "������ ����" ������
		pro.productInfo();
		
		pro = lg;
		pro.productInfo();
		
//		Snack banana = new Snack("�ٳ���ű", 4000, 2319, true, 10, 20);
//		Snack chocopie = new Snack("��������", 10000, 2356, false, 10, 20);
//		Snack lays = new Snack();
//		
		Snack banana = new Snack();
		
		pro = banana;
		pro.productInfo();
//		
//		
//		//������ ����
//		Product pro = null;
//		
//		pro = samsung;
//		
//		pro = banana;
//		pro = chocopie;
		
		
		

	}

}





















