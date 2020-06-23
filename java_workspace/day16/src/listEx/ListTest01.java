package listEx;

import java.util.Vector;

/*
  	ArrayList	Vector		LinkedList 		Stack 등의 클래스 존재....  => List  인터페이스 소속
  	
  		List 인터페이스 -> Collection 인터페이스 소속!
  		
  	List 인터페이스 특징
  		-반드시 순서가 지정되어 있다. (배열의 인덱스 번호를 갖고 있다)
  		-일괄적인 정렬형태 (sequence)
  		-배열은 고정! 요소가 변하지 않는다
  		-하지만, List는 요소의 갯수를 변경시킬 수 있다!
  		
  		
  	Vector				ArrayList
  	(구버전)			(신버전)
 	초기값 10개
 		(요소는 Object로 받아야 한다)
 		
 		add(추가하고하는 요소)					요소를 추가한다.
 		equals(요소)							비교하고자 하는 요소의 동일 여부를 확인
 		get(인덱스 정수값)						해당 번호의 요소를 가져와라! (배열과 순서가 같다. 0번주터 시작)
 		indexOf(요소)							요소가 들어 있는 위치를 반환해라!
 		size() == 배열의 length					요소의 갯수를 알려준다 (실제 들어가 있는 용량)
 		capacity()								내가 담을 수 있는 총 용량 (RAM을 체크할때 쓴다) - Vector에만 존재. ArrayList에는 없다!
 		remove(정수)							삭제할때, 해당 정수(index)   remove(0) 0번방에 있는 요소를 제거해 주세요!
 		remove(요소)							(요소) 해당 요소가 있는지 찾아가서 지워 주세요!
 		set(인덱스, 요소)						해당 인덱스에 찾아가서 요소를 삽입해라!
 		trimToSize()							용량을 갯수에 맞게 조정한다 - Vector에만 존재. ArrayList에는 없다!
 		subList(int fromIndex, int toIndex)		from부터 to까지 저장된 객체를 반환해라! 리턴값을 List로 반환한다
 												왜? List 인터페이스로 리턴하면, Vector, ArrayList, LinkedList 등의 요소를
 												반환 받아 올 수 있다!
 												{10, 20, 30, "안녕", 10.5, 6} .toArray();
 		
 		toArray()					지정된 컬렉션을 배열로 반환한다.
 									Object[] 로 리턴값이 돌아온다!
 									
 		removeAllElements()  clear() 메서드와 동일!		모든 요소를 제거해라!
 		
 		
 		
 */
public class ListTest01 {

	public static void main(String[] args) {

		
		Vector vec = new Vector();
		System.out.println("총 용량 : "+vec.capacity());
		
		vec = new Vector(5);
		System.out.println("총 용량 : "+vec.capacity());

		//요소 추가
		vec.add(10);
		vec.add("안녕");
		vec.add(1.1);
		vec.add(true);
		vec.add('A');
		System.out.println("총 용량 : "+vec.capacity());
		
		vec.add(20);	//총용량 5개 중, 6번째 데이터를 넣었다.
		System.out.println("총 용량 : "+vec.capacity());
		
		vec.trimToSize();
		System.out.println("총 용량 : "+vec.capacity());
		
		vec.add(30);	//총용량 5개 중, 6번째 데이터를 넣었다.
		System.out.println("총 용량 : "+vec.capacity());
		
		//현재 요소의 갯수 : size()
		System.out.println("총 갯수 : "+ vec.size());
		
		System.out.println(vec.contains(1.1));
		System.out.println(vec.contains("안녕"));
		
		System.out.println(vec);  //vec.toString() 요소의 내용을 볼 수 있게 해놓았다
		
		System.out.println("일반 for문");
		for (int i = 0; i < vec.size(); i++) {
			System.out.println((i+1)+"번 "+vec.get(i));
		}
		System.out.println();
		for (int i = 0; i < vec.size(); i++) {
			System.out.println((i)+"번 인덱스 "+vec.get(i));
		}
		
		
		System.out.println("빠른 for문");
		for (Object tmp : vec) {
			System.out.println(tmp);
		}
		
		System.out.println("clear() 메서드 실행 후");
		vec.clear();
		for (Object tmp : vec) {
			System.out.println(tmp);
		}
	}

}


















