package addressHomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * KOREA MARKET의 회원 정보 관리 프로그램입니다.
	System.out.println("┏━━━━━━━━━━━━━━━━━┓");
	System.out.println("┃  KOREA MARKET입니다.             ┃");
	System.out.println("┣━━━━━━━━━━━━━━━━━┫");
	System.out.println("┃     메뉴를 선택헤주세요          ┃");
	System.out.println("┣━━━━━━━━━━━━━━━━━┫");
	System.out.println("┃  1. 모든 회원 정보 보기          ┃");
	System.out.println("┃  2. 특정 회원 정보 보기          ┃");
	System.out.println("┃  3. 신규 회원 정보 등록          ┃");
	System.out.println("┃  4. 회원 정보 삭제 하기          ┃");
	System.out.println("┃  5. 회원 정보 수정 하기          ┃");
	System.out.println("┃  6. 회원 정보 정렬 하기          ┃");
	System.out.println("┃  0. 종료  하기                   ┃");
	System.out.println("┗━━━━━━━━━━━━━━━━━┛");
 * 총 6개의 메뉴를 생성하였습니다.
 * 1번은 등록된 회원들의 정보를 모두 출력합니다. for문과 iterator를 이용했습니다.
 * 2번은 특정 주소에 해당하는 회원들을 출력합니다. contains를 이용하여 해당 회원들을 찾고, cpy 리스트를 만들어서 해당 회원들의 정보를 바로 출력하지 않고 저장한 후 따로 출력했습니다. 불필요하게 반복되는 부분들을 제거하고자 하였습니다.
 * 3번은 회원 정보 등록입니다. add메서드를 이용했습니다.
 * 4번은 회원 정보 삭제입니다. remove를 이용하였고, scanner를 이용해 해당 위치의 index값을 전달하는 방식으로 구현했습니다.
 * 5번은 회원 정보 수정입니다. remove와 동일하게 scanner를 이용해 해당 위치의 index값을 전달하였습니다.
 * 값을 하나씩만 수정할 경우 setter를 이용하여 값을 전달하였고, 모두 수정할 경우는 Address객체를 새로 생성하여 그 객체에 데이터를 입력한 뒤에 set메서드를 통해 인자로 전달하는 방식으로 구현했습니다.
 * 6번은 회원 정보 정렬입니다. 이름과 나이를 기준으로 각각 오름차순으로 정렬되도록 구현했습니다.
 * 이름이 기준일 경우 이름이 같으면 다시 나이를 비교하여 정렬하고, 나이가 기준일 경우 나이가 같으면 주소를 비교하여 정렬합니다.
 */
