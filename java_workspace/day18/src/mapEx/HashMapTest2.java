package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 	HashMap<키, 밸류>
 		put(키, 밸류)
 		get(키)
 */
public class HashMapTest2 {

	public static void main(String[] args) {
		//                   0   ,  1   ,  2    , 3   ,  4   ,  5
		String []cities = {"서울","강남","대구","전주","부산","울산"};

		HashMap<Integer, String> mapCity = new HashMap<>();

		for (int i = 0; i < cities.length; i++) {
			mapCity.put(i, cities[i]);
		}
		
		System.out.println(mapCity);
		
		//////////////////////////////////////////////////////////////////
		//반복문을 이용해보자!!
		//카만 추출(keySet())해서 저장소(Integer -> Set<Integer> )에 담아둔 다음
		//Iterator 등으로 꺼내온 (next) 다음,
		//get(iter로 꺼내온 키) 한테 넣어주면 된다!
		
		System.out.println(mapCity.keySet());
		//키만 추출해서 저장소에 저장한다
		Set<Integer> set = mapCity.keySet();
		
		//출력해보자
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
//		System.out.println(mapCity.get(iter.next()));
			Integer key = iter.next();
			//int key = iter.next();
			System.out.println(key +" "+mapCity.get(key));
		}
		
		System.out.println();
		
//		for (Integer integer : set) {
//			System.out.println(integer + ". "+mapCity.get(integer));
//		}
		for (Integer key : mapCity.keySet()) {
			System.out.println(key + ". "+mapCity.get(key));
		}
		/////////////////////////////////////////////////////////
		iter = mapCity.keySet().iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			System.out.println(key +" "+mapCity.get(key));
		}
		
		
		
		
		
		
		
		
		
		
	}

}










