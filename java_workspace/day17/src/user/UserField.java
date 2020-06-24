package user;

import java.util.ArrayList;
import java.util.Scanner;

public class UserField {
	
	private ArrayList<User> list = new ArrayList<>(); //외부에서 호출할 필요가 없어서 private을 앞에 씀
	private static final int KEY_CODE = 3;  //암호화, 복호화 할 때 사용할 키값!
	
	
	//중복 검사
	public User checkId(String id) {
		/*리스트 목록 중에서 id만 가져온 후, 매개변수 id하고 비교한다!
		동일한 id가 있는 요소를 발견하면, 그 요소를 리턴하게 된다.
		없으면 null 값이 리턴된다.*/
		User user = null;
		
		//리스트에서 하나씩 꺼내오기를 반복한다! - 빠른 for문
		//요소 하나씩 꺼내올때마다 tmp가 갖게 되고,
		//tmp에서 id만 꺼내온 뒤에, 매개변수 id하고 비교하자!
		for (User tmp : list) {
			if(tmp.getId().equals(id)){ // <-- 동일한 id가 존재하는 인스턴스 (tmp)
				user = tmp;				// 그 인스턴스를 반환 시키자!
			}
		}
		
		return user;					// 만약 동일한 id가 없다면, null 값이 리턴된다!
		
	}
	
	//회원가입
	private boolean join(User user) {
		//1. id가 null이거나 빈문자열
		if(checkId(user.getId())== null) {  // checkId() 메서드는 동일한 아이디가 있다면, 그 객체를
											// 줄것이고, 동일한 아이디가 없다면, null 객체를 반환할 것이다!
			
			
			//null 이기 때문에 !!-> 가입을 시킬 수 있게됐다! list.add(해당 인스턴스)
			//list.add(user);  하기 전에!!!! pw를 암호화 하자! 일정한 패턴을 적용해서 알아보기 힘든 문장으로 pw를 변경시켜야 한다
																											//->encrypt()
			user.setPw(encrypt(user.getPw()));
			
			list.add(user); //list에 완성된 user를 저장시킨다! 최종 목적지는 list!!
			
			return true; //회원가입이 됐어요!!!!
			
		}
		return false; //회원가입이 실패됐어요 -> 왜? -> id가 중복됐기 때문에!!! 누굴통해서? : checkId()를 통해서 알게 됐음!
					  //checkId는 리턴타입이 User 타입 객체 타입!!! 인스턴스의 유무로 회원가입 실패 여부를 확인하는 거다!!
	}
	
	//로그인
	public boolean login(String id, String pw) {
		
		User user = checkId(id);
		
		//1. user가 널이라는 건 -> 아이디가 없다라는 뜻!
		if(user != null) {
			
			//패스워드 비교
			//리스트에 있는 getPw()와 매개변수 pw를 비교해야 한다!
			//문제는 리스트에 있는 getPw()는 enc 된 pw이다!
			//따라서 매개변수 pw와 비교하기 전에...
			//decrypt() 메서드를 통해서 복화한 데이터로, pw와 비교해야 한다!
			
			//1. list에서 checkId 를 통해 얻어낸 객체가 몇번에 있는지 인덱스 값 추출하자!
			//2. 그 인스턴스에서 비번을 가져오자
			//3. 그 비번을 decrypt 하자
			//4. decrypt한 데이터를 pw와 비교하자!
			//1~4번이 한문장으로 if문에 들어간다!
			//decrypt(user.getPw()).equals(pw);
			if(decrypt(list.get(list.indexOf(user)).getPw()).equals(pw)) {
			//	(4)			(3)			(1)         (2)       (5)
			
			return true;
			}
		}
		
		return false; //로그인 실패! -> 1. 아이디가 없을 때 2. id와 pw가 다를때,
	}
	
	//암호화
	public String encrypt(String pw) {
		String enc_pw = "";
		
		//pw에 들어있던 원래 pw를 특정 값을 부여해서 변환 시키자!
		//pw에 문자열을 문자단위로 잘라내서, 각각 특정값(key값)을 연산시키면 된다!
		//문자단위기 때문에 코드값이 있는데, 코드값에다 키값이 연산되어,
		//문자열에 연결시키면 변경하고자 하는 암호값으로 처리된다.
		//이때, key 값은 "복호화" 할 때도 필요하니까...
		//인스턴스 상수로 빼 놓자!
		
		//pw의 문자열을 문자단위로 가져와서 KEY_CODE를 곱하자!
		//그리고 enc_pw에 연결시키자!
		
		for (int i = 0; i < pw.length(); i++) {
			enc_pw	+= (char)(pw.charAt(i) * KEY_CODE); 
		}
		System.out.println("원래 암호 : "+pw+", enc암호 : " + enc_pw);
		return enc_pw;
	}
	
	//복호화
	public String decrypt(String enc_pw) {
		//String dec_pw; // dec_pw에 null 이 들어가게 된다. += 연산을 할 때, null12345 등으로 null부터 들어간다!!!
		String dec_pw = "";  // 공백으로 초기화를 안하면 null 값이 들어간다! 
		
		for (int i = 0; i < enc_pw.length(); i++) {
			dec_pw += (char)(enc_pw.charAt(i) / KEY_CODE);
		}
		System.out.println("enc암호 : "+ enc_pw+", dec암호 : "+dec_pw);
		return dec_pw;
	}
	
	//시작
	public void init() {
	
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		//새로운 회원 정보 입력
		//회원 아이디 검색 등
		User user = null;
		while(true) {
			user = new User();
			
			System.out.println("1. 회원가입\n2. 로그인\n3. 종료");
			choice = sc.nextInt();
			
			if(choice == 3) break;
			
			switch(choice) {
			case 1: //회원가입 - id, pw
				//입력시 에러가 날 수 있다(NumberFormatException 등...)
				//이때, 프로그램이 중단 될 수 있기때문에,
				//미연, 중단을 방지시키자! -> try catch를 적용한다!
				try {
					System.out.print("아이디(영어) : ");
					user.setId(sc.next());
					
					System.out.print("비밀번호 : ");
					user.setPw(sc.next());
					
					//System.out.println(user); // 입력이 잘됐는지 테스트용
					
				} catch (Exception e) {
					System.out.println("정보를 다시 입력해주세요");
					continue; //첫 메뉴부터 다시 보여주기
				}
				
				//입력된 정보는 user 객체에 들어있다.
				//그 객체를 join()에 보내서 회원 가입 성공 여부를 판단하자!
				if(join(user)) {
					System.out.println("회원 가입 성공");
				}else {
					System.out.println(user.getId()+"는 중복 아이디 입니다");
				}
				break;
				
			case 2: //로그인
				//id하고 pw를 입력
				//list의 저장된 데이터랑 비교한다
				//id하고 pw를 login() 메서드에 보낸다
				try {
					System.out.print("아이디(영어) : ");
					user.setId(sc.next());
					
					System.out.print("비밀번호 : ");
					user.setPw(sc.next());
					
					//System.out.println(user); // 입력이 잘됐는지 테스트용
					
				} catch (Exception e) {
					System.out.println("정보를 다시 입력해주세요");
					continue; 
				}
				
				if(login(user.getId(), user.getPw())) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("아이디 또는 비밀번호를 다시 확인해 주세요!");
				}
				break;
			}
			
			
			
		}//end of while
		System.out.println("프로그램 종료합니다");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
