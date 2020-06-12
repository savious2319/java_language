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
				System.out.print(name + "���� ���¹�ȣ�� �Է��ϼ���  : ");
				userAccountNum = sc.next();
			}
			if(!userAccountNum.equals(accountNum)){
				System.out.println("���� ���¹�ȣ�Դϴ�. �ٽ� �Է����ּ���");
			}
				if(userAccountNum.equals(accountNum)) {
					System.out.print(name + "���� ��й�ȣ�� �Է��ϼ���  : \n(" + cnt + "ȸ �õ�)\n5ȸ�̻� Ʋ���� �޴��� ���ư��ϴ�.\n");
					userPw = sc.nextInt();
					if(userPw == password) {
					System.out.println(name + "���� ���� �ܾ��� " + balance + "�� �Դϴ�");
					break;
					}else {
						cnt++;
						if (cnt != 6) {
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���");
						}
						if (cnt == 6) {
						System.out.println("5ȸ �̻� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �޴��� ���ư��ϴ�");
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
				System.out.print(name + "���� ���¹�ȣ�� �Է��ϼ���  : ");
				userAccountNum = sc.next();
				if(userAccountNum.equals(accountNum)) {break;}
				else {
				System.out.println("���� ���¹�ȣ�Դϴ�. �ٽ� �Է����ּ���");
			    }
		}	
		
		while(true) {
				System.out.print(name + "���� ��й�ȣ�� �Է��ϼ���  : \n(" + cnt + "ȸ �õ�)\n5ȸ�̻� Ʋ���� �޴��� ���ư��ϴ�");
				userPw = sc.nextInt();
				if(userPw == password) {break;}
				else{
					cnt++;
					if(cnt != 6) {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���");
					}
					if (cnt == 6) {
					System.out.println("5ȸ �̻� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �޴��� ���ư��ϴ�");
					break;
					}
					
				}
		}
		
		while(true) {
				if(cnt == 6) {break;}
				System.out.println(name + "���� ���� �ܾ��� " + balance + "�� �Դϴ�. �󸶸� �����Ͻðڽ��ϱ�?");
					withdrawAmount = sc.nextInt();
					if(withdrawAmount <= balance) {
						balance -= withdrawAmount;
						System.out.println(withdrawAmount +"�� ����Ǿ����ϴ�. ���� �ܾ���" + balance + "�� �Դϴ�");
						break;
					}else {
						System.out.println("�����Ϸ��� �ݾ��� �ܾ�(" +balance+")���� �����ϴ�.");
					}
		}	
					
}

void deposit() {
	String userAccountNum = "";
	int depositAmount = 0;
	int userPw = 0;
	int cnt = 0;
	while(true) {
			System.out.print(name + "���� ���¹�ȣ�� �Է��ϼ���  : ");
			userAccountNum = sc.next();
			if(userAccountNum.equals(accountNum)) {break;}
			else {
			System.out.println("���� ���¹�ȣ�Դϴ�. �ٽ� �Է����ּ���");
		    }
	}	
	
	while(true) {
			System.out.print(name + "���� ��й�ȣ�� �Է��ϼ���  : \n(" + cnt + "ȸ �õ�)\n5ȸ�̻� Ʋ���� �޴��� ���ư��ϴ�");
			userPw = sc.nextInt();
			if(userPw == password) {break;}
			else{
				cnt++;
				if(cnt != 6) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���");
				}
				if (cnt == 6) {
				System.out.println("5ȸ �̻� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �޴��� ���ư��ϴ�");
				break;
				}
				
			}
	}
	while(true) {
			if(cnt == 6) {break;}
			System.out.println(name + "���� ���� �ܾ��� " + balance + "�� �Դϴ�. �󸶸� �Ա��Ͻðڽ��ϱ�?");
				depositAmount = sc.nextInt();
					balance += depositAmount;
					System.out.println(depositAmount +"�� �ԱݵǾ����ϴ�. ���� �ܾ���" + balance + "�� �Դϴ�");
					break;
	}	
	
}

static void printAccountInfo() {
	
	
}

static void menu(BankAccount hgd,BankAccount pms,BankAccount iss) {
	int choice = 0;
	int choiceNum = 0;
	while(true) {
	System.out.println("1. �ܾ� ��ȸ\n2. �����ϱ�\n3. �Ա��ϱ�\n4. ����");
	choice = sc.nextInt();
	if(choice == 4) {break;}
	switch(choice) {
	
	case 1: System.out.println("��� �� �ܾ��� ��ȸ �ұ��? \n1. ȫ�浿\n2. �ڹ���\n3. �̼���");
			choiceNum = sc.nextInt();
			if(choiceNum == 1) {hgd.printBalance();}
			if(choiceNum == 2) {pms.printBalance();}
			if(choiceNum == 3) {iss.printBalance();}
			break;
	case 2: System.out.println("��� �� ���¿��� ���� �ұ��? \n1. ȫ�浿\n2. �ڹ���\n3. �̼���");
			choiceNum = sc.nextInt();
			if(choiceNum == 1) {hgd.withdraw();}
			if(choiceNum == 2) {pms.withdraw();}
			if(choiceNum == 3) {iss.withdraw();}
			break;
		
	case 3: System.out.println("��� �� ���¿� �Ա� �ұ��? \n1. ȫ�浿\n2. �ڹ���\n3. �̼���");
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
	 * ��� �ܾ� ��ȸ: balance �����ϱ� : withdraw �Ա��ϱ� : deposit
	 */

public class ClassTest06_3_01 {
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount hgd = new BankAccount("ȫ�浿", "100-01", 1234, 1000);
		BankAccount pms = new BankAccount("�ڹ���", "100-02", 5678, 5000);
		BankAccount iss = new BankAccount("�̼���", "100-03", 9876, 10000);
		
//		BankAccount [] ba = new BankAccount [3];
//		
//		ba[0] = new BankAccount("ȫ�浿", "100-01", 1234, 1000);
//		ba[1] = new BankAccount("�ڹ���", "100-02", 5678, 5000);
//		ba[2] = new BankAccount("�̼���", "100-03", 9876, 10000);
		
		
		BankAccount.menu(hgd, pms, iss);
		
		
		
		
		

	}
}
