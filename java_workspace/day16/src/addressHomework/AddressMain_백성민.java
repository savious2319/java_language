package addressHomework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 	�ּ� ã�� ����
 	����) �迭�� 5���� �ּҸ� �Է��� ���� �����ߴ�!
 	
 	=> �⺻ 2�� �ּҰ� �Է��� ����
 		����� ������ ������ 111
 		����� ���ʱ� ���ʵ� 222
 		
 	=> 3��° ���ʹ� �߰��� �� �ִ�!
 	
 	=> ��Ŭ���� 
 	class Address{
 		String si;
 		String gu;
 		String dong;
 		int bunji;		// 111, 222, 333, 444...
 	
 		// equals(), contains()
 		searchDong(){}		// �Է� : 00�� -> ������ �� ���� �Դϴ�!
 		
 		// add()
 		insertDong(){}		// ���ο� �ּ� �߰� -> �ø� �Է��ϼ���
 												-> ���� �Է��ϼ���
 												-> ���� �Է��ϼ���
 												-> ������ �Է��ϼ���
 		// set()										
 		update(){}			// ���� �ּ� ����	-> 00�� ���� : 
 												-> 00�� ���� :
 												-> 00�� ���� :
 												-> 00���� ���� :
 		//remove()										
 		delete(){}			// ���� �ּ� ����
 		
 		//����for�� toString() �������̵�
 		allAddress(){}		// ��� �ּ� ����
 		}
 		
 	=> ArrayList<Address> list = new ArrayList<Address>();
 		list.add(������ ������);
 		list.add(���ʱ� ���ʵ�);
 		
 		
 */

class MyException extends Exception {

	public MyException(String msg) {
		// �θ𿡰� msg�� ������ ���� -> �θ� ���� �ִ� getMessage() �޼��尡
		// msg�� ����� �ټ� �ִ�.
		super(msg);
	}

}

class Address {
	static Scanner sc = new Scanner(System.in);
	String si;
	String gu;
	String dong;
	int bunji;

	public String getSi() {
		return si;
	}

	public String getGu() {
		return gu;
	}

	public String getDong() {
		return dong;
	}

