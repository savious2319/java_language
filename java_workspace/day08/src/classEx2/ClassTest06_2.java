package classEx2;

import java.util.Scanner;

class Musician{
	static Scanner sc = new Scanner(System.in);
	private String name;
	private String recordSales;
	private int age;
	private String instrument;
	
	public Musician() {
		
	}
	
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
	
	
	static void printArMusician(Musician[]musician) {
		for (int i = 0; i < musician.length; i++) {
			System.out.println(musician[i].getName() + "\t");
			System.out.println(musician[i].getrecordSales() + "\t");
			System.out.println(musician[i].getAge() + "\t");
			System.out.println(musician[i].getInstrument() + "\t");
		}
	}
	
	void inputData(String name, String recordSales, int age, String instrument) {
		
		
	}
	
}


public class ClassTest06_2 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	Musician[] musician = new Musician[4];
	//객체 배열을 쓸 때는 기본생성자를 쓰는게 좋다
	for(int i = 0; i < musician.length; i++) {
		musician[i] = new Musician();
	}
	
	musician[0] = new Musician("Chick Corea", "$40,000,000", 78, "piano");
	musician[1] = new Musician("Al Di Meola", "$34,000,000", 65, "guitar");
	musician[2] = new Musician("Stanley Clarke", "23,000,000", 74, "bass");
	
	Musician m1 = new Musician("Chick Corea", "$40,000,000", 78, "piano");
	Musician m2 = new Musician("Al Di Meola", "$34,000,000", 65, "guitar");
	Musician m3 = new Musician("Stanley Clarke", "23,000,000", 74, "bass");	
	int choice = 0;
	System.out.println("Choose the musician to alter data\n1. Chick Corea\n2. Al Di Meola\n3. Stanley Clarke");
	choice = sc.nextInt();
	switch (choice) {
	case 1:
		musician[0].inputData(name, recordSales, age, instrument);
		m1.inputData(name, recordSales, age, instrument);
		m1.setrecordSales(recordSales);
		m1.setAge(age);
		m1.setInstrument(instrument);
		break;
	case 2:
		m2.setName(name);
		m2.setrecordSales(recordSales);
		m2.setAge(age);
		m2.setInstrument(instrument);
		break;
	case 3:
		m3.setName(name);
		m3.setrecordSales(recordSales);
		m3.setAge(age);
		m3.setInstrument(instrument);
		break;
	default:
		break;
	}
	
	
	
	Musician.printArMusician(musician);
	

	
	
		
		
		
		
		
		
		

	}
}

















