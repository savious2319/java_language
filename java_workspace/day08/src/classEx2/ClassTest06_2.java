package classEx2;

import java.util.Scanner;

class Musician {
	static Scanner sc = new Scanner(System.in);
	private String name;
	private String recordSales;
	private int age;
	private String instrument;

	public Musician() {

	}

//	public Musician(String name, String recordSales, int age, String instrument) {
//		super();
//		this.recordSales = recordSales;
//		this.age = age;
//		this.name = name;
//		this.instrument = instrument;
//	}

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
		
		System.out.println(name +"\t" + age + "\t\t" + instrument + "\t\t" + recordSales +"\n");
	}
	

}

public class ClassTest06_2 {

	static Scanner sc = new Scanner(System.in);
	
	static void printMusician(Musician[]musician) {
		System.out.println("Name\t\tAge\t\tInstrument\tRecordSales");
		for (int i = 0; i < musician.length; i++) {
			musician[i].printMusician();
		}
	}

	static void addMusicianData(Musician[]musician) {
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

	static void changeMusicianData(Musician[]musician) {
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

	public static void main(String[] args) {
		Musician[] musician = new Musician[7];
		// 객체 배열을 쓸 때는 기본생성자를 쓰는게 좋다
		for (int i = 0; i < musician.length; i++) {
			musician[i] = new Musician();
		}
		int choice = 0;
		while(true) {
		System.out.println("Musicians' Database\nPlease select the desired menu\n1. Print Musicians' Data"
							+ "\n2. Add Musician's Data\n3. Change Musician's Data\n4. Quit");
		choice = sc.nextInt();
		if(choice == 4) {break;}
		switch(choice) {
		case 1: printMusician(musician); break;
		case 2: addMusicianData(musician); break;
		case 3: changeMusicianData(musician); break;
		}


		}

		

	}
}
