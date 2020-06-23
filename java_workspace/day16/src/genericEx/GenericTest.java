package genericEx;

import java.util.ArrayList;

/*
 	제너릭 (Generic)
 	컬렉션 클래스<제너릭> 객체 = 인스턴스();
 	ArrayList<String> list = ArrayList<String>();
 	
 	컬렉션 객체를 만들 때, 형을 명시해서, 미리 add() 될 때의 타입을 검증할 수 있다!
 */
public class GenericTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		int num = 1234;
		list.add("안녕");
		list.add("박문수");
		list.add(num+"");			// 이 데이터는 add 시킬 수가 없네??!! 확인!!
									// 타입을 체크할 수 있다
		list.add(String.valueOf(num));
		list.add("홍길동");
		
		
	}

}
