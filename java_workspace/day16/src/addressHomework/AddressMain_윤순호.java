package addressHomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * KOREA MARKET�� ȸ�� ���� ���� ���α׷��Դϴ�.
	System.out.println("��������������������������������������");
	System.out.println("��  KOREA MARKET�Դϴ�.             ��");
	System.out.println("��������������������������������������");
	System.out.println("��     �޴��� �������ּ���          ��");
	System.out.println("��������������������������������������");
	System.out.println("��  1. ��� ȸ�� ���� ����          ��");
	System.out.println("��  2. Ư�� ȸ�� ���� ����          ��");
	System.out.println("��  3. �ű� ȸ�� ���� ���          ��");
	System.out.println("��  4. ȸ�� ���� ���� �ϱ�          ��");
	System.out.println("��  5. ȸ�� ���� ���� �ϱ�          ��");
	System.out.println("��  6. ȸ�� ���� ���� �ϱ�          ��");
	System.out.println("��  0. ����  �ϱ�                   ��");
	System.out.println("��������������������������������������");
 * �� 6���� �޴��� �����Ͽ����ϴ�.
 * 1���� ��ϵ� ȸ������ ������ ��� ����մϴ�. for���� iterator�� �̿��߽��ϴ�.
 * 2���� Ư�� �ּҿ� �ش��ϴ� ȸ������ ����մϴ�. contains�� �̿��Ͽ� �ش� ȸ������ ã��, cpy ����Ʈ�� ���� �ش� ȸ������ ������ �ٷ� ������� �ʰ� ������ �� ���� ����߽��ϴ�. ���ʿ��ϰ� �ݺ��Ǵ� �κе��� �����ϰ��� �Ͽ����ϴ�.
 * 3���� ȸ�� ���� ����Դϴ�. add�޼��带 �̿��߽��ϴ�.
 * 4���� ȸ�� ���� �����Դϴ�. remove�� �̿��Ͽ���, scanner�� �̿��� �ش� ��ġ�� index���� �����ϴ� ������� �����߽��ϴ�.
 * 5���� ȸ�� ���� �����Դϴ�. remove�� �����ϰ� scanner�� �̿��� �ش� ��ġ�� index���� �����Ͽ����ϴ�.
 * ���� �ϳ����� ������ ��� setter�� �̿��Ͽ� ���� �����Ͽ���, ��� ������ ���� Address��ü�� ���� �����Ͽ� �� ��ü�� �����͸� �Է��� �ڿ� set�޼��带 ���� ���ڷ� �����ϴ� ������� �����߽��ϴ�.
 * 6���� ȸ�� ���� �����Դϴ�. �̸��� ���̸� �������� ���� ������������ ���ĵǵ��� �����߽��ϴ�.
 * �̸��� ������ ��� �̸��� ������ �ٽ� ���̸� ���Ͽ� �����ϰ�, ���̰� ������ ��� ���̰� ������ �ּҸ� ���Ͽ� �����մϴ�.
 */
