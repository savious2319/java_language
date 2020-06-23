package foreachEx;

import java.util.Iterator;

/*
 	빠른 for문 (foreach) - 컬렉션에서만 사용가능!
 	
 	for( A : B ){		B : 컬렉션(배열, list, set...) 데이터 모음!
 						A : 컬렉션에서 요소 하나씩 가져올 때 저장해야할 임시 변수!
 						
 						
 	}
 	
 	for(      int tmp : new int[]{10,20,30}){
 	
 	
 	
 	}
 */
public class ForEachTest {

	public static void main(String[] args) {
		
		int [] ar = {10,20,30};
		/*
		for(임시변수선언 : 컬렉션) {
			
			인시변수를 활용하자
		}
		*/
		
		for(int x : ar) {
			System.out.println(x);
			
		}

		String [] str = {"이순신","박문수","홍길동"};
		
		
		for(String tmp : str) {
			System.out.println(tmp);
		}
	}

}












