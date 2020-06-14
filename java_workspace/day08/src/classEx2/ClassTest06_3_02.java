package classEx2;

import java.util.Scanner;

class BankAccount2 {
	private String name;
	private String accountNum;
	private int password;
	private int balance;

	static Scanner sc = new Scanner(System.in);

	public BankAccount2(String name, String accountNum, int password, int balance) {
		super();
		this.name = name;
		this.accountNum = accountNum;
		this.password = password;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	static void balance(BankAccount2[] ba, int index) {
		String userAccountNum = "";
		int userPw = 0;
		int cnt = 1;
		while (true) {
			System.out.println(ba[index - 1].name + "님의 계좌번호를 입력하세요");
			userAccountNum = sc.next();
			if (!userAccountNum.equals(ba[index - 1].accountNum)) {
				System.out.println("잘못된 계좌번호입니다. 다시 입력해주세요");
			} else {
				break;
			}
		}

		while (true) {
			System.out.println(ba[index - 1].name + "님의 비밀번호를 입력하세요(" + cnt + "회 시도)\n5회이상 틀리면 메뉴로 돌아갑니다");
			userPw = sc.nextInt();
			cnt++;
			if (userPw == ba[index - 1].password) {
				System.out.println(ba[index - 1].name + "님의 잔액은" + ba[index - 1].balance + "원 입니다");
				break;
			} else if (cnt == 6) {
				System.out.println("5회 이상 비밀번호가 틀렸습니다. 메뉴로 돌아갑니다");
				break;
			} else {
				System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요");
			}
		}
	}

	static void withdraw(BankAccount2[] ba, int index) {
		String userAccountNum = "";
		int withdrawAmount = 0;
		int userPw = 0;
		int cnt = 0;
		while (true) {
			System.out.println(ba[index - 1].name + "님의 계좌번호를 입력하세요");
			userAccountNum = sc.next();
			if (!userAccountNum.equals(ba[index - 1].accountNum)) {
				System.out.println("잘못된 계좌번호입니다. 다시 입력해주세요");
			} else {
				break;
			}
		}

		while (true) {
			System.out.println(ba[index - 1].name + "님의 비밀번호를 입력하세요(" + cnt + "회 시도)\n5회이상 틀리면 메뉴로 돌아갑니다");
			userPw = sc.nextInt();
			cnt++;
			if (userPw == ba[index - 1].password) {
				break;
			} else if (cnt == 6) {
				System.out.println("5회 이상 비밀번호가 틀렸습니다. 메뉴로 돌아갑니다");
				break;
			} else {
				System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요");
			}
		}

		while (true) {
			if (cnt == 6) {
				break;
			}
			System.out.println(ba[index - 1].name + "님의 현재 잔액은 " + ba[index - 1].balance + "원 입니다. 얼마를 인출하시겠습니까?");
			withdrawAmount = sc.nextInt();
			if (withdrawAmount <= ba[index - 1].balance) {
				ba[index - 1].balance -= withdrawAmount;
				System.out.println(withdrawAmount + "가 인출되었습니다. 남은 잔액은" + ba[index - 1].balance + "원 입니다");
				break;
			} else {
				System.out.println("인출하려는 금액이 잔액(" + ba[index - 1].balance + ")보다 많습니다.");
			}
		}

	}

	static void deposit(BankAccount2[] ba, int index) {
		String userAccountNum = "";
		int depositAmount = 0;
		int userPw = 0;
		int cnt = 0;
		while (true) {
			System.out.println(ba[index - 1].name + "님의 계좌번호를 입력하세요");
			userAccountNum = sc.next();
			if (!userAccountNum.equals(ba[index - 1].accountNum)) {
				System.out.println("잘못된 계좌번호입니다. 다시 입력해주세요");
			} else {
				break;
			}
		}

		while (true) {
			System.out.println(ba[index - 1].name + "님의 비밀번호를 입력하세요(" + cnt + "회 시도)\n5회이상 틀리면 메뉴로 돌아갑니다");
			userPw = sc.nextInt();
			cnt++;
			if (userPw == ba[index - 1].password) {
				break;
			} else if (cnt == 6) {
				System.out.println("5회 이상 비밀번호가 틀렸습니다. 메뉴로 돌아갑니다");
				break;
			} else {
				System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요");
			}
		}
		
		while (true) {
			if (cnt == 6) {
				break;
			}
			System.out.println(ba[index - 1].name + "님의 현재 잔액은 " + ba[index - 1].balance + "원 입니다. 얼마를 입금하시겠습니까?");
			depositAmount = sc.nextInt();
			if(depositAmount > 0) {
			ba[index - 1].balance += depositAmount;
			}
			System.out.println(depositAmount + "가 입금되었습니다. 현재 잔액은" + ba[index - 1].balance + "원 입니다");
			break;
		}

	}

}// class

public class ClassTest06_3_02 {

	static Scanner sc = new Scanner(System.in);

	void menu(BankAccount2[] ba) {
		int choice = 0;
		int index = 0;
		while (true) {
			System.out.println("1. 잔액 조회\n2. 인출하기\n3. 입금하기\n4. 종료");
			choice = sc.nextInt();
			if (choice == 4) {
				break;
			}
			switch (choice) {

			case 1:
				System.out.println("어느 분 통장 잔액을 조회 하시겠습니까? ");
				for (int i = 0; i < ba.length; i++) {
					System.out.println((i + 1) + ". " + ba[i].getName());
				}
				index = sc.nextInt();
				BankAccount2.balance(ba, index);
				break;
			case 2:
				System.out.println("어느 분 통장에서 인출 하시겠습니까? ");
				for (int i = 0; i < ba.length; i++) {
					System.out.println((i + 1) + ". " + ba[i].getName());
				}
				index = sc.nextInt();
				BankAccount2.withdraw(ba, index);
				break;

			case 3:
				System.out.println("어느 분 통장에 입금 하시겠습니까? ");
				for (int i = 0; i < ba.length; i++) {
					System.out.println((i + 1) + ". " + ba[i].getName());
				}
				index = sc.nextInt();
				BankAccount2.deposit(ba, index);
				break;

			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankAccount2[] ba = new BankAccount2[3];

		ba[0] = new BankAccount2("홍길동", "100-01", 1234, 1000);
		ba[1] = new BankAccount2("박문수", "100-02", 5678, 5000);
		ba[2] = new BankAccount2("이순신", "100-03", 9876, 10000);

		ClassTest06_3_02 ct = new ClassTest06_3_02();
		ct.menu(ba);
		
		
		
	}
}
