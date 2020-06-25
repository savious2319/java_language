package setEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();		
		HashSet setB = new HashSet();
		
		//add()메서드로 값을 넣는다 
		setA.add("1"); 	setA.add("2"); 	setA.add("3");
		setA.add("4"); 	setA.add("5"); 	setA.add("6");
		
		setB.add("5"); 	setB.add("6"); 	setB.add("7");
		setB.add("8"); 	setB.add("9"); 	setB.add("0");
		
		System.out.println("setA : "+setA);
		System.out.println("setB : "+setB);
		
		//setA를 Iterator에 등록시킨다
		Iterator iter = setA.iterator();
		
		//더 읽어올 요소가 없을때까지 무한반복 시켜서 값을 출력한다
		while(iter.hasNext()) {
		Object temp = iter.next(); //값을 임시변수 temp에 담는다 
		System.out.print(temp + " ");
		}
		
		System.out.println();
		//setB도 꺼내와 보자!
		iter = setB.iterator();
		
		while(iter.hasNext()) {
			Object temp = iter.next();
			System.out.print(temp+ " ");
		}
		
		
	}

}
