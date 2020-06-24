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
		
		list.add(new Address("서울시", "강남구", "강남동", 111));
		list.add(new Address("서울시", "서초구", "서초동", 222));
		Scanner sc = new Scanner(System.in);
		
		int choice = -1;
		
		while (choice != 0) {
			System.out.println("주소록 메뉴");
			System.out.println("1. 번지 찾기");
			System.out.println("2. 주소 추가");
			System.out.println("3. 주소 삽입");
			System.out.println("4. 주소 수정");
			System.out.println("5. 주소 삭제");
			System.out.println("6. 모든 주소 보기");
			System.out.println("0. 종료");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
//				searchDong(list);  // static void로 하면 searchDong(list)로 부를 수 없다. 객체를 따로 생성해서 호출하지않으면 안된다
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
			System.out.println("입련된 주소가 없습니다. 먼저 주소를 추가해 주세요\n");
			return;
		}
		String search = "";
		while (true) {
			boolean check = false;
			System.out.print("찾고자하는 동 입력(종료 q) : ");
			search = sc.next();
			if (search.equalsIgnoreCase("q")) {
				System.out.println();
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDong().equals(search)) {
					// if (search.contains(list.get(i).getDong())) {

					System.out.println(search + " 번지는 " + list.get(i).getBunji() + "번지 입니다\n");
					check = true;
				}
			}
			if (!check) {
				System.out.println("해당 주소의 번지를 찾을 수 없습니다\n");
			}
//			for (Address address : list) {
//				if (address.getDong().equals(search)) {
//					System.out.println(search + "번지는 " + address.getBunji() + "번지 입니다\n");
//					check = true;
//				} 
//			}
//			if (!check) {
//				System.out.println("해당 주소의 번지를 찾을 수 없습니다\n");
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
			System.out.println("시를 입력하세요");
			tmp.setSi(sc.next());
			// si = sc.next();
			System.out.println("구를 입력하세요");
			tmp.setGu(sc.next());
			// gu = sc.next();
			System.out.println("동을 입력하세요");
			// dong = sc.next();
			tmp.setDong(sc.next());
			System.out.println("번지를 입력하세요");
			// bunji = sc.nextInt();
			tmp.setBunji(sc.nextInt());
			// Address tmp = new Address(si, gu, dong, bunji);
			list.add(tmp);
			System.out.println("더 추가 하시려면 엔터를 누르세요(종료하시려면 q를 누르세요)");
			sc.nextLine();
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("q"))
				break;
		}
	}

	void update() {
		if (list.size() == 0) {
			System.out.println("입련된 주소가 없습니다. 먼저 주소를 추가해 주세요\n");
			return;
		}
		//int index = 0;
		String dong = "";
		while (true) {
			Address tmp = new Address();
			allAddress();
			System.out.print("수정하고 싶은 주소의 번호를 입력하세요(종료 q) : ");  //주소 번호로 원하는 부분을 수정하는 부분 해보기
			//index = sc.nextInt();
			if (dong.equalsIgnoreCase("q"))
				break;

//		for (int i = 0; i < list.size(); i++) {
//
//			if (list.get(i).getDong().equals(dong)) {
//				System.out.print(list.get(i).getSi() + " 수정: ");
//				list.get(i).setSi(sc.next());
//				System.out.print(list.get(i).getGu() + " 수정: ");
//				list.get(i).setGu(sc.next());
//				System.out.print(list.get(i).getDong() + " 수정: ");
//				list.get(i).setDong(sc.next());
//				System.out.print(list.get(i).getBunji() + " 수정: ");
//				list.get(i).setBunji(sc.nextInt());
//			}
//		}
			boolean check = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDong().equals(dong)) {
					System.out.print("시 수정 : ");
					tmp.setSi(sc.next());
					System.out.print("구 수정 : ");
					tmp.setGu(sc.next());
					System.out.print("동 수정 : ");
					tmp.setDong(sc.next());
					System.out.print("번지 수정 : ");
					tmp.setBunji(sc.nextInt());
					list.set(i, tmp);
					check = true;
					break;
				}
			}
			if (!check) {
				System.out.println("수정하고 싶은 동을 찾을 수 없습니다\n");
			}
		}

	}

	void insertDong() {
//		String si = "";
//		String gu = "";
//		String dong = "";
//		int bunji = 0;
		if (list.size() == 0) {
			System.out.println("입련된 주소가 없습니다. 먼저 주소를 추가해 주세요\n");
			return;
		}
		Address tmp = new Address();
		System.out.println("시를 입력하세요");
		tmp.setSi(sc.next());
		// si = sc.next();
		System.out.println("구를 입력하세요");
		tmp.setGu(sc.next());
		// gu = sc.next();
		System.out.println("동을 입력하세요");
		// dong = sc.next();
		tmp.setDong(sc.next());
		System.out.println("번지를 입력하세요");
		// bunji = sc.nextInt();
		tmp.setBunji(sc.nextInt());
		// Address address = new Address(si, gu, dong, bunji);
		while (true) {
			try {
				int index = 0;
				allAddress();
				System.out.println("몇 번째에 새로운 주소를 삽입하시겠습니까?");
				index = sc.nextInt();
				if (index <= 0) {
					throw new MyException("0보다 더 큰 수를 입력해주세요");
				}
				if (list.size() < index) {
					throw new MyException(index + "번은 존재하지않습니다");
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
			System.out.println("삭제할 주소가 없습니다\n");
			return;
		}
		String dong = "";
		while (true) {
			try {
				allAddress();
				System.out.println("삭제하고 싶은 동을 입력하세요(종료 q) : ");
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

						throw new MyException("모든 주소가 삭제 되었습니다\n");
					}
				}
				if (!check) {
					System.out.println("없는 동입니다. 다시 입력해주세요");
				}
			} catch (MyException e) {
				System.out.println(e.getMessage());
				break;
			}

		}
		// 전체 주소 삭제할때 clear() 메서드 쓰기
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
			System.out.println("입력된 주소가 없습니다\n");
		}

		// 빠른 for문
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println((i+1) +". "+ list.get(i));
//		}

		// Iterator 인터페이스
//		Iterator<Address> iter = list.iterator();
//		while(iter.hasNext()) {
//			System.out.print((++cnt) + ". ");
//			System.out.println(iter.next());
//		}
		System.out.println();
	}

}

