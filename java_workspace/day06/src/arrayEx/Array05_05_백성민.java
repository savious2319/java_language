package arrayEx;

import java.util.Random;

public class Array05_05_백성민 {

	public static void main(String[] args) {
//	문제5)
//	100 미만의 양의 정수들이 난수로 주어진다.  30미만으로 조정할 수 있다
//	정수형 배열 20개에 입력받은 후,
//	입력받은 난수가 각각 몇개인지 출력해야 한다.
//	이때, 작은 수부터 몇개가 겹치는지 출력해야 한다.
//	단, 카운트가 0개인 숫자는 출력하지 않는다.
//
//	1 : 5개
//	2 : 6개
//	45 : 1개
//	67 : 4개
//	99 : 1개

		
		
//		static void printScore() {
//			
//		}
		
		int cnt = 0;
		int[] arNum = new int[20];
		Random r = new Random();

		for (int i = 0; i < arNum.length; i++) {
			arNum[i] = r.nextInt(30);

		}

		for (int i = 0; i < arNum.length; i++) {
			for (int j = i + 1; j < arNum.length; j++) {
				if (arNum[i] > arNum[j]) {
					int temp = arNum[i];
					arNum[i] = arNum[j];
					arNum[j] = temp;
				}
			}
		}

		int[] tempCnt = new int[20];

		for (int i = 0; i < arNum.length; i++) {
			for (int j = 0; j < arNum.length; j++) {
				if (arNum[i] == arNum[j]) {
					cnt++;
					tempCnt[i] = cnt;
				} // if
			} // j for
			cnt = 0;
		} // i for
		for (int i = 0; i < arNum.length; i++) {
			System.out.print(arNum[i] + " ");
		}
		
		System.out.println();
		
//		for (int i = 0; i < arNum.length; i++) {
//			if(tempCnt[i] >= 1) {
//				System.out.println(arNum[i] + " : " + tempCnt[i] + "개");
//			}
//		}
		
		System.out.println();

//		for (int i = 0; i < arNum.length; i++) {
//				if (i == arNum.length-1) {
//					if (arNum[i-1]==arNum[i]) {
//						System.out.println(arNum[i] + " : " + tempCnt[i] + "개");
//					}
//						else{
//						System.out.println(arNum[i] + " : " + tempCnt[i] + "개");
//					}
//				}else {
//					if (arNum[i] == arNum[i + 1]) { //arNum[0]이 arNum[1]과 같다면 arNum[0]은 출력을 안한다.
//													//arNum[1]이 arNum[2]와 다르면 arNum[1]가 출력된다.
//													//arNum[18]이 arNum[19]와 같다면 arNum[18]이 출력안되고 continue된다.
//													//i(19) == arNum.length-1로 들어와 arNum[19]를 출력한다
//													//arNum[18]이 arNum[19]와 다른면 arNum[18]이 출력된다.
//													//그 다음 i(19) == arNum.length-1로 들어와 arNum[18]이 arNum[19]이
//													//다르기때문에 else문에 들어가서 arNum[19]가 출력된다.
//						continue;
////				} else if (i == arNum.length) {
////					System.out.println(arNum[i] + " : " + tempCnt[i] + "개");
////				} 
//					}else {
//						System.out.println(arNum[i] + " : " + tempCnt[i] + "개");
//					}
//				}
//		}

		
//		for (int i = 1; i < arNum.length; i++) {  // i = 0, j = i +1   j > i
//			for (int j = i-1; j < i; j++) {
//				if (arNum[i] != arNum[j]) {  
//					System.out.println(arNum[j] + " : " + tempCnt[j] + "개");  // arNum[i]
//				}
//				if(i == (arNum.length-1)) {	
//					System.out.println(arNum[i] + " : " + tempCnt[i] + "개");  // arNum[j]
//				}
//			}// j for
//		
//
//		} // i for
		
		for (int i = 0; i < arNum.length; i++) {  // i = 0, j = i +1   j > i
			for (int j = i+1; j > i; j++) {
				if (arNum[i] != arNum[j]) {  
					System.out.println(arNum[i] + " : " + tempCnt[i] + "개");  // arNum[i]
				}
				if(j == (arNum.length-1)) {	
					System.out.println(arNum[j] + " : " + tempCnt[j] + "개");  // arNum[j]
				}
			}// j for
		

		} // i for

		
		
		
		
		
		// 윤순호씨 소스코드
//	for (int i = 0; i < arNum.length; i++) {
//		for (int j = 0; j < arNum.length; j++) {
//			if(i == arNum[j]) {
//				cnt++;
//			}//if
//		}// j for
//		if(cnt >= 1) {
//		System.out.println(i + " : " + cnt + "개");
//		}
//		cnt = 0;
//	}// i for
	}

}