public class AddressMain_����ȣ {
	public static void main(String[] args) { 
		new KoreaMarket().showMainMenu();
	}//end main
}//end class
class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class Person{
	private String name;//�̸�
	private int age;	//����
	//getter setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	//������
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void printUserInfo() {
		System.out.print("   \t"+name+"\t"+age+"��");
	}
}//end class Person
class Address extends Person{
	//��� ȸ���� '�����'�� �����Ѵٰ� �����Ͽ�, static final�� �����Ͽ����ϴ�.
	static final String si = "�����";	//��
	private String gu;							//��
	private String dong;						//��
	private String bunji;						//����
	private int member;							//��������
	//getter setter
	public String getGu() {return gu;}
	public void setGu(String gu) {this.gu = gu;}
	public String getDong() {return dong;}
	public void setDong(String dong) {this.dong = dong;}
	public String getBunji() {return bunji;}
	public void setBunji(String bunji) {this.bunji = bunji;}
	public int getMember() {return member;}
	public void setMember(int member) {this.member = member;}
	//������
	Address(String name, int age, String gu, String dong, String bunji, int member) {
		super(name, age);
		this.gu = gu;
		this.dong = dong;
		this.bunji = bunji;
		this.member = member;
	}
	Address(){
		super("",-1);
		this.gu = "";
		this.dong = "";
		this.member = -1;
		this.bunji = "";
	}
	@Override
	void printUserInfo() {
		super.printUserInfo();
		System.out.println("\t"+si+"\t"+gu+"\t"+dong+"\t"+bunji+"\t"+member+"��");
	}
}//end class Address
class KoreaMarket {
	static Scanner sc = new Scanner(System.in);
	//���� �޴�
	void showMainMenu() {
		int choice = -1;
		ArrayList<Address> user = new ArrayList<Address>();
		//5���� �⺻�� �Է�
		user.add(new Address("ȫ�浿",22,"������","������","111",2));
		user.add(new Address("��Ʃ��",40,"���ʱ�","���ʵ�","222",1));
		user.add(new Address("�ڹ���",27,"�����","��赿","333",3));
		user.add(new Address("�̼���",33,"������","���ﵿ","555",4));
		user.add(new Address("���̹�",18,"������","�Ｚ��","666",3));
		while(choice != 0) {
			System.out.println("��������������������������������������");
			System.out.println("��      KOREA MARKET�Դϴ�.         ��");
			System.out.println("��������������������������������������");
			System.out.println("��     �޴��� �������ּ���          ��");
			System.out.println("��������������������������������������");
			System.out.println("��  1. ��� ȸ�� ���� ����          ��");
			System.out.println("��  2. Ư�� ȸ�� ���� ����          ��");
			System.out.println("��  3. �ű� ȸ�� ���� ���          ��");
			System.out.println("��  4. ȸ�� ���� ���� �ϱ�          ��");
			System.out.println("��  5. ȸ�� ���� ���� �ϱ�          ��");
			System.out.println("��  6. ȸ�� ���� ���� �ϱ�          ��");
			System.out.println("��  0. ����  �ϱ�                   ��");
			System.out.println("��������������������������������������");
			System.out.print("      �Է� : "); choice = sc.nextInt();
			switch(choice) {
			case 1: AllCheckUserInfo(user); break;	//��� ȸ�� ���� ����
			case 2: checkUserInfo(user); break;		//Ư�� ȸ�� ���� ����
			case 3: createUserInfo(user); break;	//�ű� ȸ�� ���� ���
			case 4: deleteUserInfo(user); break;	//ȸ�� ���� ���� �ϱ�
			case 5: updateUserInfo(user); break;	//ȸ�� ���� ���� �ϱ�
			case 6: orderUserInfo(user); break;		//ȸ�� ���� ���� �ϱ�
			}//end switch
		}//end while
		System.out.println("����������������������������������������������");
		System.out.println("         ���α׷��� �����մϴ�.");
		System.out.println("����������������������������������������������");
	}//end showMainMenu
	//Ư�� ȸ�� ���� ���
	private void checkUserInfo(ArrayList<Address> user) {
		String search = "";
		int cnt = 0, checkNum = 0;
		ArrayList<Address> cpy = new ArrayList<Address>();
		System.out.println("��������������������������������������������������������");
		System.out.println("     �ּҸ� ���ؼ� Ư�� ȸ���� ������ ����մϴ�.");
		System.out.print("     ã���� ���� ���� �Է��� �ּ��� : "); search = sc.next();
		System.out.println("��������������������������������������������������������");
		for(Address str : user) {
			if(str.getGu().contains(search) || str.getDong().contains(search)) {
				cpy.add(str);
			}else {
				checkNum++;
			}//end if
		}//end for
		if(checkNum == user.size()) {
			System.out.println("��������������������������������������������������������");
			System.out.println("            ��ġ�ϴ� ������ �����ϴ�.");
			System.out.println("��������������������������������������������������������");
		}else {
			System.out.println("��������������������������������������������������������������������������������");
			System.out.println("    "+search+" ȸ������ ������ ����մϴ�.");
			System.out.println("       ��ȣ\t �̸�\t����\t  ��\t  ��\t  ��\t����\t��������");
			for(Address str : cpy) {
				System.out.print("\t"+(++cnt)+"��");
				str.printUserInfo();
			}//end for
			System.out.println("��������������������������������������������������������������������������������");
		}//end if
	}//end checkUserInfo
	//��� ȸ�� ���� ���
	private void AllCheckUserInfo(ArrayList<Address> user) {
		int cnt = 0;
		//for�� �̿�
		//		System.out.println("������������������������������������������������������������������������������������������������������������������������������");
		//		System.out.println("       ��ȣ\t �̸�\t����\t  ��\t  ��\t  ��\t����\t��������");
		//		for(Address users : user) {
		//			System.out.print("   "+(++cnt)+"��");
		//			users.printUserInfo();
		//		}//end for
		//		System.out.println("������������������������������������������������������������������������������������������������������������������������������");
		//iterator �̿�
		Iterator<Address> itr = user.iterator();
		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("       ��ȣ\t �̸�\t����\t  ��\t  ��\t  ��\t����\t��������");
		while(itr.hasNext()) {
			System.out.print("\t"+(++cnt)+"��");
			itr.next().printUserInfo();;
		}//end while
		System.out.println("��������������������������������������������������������������������������������");
	}//end AllCheckUserInfo
	//�ű� ȸ�� ���� ���
	private void createUserInfo(ArrayList<Address> user) {
		String name = "",gu = "",dong = "",bunji = "";
		int age = 0, member = 0;
		System.out.println("��������������������������������������������������������");
		System.out.println("           �ű� ȸ���� ������ ����մϴ�.");
		System.out.println("��������������������������������������������������������");
		System.out.print("�̸��� �Է����ּ��� : "); name = sc.next();
		System.out.print("���̸� �Է����ּ��� : "); age = sc.nextInt();
		System.out.print("���� �Է��� �ּ���.\n(������, ���ʱ�, �����, ������) �߿��� �Է��� �ּ��� : "); gu = sc.next();
		System.out.print("���� �Է��� �ּ��� : "); dong = sc.next();
		System.out.print("������ �Է����ּ��� : "); bunji = sc.next();
		System.out.print("���������� �Է����ּ��� : "); member = sc.nextInt();
		user.add(new Address(name,age,gu,dong,bunji,member));
	}//end createUserInfo
	//ȸ�� ���� ���� �ϱ�
	private void deleteUserInfo(ArrayList<Address> user) {
		int delNum = 0;
		printUserName(user);
		while(true) {
			try {
				System.out.println("��������������������������������������������");
				System.out.print("    �� ��° ȸ���� �����Ͻðڽ��ϱ�?"); delNum = sc.nextInt();
				if(delNum < 0) throw new MyException("\t0���� ū ���� �Է����ּ���.");
				System.out.println("��������������������������������������������");
				break;
			}catch(MyException e) {
				System.out.println(e.getMessage());
				System.out.println("��������������������������������������������");
			}catch(Exception e) {
				System.out.println("\t  ������ �Է����ּ���.");
				System.out.println("��������������������������������������������");
				sc.nextLine();
			}//end try
		}//end while
		//�����Ϸ��� ȸ���� ��ġ�� �Էµ� ȸ�������� ���� ��� Ȯ��
		System.out.println("��������������������������������������������");
		if(delNum > user.size() || delNum < 0) {
			System.out.println("  "+delNum+"��° ��ġ�� ȸ�� ������ �����ϴ�.");
			System.out.println("      ������ ȸ���� ������ �����մϴ�.");
			System.out.println("     "+user.get(user.size()-1).getName()+" ȸ������ ������ �����մϴ�.");
			user.remove(user.size()-1);
		}else {
			System.out.println("     "+user.get(delNum-1).getName()+" ȸ������ ������ �����մϴ�.  "); 
			user.remove(delNum-1);
		}
		System.out.println("��������������������������������������������");
	}//end deleteUserInfo
	//ȸ�� ���� ���� �ϱ�
	private void updateUserInfo(ArrayList<Address> user) {
		String name = "",gu = "",dong = "",bunji = "";
		int age = 0, member = 0,select = 0;
		int changeNum = 0;
//		printUserName(user);		//ȸ���� �̸� ���ٴ� ��ü �����͸� ����� �ִ� ���� ���� ����
		AllCheckUserInfo(user);
		while(true) {
			try {
				System.out.println("����������������������������������������������������");
				System.out.print("    ���° ȸ���� �����͸� �����Ͻðڽ��ϱ�?"); changeNum = sc.nextInt();
				if(changeNum < 0) throw new MyException("\t     0���� ū ���� �Է����ּ���.");
				System.out.println("����������������������������������������������������");
				break;
			}catch(MyException e) {
				System.out.println(e.getMessage());
				System.out.println("����������������������������������������������������");
			}catch(Exception e) {
				System.out.println("\t     ������ �Է����ּ���.");
				System.out.println("����������������������������������������������������");
				sc.nextLine();
			}//end try
		}//end while
		System.out.println("��������������������������������������������������������������������������������������");
		//�����Ϸ��� ȸ���� ��ġ�� �Էµ� ȸ�������� ���� ��� Ȯ��
		if(changeNum > user.size()) {
			System.out.println("\t  "+changeNum+"��° ��ġ�� ȸ�� ������ �����ϴ�.");
			System.out.println("\t      ������ ȸ���� ������ �����մϴ�.");
			changeNum = user.size();
		}//end if
		System.out.println("\t"+user.get(changeNum-1).getName()+" ȸ������ � ������ �����Ͻðڽ��ϱ�?");
		System.out.println("  1.�̸�     2.����     3.��     4.��     5.����     6.��������     7.��� ����");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.print("\t�Է� : "); select = sc.nextInt();
		System.out.println("����������������������������������������������");
		switch(select) {
		case 1:
			System.out.print("     ������ �̸��� �Է����ּ���  : "); name = sc.next();
			user.get(changeNum-1).setName(name);
			break;
		case 2:
			System.out.print("     ������ ���̸� �Է����ּ���  : "); age = sc.nextInt();
			user.get(changeNum-1).setAge(age);
			break;
		case 3:
			System.out.print("     ������ �ּ�(��)�� �Է����ּ���  : "); gu = sc.next();
			user.get(changeNum-1).setGu(gu);
			break;
		case 4:
			System.out.print("     ������ �ּ�(��)�� �Է����ּ���  : "); dong = sc.next();
			user.get(changeNum-1).setDong(dong);
			break;
		case 5:
			System.out.print("     ������ �������� �Է����ּ���  : "); bunji = sc.next();
			user.get(changeNum-1).setBunji(bunji);
			break;
		case 6:
			System.out.print("     ������ ���������� �Է����ּ���  : "); member = sc.nextInt();
			user.get(changeNum-1).setMember(member);
			break;
		case 7:
			System.out.print("     ������ �̸��� �Է����ּ���  : "); name = sc.next();
			System.out.print("     ������ ���̸� �Է����ּ���  : "); age = sc.nextInt();
			System.out.print("     ������ �ּ�(��)�� �Է����ּ���  : "); gu = sc.next();
			System.out.print("     ������ �ּ�(��)�� �Է����ּ���  : "); dong = sc.next();
			System.out.print("     ������ �������� �Է����ּ���  : "); bunji = sc.next();
			System.out.print("     ������ ���������� �Է����ּ���  : "); member = sc.nextInt();
			Address tmp= new Address(name,age,gu,dong,bunji,member);
			user.set(changeNum-1, tmp);
		}//end switch
		System.out.println("����������������������������������������������");
	}//end changeUserInfo
	//ȸ�� ���� ���� �ϱ�
	private void orderUserInfo(ArrayList<Address> user) {  
		int orderNum = 0;
		Address tmp;
		while(true) {
			try {
				System.out.println("������������������������������������������������������������������������������������������");
				System.out.println("��\t� ������ �������� �����Ͻðڽ��ϱ�?(�������� ����)\t\t\t\t��");
				System.out.println("��    ������������ �����ϸ�,�� ������ ������ ��� ���� �������� �߰��� ���մϴ�     ��");
				System.out.println("������������������������������������������������������������������������������������������");
				System.out.print("   1.�̸�\n   2.����\n   �Է�   :  ");	orderNum = sc.nextInt();
				if(orderNum < 0 || orderNum > 2) throw new MyException("\t1, 2�� �߿��� �Է��� �ּ���.");
				break;
			}catch(MyException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println("\t������ �Է����ּ���.");
				sc.nextLine();
			}//end try
		}//end while
		switch(orderNum) {
		case 1:
			for(int i = 0;i<user.size()-1;i++) {
				for(int j = i+1;j<user.size();j++) {
					int check = user.get(i).getName().compareToIgnoreCase(user.get(j).getName());
					if(check > 0){											//���� �̸��� �� ���� �̸����� �� �տ� �ִٸ�,
						tmp = user.get(i);
						user.set(i, user.get(j));
						user.set(j, tmp);
					}else if(check == 0) {									//�� �̸��� �Ȱ��ٸ�,
						if(user.get(i).getAge() >= user.get(j).getAge()) {	//�� ����� ���̸� ���մϴ�.
							tmp = user.get(i);
							user.set(i, user.get(j));
							user.set(j, tmp);
						}//end if
					}//end if
				}//end for(j)
			}//end for(i)
			System.out.println("��������������������������������������������������������");
			System.out.println("        �̸��� �������� �������� �����մϴ�");
			System.out.println("��������������������������������������������������������");
			break;
		case 2:
			for(int i = 0;i<user.size()-1;i++) {
				for(int j = i+1;j<user.size();j++) {
					if(user.get(i).getAge() > user.get(j).getAge()){				//�� ����� ���̸� ��
						tmp = user.get(i);
						user.set(i, user.get(j));
						user.set(j, tmp);
					}else if(user.get(i).getAge() == user.get(j).getAge()) {						//�� ����� ���̰� �Ȱ��ٸ�
						int check = user.get(i).getGu().compareToIgnoreCase(user.get(j).getGu());	//�� ����� ���� ���մϴ�.
						if(check > 0) {
							tmp = user.get(i);
							user.set(i, user.get(j));
							user.set(j, tmp);
						}else if(check == 0) {																//�� ����� ���� �Ȱ��ٸ�
							int check2 = user.get(i).getDong().compareToIgnoreCase(user.get(j).getDong());	//�� ����� ���� ���մϴ�.
							if(check2 > 0) {
								tmp = user.get(i);
								user.set(i, user.get(j));
								user.set(j, tmp);
							}//end if - 3
						}//end if - 2
					}//end if - 1
				}//end for(j)
			}//end for(i)
			System.out.println("��������������������������������������������������������");
			System.out.println("        ���̸� �������� �������� �����մϴ�");
			System.out.println("��������������������������������������������������������");
			break;
		}//end switch
	}//end orderUserInfo
	//���� ��ϵ� ȸ���� �̸��� ���
	private void printUserName(ArrayList<Address> user) {
		int cnt = 0;
		System.out.println("����������������������������");
		System.out.println("     ���� ��ϵ� ȸ��");
		for(Address users : user) {
			System.out.println("     "+(++cnt)+"�� : "+users.getName());
		}//end for
		System.out.println("����������������������������");
	}//end printUserName
}//end KoreaMarket


