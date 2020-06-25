package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 	HashMap<키, 밸류>
 		put(키, 밸류)
 		get(키)
 */
public class HashMapTest3_1 {

	public static void main(String[] args) {
		//        key     value
		HashMap<String, String> map = new HashMap<>();
		//         id       pw
		map.put("이순신", "100");
		map.put("유관순", "120");
		map.put("강감찬", "130");
		map.put("박문수", "140");

		// 로그인 처리
		// 1. 키가 아이디 이다
		// 2. 입력한 아이디가 map에 있는 지 검사하자!
		// 2-1. 아이디가 없으면 다시 입력
		// 2-2. 아이디가 존재하면 3
		// 3. 비밀번호와 map에 있는 value가 같은지 검사하자
		// 4. 로그인 되었습니다!
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id : "); String id = sc.nextLine().trim();
		System.out.print("pw : "); String pw = sc.nextLine().trim();
		
	    if(map.containsKey(id)) {
	    	if(map.containsValue(pw)){
	    		System.out.println("로그인 성공!");
	    		break;
	    	}else {
	    		System.out.println("비밀번호를 잘못 입력하셨습니다");
	    	}
	    }else {
	    	System.out.println("아이디를 다시 입력해 주세요");
	    }
		}
		
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("id : ");
//			String id = sc.nextLine().trim();
//			System.out.print("pw : ");
//			String pw = sc.nextLine().trim();
//
//			// Set<String> set = map.keySet();
//			map.keySet();
//			if (map.containsKey(id)) {
//				// 있다면
//				if (map.get(id).equals(pw)) {
//					System.out.println("로그인 되었습니다");
//					break;
//				} else {
//					System.out.println("비밀번호 오류! ID 비번을 다시 입력해 주세요");
//					continue;
//				}
//			} else {
//				// 없다면
//				System.out.println(id + "는 없습니다. 다시 입력해 주세요");
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
