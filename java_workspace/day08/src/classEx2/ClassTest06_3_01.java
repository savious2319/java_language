package classEx2;

import java.util.Scanner;

class BankAccount {
	private String name;
	private String accountNum;
	private int password;
	private int balance;

	static Scanner sc = new Scanner(System.in);

	public BankAccount(String name, String accountNum, int password, int balance) {
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

	void printBalance() {
		String userAccountNum = "";
		int userPw = 0;
		int cnt = 0;
			while(true) {
			if (cnt == 0) {
				System.out.print(name + "님의 계좌번호를 입력하세요  : ");
				userAccountNum = sc.next();
			}
			if(!userAccountNum.equals(accountNum)){
				System.out.println("없는 계좌번호입니다. 다시 입력해주세요");
			}
				if(userAccountNum.equals(accountNum)) {
					System.out.print(name + "님의 비밀번호를 입력하세요  : \n(" + cnt + "회 시도)\n5회이상 틀리면 메뉴로 돌아갑니다.\n");
					userPw = sc.nextInt();
					if(userPw == password) {
					System.out.println(name + "님의 현재 잔액은 " + balance + "원 입니다");
					break;
					}else {
						cnt++;
						if (cnt != 6) {
							System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요");
						}
						if (cnt == 6) {
						System.out.println("5회 이상 비밀번호가 틀렸습니다. 메뉴로 돌아갑니다");
						break;
						}
					}
				}	
			}//while
	}//end method
void withdraw() {
		String userAccountNum = "";
		int withdrawAmount = 0;
		int userPw = 0;
		int cnt = 0;
		while(true) {
				System.out.print(name + "님의 계좌번호를 입력하세요  : ");
				userAccountNum = sc.next();
				if(userAccountNum.equals(accountNum)) {break;}
				else {
				System.out.println("없는 계좌번호입니다. 다시 입력해주세요");
			    }
		}	
		
		while(true) {
				System.out.print(name + "님의 비밀번호를 입력하세요  : \n(" + cnt + "회 시도)\n5회이상 틀리면 메뉴로 돌아갑니다");
				userPw = sc.nextInt();
				if(userPw == password) {break;}
				else{
					cnt++;
					if(cnt != 6) {
					System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요");
					}
					if (cnt == 6) {
					System.out.println("5회 이상 비밀번호가 틀렸습니다. 메뉴로 돌아갑니다");
					break;
					}
					
				}
		}
		
		while(true) {
				if(cnt == 6) {break;}
				System.out.println(name + "님의 현재 잔액은 " + balance + "원 입니다. 얼마를 인출하시겠습니까?");
					withdrawAmount = sc.nextInt();
					if(withdrawAmount <= balance) {
						balance -= withdrawAmount;
						System.out.println(withdrawAmount +"가 인출되었습니다. 남은 잔액은" + balance + "원 입니다");
						break;
					}else {
						System.out.println("인출하려는 금액이 잔액(" +balance+")보다 많습니다.");
					}
		}	
					
}

void deposit() {
	String userAccountNum = "";
	int depositAmount = 0;
	int userPw = 0;
	int cnt = 0;
	while(true) {
			System.out.print(name + "님의 계좌번호를 입력하세요  : ");
			userAccountNum = sc.next();
			if(userAccountNum.equals(accountNum)) {break;}
			else {
			System.out.println("없는 계좌번호입니다. 다시 입력해주세요");
		    }
	}	
	
	while(true) {
			System.out.print(name + "님의 비밀번호를 입력하세요  : \n(" + cnt + "회 시도)\n5회이상 틀리면 메뉴로 돌아갑니다");
			userPw = sc.nextInt();
			if(userPw == password) {break;}
			else{
				cnt++;
				if(cnt != 6) {
				System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요");
				}
				if (cnt == 6) {
				System.out.println("5회 이상 비밀번호가 틀렸습니다. 메뉴로 돌아갑니다");
				break;
				}
				
			}
	}
	while(true) {
			if(cnt == 6) {break;}
			System.out.println(name + "님의 현재 잔액은 " + balance + "원 입니다. 얼마를 입금하시겠습니까?");
				depositAmount = sc.nextInt();
					balance += depositAmount;
					System.out.println(depositAmount +"가 입금되었습니다. 현재 잔액은" + balance + "원 입니다");
					break;
	}	
	
}

static void printAccountInfo() {
	
	
}

static void menu(BankAccount hgd,BankAccount pms,BankAccount iss) {
	int choice = 0;
	int choiceNum = 0;
	while(true) {
	System.out.println("1. 잔액 조회\n2. 인출하기\n3. 입금하기\n4. 종료");
	choice = sc.nextInt();
	if(choice == 4) {break;}
	switch(choice) {
	
	case 1: System.out.println("어느 분 잔액을 조회 할까요? \n1. 홍길동\n2. 박문수\n3. 이순신");
			choiceNum = sc.nextInt();
			if(choiceNum == 1) {hgd.printBalance();}
			if(choiceNum == 2) {pms.printBalance();}
			if(choiceNum == 3) {iss.printBalance();}
			break;
	case 2: System.out.println("어느 분 계좌에서 인출 할까요? \n1. 홍길동\n2. 박문수\n3. 이순신");
			choiceNum = sc.nextInt();
			if(choiceNum == 1) {hgd.withdraw();}
			if(choiceNum == 2) {pms.withdraw();}
			if(choiceNum == 3) {iss.withdraw();}
			break;
		
	case 3: System.out.println("어느 분 계좌에 입금 할까요? \n1. 홍길동\n2. 박문수\n3. 이순신");
			choiceNum = sc.nextInt();
			if(choiceNum == 1) {hgd.deposit();}
			if(choiceNum == 2) {pms.deposit();}
			if(choiceNum == 3) {iss.deposit();}
			break;
	
	}
	
	}
	
	
}

}//class
	
	/*
	 * 기능 잔액 조회: balance 인출하기 : withdraw 입금하기 : deposit
	 */

public class ClassTest06_3_01 {
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount hgd = new BankAccount("홍길동", "100-01", 1234, 1000);
		BankAccount pms = new BankAccount("박문수", "100-02", 5678, 5000);
		BankAccount iss = new BankAccount("이순신", "100-03", 9876, 10000);
		
//		BankAccount [] ba = new BankAccount [3];
//		
//		ba[0] = new BankAccount("홍길동", "100-01", 1234, 1000);
//		ba[1] = new BankAccount("박문수", "100-02", 5678, 5000);
//		ba[2] = new BankAccount("이순신", "100-03", 9876, 10000);
		
		
		BankAccount.menu(hgd, pms, iss);
		
		
		
		
		

	}
}
