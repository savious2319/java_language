package classEx2;

import java.util.Scanner;


class Musician {
	static Scanner sc = new Scanner(System.in);
	private String name;
	private String recordSales;
	private int age;
	private String instrument;

//	public Musician() {
//
//	}

	public Musician(String name, String recordSales, int age, String instrument) {
		super();
		this.recordSales = recordSales;
		this.age = age;
		this.name = name;
		this.instrument = instrument;
	}

	public String getrecordSales() {
		return recordSales;
	}

	public void setrecordSales(String recordSales) {
		this.recordSales = recordSales;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
 
	void printMusician() {
		
		System.out.println(name +"\t\t" + age + "\t\t" + instrument + "\t\t" + recordSales +"\n");
	}
	

}

public class ClassTest06_2 {
	
	static Musician[] musician = new Musician[10];
	static Scanner sc = new Scanner(System.in);
	
	static void printMusician() {
		System.out.println("No\tName\t\tAge\t\tInstrument\tRecordSales");
		for (int i = 0; i < musician.length; i++) {
			System.out.print((i+1) + "\t"+musician[i].getName()+"\t\t"+ musician[i].getAge()+"\t\t"+
							 musician[i].getInstrument() + "\t\t"+  musician[i].getrecordSales() + "\n");
			
		}
	}
	
	static void insertMusician() {
		String name = "";
		int age = 0;
		String instrument = "";
		String recordSales = "";

		System.out.println("Enter number: ");
		int num = sc.nextInt();
		sc.nextLine();
		if(num >= 1 && num <= 10 && musician[num-1] != null) {
			
			for (int i = musician.length - 1; i > num - 1; i--) {
				musician[i] = musician[i-1];
			}
			
			System.out.println(musician[2].getName());
			
			System.out.print("Enter name : "); 
			name = sc.nextLine();
			musician[num-1].setName(name);
			System.out.print("Enter age : ");
			age = sc.nextInt();
			musician[num-1].setAge(age);
			sc.nextLine();
			System.out.print("Enter instrument : ");
			instrument = sc.nextLine();
			musician[num-1].setInstrument(instrument);
			System.out.print("Enter record sales : "); 
			recordSales = sc.nextLine();
			musician[num-1].setrecordSales(recordSales);
			
			System.out.println(musician[2].getName());
			
			
		}else {
			System.out.println("\nError: There is no musician with that number");
		}
	}
	

	static void addMusicianData() {
		char ch = ' ';
		for (int i = 0; i < musician.length; i++) {
			
			sc.nextLine();
			System.out.print("Enter name : "); musician[i].setName(sc.nextLine());
			System.out.print("Enter age : "); musician[i].setAge(sc.nextInt()); sc.nextLine();
			System.out.print("Enter instrument : "); musician[i].setInstrument(sc.nextLine());
			System.out.print("Enter record sales : "); musician[i].setrecordSales(sc.next());
			System.out.println("Would you like to continue adding data? [y/n]"); ch = sc.next().charAt(0);
			if(ch == 'n') {break;}
			
			
		}
	}

	static void changeMusicianData() {
		int userChoice = 0;
		String userInput = "";
		System.out.println("Please select which musician you would like to change");
		for (int i = 0; i < musician.length; i++) {
			System.out.println((i+1)+ ". " + musician[i].getName());
		}
		userChoice = sc.nextInt();
		sc.nextLine();
		while(true) {
		System.out.println("Please enter the category you would like to change from the following menu\n"
				+ "1. name\n2. age\n3. instrument\n4. record sales\n5. quit");
		userInput = sc.nextLine();
		if(userInput.equals("name")) {
			//sc.nextLine();
			System.out.print("Enter name : "); musician[userChoice-1].setName(sc.nextLine());
		}
		if(userInput.equals("age")) {
			System.out.print("Enter age : "); musician[userChoice-1].setAge(sc.nextInt());sc.nextLine();
		}
		if(userInput.equals("instrument")) {
			System.out.print("Enter instrument : "); musician[userChoice-1].setInstrument(sc.nextLine());
		}
		if(userInput.equals("record sales")) {
			System.out.print("Enter record sales : "); musician[userChoice-1].setrecordSales(sc.next());
			sc.nextLine();
		}
		if(userInput.equals("quit")) {break;}
		}
	
	}
	
	static void removeMusician() {
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		if(num >= 1 && num <= 10 && musician[num-1] != null) {
			musician[num-1] = null;
			
			
		}
	}

	public static void main(String[] args) {
		
		// 객체 배열을 쓸 때는 기본생성자를 쓰는게 좋다
//		for (int i = 0; i < musician.length; i++) {
//			musician[i] = new Musician();
//		}
		musician[0] = new Musician("Al", "1",1,"1");
		musician[1] = new Musician("Chick", "1",1,"1");
		musician[2] = new Musician("Keith", "1",1,"1");
		musician[3] = new Musician("James", "1",1,"1");
		musician[4] = new Musician("Pat", "1",1,"1");
		musician[5] = new Musician("Andy", "1",1,"1");
		musician[6] = new Musician("John", "1",1,"1");
		musician[7] = new Musician("Steve", "1",1,"1");
		musician[8] = new Musician("Eric", "1",1,"1");
		musician[9] = new Musician("Paul", "1",1,"1");
		
		int choice = 0;
		while(true) {
		System.out.println("Musicians' Database\nPlease select the desired menu\n1. Print Musicians"
							+ "\n2. Add Musician\n3. Insert Musician\n4. Change Data\n5. Remove Data\n6. Exit");
		choice = sc.nextInt();
		if(choice == 4) {break;}
		switch(choice) {
		case 1: printMusician(); break;
		case 2: addMusicianData(); break;
		case 3:	insertMusician(); break;
		case 4: changeMusicianData(); break;
		case 5: removeMusician(); break;
		}


		}

		

	}
}
