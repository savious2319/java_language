package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar 
 */

public class CalendarTest5 {

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
		
		Calendar cal = Calendar.getInstance();
		//cal.get(Calendar.DAY_OF_WEEK) %7 + 1 // ������ ���� �� �� �ִ�
		
		//               0    1    2    3    4    5    6
//		String[]yoil = {"","��","��","ȭ","��","��","��","��"};  //�� ���ڿ��� �־ �ε������� ��������!
//		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)]);
		
		String[]yoil = {"��","��","ȭ","��","��","��","��"};  //�� ���ڿ��� �־ �ε������� ��������!
		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
		
		String date1 = "202005";
		String date2 = "201906";
		
		//�� ��¥���� �������� ����� ������
		//1. ���ڿ����� subString()
		//2. ���ڿ��� int�� parsing �ؾ� �Ѵ�.
		//3. ���밪���� ������� : Math.abs()
		
		
		
		int year1 = Integer.parseInt(date1.substring(0, 4))*12;
		int year2 = Integer.parseInt(date2.substring(0, 4))*12;
		
		int month1 = Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(4));
		
		//year1�� �������� ȯ���� ����! year1 * 12
		//year2�� *12�� �ϸ� �������� ȯ��
		//����, month1, month2 �� �����ָ� �ȴ�
		//�׸��� �� ���� ���� �ȴ�!
		
		int monthDiff =Math.abs((year2 + month2) - (year1 + month1));
		System.out.println(date1+"��"+date2+"��"+monthDiff+"���� ���Դϴ�");
		
//		System.out.println(Math.abs(d2-d1)+"���� ���̰� ���ϴ�");
		
		//Ư�� �⵵�� �������� �Ǵ��� ����
		// ���� 366�� �ִٴ� �� -> 2�� 29�ϱ��� �ִ� �⵵
		// leapYear
		// Ư�� �⵵��...
		// 1. 4�� ������ �������� �⵵
		// 2. �׷��� �� �⵵ �߿��� 100���� ������ �������� �� �⵵�� ���� �ؾ� �Ѵ�.
		// 3. �׷��鼭 ���ÿ� 400���� ������ �������� �� �ش� ������ �ȴ�!
		int year = 2020;
		
		System.out.println(year+"��"+(year % 4 == 0 && year % 100 != 0 ? "����" : "������ �ƴմϴ�"));
		
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year+"��" +"��CalendarTest4.java���Դϴ�");
		}else {
			System.out.println(year+"��"+"������ �ƴմϴ�");
		}
		
		
		//year�� �����Դϴ�!
	}

}












































