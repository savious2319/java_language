package listEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
  	ArrayList
  		-Vector의 메서드들을 거의 승계해서 사용
  			capacity() 등이 없음
  		-capacity 와 size가 동일함!
 	
 	**List 계열의 특징  
 	  1. 같은 요소가 이미 들어 있어도 중복해서 계속 넣을 수 있다!!
 	  2. 순서가 존재한다 (인덱스)
 		
 		
 */
public class ListTest02 {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList(); //list의 타입은 Object 이다
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		
		//일반 for으로 점수, 총합 구해보기
		
		//빠른 for문으로 점수, 총합 구해보기
		
		System.out.println("일반 for 점수");
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) +"점");
			//sum += (Integer)list.get(i);  // 객체를 자식 타입으로 형변환 가능!
			sum += (int)list.get(i); //  auto boxing때문에 가능
		}
		System.out.println("일반 for총합 : "+sum);
		
		
//		generic를 쓰면 형변환 할필요없다
//		for (int i = 0; i < list2.size(); i++) {
//			sum += list2.get(i);
//		}
		
		
		System.out.println();
		sum = 0;
		System.out.println("빠른 for문 점수");
		for (Object tmp : list) {
			System.out.println(tmp + "점");
			//sum += (Integer)tmp;
			sum += (int)tmp;
		}
		System.out.println("빠른 for문 총합 : "+sum);
		
		//30점을 찾아서 300으로 변경해 보세요~
		if(list.contains(30)) {
			list.set(list.indexOf(30), 300);
		}else {
			System.out.println("찾는 요소가 없어요");
		}
		
		
//		for (Object tmp : list) {
//			if(list.contains(30)) {
//				list.set(2, 300);
//			}
//		}
		
		System.out.println(list);
		
		//10점과 20점 사이에 15점을 삽입하세요!
		//오버로딩된 add 메서드 사용하기
		
		list.add(list.indexOf(20), 15);
		System.out.println(list);
		
		//40과 50만 추출해서 출력해 보세요
		
//		System.out.println(list.subList(list.indexOf(40), list.indexOf(60)));
		List list3 = list.subList(list.indexOf(40), list.indexOf(50)+1);  // List로 반환하니까 List로 받아야 한다
		
		//ArrayList list3 = (ArrayList)list.subList(list.indexOf(40), list.indexOf(50)+1);
		//형변환 에러!
		ArrayList list4 = new ArrayList(list.subList(list.indexOf(40), list.indexOf(50)+1));
		// ArrayList로 받는다면 new ArrayList로 형변화 시켜야 한다
		
		
		System.out.println(list2);
		System.out.println(list3);

		//요소 삭제시 받드시 해당 요소 존재 여부 검사 후에 삭제할 수 있도록 하자
		if(list.contains(50)) {
			int idx = list.indexOf(50);
			list.remove(idx);
			System.out.println(list);
		}else {
			System.out.println("삭제하고자 하는 요소가 없습니다");
		}
		
		
	}

}










































