package classEx2;

import java.util.Scanner;

/**
 * @author admin
 *
 */
class MyFriendBirthday{
	String name;
	int year;
	int month;
	int day;
	public MyFriendBirthday() {
		
	}
	public MyFriendBirthday(String name) {
		this.name = name;
	}
	public MyFriendBirthday(String name, int year) {
		this.name = name;
		this.year = year;
	}
	public MyFriendBirthday(String name, int year, int month) {
		this.name = name;
		this.year = year;
		this.month = month;
	}
	public MyFriendBirthday(String name, int year, int month, int day) {
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
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	void printMyFriend() {
		System.out.print(this.name+"\t");
		System.out.print(this.year+"\t");
		System.out.print(this.month+"\t");
		System.out.println(this.day);

	}
	void inputDate() {
		if(this.getYear()==0) {
			System.out.println(this.getName()+"님의 태어난 년도를 입력해 주세요:");

		}else if(this.getMonth()==0){
			
		
		}else if(this.getDay()==0){
			
		}else { 
			System.out.println("데이터 입력이 완료 되었습니다.");
			
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	void menu() {
		while(true) {
			System.out.println("등록된 회원 정보");
			System.out.println("이름\t년도\t월\t일");
			this.printMyFriend();
			System.out.println();
			System.out.println(this.getName()+"님의 어떤 데이터를 수정하시겠습니까?");
					
			System.out.println("1. 태어난 년도");
			System.out.println("2. 태어난 월");
			System.out.println("3. 태어난 일");
			System.out.println("4. 종료");
			System.out.print("번호를 선택해 주세요 : ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print(this.getYear()+"년 >> 수정년도 입력 : ");
				int year = sc.nextInt();
				setYear(year);
				break;
			case 2:
				System.out.print(this.getMonth()+"월 >> 수정 월 입력 : ");
				int month = sc.nextInt();
				setYear(month);
				break;
			case 3:
				System.out.print(this.getDay()+"일 >> 수정 일 입력 : ");
				int day= sc.nextInt();
				setYear(day);
				break;
			}
		} //end while
		
	}
	
}
public class ClassTest06_배정수 {

	public static void main(String[] args) {
		MyFriendBirthday hgd = new MyFriendBirthday("홍길동",1945,5,2);
		MyFriendBirthday pms = new MyFriendBirthday("박문수", 1995);
		MyFriendBirthday iss = new MyFriendBirthday("이순신");
		//System.out.println("이름\t년도\t월\t일");
		
		//hgd.printMyFriend();
		//pms.printMyFriend();
		//iss.printMyFriend();

		//hgd.inputDate();
		
		//hgd.printMyFriend();
		
		hgd.menu();
		

	}

}














