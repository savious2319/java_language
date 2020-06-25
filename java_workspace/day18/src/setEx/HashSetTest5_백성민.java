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
		
		HashSet set1 = new HashSet();
		HashSet set2 = new HashSet();
		int cnt1 = 0; //전체 카운트
		int cnt2 = 0; // 동일한 난수 세는 카운트
		int rNum = 0;
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
		while(set1.size() < 6){   //set1.size() < 6 --> set1에 
			rNum = r.nextInt(45)+1;
			if(!set1.add(rNum)){  //처음에 난수가 입력된다
				set2.add(rNum);   //입력이 성공되면 true라 리턴되고 !연산자때문에 false가 되서 if문을 빠져나간다
				cnt2++;           //그리고 cnt1이 누적된다.
			}                     //만약 같은 숫자가 있으면 false가 리턴되고 !연산자때문에 true가 되서 if문에 들어가
			cnt1++;               //set2.add(rNum)에 입력되고 동일한 난수의 수를 구해주는 cnt2에 누적이 된다
	
		}
		System.out.println("set1(6개의 난수) : " + set1 +" \n"+cnt1+"번 만에 로또숫자가 채워졌음");
		System.out.println("set2(동일한 난수) : " + set2 +" "+cnt2+"개");
		
		
		
		
		// 2. 최초 6개 출력
		// 2-1. 이후 오름차순 정렬!
		
		List setList = new ArrayList(set1);
		Collections.sort(setList);
		
		System.out.println("로또번호 오름차순 : " +setList);
		
		
		
		
		
		
		
	}

}


















