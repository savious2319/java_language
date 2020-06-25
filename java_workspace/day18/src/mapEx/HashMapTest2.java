package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 	HashMap<Ű, ���>
 		put(Ű, ���)
 		get(Ű)
 */
public class HashMapTest2 {

	public static void main(String[] args) {
		//                   0   ,  1   ,  2    , 3   ,  4   ,  5
		String []cities = {"����","����","�뱸","����","�λ�","���"};

		HashMap<Integer, String> mapCity = new HashMap<>();

		for (int i = 0; i < cities.length; i++) {
			mapCity.put(i, cities[i]);
		}
		
		System.out.println(mapCity);
		
		//////////////////////////////////////////////////////////////////
		//�ݺ����� �̿��غ���!!
		//ī�� ����(keySet())�ؼ� �����(Integer -> Set<Integer> )�� ��Ƶ� ����
		//Iterator ������ ������ (next) ����,
		//get(iter�� ������ Ű) ���� �־��ָ� �ȴ�!
		
		System.out.println(mapCity.keySet());
		//Ű�� �����ؼ� ����ҿ� �����Ѵ�
		Set<Integer> set = mapCity.keySet();
		
		//����غ���
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










