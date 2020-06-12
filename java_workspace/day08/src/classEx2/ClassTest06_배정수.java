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
			System.out.println(this.getName()+"���� �¾ �⵵�� �Է��� �ּ���:");

		}else if(this.getMonth()==0){
			
		
		}else if(this.getDay()==0){
			
		}else { 
			System.out.println("������ �Է��� �Ϸ� �Ǿ����ϴ�.");
			
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	void menu() {
		while(true) {
			System.out.println("��ϵ� ȸ�� ����");
			System.out.println("�̸�\t�⵵\t��\t��");
			this.printMyFriend();
			System.out.println();
			System.out.println(this.getName()+"���� � �����͸� �����Ͻðڽ��ϱ�?");
					
			System.out.println("1. �¾ �⵵");
			System.out.println("2. �¾ ��");
			System.out.println("3. �¾ ��");
			System.out.println("4. ����");
			System.out.print("��ȣ�� ������ �ּ��� : ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print(this.getYear()+"�� >> �����⵵ �Է� : ");
				int year = sc.nextInt();
				setYear(year);
				break;
			case 2:
				System.out.print(this.getMonth()+"�� >> ���� �� �Է� : ");
				int month = sc.nextInt();
				setYear(month);
				break;
			case 3:
				System.out.print(this.getDay()+"�� >> ���� �� �Է� : ");
				int day= sc.nextInt();
				setYear(day);
				break;
			}
		} //end while
		
	}
	
}
public class ClassTest06_������ {

	public static void main(String[] args) {
		MyFriendBirthday hgd = new MyFriendBirthday("ȫ�浿",1945,5,2);
		MyFriendBirthday pms = new MyFriendBirthday("�ڹ���", 1995);
		MyFriendBirthday iss = new MyFriendBirthday("�̼���");
		//System.out.println("�̸�\t�⵵\t��\t��");
		
		//hgd.printMyFriend();
		//pms.printMyFriend();
		//iss.printMyFriend();

		//hgd.inputDate();
		
		//hgd.printMyFriend();
		
		hgd.menu();
		

	}

}














