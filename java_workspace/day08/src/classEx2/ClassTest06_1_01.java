package classEx2;

import java.util.Scanner;

class Birthday {

	private String name;
	private int year;
	private int month;
	private int day;

//	public ClassTest06_1() {
//		
//	}

	public Birthday(String name) {
		this.name = name;
	}

	public Birthday(String name, int year) {

		this.name = name;
		this.year = year;
	}

	public Birthday(String name, int year, int month, int day) {

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
	
	public void inputBirthday() {
		
	}
}

public class ClassTest06_1_01 {
	static Scanner sc = new Scanner(System.in);

	static void addBirthdayData(FriendBirthday[] birthday) {
		String userInput = "";
		

		while (true) {
			System.out.println(birthday[1].getName() + "님과 " + birthday[2].getName() + "님 중에 어느분 데이터를 추가 하시겠습니까? ");
			userInput = sc.next();
			if (userInput.equals(birthday[1].getName())) {

				System.out.print("월을 입력해 주세요(1월 ~ 12월 사이): ");
				birthday[1].setMonth(sc.nextInt());
				System.out.println(birthday[1].getMonth());
				System.out.print("일을 입력해 주세요(1일 ~ 31일 사이): ");
				birthday[1].setDay(sc.nextInt());
				System.out.println("데이터가 추가 되었습니다");
				break;
			} else if (userInput.equals(birthday[2].getName())) {

				System.out.print("년도를 입력해 주세요(1990년 ~ 2020년 사이) : ");
				birthday[2].setYear(sc.nextInt());
				System.out.print("월을 입력해 주세요(1월 ~ 12월 사이): ");
				birthday[2].setMonth(sc.nextInt());
				System.out.print("일을 입력해 주세요(1일 ~ 31일 사이): ");
				birthday[2].setDay(sc.nextInt());
				System.out.println("데이터가 추가 되었습니다");
				break;
			} else {
				System.out.println("박문수님과 이순님 이외에는 추가가 불가능합니다");
			}
		}
	}

	static void changeBirthdayData(FriendBirthday[] birthday) {
		String userInput = "";
		while (true) {
			System.out.println("어느 분의 데이터를 변경 하시겠습니까? \n" + birthday[0].getName() + "\n" + birthday[1].getName() + "\n"
					+ birthday[2].getName() + "\n");
			userInput = sc.next();
			if (userInput.equals(birthday[0].getName())) {

				System.out.print("년도를 입력해 주세요 : ");
				birthday[0].setYear(sc.nextInt());
				System.out.print("월을 입력해 주세요 : ");
				birthday[0].setMonth(sc.nextInt());
				System.out.print("일을 입력해 주세요 : ");
				birthday[0].setDay(sc.nextInt());
				System.out.println(birthday[0].getName() + "님의 데이터 변경이 완료되었습니다");
				break;
			} else if (userInput.equals(birthday[1].getName())) {

				System.out.print("년도를 입력해 주세요 : ");
				birthday[0].setYear(sc.nextInt());
				System.out.print("월을 입력해 주세요 : ");
				birthday[0].setMonth(sc.nextInt());
				System.out.print("일을 입력해 주세요 : ");
				birthday[0].setDay(sc.nextInt());
				System.out.println(birthday[1].getName() + "님의 데이터 변경이 완료되었습니다");
				break;
			} else if (userInput.equals(birthday[2].getName())) {

				System.out.print("년도를 입력해 주세요 : ");
				birthday[0].setYear(sc.nextInt());
				System.out.print("월을 입력해 주세요 : ");
				birthday[0].setMonth(sc.nextInt());
				System.out.print("일을 입력해 주세요 : ");
				birthday[0].setDay(sc.nextInt());
				System.out.println(birthday[2].getName() + "님의 데이터 변경이 완료되었습니다");
				break;
			} else {
				System.out.println("데이터에 없는 분입니다. 다시 입력해 주세요");
			}
		}
	}

	static void printBirthdayData(FriendBirthday[] birthday, int index) {
		System.out.println("이름\t\t년\t\t월\t\t일");
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

		birthday[0] = new FriendBirthday("홍길동", 1945, 5, 2);
		birthday[1] = new FriendBirthday("박문수", 0,0,0);
		birthday[2] = new FriendBirthday("이순신", 0,0,0);

		
		//배열 하나씩만 넘긴다

		// 출력
		//printBirthdayData(birthday);

//		int choice = 0;
		while (true) {
//			System.out.print("\n★메뉴★\n1. 생일자 정보 보기\n2. 생일자 정보 추가\n3. 생일자 정보 변경\n0. 종료\n선택해 주세요 : ");
//			choice = sc.nextInt();
//			if (choice == 0) {
//				break;
//			}
//			switch (choice) {
//			case 1:// 출력
//				printBirthdayData(birthday);
//				break;
//			case 2:// 추가
//				addBirthdayData(birthday);
//				break;
//			case 3: // 변경
//				changeBirthdayData(birthday);
//				break;
//			}
			
			int index = 0;
//			birthday[index].getDay();
			
			// ctrl + d => 전체 줄 삭제
			
			System.out.print("\n★생일자 명단★\n생일자를 선택해주세요\n1. 홍길동\n2. 박문수\n3. 이순신");
			index = sc.nextInt();
			
			switch(index) {
			case 1: printBirthdayData(birthday, index);
			}
		}

	}
}
