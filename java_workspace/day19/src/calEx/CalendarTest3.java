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
			strYoil = "�Ͽ���";
			break;
		case 2:
			strYoil = "������";
			break;
		case 3:
			strYoil = "ȭ����";
			break;
		case 4:
			strYoil = "������";
			break;
		case 5:
			strYoil = "�����";
			break;
		case 6:
			strYoil = "�ݿ���";
			break;
		case 7:
			strYoil = "�����";
			break;
		}

		return strYoil;
	}

	public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
		
		//���ϴ� ��¥�� �Է��ϸ� �ش� ������ ����� �ݴϴ�!
		//�� ������ 1984�� 09�� 10�� �� �Դϴ�.
		cal1.set(1984, 9-1, 10);  //month�� �迭�̱⶧���� set�Ҷ��� �׻� +1�� �ؾ��Ѵ�!
		
		System.out.println(cal1);
		
		//���� ���Ͽ� �¾��?
		System.out.println(getYoil(cal1.get(Calendar.DAY_OF_WEEK)));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�¾ �⵵"); int year = sc.nextInt();
		System.out.println("�¾ ��"); int month = sc.nextInt()-1; //����ڷκ��� ���� �Է¹��� ��, �̸� -1�� ������!
		System.out.println("�¾ ��"); int day = sc.nextInt();

		cal1.set(year, month, day);
		
		System.out.println(getYoil(cal1.get(Calendar.DAY_OF_WEEK)));
	}

}















