package setEx;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		Object [] ar = {"1","2","3","4","5", new Integer(6), 7};
		HashSet<Object> set = new HashSet<>();
		
		for (int i = 0; i < ar.length; i++) {
			set.add(ar[i]);
		}
		
		System.out.println(set);
		
		//������ 1~7���� ����ִµ�,
		//�ٽ�, 1,2,3�� �߰��ߴ�. (�� 10���� ��Ҹ� �־��µ�...)
		System.out.println(set.add("1")); //�߰��� �ȵƴ�!!! false!!!
		System.out.println(set.add("2"));
		System.out.println(set.add("3"));
		
		//�ߺ��� �����Ѵ�!
		System.out.println("1~3���� �߰� �� : "+set);
		
	}

}
