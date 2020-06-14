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
			System.out.println(ba[index - 1].name + "���� ���¹�ȣ�� �Է��ϼ���");
			userAccountNum = sc.next();
			if (!userAccountNum.equals(ba[index - 1].accountNum)) {
				System.out.println("�߸��� ���¹�ȣ�Դϴ�. �ٽ� �Է����ּ���");
			} else {
				break;
			}
		}

		while (true) {
			System.out.println(ba[index - 1].name + "���� ��й�ȣ�� �Է��ϼ���(" + cnt + "ȸ �õ�)\n5ȸ�̻� Ʋ���� �޴��� ���ư��ϴ�");
			userPw = sc.nextInt();
			cnt++;
			if (userPw == ba[index - 1].password) {
				System.out.println(ba[index - 1].name + "���� �ܾ���" + ba[index - 1].balance + "�� �Դϴ�");
				break;
			} else if (cnt == 6) {
				System.out.println("5ȸ �̻� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �޴��� ���ư��ϴ�");
				break;
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}

	static void withdraw(BankAccount2[] ba, int index) {
		String userAccountNum = "";
		int withdrawAmount = 0;
		int userPw = 0;
		int cnt = 0;
		while (true) {
			System.out.println(ba[index - 1].name + "���� ���¹�ȣ�� �Է��ϼ���");
			userAccountNum = sc.next();
			if (!userAccountNum.equals(ba[index - 1].accountNum)) {
				System.out.println("�߸��� ���¹�ȣ�Դϴ�. �ٽ� �Է����ּ���");
			} else {
				break;
			}
		}

		while (true) {
			System.out.println(ba[index - 1].name + "���� ��й�ȣ�� �Է��ϼ���(" + cnt + "ȸ �õ�)\n5ȸ�̻� Ʋ���� �޴��� ���ư��ϴ�");
			userPw = sc.nextInt();
			cnt++;
			if (userPw == ba[index - 1].password) {
				break;
			} else if (cnt == 6) {
				System.out.println("5ȸ �̻� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �޴��� ���ư��ϴ�");
				break;
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���");
			}
		}

		while (true) {
			if (cnt == 6) {
				break;
			}
			System.out.println(ba[index - 1].name + "���� ���� �ܾ��� " + ba[index - 1].balance + "�� �Դϴ�. �󸶸� �����Ͻðڽ��ϱ�?");
			withdrawAmount = sc.nextInt();
			if (withdrawAmount <= ba[index - 1].balance) {
				ba[index - 1].balance -= withdrawAmount;
				System.out.println(withdrawAmount + "�� ����Ǿ����ϴ�. ���� �ܾ���" + ba[index - 1].balance + "�� �Դϴ�");
				break;
			} else {
				System.out.println("�����Ϸ��� �ݾ��� �ܾ�(" + ba[index - 1].balance + ")���� �����ϴ�.");
			}
		}

	}

	static void deposit(BankAccount2[] ba, int index) {
		String userAccountNum = "";
		int depositAmount = 0;
		int userPw = 0;
		int cnt = 0;
		while (true) {
			System.out.println(ba[index - 1].name + "���� ���¹�ȣ�� �Է��ϼ���");
			userAccountNum = sc.next();
			if (!userAccountNum.equals(ba[index - 1].accountNum)) {
				System.out.println("�߸��� ���¹�ȣ�Դϴ�. �ٽ� �Է����ּ���");
			} else {
				break;
			}
		}

		while (true) {
			System.out.println(ba[index - 1].name + "���� ��й�ȣ�� �Է��ϼ���(" + cnt + "ȸ �õ�)\n5ȸ�̻� Ʋ���� �޴��� ���ư��ϴ�");
			userPw = sc.nextInt();
			cnt++;
			if (userPw == ba[index - 1].password) {
				break;
			} else if (cnt == 6) {
				System.out.println("5ȸ �̻� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �޴��� ���ư��ϴ�");
				break;
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���");
			}
		}
		
		while (true) {
			if (cnt == 6) {
				break;
			}
			System.out.println(ba[index - 1].name + "���� ���� �ܾ��� " + ba[index - 1].balance + "�� �Դϴ�. �󸶸� �Ա��Ͻðڽ��ϱ�?");
			depositAmount = sc.nextInt();
			if(depositAmount > 0) {
			ba[index - 1].balance += depositAmount;
			}
			System.out.println(depositAmount + "�� �ԱݵǾ����ϴ�. ���� �ܾ���" + ba[index - 1].balance + "�� �Դϴ�");
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
			System.out.println("1. �ܾ� ��ȸ\n2. �����ϱ�\n3. �Ա��ϱ�\n4. ����");
			choice = sc.nextInt();
			if (choice == 4) {
				break;
			}
			switch (choice) {

			case 1:
				System.out.println("��� �� ���� �ܾ��� ��ȸ �Ͻðڽ��ϱ�? ");
				for (int i = 0; i < ba.length; i++) {
					System.out.println((i + 1) + ". " + ba[i].getName());
				}
				index = sc.nextInt();
				BankAccount2.balance(ba, index);
				break;
			case 2:
				System.out.println("��� �� ���忡�� ���� �Ͻðڽ��ϱ�? ");
				for (int i = 0; i < ba.length; i++) {
					System.out.println((i + 1) + ". " + ba[i].getName());
				}
				index = sc.nextInt();
				BankAccount2.withdraw(ba, index);
				break;

			case 3:
				System.out.println("��� �� ���忡 �Ա� �Ͻðڽ��ϱ�? ");
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

		ba[0] = new BankAccount2("ȫ�浿", "100-01", 1234, 1000);
		ba[1] = new BankAccount2("�ڹ���", "100-02", 5678, 5000);
		ba[2] = new BankAccount2("�̼���", "100-03", 9876, 10000);

		ClassTest06_3_02 ct = new ClassTest06_3_02();
		ct.menu(ba);
		
		
		
	}
}