	public int getBunji() {
		return bunji;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public void setGu(String gu) {
		this.gu = gu;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public void setBunji(int bunji) {
		this.bunji = bunji;
	}

	public Address() {

	}

	public Address(String si, String gu, String dong, int bunji) {
		super();
		this.si = si;
		this.gu = gu;
		this.dong = dong;
		this.bunji = bunji;
	}

	@Override
	public String toString() {
		return si + " " + gu + " " + dong + " " + bunji;

	}

	void searchDong(ArrayList<Address> list) {
		// Iterator<Address> iter = list.iterator();
		if (list.size() == 0) {
			System.out.println("�Էõ� �ּҰ� �����ϴ�. ���� �ּҸ� �߰��� �ּ���\n");
			return;
		}
		String search = "";
		while (true) {
			boolean check = false;
			System.out.print("ã�����ϴ� �� �Է�(���� q) : ");
			search = sc.next();
			if (search.equals("q")) {
				System.out.println();
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDong().equals(search)) {

					System.out.println(search + " ������ " + list.get(i).getBunji() + "���� �Դϴ�\n");
					check = true;
				}
			}
			if (!check) {
				System.out.println("�ش� �ּ��� ������ ã�� �� �����ϴ�\n");
			}
//			for (Address address : list) {
//				if (address.getDong().equals(search)) {
//					System.out.println(search + "������ " + address.getBunji() + "���� �Դϴ�\n");
//					check = true;
//				} 
//			}
//			if (!check) {
//				System.out.println("�ش� �ּ��� ������ ã�� �� �����ϴ�\n");
//			}
//			while(iter.hasNext()) {
//				if (iter.)
//				System.out.println(iter.next());
//			}
		}
	}

	void addDong(ArrayList<Address> list) {
//		String si = "";
//		String gu = "";
//		String dong = "";
//		int bunji = 0;
		while(true) {
		Address address = new Address();
		System.out.println("�ø� �Է��ϼ���");
		address.setSi(sc.next());
		// si = sc.next();
		System.out.println("���� �Է��ϼ���");
		address.setGu(sc.next());
		// gu = sc.next();
		System.out.println("���� �Է��ϼ���");
		// dong = sc.next();
		address.setDong(sc.next());
		System.out.println("������ �Է��ϼ���");
		// bunji = sc.nextInt();
		address.setBunji(sc.nextInt());
		// Address address = new Address(si, gu, dong, bunji);
		list.add(address);
		System.out.println("�� �߰� �Ͻ÷��� ���͸� ��������(�����Ͻ÷��� q�� ��������)");
		sc.nextLine();
		String choice = sc.nextLine();
		if(choice.equals("q")) {break;}
		}
	}

	void update(ArrayList<Address> list) {
		if (list.size() == 0) {
			System.out.println("�Էõ� �ּҰ� �����ϴ�. ���� �ּҸ� �߰��� �ּ���\n");
			return;
		}
		String dong = "";
		while (true) {
			Address address = new Address();
			address.allAddress(list);
			System.out.print("�����ϰ� ���� ���� �Է��ϼ���(���� q) : ");
			dong = sc.next();
			if (dong.equals("q")) {
				break;
			}

//		for (int i = 0; i < list.size(); i++) {
//
//			if (list.get(i).getDong().equals(dong)) {
//				System.out.println(list.get(i).getSi() + " ����");
//				list.get(i).setSi(sc.next());
//				System.out.println(list.get(i).getGu() + " ����");
//				list.get(i).setGu(sc.next());
//				System.out.println(list.get(i).getDong() + " ����");
//				list.get(i).setDong(sc.next());
//				System.out.println(list.get(i).getBunji() + " ����");
//				list.get(i).setBunji(sc.nextInt());
//				//address[0].setSi(sc.next());
//				//list.set(i, );
//			}
//		}
			boolean check = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDong().equals(dong)) {
					System.out.print("�� ���� : ");
					address.setSi(sc.next());
					System.out.print("�� ���� : ");
					address.setGu(sc.next());
					System.out.print("�� ���� : ");
					address.setDong(sc.next());
					System.out.print("���� ���� : ");
					address.setBunji(sc.nextInt());
					list.set(i, address);
					check = true;
					break;
				}
			}
			if (!check) {
				System.out.println("�����ϰ� ���� ���� ã�� �� �����ϴ�\n");
			}
		}

	}

	void insertDong(ArrayList<Address> list) {
//		String si = "";
//		String gu = "";
//		String dong = "";
//		int bunji = 0;
		if (list.size() == 0) {
			System.out.println("�Էõ� �ּҰ� �����ϴ�. ���� �ּҸ� �߰��� �ּ���\n");
			return;
		}
		Address address = new Address();
		System.out.println("�ø� �Է��ϼ���");
		address.setSi(sc.next());
		// si = sc.next();
		System.out.println("���� �Է��ϼ���");
		address.setGu(sc.next());
		// gu = sc.next();
		System.out.println("���� �Է��ϼ���");
		// dong = sc.next();
		address.setDong(sc.next());
		System.out.println("������ �Է��ϼ���");
		// bunji = sc.nextInt();
		address.setBunji(sc.nextInt());
		// Address address = new Address(si, gu, dong, bunji);
		while (true) {
			try {
				int index = 0;
				address.allAddress(list);
				System.out.println("�� ��°�� ���ο� �ּҸ� �����Ͻðڽ��ϱ�?");
				index = sc.nextInt();
				if (index <= 0) {
					throw new MyException("0���� �� ū ���� �Է����ּ���");
				}
				if (list.size() < index) {
					throw new MyException(index + "��°�� ���������ʽ��ϴ�");
				}
				list.add(index - 1, address);
				break;
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	void delete(ArrayList<Address> list) {
		if (list.size() == 0) {
			System.out.println("������ �ּҰ� �����ϴ�\n");
			return;
		}
		Address address = new Address();
		String dong = "";
		while (true) {
			try {
				address.allAddress(list);
				System.out.println("�����ϰ� ���� ���� �Է��ϼ���(���� q) : ");
				dong = sc.next();
				boolean check = false;
				if (dong.equals("q")) {
					break;
				}
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getDong().equals(dong)) {
						list.remove(list.get(i));
						check = true;
					}
					if (list.size() == 0) {

						throw new MyException("�� �̻� ������ �ּҰ� �����ϴ�\n");
					}
				}
				if (!check) {
					System.out.println("���� ���Դϴ�. �ٽ� �Է����ּ���");
				}
			} catch (MyException e) {
				System.out.println(e.getMessage());
				break;
			}

		}

//		for (int i = 0; i < list.size(); i++) {
//			list.clear();
//			
//		}
	}

	void allAddress(ArrayList<Address> list) {
		int cnt = 0;
		for (Address address : list) {
			System.out.print((++cnt) + ". ");
			System.out.println(address);
		}
		if (list.size() == 0) {
			System.out.println("�Էµ� �ּҰ� �����ϴ�\n");
		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println((i+1) +". "+ list.get(i));
//		}

		Iterator<Address> iter = list.iterator();
//		while(iter.hasNext()) {
//			System.out.print((++cnt) + ". ");
//			System.out.println(iter.next());
//		}
		System.out.println();
	}

	static void menu(ArrayList<Address> list) {
		Address address = new Address();

		Scanner sc = new Scanner(System.in);

		int choice = -1;

		while (choice != 0) {
			System.out.println("�ּҷ� �޴�");
			System.out.println("1. ���� ã��");
			System.out.println("2. �ּ� �߰�");
			System.out.println("3. �ּ� ����");
			System.out.println("4. �ּ� ����");
			System.out.println("5. �ּ� ����");
			System.out.println("6. ��� �ּ� ����");
			System.out.println("0. ����");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				address.searchDong(list);
				break;

			case 2:
				address.addDong(list);
				break;

			case 3:
				address.insertDong(list);
				break;
			case 4:
				address.update(list);
				break;

			case 5:
				address.delete(list);
				break;

			case 6:
				address.allAddress(list);
				break;
			}
		}
	}
}

public class AddressMain_�鼺�� {

	public static void main(String[] args) {

		ArrayList<Address> list = new ArrayList<Address>();
		list.add(new Address("�����", "������", "������", 111));
		list.add(new Address("�����", "���ʱ�", "���ʵ�", 222));

		Address.menu(list);

	}

}
