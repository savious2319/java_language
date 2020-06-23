package enumEx;

import java.util.Enumeration;
import java.util.Vector;

/*
 	Enumeration 인터페이스 
 	
 	컬렉션에 접근해서 요소를 찾아갈때 쓴다!
 	
 	(컬렉션을 Enumeration에 등록하기)     : elements()
 	(컬렉션에서 더 읽어올 요소가 있나요?) : hasMoreElements() true, false
 	(그럼 그 다음 요소를 읽어와라!)		  : nextElement()
 	
 	
 */
public class EnumTest {

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
		
		//vec 요소를 Enumeration(열거자)을 이용해서 출력해 보자!
		//1. vec를 등록시키자: elements()
		//2. vec의 요소가 있는지 검사하자 : hasMoreElements()
		//3. vec의 요소를 꺼내오자! : nextElement()
		
		
		
		//객체 = vec.elements();
		Enumeration<String> en = vec.elements();
		/*System.out.print(en.hasMoreElements() + " ");
		System.out.println(en.nextElement());
		
		System.out.print(en.hasMoreElements() + " ");
		System.out.println(en.nextElement());
		
		System.out.print(en.hasMoreElements() + " ");
		System.out.println(en.nextElement());
		
		System.out.print(en.hasMoreElements() + " ");
		System.out.println(en.nextElement());
		
		System.out.print(en.hasMoreElements() + " ");*/
		//System.out.println(en.nextElement());
		
		
		while(en.hasMoreElements()) {  // fase가 나올때까지 무한반복한다
			System.out.println(en.nextElement());
		}
	}

}













