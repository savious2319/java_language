package setEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class HashSetTest5_백성민 {

	public static void main(String[] args) {
		//로또 만들기!
		
		// 1~45까지, 6개의 데이터(난수)를 출력한다!
		
		// 6개의 난수를 HashSet으로 받는다 왜냐하면 중복되는 숫자 없이 입력을 받을 수 있기때문에!
		// HashSet size가 6이 될때까지 계속 무한루프를 돌리자
		// while문으로 돌리자!
		
		// 1. 이때, 동일한 난수가 몇개 있었는지 출력해 보자!
		
		//      몇번 만에 6개 채워졌는지도 출력해 보자
		
		//
		
		Random r = new Random();
		
		HashSet<Integer> set = new HashSet<>(); //set1은 난수 6개를 넣을 객체
		ArrayList<Integer> list = new ArrayList<>(); //set2는 중복된 난수를 담을 객체 
													 //ArrayList는 동일한 수가 들어와도 저장된다
													 //Set으로 하면 동일한 수가 들어오면 튕겨져 나간다!!!!
		int cnt1 = 0; //전체 카운트
		int cnt2 = 0; // 동일한 난수 세는 카운트
		int rNum = 0; // 난수를 저장할 변수
//		while(true){
//			rNum = r.nextInt(45)+1;
//			if(!set1.add(rNum)){
//				set2.add(rNum);
//				cnt2++;
//			}
//			cnt1++;
//			if(set1.size() == 6) {
//				break;
//			}
//		}
//		while(set1.size() < 6){   //set1.size() < 6 --> set1에 난수가 인덱스[0],[1],[2],[3],[4],[5]순으로 들어온다.
//																//[6] < 6 때 while문을 빠져서 6개의 난수를 출력한다
//			rNum = r.nextInt(45)+1; //1~45사이의 난수가 rNum에 대입된다
//			if(!set1.add(rNum)){  //처음에 난수가 입력된다
//				set2.add(rNum);   //입력이 성공되면 true라 리턴되고 !연산자때문에 false가 되서 if문을 빠져나간다
//				cnt2++;           //그리고 cnt1이 누적된다.
//			}                     //만약 같은 숫자가 있으면 false가 리턴되고 !연산자때문에 true가 되서 if문에 들어가
//			cnt1++;               //set2.add(rNum)에 입력되고 동일한 난수의 수를 구해주는 cnt2에 누적이 된다
//								  //그리고 if문을 나와서 다시 cnt1에 다시 누적이된다. 그래서 총 몇번만에 6개가 채워졌는지
//							   	  //알 수 있다
//	
//		}
		
		while(set.size() < 6) {
			if(!set.add(Integer.valueOf(r.nextInt(9)+1))) {
				list.add(Integer.valueOf(r.nextInt(9)+1));
				cnt2++;
			}
			cnt1++;
		}
		
		
		
		
		System.out.println("set1(6개의 난수) : " + set +" \n"+cnt1+"번 만에 로또숫자가 채워졌음");
		System.out.println("set2(동일한 난수) : " + list +" "+cnt2+"개");
		
		
		
		
		// 2. 최초 6개 출력
		// 2-1. 이후 오름차순 정렬!
		//Collections.sort 메서드는 인자 값이 List여서 HashSet에서 List 타입으로 바꾸어줘야 한다.
		//List타입의 (ArrayList)생성자값을 set1으로 한다.
		
		//ArrayList setList = new ArrayList(set1); 
		List<Integer> setList = new ArrayList<>(set); 
		Collections.sort(setList);
		
		
		System.out.println("로또번호 오름차순 : " +setList);
		
		
		
		
		
		
		
	}

}


















