package addressHomework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 	주소 찾기 예제
 	예전) 배열에 5개의 주소를 입력해 놓고 시작했다!
 	
 	=> 기본 2줄 주소값 입력해 놓기
 		서울시 강남구 강남동 111
 		서울시 서초구 서초동 222
 		
 	=> 3번째 부터는 추가할 수 있다!
 	
 	=> 모델클래스 
 	class Address{
 		String si;
 		String gu;
 		String dong;
 		int bunji;		// 111, 222, 333, 444...
 	
 		// equals(), contains()
 		searchDong(){}		// 입력 : 00동 -> 번지는 몇 번지 입니다!
 		
 		// add()
 		insertDong(){}		// 새로운 주소 추가 -> 시를 입력하세요
 												-> 구를 입력하세요
 												-> 동을 입력하세요
 												-> 번지를 입력하세요
 		// set()										
 		update(){}			// 기존 주소 수정	-> 00시 수정 : 
 												-> 00구 수정 :
 												-> 00동 수정 :
 												-> 00번지 수정 :
 		//remove()										
 		delete(){}			// 기존 주소 삭제
 		
 		//빠른for문 toString() 오버라이딩
 		allAddress(){}		// 모든 주소 보기
 		}
 		
 	=> ArrayList<Address> list = new ArrayList<Address>();
 		list.add(강남구 강남동);
 		list.add(서초구 서초동);
 		
 		
 */

class MyException extends Exception {

	public MyException(String msg) {
		// 부모에게 msg를 전달해 주자 -> 부모가 갖고 있는 getMessage() 메서드가
		// msg를 출력해 줄수 있다.
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
			System.out.println("입련된 주소가 없습니다. 먼저 주소를 추가해 주세요\n");
			return;
		}
		String search = "";
		while (true) {
			boolean check = false;
			System.out.print("찾고자하는 동 입력(종료 q) : ");
			search = sc.next();
			if (search.equals("q")) {
				System.out.println();
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDong().equals(search)) {

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

	void addDong(ArrayList<Address> list) {
//		String si = "";
//		String gu = "";
//		String dong = "";
//		int bunji = 0;
		while(true) {
		Address address = new Address();
		System.out.println("시를 입력하세요");
		address.setSi(sc.next());
		// si = sc.next();
		System.out.println("구를 입력하세요");
		address.setGu(sc.next());
		// gu = sc.next();
		System.out.println("동을 입력하세요");
		// dong = sc.next();
		address.setDong(sc.next());
		System.out.println("번지를 입력하세요");
		// bunji = sc.nextInt();
		address.setBunji(sc.nextInt());
		// Address address = new Address(si, gu, dong, bunji);
		list.add(address);
		System.out.println("더 추가 하시려면 엔터를 누르세요(종료하시려면 q를 누르세요)");
		sc.nextLine();
		String choice = sc.nextLine();
		if(choice.equals("q")) {break;}
		}
	}

	void update(ArrayList<Address> list) {
		if (list.size() == 0) {
			System.out.println("입련된 주소가 없습니다. 먼저 주소를 추가해 주세요\n");
			return;
		}
		String dong = "";
		while (true) {
			Address address = new Address();
			address.allAddress(list);
			System.out.print("수정하고 싶은 동을 입력하세요(종료 q) : ");
			dong = sc.next();
			if (dong.equals("q")) {
				break;
			}

//		for (int i = 0; i < list.size(); i++) {
//
//			if (list.get(i).getDong().equals(dong)) {
//				System.out.println(list.get(i).getSi() + " 수정");
//				list.get(i).setSi(sc.next());
//				System.out.println(list.get(i).getGu() + " 수정");
//				list.get(i).setGu(sc.next());
//				System.out.println(list.get(i).getDong() + " 수정");
//				list.get(i).setDong(sc.next());
//				System.out.println(list.get(i).getBunji() + " 수정");
//				list.get(i).setBunji(sc.nextInt());
//				//address[0].setSi(sc.next());
//				//list.set(i, );
//			}
//		}
			boolean check = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDong().equals(dong)) {
					System.out.print("시 수정 : ");
					address.setSi(sc.next());
					System.out.print("구 수정 : ");
					address.setGu(sc.next());
					System.out.print("동 수정 : ");
					address.setDong(sc.next());
					System.out.print("번지 수정 : ");
					address.setBunji(sc.nextInt());
					list.set(i, address);
					check = true;
					break;
				}
			}
			if (!check) {
				System.out.println("수정하고 싶은 동을 찾을 수 없습니다\n");
			}
		}

	}

	void insertDong(ArrayList<Address> list) {
//		String si = "";
//		String gu = "";
//		String dong = "";
//		int bunji = 0;
		if (list.size() == 0) {
			System.out.println("입련된 주소가 없습니다. 먼저 주소를 추가해 주세요\n");
			return;
		}
		Address address = new Address();
		System.out.println("시를 입력하세요");
		address.setSi(sc.next());
		// si = sc.next();
		System.out.println("구를 입력하세요");
		address.setGu(sc.next());
		// gu = sc.next();
		System.out.println("동을 입력하세요");
		// dong = sc.next();
		address.setDong(sc.next());
		System.out.println("번지를 입력하세요");
		// bunji = sc.nextInt();
		address.setBunji(sc.nextInt());
		// Address address = new Address(si, gu, dong, bunji);
		while (true) {
			try {
				int index = 0;
				address.allAddress(list);
				System.out.println("몇 번째에 새로운 주소를 삽입하시겠습니까?");
				index = sc.nextInt();
				if (index <= 0) {
					throw new MyException("0보다 더 큰 수를 입력해주세요");
				}
				if (list.size() < index) {
					throw new MyException(index + "번째는 존재하지않습니다");
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
			System.out.println("삭제할 주소가 없습니다\n");
			return;
		}
		Address address = new Address();
		String dong = "";
		while (true) {
			try {
				address.allAddress(list);
				System.out.println("삭제하고 싶은 동을 입력하세요(종료 q) : ");
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

						throw new MyException("더 이상 삭제할 주소가 없습니다\n");
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
			System.out.println("입력된 주소가 없습니다\n");
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

public class AddressMain_백성민 {

	public static void main(String[] args) {

		ArrayList<Address> list = new ArrayList<Address>();
		list.add(new Address("서울시", "강남구", "강남동", 111));
		list.add(new Address("서울시", "서초구", "서초동", 222));

		Address.menu(list);

	}

}
