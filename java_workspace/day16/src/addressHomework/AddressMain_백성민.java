package addressHomework;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
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
		return si + " "+ gu +" "+dong +" "+bunji;
		
	}

	void searchDong(ArrayList<Address> list) {
		String search = "";
		System.out.print("찾고자하는 동 입력 : ");
		search = sc.next();
		try {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDong().equals(search)) {

					throw new MyException(search+" 번지는 " + list.get(i).getBunji() + "번지 입니다");
				}
			}
			
			System.out.println("해당 주소의 번지를 찾을 수 없습니다");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	// for (Address address : list) {
	// if (!address.getDong().equals(search)) {
	// continue;
	// } else {
	// System.out.println("번지는 " + address.getBunji() + "번지 입니다");
	// }
	// }


	void insertDong(ArrayList<Address> list) {
		String si = "";
		String gu = "";
		String dong = "";
		int bunji = 0;
		System.out.println("시를 입력하세요");
		// address.setSi(sc.next());
		si = sc.next();
		System.out.println("구를 입력하세요");
		gu = sc.next();
		System.out.println("동을 입력하세요");
		dong = sc.next();
		System.out.println("번지를 입력하세요");
		bunji = sc.nextInt();
		Address address = new Address(si, gu, dong, bunji);
		list.add(address);
	}

	void update(ArrayList<Address> list) {
		String dong = "";
		System.out.print("수정하고 싶은 동을 입력하세요 : ");
		dong = sc.next();
		int idx = 0;

		Address address = new Address();

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
			}
		}
		if(!check) {
			System.out.println("수정하고 싶은 동을 찾을 수 없습니다\n");
		}

	}

	void delete(ArrayList<Address> list) {
		String dong = "";
		System.out.println("삭제하고 싶은 동을 입력하세요 : ");
		dong = sc.next();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDong().equals(dong)) {
				list.remove(list.get(i));
			}
		}

//		for (int i = 0; i < list.size(); i++) {
//			list.clear();
//			
//		}
	}

	void allAddress(ArrayList<Address> list) {
//		for (Address address : list) {
//			System.out.println(address);
//		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) +". "+ list.get(i));
		}
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
			System.out.println("3. 주소 수정");
			System.out.println("4. 주소 삭제");
			System.out.println("5. 모든 주소 보기");
			System.out.println("0. 종료");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				address.searchDong(list);
				break;

			case 2:
				address.insertDong(list);
				break;

			case 3:
				address.update(list);
				break;

			case 4:
				address.delete(list);
				break;

			case 5:
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
