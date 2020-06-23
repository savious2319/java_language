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
public class ForEachTest2 {

	public static void main(String[] args) {
		
		int[][] arScore = { 
				{10,20,30,40},	//1번
				{50,60,70,80},	//2번
				{51,61,71,81},	//3번
		};
		//향샹된 for문을 이용해서
		//번호, 각 점수, 총점
		//번호, 각 점수, 총점
		//번호, 각 점수, 총점
		int cnt = 0;
		int sum = 0;
		int i = 0;
//		for (int[]num  : arScore) {
//			System.out.println(++i + "번");
//			for (int score : num) {
//				System.out.print(score +"점 ");
//				sum += score;
//				cnt++;
//				if(cnt == 4) {
//					System.out.println("\n총점 : " +sum +"점\n");
//					sum = 0;
//					cnt = 0;}
//			}
//		}
		for (int[] arTemp  : arScore) {   //2차원 배열의 부분요소는 다시 배열이다(1차원)
			System.out.println(++i + "번");
			for (int score : arTemp) {   // 1차원 배열의 부분요소는 int이다. 임시변수 score
				System.out.print(score +"점 ");
				sum += score;
			}
			System.out.println("\n총점 : " +sum +"점\n");
			sum = 0;
		}
	}

}












