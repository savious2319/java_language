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
			System.out.println(birthday[index - 1].name + "님의 어떤 데이터를 변경하시겠습니까?");
			System.out.println("1. 태어난 년도");
			System.out.println("2. 태어난 월");
			System.out.println("3. 태어난 일");
			System.out.println("4. 종료");
			System.out.println("번호를 선택해 주세요");
			int select = sc.nextInt();
			if (select == 4) {
				break;
			}
			switch (select) {
			case 1:
				System.out.println(birthday[index - 1].year + ">>> 바꿀 년도 입력 : ");
				birthday[index - 1].setYear(sc.nextInt());
				break;
			case 2:
				System.out.println(birthday[index - 1].month + ">>> 바꿀 월 입력 : ");
				birthday[index - 1].setMonth(sc.nextInt());
				break;

			case 3:
				System.out.println(birthday[index - 1].day + ">>> 바꿀 일 입력 : ");
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
			System.out.println("이름\t\t년도\t\t월\t\t일");
			birthday[0].printBirthday();
			birthday[1].printBirthday();
			birthday[2].printBirthday();
			System.out.print("★생일자 명단★\n회원을 선택해주세요\n1. 홍길동\n2. 박문수\n3. 이순신\n4. 종료");
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

		birthday[0] = new FriendBirthday("홍길동", 1945, 5, 2);
		birthday[1] = new FriendBirthday("박문수", 1945, 0, 0);
		birthday[2] = new FriendBirthday("이순신", 0, 0 ,0);

		// 배열 하나씩만 넘긴다
		menu(birthday);

	}

}
