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
		//���� ǰ�� ���⸦ ���� ��ǰ���� �ʱ�ȭ
		
		menu();
	}
	
	void menu() {
		int choice = -1; // ���� �޴� ���
		int shoppingMenu = 0;
		while(choice != 0) {
		System.out.println("1. ���� ǰ�� ����");
		System.out.println("2. �����ϱ�");
		System.out.println("3. ���� �����ݺ���");
		System.out.println("0. �����ϱ�");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			shoppingMenu = showList();
			break;

		case 2:
			if (shoppingMenu != 0) {
				switch (shoppingMenu) {
				//�Ű������� ������ ����!!!
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
		tv = new TV("������ǰ", "123", "TV", 3600000, "�Ｚ", 42);
		phone = new Phone("�޴���", "456", "V7", 1200000, "����", "OLED");
		
		System.out.println("���� ǰ�� ����");
		System.out.println("1. TV");
		tv.printProductInfo();
		System.out.println("2. Phone");
		phone.printProductInfo();
		System.out.println("� ǰ���� �����ұ��?(0���� ���θ޴�)");
		int choice = sc.nextInt();
//		switch (choice) {
//		case 1:
//			buy(tv);	//�Ű������� ������ ����!!!
//			break;
//		case 2:
//			buy(phone);	//�Ű������� ������ ����!!!
//			break;
//		case 3:
//			break;
//		}
		
		return choice;
		
	}
	
	private void showMoney() {
		System.out.println("���� ������: " + money + "��");
		
	}
	
	private void buy (Product prod) {
		System.out.println(prod.getItem() + "��  ������" +
						   prod.getPrice() + "�Դϴ�. �����Ͻðڽ��ϱ�?"
						   		+ "1. �� / 2. �ƴϿ�");
		int num = sc.nextInt();
		if(num == 1) {
			money -= prod.getPrice();
		}else {
			
		}
		
	}

}