public class AddressMain_윤순호 {
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
	private String name;//이름
	private int age;	//나이
	//getter setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	//생성자
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void printUserInfo() {
		System.out.print("   \t"+name+"\t"+age+"세");
	}
}//end class Person
class Address extends Person{
	//모든 회원은 '서울시'에 거주한다고 가정하여, static final로 선언하였습니다.
	static final String si = "서울시";	//시
	private String gu;							//구
	private String dong;						//동
	private String bunji;						//번지
	private int member;							//가구원수
	//getter setter
	public String getGu() {return gu;}
	public void setGu(String gu) {this.gu = gu;}
	public String getDong() {return dong;}
	public void setDong(String dong) {this.dong = dong;}
	public String getBunji() {return bunji;}
	public void setBunji(String bunji) {this.bunji = bunji;}
	public int getMember() {return member;}
	public void setMember(int member) {this.member = member;}
	//생성자
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
		System.out.println("\t"+si+"\t"+gu+"\t"+dong+"\t"+bunji+"\t"+member+"명");
	}
}//end class Address
class KoreaMarket {
	static Scanner sc = new Scanner(System.in);
	//메인 메뉴
	void showMainMenu() {
		int choice = -1;
		ArrayList<Address> user = new ArrayList<Address>();
		//5명의 기본값 입력
		user.add(new Address("홍길동",22,"강남구","강남동","111",2));
		user.add(new Address("유튜브",40,"서초구","서초동","222",1));
		user.add(new Address("박문수",27,"노원구","상계동","333",3));
		user.add(new Address("이순신",33,"강남구","역삼동","555",4));
		user.add(new Address("네이버",18,"강남구","삼성동","666",3));
		while(choice != 0) {
			System.out.println("┏━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃      KOREA MARKET입니다.         ┃");
			System.out.println("┣━━━━━━━━━━━━━━━━━┫");
			System.out.println("┃     메뉴를 선택헤주세요          ┃");
			System.out.println("┣━━━━━━━━━━━━━━━━━┫");
			System.out.println("┃  1. 모든 회원 정보 보기          ┃");
			System.out.println("┃  2. 특정 회원 정보 보기          ┃");
			System.out.println("┃  3. 신규 회원 정보 등록          ┃");
			System.out.println("┃  4. 회원 정보 삭제 하기          ┃");
			System.out.println("┃  5. 회원 정보 수정 하기          ┃");
			System.out.println("┃  6. 회원 정보 정렬 하기          ┃");
			System.out.println("┃  0. 종료  하기                   ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━┛");
			System.out.print("      입력 : "); choice = sc.nextInt();
			switch(choice) {
			case 1: AllCheckUserInfo(user); break;	//모든 회원 정보 보기
			case 2: checkUserInfo(user); break;		//특정 회원 정보 보기
			case 3: createUserInfo(user); break;	//신규 회원 정보 등록
			case 4: deleteUserInfo(user); break;	//회원 정보 삭제 하기
			case 5: updateUserInfo(user); break;	//회원 정보 수정 하기
			case 6: orderUserInfo(user); break;		//회원 정보 정렬 하기
			}//end switch
		}//end while
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("         프로그램을 종료합니다.");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━┛");
	}//end showMainMenu
	//특정 회원 정보 출력
	private void checkUserInfo(ArrayList<Address> user) {
		String search = "";
		int cnt = 0, checkNum = 0;
		ArrayList<Address> cpy = new ArrayList<Address>();
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("     주소를 통해서 특정 회원의 정보를 출력합니다.");
		System.out.print("     찾으실 구나 동을 입력해 주세요 : "); search = sc.next();
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		for(Address str : user) {
			if(str.getGu().contains(search) || str.getDong().contains(search)) {
				cpy.add(str);
			}else {
				checkNum++;
			}//end if
		}//end for
		if(checkNum == user.size()) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("            일치하는 정보가 없습니다.");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		}else {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("    "+search+" 회원들의 정보를 출력합니다.");
			System.out.println("       번호\t 이름\t나이\t  시\t  구\t  동\t번지\t가구원수");
			for(Address str : cpy) {
				System.out.print("\t"+(++cnt)+"번");
				str.printUserInfo();
			}//end for
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		}//end if
	}//end checkUserInfo
	//모든 회원 정보 출력
	private void AllCheckUserInfo(ArrayList<Address> user) {
		int cnt = 0;
		//for문 이용
		//		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		//		System.out.println("       번호\t 이름\t나이\t  시\t  구\t  동\t번지\t가구원수");
		//		for(Address users : user) {
		//			System.out.print("   "+(++cnt)+"번");
		//			users.printUserInfo();
		//		}//end for
		//		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		//iterator 이용
		Iterator<Address> itr = user.iterator();
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("       번호\t 이름\t나이\t  시\t  구\t  동\t번지\t가구원수");
		while(itr.hasNext()) {
			System.out.print("\t"+(++cnt)+"번");
			itr.next().printUserInfo();;
		}//end while
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	}//end AllCheckUserInfo
	//신규 회원 정보 등록
	private void createUserInfo(ArrayList<Address> user) {
		String name = "",gu = "",dong = "",bunji = "";
		int age = 0, member = 0;
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("           신규 회원의 정보를 등록합니다.");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.print("이름을 입력해주세요 : "); name = sc.next();
		System.out.print("나이를 입력해주세요 : "); age = sc.nextInt();
		System.out.print("구를 입력해 주세요.\n(강남구, 서초구, 노원구, 강동구) 중에서 입력해 주세요 : "); gu = sc.next();
		System.out.print("동을 입력해 주세요 : "); dong = sc.next();
		System.out.print("번지를 입력해주세요 : "); bunji = sc.next();
		System.out.print("가구원수를 입력해주세요 : "); member = sc.nextInt();
		user.add(new Address(name,age,gu,dong,bunji,member));
	}//end createUserInfo
	//회원 정보 삭제 하기
	private void deleteUserInfo(ArrayList<Address> user) {
		int delNum = 0;
		printUserName(user);
		while(true) {
			try {
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━┓");
				System.out.print("    몇 번째 회원을 삭제하시겠습니까?"); delNum = sc.nextInt();
				if(delNum < 0) throw new MyException("\t0보다 큰 수로 입력해주세요.");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━┛");
				break;
			}catch(MyException e) {
				System.out.println(e.getMessage());
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━┛");
			}catch(Exception e) {
				System.out.println("\t  정수를 입력해주세요.");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━┛");
				sc.nextLine();
			}//end try
		}//end while
		//삭제하려는 회원의 위치가 입력된 회원수보다 많은 경우 확인
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━┓");
		if(delNum > user.size() || delNum < 0) {
			System.out.println("  "+delNum+"번째 위치에 회원 정보가 없습니다.");
			System.out.println("      마지막 회원의 정보를 삭제합니다.");
			System.out.println("     "+user.get(user.size()-1).getName()+" 회원님의 정보를 삭제합니다.");
			user.remove(user.size()-1);
		}else {
			System.out.println("     "+user.get(delNum-1).getName()+" 회원님의 정보를 삭제합니다.  "); 
			user.remove(delNum-1);
		}
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━┛");
	}//end deleteUserInfo
	//회원 정보 수정 하기
	private void updateUserInfo(ArrayList<Address> user) {
		String name = "",gu = "",dong = "",bunji = "";
		int age = 0, member = 0,select = 0;
		int changeNum = 0;
//		printUserName(user);		//회원의 이름 보다는 전체 데이터를 출력해 주는 것이 보기 좋음
		AllCheckUserInfo(user);
		while(true) {
			try {
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.print("    몇번째 회원의 데이터를 수정하시겠습니까?"); changeNum = sc.nextInt();
				if(changeNum < 0) throw new MyException("\t     0보다 큰 수로 입력해주세요.");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━┛");
				break;
			}catch(MyException e) {
				System.out.println(e.getMessage());
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━┛");
			}catch(Exception e) {
				System.out.println("\t     정수를 입력해주세요.");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━┛");
				sc.nextLine();
			}//end try
		}//end while
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		//수정하려고 회원의 위치가 입력된 회원수보다 많은 경우 확인
		if(changeNum > user.size()) {
			System.out.println("\t  "+changeNum+"번째 위치에 회원 정보가 없습니다.");
			System.out.println("\t      마지막 회원의 정보를 수정합니다.");
			changeNum = user.size();
		}//end if
		System.out.println("\t"+user.get(changeNum-1).getName()+" 회원님의 어떤 정보를 수정하시겠습니까?");
		System.out.println("  1.이름     2.나이     3.구     4.동     5.번지     6.가구원수     7.모두 수정");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.print("\t입력 : "); select = sc.nextInt();
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━┓");
		switch(select) {
		case 1:
			System.out.print("     수정할 이름을 입력해주세요  : "); name = sc.next();
			user.get(changeNum-1).setName(name);
			break;
		case 2:
			System.out.print("     수정할 나이를 입력해주세요  : "); age = sc.nextInt();
			user.get(changeNum-1).setAge(age);
			break;
		case 3:
			System.out.print("     수정할 주소(구)를 입력해주세요  : "); gu = sc.next();
			user.get(changeNum-1).setGu(gu);
			break;
		case 4:
			System.out.print("     수정할 주소(구)을 입력해주세요  : "); dong = sc.next();
			user.get(changeNum-1).setDong(dong);
			break;
		case 5:
			System.out.print("     수정할 번지수를 입력해주세요  : "); bunji = sc.next();
			user.get(changeNum-1).setBunji(bunji);
			break;
		case 6:
			System.out.print("     수정할 가구원수를 입력해주세요  : "); member = sc.nextInt();
			user.get(changeNum-1).setMember(member);
			break;
		case 7:
			System.out.print("     수정할 이름을 입력해주세요  : "); name = sc.next();
			System.out.print("     수정할 나이를 입력해주세요  : "); age = sc.nextInt();
			System.out.print("     수정할 주소(구)를 입력해주세요  : "); gu = sc.next();
			System.out.print("     수정할 주소(구)을 입력해주세요  : "); dong = sc.next();
			System.out.print("     수정할 번지수를 입력해주세요  : "); bunji = sc.next();
			System.out.print("     수정할 가구원수를 입력해주세요  : "); member = sc.nextInt();
			Address tmp= new Address(name,age,gu,dong,bunji,member);
			user.set(changeNum-1, tmp);
		}//end switch
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━┛");
	}//end changeUserInfo
	//회원 정보 정렬 하기
	private void orderUserInfo(ArrayList<Address> user) {  
		int orderNum = 0;
		Address tmp;
		while(true) {
			try {
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("┃\t어떤 정보를 기준으로 정렬하시겠습니까?(오름차순 정렬)\t\t\t\t┃");
				System.out.println("┃    오름차순으로 정렬하며,비교 정보가 동일할 경우 하위 정보들을 추가로 비교합니다     ┃");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				System.out.print("   1.이름\n   2.나이\n   입력   :  ");	orderNum = sc.nextInt();
				if(orderNum < 0 || orderNum > 2) throw new MyException("\t1, 2번 중에서 입력해 주세요.");
				break;
			}catch(MyException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println("\t정수를 입력해주세요.");
				sc.nextLine();
			}//end try
		}//end while
		switch(orderNum) {
		case 1:
			for(int i = 0;i<user.size()-1;i++) {
				for(int j = i+1;j<user.size();j++) {
					int check = user.get(i).getName().compareToIgnoreCase(user.get(j).getName());
					if(check > 0){											//뒤의 이름이 더 앞의 이름보다 더 앞에 있다면,
						tmp = user.get(i);
						user.set(i, user.get(j));
						user.set(j, tmp);
					}else if(check == 0) {									//두 이름이 똑같다면,
						if(user.get(i).getAge() >= user.get(j).getAge()) {	//두 사람의 나이를 비교합니다.
							tmp = user.get(i);
							user.set(i, user.get(j));
							user.set(j, tmp);
						}//end if
					}//end if
				}//end for(j)
			}//end for(i)
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("        이름을 기준으로 오름차순 정렬합니다");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			break;
		case 2:
			for(int i = 0;i<user.size()-1;i++) {
				for(int j = i+1;j<user.size();j++) {
					if(user.get(i).getAge() > user.get(j).getAge()){				//두 사람의 나이를 비교
						tmp = user.get(i);
						user.set(i, user.get(j));
						user.set(j, tmp);
					}else if(user.get(i).getAge() == user.get(j).getAge()) {						//두 사람의 나이가 똑같다면
						int check = user.get(i).getGu().compareToIgnoreCase(user.get(j).getGu());	//두 사람의 구를 비교합니다.
						if(check > 0) {
							tmp = user.get(i);
							user.set(i, user.get(j));
							user.set(j, tmp);
						}else if(check == 0) {																//두 사람의 구가 똑같다면
							int check2 = user.get(i).getDong().compareToIgnoreCase(user.get(j).getDong());	//두 사람의 동을 비교합니다.
							if(check2 > 0) {
								tmp = user.get(i);
								user.set(i, user.get(j));
								user.set(j, tmp);
							}//end if - 3
						}//end if - 2
					}//end if - 1
				}//end for(j)
			}//end for(i)
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("        나이를 기준으로 오름차순 정렬합니다");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			break;
		}//end switch
	}//end orderUserInfo
	//현재 등록된 회원의 이름만 출력
	private void printUserName(ArrayList<Address> user) {
		int cnt = 0;
		System.out.println("┏━━━━━━━━━━━━┓");
		System.out.println("     현재 등록된 회원");
		for(Address users : user) {
			System.out.println("     "+(++cnt)+"번 : "+users.getName());
		}//end for
		System.out.println("┗━━━━━━━━━━━━┛");
	}//end printUserName
}//end KoreaMarket


