package classEx2;

import java.util.Scanner;

public class ClassTest06_1 {
	static Scanner sc = new Scanner(System.in);
	
	private String name;
	private String year;
	private String month;
	private String day;
	
//	public ClassTest06_1() {
//		
//	}
	
	
	
		
	public ClassTest06_1(String name) {
		this.name = name;
	}




	public ClassTest06_1(String name, String year) {

		this.name = name;
		this.year = year;
	}
	


	public ClassTest06_1(String name, String year, String month, String day) {
	
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
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
		System.out.println("1월부터 12월달 사이를 입력해주세요");
		this.month = month;
	}



	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		System.out.println("1일부터 31일 사이를 입력해주세요");
		this.day = day;
	}




	public void printBirthday() {
		
		System.out.println(name + "\t\t" + year +"\t\t" + month + "\t\t" + day);
		
	}
	
	static void inputArBirth(ClassTest06_1[]birthday) {
		System.out.println("이름\t\t년\t\t월\t\t일");
		for (int i = 0; i < birthday.length; i++) {
			birthday[i].setName(sc.next());
			birthday[i].setYear(sc.next());
			birthday[i].setMonth(sc.next());
			birthday[i].setDay(sc.next());
		}
	}
	
	static void printArBirth(ClassTest06_1[]birthday) {
		System.out.println("이름\t\t년\t\t월\t\t일");
		for (int i = 0; i < birthday.length; i++) {
			System.out.println(birthday[i].getName()+"\t");
			System.out.println(birthday[i].getYear()+"\t");
			System.out.println(birthday[i].getMonth()+"\t");
			System.out.println(birthday[i].getDay()+"\t");
		}
		
	}



	public static void main(String[] args) {
	
	ClassTest06_1 [] birthday = new ClassTest06_1 [3];
	
	for (int i = 0; i < birthday.length; i++) {
		//birthday[i] = new ClassTest06_1();
	}
	
	
	
	birthday[0] = new ClassTest06_1("홍길동", "1945", "5", "2");
	birthday[1] = new ClassTest06_1("박문수", "1945", "데이터 없음", "데이터 없음");
	birthday[2] = new ClassTest06_1("이순신", "데이터 없음", "데이터 없음", "데이터 없음");
		
	ClassTest06_1 hgd = new ClassTest06_1("홍길동", "1945", "5", "2");
	ClassTest06_1 pms = new ClassTest06_1("박문수", "1945", "데이터 없음", "데이터 없음");
	ClassTest06_1 iss = new ClassTest06_1("이순신", "데이터 없음", "데이터 없음", "데이터 없음");
	
	
	while(true) {
	int choice = 0;
	System.out.println("어느 분 데이터를 바꾸길 원하십니까? \n1. 홍길동\n2. 박문수\n3. 이순신\n");
	choice = sc.nextInt();
	switch (choice) {
	case 1:
		ClassTest06_1.inputArBirth(birthday);
		break;

	default:
		break;
	}

	
	
	}
	
	
	//ClassTest06_1.printArBirth(birthday);
	
	
	
//	hgd.printBirthday();
//	pms.printBirthday();
//	iss.printBirthday();
	
		
		
		
		
		
		
		
		
		

	}
}

















