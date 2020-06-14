package extendsEx;

import java.util.Scanner;

public class ExtendsTest {
	static String[] guests = new String[10];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		insertTestNames();
		
		do {
			displayGuests();
			displayMenu();
			int option = getOption();
			
			if(option == 1) {
				addGuest();
			}
			else if(option == 2) {
				insertGuest();
			}
			else if(option == 3) {
				renameGuest();
			}
			else if(option == 4) {
				removeGuest();
			}
			else if(option == 5) {
				System.out.println("Exiting...");
				break;
			}
		}while(true);
	
	}
	
	static void displayGuests() {
		System.out.println("-------------------------------\n- Guests -\n");
		boolean isEmpty = true;
		for (int i = 0; i < guests.length; i++) {
			if(guests[i] != null) {
				System.out.println((i+1) + ". " + guests[i]);
				isEmpty = false;
			}
		}
		if(isEmpty) {
			System.out.println("Guest list is empty");
		}
	}
	
	static void displayMenu() {
		System.out.println("-------------------------------\n- Menu -\n");
		System.out.println("1 - Add Guest");
		System.out.println("2 - Insert Guest");
		System.out.println("3 - Rename Guest");
		System.out.println("4 - Remove Guest");
		System.out.println("5 - Exit");
	}
	
	static int getOption() {
		System.out.println("Option: ");
		int option = sc.nextInt();
		sc.nextLine();
		System.out.println();
		return option;
	}
	
	
	static void addGuest() {
		for (int i = 0; i < guests.length; i++) {
			if(guests[i] == null) {
				System.out.println("Name: ");
				guests[i] = sc.nextLine();
				break;
			}
		}
	}
	
	static void insertGuest() {
		System.out.println("Number: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1 && num <= 10 && guests[num-1] != null) {
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			for (int i = guests.length - 1; i > num - 1; i--) {
				guests[i] = guests[i-1];
			}
			
			guests[num-1] = name;
		}else {
			System.out.println("\nError: There is no guest with that number");
		}
	}
	
	static void renameGuest() {
		System.out.println("Number: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1 && num <= 10 && guests[num-1] != null) {
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			guests[num-1] = name;
		}else {
			System.out.println("\nError: There is no guest with that number");
		}
	}
	
	static void removeGuest() {
		System.out.println("Number: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1 && num <= 10 && guests[num-1] != null) {
			guests[num-1] = null;
			
			String[]temp = new String[guests.length];
			int ti = 0;
			for (int i = 0; i < guests.length; i++) {
				if(guests[i] != null) {
					temp[ti] = guests[i];
					ti++;
				}
			}
			guests = temp;
		}else {
			System.out.println("\nError: There is no guest with that number");
		}
	}
	
	static void insertTestNames() {
		guests[0] = "Brian Baek";
		guests[1] = "Al Di Meola";
		guests[2] = "Chick Corea";
		guests[3] = "John Lennon";
		guests[4] = "Paul McCartney";
		guests[5] = "Lebron James";
		guests[6] = "Dwayne Wade";
		guests[7] = "Carmelo Anthony";
		guests[8] = "Kobe Bryant";
		guests[9] = "Michael Jordan";
	}
	

}
