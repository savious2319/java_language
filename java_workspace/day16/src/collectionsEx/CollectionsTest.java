package collectionsEx;

import java.util.ArrayList;
import java.util.Collections;

/*
 	Collections : 클래스  (Collection은 인터페이스)
 	
 	- 컬렉션을 사용할 수 있는 메서드들을 갖고 있는 클래스
 */
public class CollectionsTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		System.out.println(list);
		
		//1뒤에 0을 넣고 싶다!
		//list.add(0);
		System.out.println(list);
		
		list.add(list.indexOf(1)+1, 0); // +1은 그 다음 번째를 의미 
		System.out.println(list);
		
		//10,20  10과 20 사이에 15를 넣으세요!
		//20을 indexOf로 찾아서 15를 add() 시켰다!
		//그런데 이번에는 1이 마지막방이었다!
		//그래서, 그냥 1을 찾으면 1에 자리에 0이 들어가고,
		//1이 뒤로 밀리게 된다!
		//그래서 indexOf(1) "+1" 그 다음 요소를 알려준 뒤 삽입했다
		
		/////////////////////////////////////////////////////////
		// Collections : static 메서드를 보유하고 있다!
		System.out.println(Collections.max(list));

		ArrayList<Integer> cpyList = new ArrayList<>(list);
		
		
		Collections.sort(cpyList);
		System.out.println("원본 : "+list);
		System.out.println("sort() : "+cpyList);  //오름차순으로 list자체가 변경
		
		Collections.shuffle(cpyList); //섞다
		System.out.println("Collections.shuffle(cpyList) : "+cpyList);
		
		//cpyList를 내림차순으로 변경하고 싶다!
		//sort() : 오름차순!!!
		//reverse()
		Collections.reverse(cpyList);
		System.out.println("Collections.reverse(cpyList) : "+cpyList);
		
		Collections.sort(cpyList);   //오름차순으로 한 다음
		Collections.reverse(cpyList); //그것을 거꾸로 나열하면 내림차순이 된다
		System.out.println("Collections.sort(cpyList) + Collections.reverse(cpyList) : "+ cpyList);
		
	}

}


























