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
public class HashMapTest3 {

	public static void main(String[] args) {
		//       key      value
		HashMap<String, String> map = new HashMap<>();
		//       id        pw
		map.put("이순신", "100");
		map.put("유관순", "120");
		map.put("강감찬", "130");
		map.put("박문순", "140");

		System.out.println(map);
		//강감찬이 pw를 133으로 변경하고자 한다!
		map.put("강감찬", "133");
		System.out.println(map);
		
		//아이디 pw 입력받아서 put 시켜보자!
		Scanner sc = new Scanner(System.in);
		System.out.print("id : "); String id = sc.nextLine().trim();
		System.out.print("pw : "); String pw = sc.nextLine().trim();
		
		map.put(id, pw);
		
		System.out.println(map);
	}

}










