package mapEx;

import java.util.HashMap;

/*
 	HashMap<키, 밸류>
 		put(키, 밸류)
 		get(키)
 */
public class HashMapTest {

	public static void main(String[] args) {

		/*
		    키  - 밸류
		   홍길동 96
		   이순신 100
		   유관순 98
		   신사임당 75
		 */
		//       key      value
		HashMap<String, Integer> map = new HashMap<>();
		
		//map.put("홍길동", new Integer(96));
		map.put("홍길동", 96);
		map.put("이순신", 100);
		map.put("유관순", 98);
		map.put("신사임당", 75);
		
		// 키를 줄게 밸류 다오
		System.out.println(map.get("홍길동"));
		System.out.println(map.get("이순신"));
		System.out.println(map.get("유관순"));
		System.out.println(map.get("신사임당"));
		
	}

}










