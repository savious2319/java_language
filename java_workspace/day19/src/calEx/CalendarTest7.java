package calEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 	Calendar �޷¸����
 	-�⵵�� ���� �Է¹����� �� ���� �޷��� �������
 	�Է� ��)
 	�⵵ : 2020
 	��   : 5
 	
 	   [2020�� 5��]
 	   
 	�� �� ȭ �� �� �� ��
 	                1  2
     3  4  5...........
     
    31 	
    
   1. ���� ������ �˾ƾ� �Ѵ�! �����Ͽ� 1�� ���۵ȴٸ�.... �Ͽ�ȭ ���� ������ ����ؾ��Ѵ�.
   2. ���������� �˾ƾ��Ѵ�!  getActually~~~() �� ���
   3. ��¥�� ������ ������ �����ؾ��Ѵ�.                 
 */

public class CalendarTest7 {
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
		Scanner sc = new Scanner(System.in);
		int year = 2020;
		int month = 6-1;
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, 1);
		
		System.out.println("["+year+"�� "+(month+1)+"��]");
		System.out.println(" �� �� ȭ �� �� �� ��");    // " ��" �Ͽ��� �տ� ���� �ϳ�
		//                  012012012012012012012
//		for (int i = 0; i < 2; i++) {
//			
//			System.out.print("  ");
//			
//		}
//			for (int i = 0; i < 30; i++) {
//				
//				System.out.print((i+1) +" ");
//				if(i % 7 == 0) {
//					System.out.println();
//				}
//			}
		
		
		
//		System.out.println("���� ���� : "+getYoil(cal.get(Calendar.DAY_OF_WEEK)));
//		int lastDate = cal.getActualMaximum(Calendar.DATE);
//		System.out.println("6�� ������ �� : "+lastDate);
		
		//�����ϴ� ������ ���س��� -> ù �ٿ� ������ ���� �Ѵ�.
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(startDay + "����");
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		
		
		
		//���� ��°���
		for (int i = 1; i < startDay; i++) {
			System.out.print("   ");   //���� ���� ����� -> 3ĭ ����
		}
		int yoil = 1;
		for(int i = 1; i <=lastDay ;i++) {
			
			System.out.print( i<10 ? "  "+i:" "+i); // 1�� �ڸ����� ���� ��, i�� => 3ĭ
													// 10�� �ڸ��� �Ǹ� ���� 1ĭ i���� 10�� => 3ĭ
			if(startDay % 7 == 0) {
			System.out.println();
			}
			startDay++;
		}
		
		
		
		
	}

}












































