package setEx;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		Object [] ar = {"1","2","3","4","5", new Integer(6), 7};
		HashSet<Object> set = new HashSet<>();
		ArrayList<Object> list = new ArrayList<>();
		
		for (int i = 0; i < ar.length; i++) {
			list.add(ar[i]);
		}
		
		for (int i = 0; i < ar.length; i++) {
			set.add(ar[i]);
		}
		
		System.out.println("HashSet : "+set);
		
		System.out.println("ArrayList : "+list);
		
		//������ 1~7���� ����ִµ�,
		//�ٽ�, 1,2,3�� �߰��ߴ�. (�� 10���� ��Ҹ� �־��µ�...)
		System.out.println(set.add("1")); //�߰��� �ȵƴ�!!! false!!!
		System.out.println(set.add("2"));
		System.out.println(set.add("3"));
		
		System.out.println(list.add("1")); 
		System.out.println(list.add("2"));
		System.out.println(list.add("3"));
		//�ߺ��� �����Ѵ�!
		System.out.println("HashSet 1~3���� �߰� �� : "+set);
		System.out.println("ArrayList 1~3���� �߰� �� : "+list);
		
	}

}
