package setEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest4 {

	public static void main(String[] args) {
		// 총 6개의 요소가 있다!
		String[]str = {"C언어", "자바", "XML", "C언어", "HTML","자바"};
		
		//이중, C언어, 자바가 겹치는 요소이다!
		HashSet hs1 = new HashSet();
		HashSet hs2 = new HashSet();
		
		//h1에는 중복배제된 모든 요소를 넣는다
		//h2에는 중복된 요소만 모아 놓는다!
		
		
		//향상된 for문으로 연습해 보자!
		
		//1. hs1에 tmp를 추가한다.
		//2. 성공하면 그대로 hs1에 담는다 그리고
		//3. 리턴값은 true가 된다.
		//4. 그 후에 ! 연산자로인해 false가 된다.
		//5. 따라서 if문 영역 안으로 들어오지 못하고, for문으로 이동!
		//6. 만약 hs1에 tmp를 add 시킬때,,
		//7. 실패하면(동일한 요소가 있다면), false가 나온다
		//8. false는 !연산자로 인해 true 값이 되고
		//9. if문 안으로 들어온다.
		//10. 동일한 값을 저장하는 hs2에 저장하게 된다
		//※ add()는 요소를 추가할 대 hashCode() 와 equals()를 비교하게 된다!
		// 그 후, 동일한 hashCode() 값이 존재하면, add 시키지 않고 false를 주게 된다!

		for (String tmp : str) {
			if(!hs1.add(tmp)) { 
				hs2.add(tmp); 
			}
		}
		System.out.println("중복배제된 모든 요소 hs1 : "+hs1);
		System.out.println("중복된 모든 요소 hs2 : "+hs2);
		
		//removeAll 메서드 - 겹치는 요소를 지움
		hs1.removeAll(hs2);
		System.out.println("hs2랑 겹치는 요소를 hs1에서 지움 : "+hs1);
		
		System.out.println("set에 있는 요소가 비어 있니? : "+hs1.isEmpty());
		hs1.clear();
		System.out.println("set에 있는 요소가 비어 있니? : "+hs1.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


















