package team_homework;

import java.util.Scanner;

/*
	*** 별찍기 문제 ***
	
	별 찍기 문제는 *을 이용해서 도형을 만들어 내는 문제입니다.
	높이 또는 너비를 물어보고 도형의 모양을 찍어내기 바랍니다.
	
	메뉴 구성  : (문제 풀이 :    )
	1. 직각사각형
	2. 직각삼각형
	3. 역 직각삼각형
	4. 하단 삼각형
	5. 마름모
	6. 별+알파벳
	0. 종료
	번호를 고르세요 : 
	
 제출 : java_homework / java_day03 / Print_star 폴더
 			
 			Print_star_홍길동_박문수_김정수.java
 
 */

public class Print_star {
	
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * 1번 문제 풀이 직각 사각형
	 */
	static void printSquare() {
//		1. 직각 사각형  (문제 풀이 :  000)
//		높이, 너비
//		높이는? : 3
//		너비는? : 5
//
//		*****
//		*****
//		*****
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	/**
	 * 2번 문제 풀이 직감 삼각형
	 */
	static void printTriangle_v1() {
//		 2. 직각 삼각형  (문제 풀이 :  000)
//	 		높이는? 4
//	 		*
//	 		**
//	 		***
//	 		****

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	/**
	 * 3번 문제 풀이 역 직각 삼각형
	 */
	static void printReverseTriangle_v1() {
//		3. 역 직각 삼각형 : 높이는? __  (문제 풀이 :  000)
//		 		   *
//		 		  **
//		         ***
//		        ****
//		       *****

		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 4 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 4 - i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 4번 문제 풀이 : 백성민 
	 * 높이가 5인 하단 삼각형
	 */

	static void printTriangle_v2() {
//	    4. 하단 삼각형  : 높이는?  5  (문제 풀이 :  백성민)
//	    	       *****
//	    	       ****
//	    	       ***
//	    	       **
//	    	       *
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		int cnt = 5;
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < cnt; j++) {
//				System.out.print("*");
//			}
//			cnt--;
//			System.out.println();
//		}
	}

	/**
	 * 5번 문제 풀이 : 백성민 
	 * 하단 역삼각형
	 */
	static void printReverseTriangle_v2() {
//		 5. 하단 역삼각형 : 높이는? (문제풀이 : 백성민)
//		    	 *****
//		          ****
//		           ***
//		            **
//		             *
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j < 5; j++) {
				System.out.print("*");

			}

			System.out.println();
		}
	}
	/**
	 * 6번 문제 풀이 : 마름모
	 */
	static void printDiamond() {
//	    6.마름모  :  높이는?   5  (문제 풀이 :  000)
//	    	    
//	            *
//	           ***
//	          *****
//	           ***
//	            *
//	         
//	         (짝수 높이일 경우 마름모 높이가 안맞음!!! 처리하기!!)
		//System.out.print("마름모의 높이를 입력하세용 : "); int n = sc.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 3-(2*i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}
	/**
	 * 7번 문제 풀이 : 별 알파벳 찍기
	 */
	static void printStarAndAlpha() {

//		7. 별 알파벳 찍기  (문제 풀이 :  000)
//	       1) 사용자로부터 높이(행의 갯수)를 입력받습니다.
//	       	  예) n행 (1행~50까지만 입력받습니다)
//	       
//	       2) 행 출력방식  
//	          (1) 열의 길이는 알파벳 수(A~Z)와 동일합니다.
//	          (2) 첫 행은 A가 나오고 나머지 열에는 * 이 등장합니다.
//	          (3) 다음행은 B가 나오고 나머지 열에는 *이 등장합니다.
//	          (4) 이렇게 n행까지 한 줄에 알파벳 하나씩 등장합니다.
//	       	  
//	       3) Z행이 넘어가는 값을 출력할 때는 반대로 알파벳을 출력해야 합니다.
//	       
//	          출력예
//	       		A*******************
//	       		*B******************
//	       		**C*****************
//	       		.....
//	 			*****************W**
//	 			******************Y**
//	       		*******************Z
//	            ******************Y*
//	            *****************X**
//	            ****************W***
		
		while (true) {
			char Alpha = 'A' - 1;
			int colNum = 0;
			System.out.print("몇 행을 보고 싶으세요?");
			colNum = sc.nextInt();
			if (colNum > 0 && colNum < 52) {
				for (int i = 0; i < colNum; i++) {
					for (int j = 0; j < 26; j++) {
						if (i == j) {
							Alpha++;
							System.out.print(Alpha);
						} else if (i + j == 50) {
							Alpha--;
							System.out.print(Alpha);
						} else {
							System.out.print("*");
						}

					} // end of j for
					System.out.println();
				} // end of i for
				//break;
			} else {
				System.out.println("1행부터 51행까지만 입력받습니다");
			} // end of else
		} // end of while

	}

	public static void main(String[] args) {

//		// 1.직각 사각형
//		Print_star.printSquare();
//		System.out.println();
//
//		// 2.직각 삼각형
//		Print_star.printTriangle_v1();
//		System.out.println();
//
//		// 3.역 직각 삼각형
//		Print_star.printReverseTriangle_v1();
//		System.out.println();
//
//		// 4.하단 삼각형
//		Print_star.printTriangle_v2();
//		System.out.println();
//
//		// 5.하단 역삼각형
//		Print_star.printReverseTriangle_v2();
//		System.out.println();

		// 6.마름모
		Print_star.printDiamond();
		System.out.println();

		// 7.별 알파벳 찍기
		//Print_star.printStarAndAlpha();

	}// end of main

} // end class Print_star
