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
		
		//기존에 1~7까지 들어있는데,
		//다시, 1,2,3을 추가했다. (총 10개의 요소를 넣었는데...)
		System.out.println(set.add("1")); //추가가 안됐다!!! false!!!
		System.out.println(set.add("2"));
		System.out.println(set.add("3"));
		
		//중복을 배제한다!
		System.out.println("1~3까지 추가 후 : "+set);
		
	}

}
