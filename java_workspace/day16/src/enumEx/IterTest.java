package enumEx;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
  	Enumeration : "열거자" 구버전!!!
 	
 	Iterator 인터페이스 : "반복자"  신버전!!!
 	
 	
 	
 	컬렉션에 접근해서 요소를 찾아갈때 쓴다!
 	
 	(컬렉션을 Iterator에 등록하기)     : iterator()
 	(컬렉션에서 더 읽어올 요소가 있나요?) : hasNext() 	true, false
 	(그럼 그 다음 요소를 읽어와라!)		  : next()
 	
 	
 */
public class IterTest {

	public static void main(String[] args) {

		String[]arStr = {"안녕","홍길동","이순신","박문수"};
		
		Vector<String> vec = new Vector<String>();
		
		//배열 String == vec<String>의 저장소 타입이 동일하게 됐다
		//동일한 타입으로 맞춰놨다!
		
		//vec에다가 add(배열의 요소를) 시킬 수 있게 됐다!
		
		for (int i = 0; i < arStr.length; i++) {
			vec.add(arStr[i]);
		}
		
		System.out.println(vec);
		
		
		//Iterator로 접근해서 출력해 보자!
		
		//객체 = vec.iterator();
		Iterator<String> iter = vec.iterator();
		
		//객체.요소가 있니?
		while(iter.hasNext()) {
			//객체에서 꺼내와 -> 출력문에 넣어!
			//Object obj = iter.next();  //대입 연산
			System.out.println(iter.next());  //또 출력
											  // next() 메서드는 컬렉션에서 다음 요소로 커서를 옮기라는 뜻
											  // next()를 사용할 때마다 요소의 위치가 변경된다!
		}
		//next()를 통해서 끝까지 갔으면, 더이상 요소를 가리킬 수 없다.
		//그래서 반복자(열거자)를 사용하고 싶으면, 다시 등록시키자!
		iter = vec.iterator(); //다시 등록
		System.out.println(iter.next());  //또 출력
		
		
		
	}

}













