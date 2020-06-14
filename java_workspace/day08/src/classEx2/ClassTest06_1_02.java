package classEx2;

import java.util.Scanner;

class FriendBirthday {

	private String name;
	private int year;
	private int month;
	private int day;

	public FriendBirthday(String name, int year, int month, int day) {
		
		this.name = name;
		if(1<=year && 2020>=year) {
		setYear(year);
		}else {
			this.year = -1;
		}
		//this.year = year;
		if(1<=month && 12>=month) {
		setMonth(month);
		}else {
			this.month = -1;
		}
		// this.month = month;
		if(1<=day && 31>=day) {
		setDay(day);
		}else {
			this.day = -1;
		}
		// this.day = day;
	}

	public FriendBirthday(String name, int year) {

		this(name, year, -1, -1);
	}
	public FriendBirthday(String name) {
		this(name, -1, -1, -1);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {

		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
//		if(1<=Integer.parseInt(month) && 12>=Integer.parseInt(month)) {
//		}
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
//		if(1<=Integer.parseInt(day) && 31>=Integer.parseInt(day)) {
//		}
		this.day = day;
	}

	public void printBirthday() {

		System.out.println(name + "\t\t" + year + "\t\t" + month + "\t\t" + day);
	}

	static Scanner sc = new Scanner(System.in);

	static void changeBirthdayData(FriendBirthday[] birthday, int index) {
		while (true) {
			birthday[index - 1].printBirthday();
			System.out.println(birthday[index - 1].name + "���� � �����͸� �����Ͻðڽ��ϱ�?");
			System.out.println("1. �¾ �⵵");
			System.out.println("2. �¾ ��");
			System.out.println("3. �¾ ��");
			System.out.println("4. ����");
			System.out.println("��ȣ�� ������ �ּ���");
			int select = sc.nextInt();
			if (select == 4) {
				break;
			}
			switch (select) {
			case 1:
				System.out.println(birthday[index - 1].year + ">>> �ٲ� �⵵ �Է� : ");
				birthday[index - 1].setYear(sc.nextInt());
				break;
			case 2:
				System.out.println(birthday[index - 1].month + ">>> �ٲ� �� �Է� : ");
				birthday[index - 1].setMonth(sc.nextInt());
				break;

			case 3:
				System.out.println(birthday[index - 1].day + ">>> �ٲ� �� �Է� : ");
				birthday[index - 1].setDay(sc.nextInt());
				break;
			}
		}
	}

}

public class ClassTest06_1_02 {
	static Scanner sc = new Scanner(System.in);

	static void menu(FriendBirthday[] birthday) {
		int index = 0;
		while (true) {
			System.out.println("�̸�\t\t�⵵\t\t��\t\t��");
			birthday[0].printBirthday();
			birthday[1].printBirthday();
			birthday[2].printBirthday();
			System.out.print("�ڻ����� ��ܡ�\nȸ���� �������ּ���\n1. ȫ�浿\n2. �ڹ���\n3. �̼���\n4. ����");
			index = sc.nextInt();
			if (index == 0) {
				break;
			}
			switch (index) {
			case 1:
				FriendBirthday.changeBirthdayData(birthday, index);
				break;
			case 2:
				FriendBirthday.changeBirthdayData(birthday, index);
				break;
			case 3:
				FriendBirthday.changeBirthdayData(birthday, index);
				break;

			}
		}
	}

	public static void main(String[] args) {

		FriendBirthday[] birthday = new FriendBirthday[3];

		birthday[0] = new FriendBirthday("ȫ�浿", 1945, 5, 2);
		birthday[1] = new FriendBirthday("�ڹ���", 1945, 0, 0);
		birthday[2] = new FriendBirthday("�̼���", 0, 0 ,0);

		// �迭 �ϳ����� �ѱ��
		menu(birthday);

	}

}
