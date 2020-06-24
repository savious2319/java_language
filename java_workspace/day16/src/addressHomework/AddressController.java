package addressHomework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import myException.MyException;


public class AddressController {
	static Scanner sc = new Scanner(System.in);
	ArrayList<Address> list = new ArrayList<Address>();
	int index;
	
	void menu() {
		
		list.add(new Address("�����", "������", "������", 111));
		list.add(new Address("�����", "���ʱ�", "���ʵ�", 222));
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
//				searchDong(list);  // static void�� �ϸ� searchDong(list)�� �θ� �� ����. ��ü�� ���� �����ؼ� ȣ������������ �ȵȴ�
				searchDong();
				break;
				
			case 2:
				addDong();
				break;
				
			case 3:
				insertDong();
				break;
			case 4:
				update();
				break;
				
			case 5:
				delete();
				break;
				
			case 6:
				allAddress();
				break;
			}
		}
	}

	void searchDong() {
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
			if (search.equalsIgnoreCase("q")) {
				System.out.println();
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDong().equals(search)) {
					// if (search.contains(list.get(i).getDong())) {

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

	void addDong() {
//		String si = "";
//		String gu = "";
//		String dong = "";
//		int bunji = 0;
		while (true) {
			Address tmp = new Address();
			System.out.println("�ø� �Է��ϼ���");
			tmp.setSi(sc.next());
			// si = sc.next();
			System.out.println("���� �Է��ϼ���");
			tmp.setGu(sc.next());
			// gu = sc.next();
			System.out.println("���� �Է��ϼ���");
			// dong = sc.next();
			tmp.setDong(sc.next());
			System.out.println("������ �Է��ϼ���");
			// bunji = sc.nextInt();
			tmp.setBunji(sc.nextInt());
			// Address tmp = new Address(si, gu, dong, bunji);
			list.add(tmp);
			System.out.println("�� �߰� �Ͻ÷��� ���͸� ��������(�����Ͻ÷��� q�� ��������)");
			sc.nextLine();
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("q"))
				break;
		}
	}

	void update() {
		if (list.size() == 0) {
			System.out.println("�Էõ� �ּҰ� �����ϴ�. ���� �ּҸ� �߰��� �ּ���\n");
			return;
		}
		//int index = 0;
		String dong = "";
		while (true) {
			Address tmp = new Address();
			allAddress();
			System.out.print("�����ϰ� ���� �ּ��� ��ȣ�� �Է��ϼ���(���� q) : ");  //�ּ� ��ȣ�� ���ϴ� �κ��� �����ϴ� �κ� �غ���
			//index = sc.nextInt();
			if (dong.equalsIgnoreCase("q"))
				break;

//		for (int i = 0; i < list.size(); i++) {
//
//			if (list.get(i).getDong().equals(dong)) {
//				System.out.print(list.get(i).getSi() + " ����: ");
//				list.get(i).setSi(sc.next());
//				System.out.print(list.get(i).getGu() + " ����: ");
//				list.get(i).setGu(sc.next());
//				System.out.print(list.get(i).getDong() + " ����: ");
//				list.get(i).setDong(sc.next());
//				System.out.print(list.get(i).getBunji() + " ����: ");
//				list.get(i).setBunji(sc.nextInt());
//			}
//		}
			boolean check = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDong().equals(dong)) {
					System.out.print("�� ���� : ");
					tmp.setSi(sc.next());
					System.out.print("�� ���� : ");
					tmp.setGu(sc.next());
					System.out.print("�� ���� : ");
					tmp.setDong(sc.next());
					System.out.print("���� ���� : ");
					tmp.setBunji(sc.nextInt());
					list.set(i, tmp);
					check = true;
					break;
				}
			}
			if (!check) {
				System.out.println("�����ϰ� ���� ���� ã�� �� �����ϴ�\n");
			}
		}

	}

	void insertDong() {
//		String si = "";
//		String gu = "";
//		String dong = "";
//		int bunji = 0;
		if (list.size() == 0) {
			System.out.println("�Էõ� �ּҰ� �����ϴ�. ���� �ּҸ� �߰��� �ּ���\n");
			return;
		}
		Address tmp = new Address();
		System.out.println("�ø� �Է��ϼ���");
		tmp.setSi(sc.next());
		// si = sc.next();
		System.out.println("���� �Է��ϼ���");
		tmp.setGu(sc.next());
		// gu = sc.next();
		System.out.println("���� �Է��ϼ���");
		// dong = sc.next();
		tmp.setDong(sc.next());
		System.out.println("������ �Է��ϼ���");
		// bunji = sc.nextInt();
		tmp.setBunji(sc.nextInt());
		// Address address = new Address(si, gu, dong, bunji);
		while (true) {
			try {
				int index = 0;
				allAddress();
				System.out.println("�� ��°�� ���ο� �ּҸ� �����Ͻðڽ��ϱ�?");
				index = sc.nextInt();
				if (index <= 0) {
					throw new MyException("0���� �� ū ���� �Է����ּ���");
				}
				if (list.size() < index) {
					throw new MyException(index + "���� ���������ʽ��ϴ�");
				}
				list.add(index - 1, tmp);
				break;
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	void delete() {
		if (list.size() == 0) {
			System.out.println("������ �ּҰ� �����ϴ�\n");
			return;
		}
		String dong = "";
		while (true) {
			try {
				allAddress();
				System.out.println("�����ϰ� ���� ���� �Է��ϼ���(���� q) : ");
				dong = sc.next();
				boolean check = false;
				if (dong.equalsIgnoreCase("q"))
					break;

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getDong().equals(dong)) {
						list.remove(list.get(i));
						check = true;
					}
					if (list.size() == 0) {

						throw new MyException("��� �ּҰ� ���� �Ǿ����ϴ�\n");
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
		// ��ü �ּ� �����Ҷ� clear() �޼��� ����
//		for (int i = 0; i < list.size(); i++) {
//			list.clear();
//			
//		}
	}

	void allAddress() {
		int cnt = 0;
		for (Address address : list) {
			System.out.print((++cnt) + ". ");
			System.out.println(address);
		}
		if (list.size() == 0) {
			System.out.println("�Էµ� �ּҰ� �����ϴ�\n");
		}

		// ���� for��
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println((i+1) +". "+ list.get(i));
//		}

		// Iterator �������̽�
//		Iterator<Address> iter = list.iterator();
//		while(iter.hasNext()) {
//			System.out.print((++cnt) + ". ");
//			System.out.println(iter.next());
//		}
		System.out.println();
	}

}

