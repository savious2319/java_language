package mapEx;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 	HashMap<Ű, ���>
 		put(Ű, ���)
 		get(Ű)
 		
 	entrySet() - Ű�ϰ� ������ ���ÿ� �����´�! Set ���·� ����!!!	
 */
public class HashMapTest4 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("�ڹ���", 100);
		map.put("�̼���", 90);
		map.put("ȫ�浿", 30);
		map.put("������", 70);
		map.put("�Ӳ���", 20);
		map.put("������", 90);
		
		//System.out.println(map);
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		Iterator <Map.Entry<String, Integer>> iter = set.iterator();
		
		//��ü ��Ҹ� ����� ����!
		
		while(iter.hasNext()) {
		Map.Entry<String, Integer> tmp = iter.next();
		
		System.out.println(tmp.getKey() + " " + tmp.getValue());
		
		}
		
		//////////////////////////////////
		//1. ��� ���� ���
		//2. ����/���(.1)���
		//3. �ְ���
		//4. ������ ���
		int sum = 0;
		iter = set.iterator();
		Collection<Integer> grade = map.values();
		Iterator<Integer> iter2 = grade.iterator();
		
		System.out.println("////////////////////////////////");
//		System.out.println(grade);
//		for (Integer tmp : grade) {
//			sum += tmp;
//		}
//		System.out.println("���� : "+sum);
//		System.out.println("��� : "+sum / 3.0);
		while(iter2.hasNext()) {
			int score = iter2.next().intValue();
			System.out.println(iter.next().getKey() +" : "+score+"��");
			sum += iter2.next().intValue();
		}
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+String.format("%.1f", (double)sum / set.size()));
		
		System.out.println("�ְ��� : " +Collections.max(grade));
		System.out.println("������ : " +Collections.min(grade));
	}

}


















