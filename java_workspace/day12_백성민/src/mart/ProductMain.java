package mart;

import buyerEx.Buyer;
import productEx.Phone;
import productEx.Product;
import productEx.TV;
/*
 	��ȹ�ǵ�
 	1) ���� : ��ǰ���� �� Ŭ������ �����Ѵ�.
 	2) ��Ŭ������ 1�� ����� ���� �ۼ��ߴ�.
 	...
 	..
 	
 	������Ʈ ����
 	1) Buyer Ÿ���� ��ü�� ���� �������� ������!
 	2) Buyer�� �������� ����� �� �־�� �Ѵ�!
 */


public class ProductMain {

	public static void main(String[] args) {
		
		Product product = new Product("ǰ��", "ǰ��", "��ǰ��", -1);
		TV samsungTV = new TV("TV", "ǰ��", "��ǰ��", 3600000, "�Ｚ", 42);
		Phone lgPhone = new Phone("ǰ��", "ǰ��", "��ǰ��", 1200000, "����", "OLED");
		
		//Buyer hgd = new Buyer(5000000); //������
		
		//hgd.buy(samsungTV);
		//hgd.buy(lgPhone);
		//hgd.infor(); //������ �� ���Ҵ���?
		
		
		Buyer hgd = new Buyer(10000000); //õ����
		hgd.startShopping();
		
	}

}
