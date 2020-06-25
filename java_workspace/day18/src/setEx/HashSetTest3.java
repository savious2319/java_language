package setEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest3 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		setA.add("6");

		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		setB.add("9");
		setB.add("0");

		// 교집합 : 두 집합간에 공통 요소를 모아 놓은 집합 -> 5, 6
		// 차집합 : A-B A에만 있는 거 (B와 공통 요소를 배제 시킨 것) -> 1,2,3,4
		// B-A B에만 있는 것 -> 7,8,9,0,
		// 합집합 : A와 B의 요소를 모두 합친 것, 공통 요소는 배제 -> 0 ~ 9 하나씩 나오게!

		HashSet setHap = new HashSet(); // 0,1,2,3,4,5,6,7,8,9
		HashSet setKyo = new HashSet(); // 5,6
		HashSet setChaA_B = new HashSet(); // 1~4
		HashSet setChaB_A = new HashSet(); // 7~0

		// 요소를 하나꺼내와서, A 집합에 포함되어 있니? 응, 그럼 교집합에 추가시켜!
		// Iterator 등록해서 쓰면 빠르다!
		Iterator iter = setB.iterator();
		while (iter.hasNext()) {
			Object temp = iter.next();

			if (setA.contains(temp)) {

				setKyo.add(temp);
			}
		}

		System.out.println("setA와 setB의 교집합 : "+setKyo);

		// 차집합 A-B:
		iter = setA.iterator();
		while(iter.hasNext()){
		Object temp = iter.next();
		if(!setB.contains(temp))
		setChaA_B.add(temp);
		}
		System.out.println("차집합 A-B : "+setChaA_B);
		// 차집합 B-A:
		iter = setB.iterator();
		while(iter.hasNext()){
			Object temp = iter.next();
			if(!setA.contains(temp))
				setChaB_A.add(temp);
		}
		System.out.println("차집합 B-A : "+setChaB_A);
		
		//HashSet 합집합
//		iter = setA.iterator();
//		while(iter.hasNext()) {
//			Object temp = iter.next();
//			setHap.add(temp);
//		}
//		iter = setB.iterator();
//		while(iter.hasNext()) {
//			Object temp = iter.next();
//			setHap.add(temp);
//		}
		iter = setB.iterator();
		while(iter.hasNext()) {
			setHap.add(iter.next());
		}
		iter = setA.iterator();
		while(iter.hasNext()) {
			setHap.add(iter.next()); //setHap은 setB를 갖고 있다. 이 상태에서 setA를 추가시키자! 이때, 이미 들어있는 요소는
									 //알아서 배제한 후 없는 요소만 넣게 된다!! Set!
		}
		System.out.println("HashSet 합집합 : "+setHap);
		
		
		//ArrayList 합집합
		ArrayList ar = new ArrayList();
		
		iter = setA.iterator();
		while(iter.hasNext()) {
			Object temp = iter.next();
			ar.add(temp);
		}
		iter = setB.iterator();
		while(iter.hasNext()) {
			Object temp = iter.next();
			ar.add(temp);
		}
		System.out.println("ArrayList 합집합 : "+ar);
	}

}


















