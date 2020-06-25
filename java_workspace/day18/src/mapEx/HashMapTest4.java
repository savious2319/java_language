package mapEx;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 	HashMap<키, 밸류>
 		put(키, 밸류)
 		get(키)
 		
 	entrySet() - 키하고 벨류를 동시에 가져온다! Set 형태로 리턴!!!	
 */
public class HashMapTest4 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("박문수", 100);
		map.put("이순신", 90);
		map.put("홍길동", 30);
		map.put("유관순", 70);
		map.put("임꺽정", 20);
		map.put("김정수", 90);
		
		//System.out.println(map);
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		Iterator <Map.Entry<String, Integer>> iter = set.iterator();
		
		//전체 요소를 출력해 보자!
		
		while(iter.hasNext()) {
		Map.Entry<String, Integer> tmp = iter.next();
		
		System.out.println(tmp.getKey() + " " + tmp.getValue());
		
		}
		
		//////////////////////////////////
		//1. 모든 점수 출력
		//2. 총점/평균(.1)출력
		//3. 최고점
		//4. 최저점 출력
		int sum = 0;
		iter = set.iterator();
		Collection<Integer> grade = map.values();
		Iterator<Integer> iter2 = grade.iterator();
		
		System.out.println("////////////////////////////////");
//		System.out.println(grade);
//		for (Integer tmp : grade) {
//			sum += tmp;
//		}
//		System.out.println("총점 : "+sum);
//		System.out.println("평균 : "+sum / 3.0);
		while(iter2.hasNext()) {
			int score = iter2.next().intValue();
			System.out.println(iter.next().getKey() +" : "+score+"점");
			sum += iter2.next().intValue();
		}
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+String.format("%.1f", (double)sum / set.size()));
		
		System.out.println("최고점 : " +Collections.max(grade));
		System.out.println("최저점 : " +Collections.min(grade));
	}

}


















