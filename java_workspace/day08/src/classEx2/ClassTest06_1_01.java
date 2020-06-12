package classEx2;

import java.util.Scanner;

class Birthday {

	private String name;
	private String year;
	private String month;
	private String day;

//	public ClassTest06_1() {
//		
//	}

	public Birthday(String name) {
		this.name = name;
	}

	public Birthday(String name, String year) {

		this.name = name;
		this.year = year;
	}

	public Birthday(String name, String year, String month, String day) {

		this.name = name;
		this.year = year;
		//if(1<=Integer.parseInt(month) && 12>=Integer.parseInt(month))
		setMonth(month);
		//this.month = month;
		setDay(day);
		//this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {

		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
//		if(1<=Integer.parseInt(month) && 12>=Integer.parseInt(month)) {
//		}
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
//		if(1<=Integer.parseInt(day) && 31>=Integer.parseInt(day)) {
//		}
		this.day = day;
	}

	public void printBirthday() {

		System.out.println(name + "\t\t" + year + "\t\t" + month + "\t\t" + day);

	}
	
	public void inputBirthday() {
		
	}
}

public class ClassTest06_1_01 {
	static Scanner sc = new Scanner(System.in);

	static void addBirthdayData(FriendBirthday[] birthday) {
		String userInput = "";
		;
		String year = "";
		String month = "";
		String day = "";

		while (true) {
			System.out.println(birthday[1].getName() + "�԰� " + birthday[2].getName() + "�� �߿� ����� �����͸� �߰� �Ͻðڽ��ϱ�? ");
			userInput = sc.next();
			if (userInput.equals(birthday[1].getName())) {

				System.out.print("���� �Է��� �ּ���(1�� ~ 12�� ����): ");
				month = sc.next();
				birthday[1].setMonth(month);
				System.out.println(birthday[1].getMonth());
				System.out.print("���� �Է��� �ּ���(1�� ~ 31�� ����): ");
				day = sc.next();
				birthday[1].setDay(day);
				System.out.println("�����Ͱ� �߰� �Ǿ����ϴ�");
				break;
			} else if (userInput.equals(birthday[2].getName())) {

				System.out.print("�⵵�� �Է��� �ּ���(1990�� ~ 2020�� ����) : ");
				year = sc.next();
				birthday[2].setYear(year);
				System.out.print("���� �Է��� �ּ���(1�� ~ 12�� ����): ");
				month = sc.next();
				birthday[2].setMonth(month);
				System.out.print("���� �Է��� �ּ���(1�� ~ 31�� ����): ");
				day = sc.next();
				birthday[2].setDay(day);
				System.out.println("�����Ͱ� �߰� �Ǿ����ϴ�");
				break;
			} else {
				System.out.println("�ڹ����԰� �̼��� �̿ܿ��� �߰��� �Ұ����մϴ�");
			}
		}
	}

	static void changeBirthdayData(FriendBirthday[] birthday) {
		String userInput = "";
		String newYear = "";
		String newMonth = "";
		String newDay = "";

		while (true) {
			System.out.println("��� ���� �����͸� ���� �Ͻðڽ��ϱ�? \n" + birthday[0].getName() + "\n" + birthday[1].getName() + "\n"
					+ birthday[2].getName() + "\n");
			userInput = sc.next();
			if (userInput.equals(birthday[0].getName())) {

				System.out.print("�⵵�� �Է��� �ּ��� : ");
				newYear = sc.next();
				birthday[0].setYear(newYear);
				System.out.print("���� �Է��� �ּ��� : ");
				newMonth = sc.next();
				birthday[0].setMonth(newMonth);
				System.out.print("���� �Է��� �ּ��� : ");
				newDay = sc.next();
				birthday[0].setDay(newDay);
				System.out.println(birthday[0].getName() + "���� ������ ������ �Ϸ�Ǿ����ϴ�");
				break;
			} else if (userInput.equals(birthday[1].getName())) {

				System.out.print("�⵵�� �Է��� �ּ��� : ");
				newYear = sc.next();
				birthday[0].setYear(newYear);
				System.out.print("���� �Է��� �ּ��� : ");
				newMonth = sc.next();
				birthday[0].setMonth(newMonth);
				System.out.print("���� �Է��� �ּ��� : ");
				newDay = sc.next();
				birthday[0].setDay(newDay);
				System.out.println(birthday[1].getName() + "���� ������ ������ �Ϸ�Ǿ����ϴ�");
				break;
			} else if (userInput.equals(birthday[2].getName())) {

				System.out.print("�⵵�� �Է��� �ּ��� : ");
				newYear = sc.next();
				birthday[0].setYear(newYear);
				System.out.print("���� �Է��� �ּ��� : ");
				newMonth = sc.next();
				birthday[0].setMonth(newMonth);
				System.out.print("���� �Է��� �ּ��� : ");
				newDay = sc.next();
				birthday[0].setDay(newDay);
				System.out.println(birthday[2].getName() + "���� ������ ������ �Ϸ�Ǿ����ϴ�");
				break;
			} else {
				System.out.println("�����Ϳ� ���� ���Դϴ�. �ٽ� �Է��� �ּ���");
			}
		}
	}

	static void printBirthdayData(FriendBirthday[] birthday, int index) {
		System.out.println("�̸�\t\t��\t\t��\t\t��");
		for (int i = 0; i < birthday.length; i++) {
//			System.out.print(birthday[i].getName() + "\t\t");
//			System.out.print(birthday[i].getYear() + "\t\t");
//			System.out.print(birthday[i].getMonth() + "\t\t");
//			System.out.print(birthday[i].getDay() + "\t\t");
			birthday[i].printBirthday();

		}

	}

	public static void main(String[] args) {

		FriendBirthday[] birthday = new FriendBirthday[3];

		for (int i = 0; i < birthday.length; i++) {
			// birthday[i] = new ClassTest06_1();
		}

		birthday[0] = new FriendBirthday("ȫ�浿", "1945", "5", "2");
		birthday[1] = new FriendBirthday("�ڹ���", "1945", "����", "����");
		birthday[2] = new FriendBirthday("�̼���", "����", "����", "����");

		FriendBirthday hgd = new FriendBirthday("ȫ�浿", "1945", "5", "2");
		FriendBirthday pms = new FriendBirthday("�ڹ���", "1945", "������ ����", "������ ����");
		FriendBirthday iss = new FriendBirthday("�̼���", "������ ����", "������ ����", "������ ����");
		
		//�迭 �ϳ����� �ѱ��

		// ���
		//printBirthdayData(birthday);

//		int choice = 0;
		while (true) {
//			System.out.print("\n�ڸ޴���\n1. ������ ���� ����\n2. ������ ���� �߰�\n3. ������ ���� ����\n0. ����\n������ �ּ��� : ");
//			choice = sc.nextInt();
//			if (choice == 0) {
//				break;
//			}
//			switch (choice) {
//			case 1:// ���
//				printBirthdayData(birthday);
//				break;
//			case 2:// �߰�
//				addBirthdayData(birthday);
//				break;
//			case 3: // ����
//				changeBirthdayData(birthday);
//				break;
//			}
			
			int index = 0;
//			birthday[index].getDay();
			
			// ctrl + d => ��ü �� ����
			
			System.out.print("\n�ڻ����� ��ܡ�\n�����ڸ� �������ּ���\n1. ȫ�浿\n2. �ڹ���\n3. �̼���");
			index = sc.nextInt();
			
			switch(index) {
			case 1: printBirthdayData(birthday, index);
			}
		}

	}
}
