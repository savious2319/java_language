package team_homework;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Print_star_teamhomework {
	static Scanner sc = new Scanner(System.in);
	/**
	 *	문제 풀이 : 윤순호
	 * 	3행 5열로 *을 출력하는 메소드입니다.
	 */
	static void printSquare() {
		for(int i = 0;i<3;i++) {		//행
			for(int j = 0;j<5;j++) {	//열
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printSquare
	/**
	 * 문제 풀이 : 윤순호
	 * 높이가 n인 직각 삼각형을 *을 통해 만드는 메소드입니다.
	 */
	static void printTriangle_v1() {
		System.out.println("몇 줄을 출력하시겠습니까?");
		int input =	sc.nextInt();
		for(int i = 0;i<input;i++) {		//행
			for(int j = 0;j<=i;j++) {	//열
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printTriangle_v1
	/**
	 * 높이가 5인 직각 삼각형을 *을 통해 만드는 메소드입니다.
	 * 역방향으로 만들어봅니다.
	 */
	static void printReverseTriangle_v1() {
		System.out.println("몇 줄을 출력하시겠습니까?");
		int input =	sc.nextInt();
		for(int i = 0;i<input;i++) {
			for(int j = 0;j<input-i;j++) {
				System.out.print(" ");
			}//end for(j)
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}//end for(k)
			System.out.println();
		}//end for(i)
	}//end printReverseTriangle_v1
	/**
	 * 높이가 5인 직각 삼각형을 *을 통해 만드는 메소드입니다.
	 * 하단으로 출력되게 만들어봅니다.
	 */
	static void printTriangle_v2() {
		System.out.println("몇 줄을 출력하시겠습니까?");
		int input =	sc.nextInt();
		for(int i =0;i< input;i++) {
			for(int j = 0;j<input-i;j++) {
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printTriangle_v2
	/**
	 * 높이가 5인 직각 삼각형을 *을 통해 만드는 메소드입니다.
	 * 하단,그리고 역방향으로 출력되게 만들어봅니다.
	 */
	static void printReverseTriangle_v2() {
		System.out.println("몇 줄을 출력하시겠습니까?");
		int input =	sc.nextInt();
		for(int i = 0;i<input;i++) {
			for(int j = 0;j < i;j++) {
				System.out.print(" ");
			}//end for(j)
			for(int k = 0;k<input-i;k++) {
				System.out.print("*");
			}//end for(k)
			System.out.println();
		}//end for(i)
	}//end printReverseTriangle_v2
	/**
	 * 피라미드 모양을 *을 통해 만드는 메소드입니다.
	 */
	static void printPyramid() {
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5-i;j++) {
				System.out.print(" ");
			}//end for(j)
			for(int k = 0;k < (2*i) + 1;k++) {
				System.out.print("*");
			}//end for(k)
			System.out.println();
		}//end for(i)
	}//end printPyramid
	/**
	 * i의 경우 한번 진행하고, 다시 되돌아오는 식으로 총 2번 반복이 되기 때문에,알파벳의 개수 26개 * 2로 i의 조건은 < 52로 설정
	 * 알파벳의 개수가 26개이기 때문에 j의 조건은 < 26으로 설정
	 */
	static void printStarAndAlpha() {
		for(;;) {
			char Alpha = 'A'-1;
			int input = 0;
			System.out.println("숫자를 입력하세요 : ");
			input = sc.nextInt();
			if(input > 51) {
				System.out.println("51이하로 입력해주세요.");
				continue;
			}//end if(input)
				for (int i = 0; i < input;i++){								
					for(int j =0;j <26;j++){		
						if(i == j){					//i,j 의 값이 똑같은 경우 alpha출력후 alpha값 ++
							Alpha++;				//이 조건식은 i가 25인 경우까지만 사용가능, j의 max값이 25이기 때문에
							System.out.print(Alpha);
			
						}else if(i+j == 50){		//i>=26인 경우 위 조건식을 실행할 수 없기 때문에, i+j=50이라는 조건식 생성
							--Alpha;				//이 경우 alpha가 거꾸로 출력이 되야하기 때문에 alpha출력 후 alpha--진행
							System.out.print(Alpha);
						}else {
							System.out.print("*");	//그 외 경우 전부 *을 출력
							try {
								Thread.sleep(3);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}//end try
						}//end if
					}//end for(j)
					System.out.println();
				}//end for(i)
                break;
			}//end for
	}//end printStarAndAlpha
	
	static void printDiamond() {
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3-i;j++) {
				System.out.print(" ");
			}//end for(j)
			for(int k = 0;k<(2*i)+1;k++) {
				System.out.print("*");
			}//end for(k)
			System.out.println();
		}//end for(i)<--상단부
		for(int i = 0;i<3;i++) {
			for(int j = 0;j <2+i;j++) {
				System.out.print(" ");
			}//end for(j)
			for(int k = 0;k<3-(2*i);k++) {
				System.out.print("*");
			}//end for(k)
			System.out.println();
		}//end for(i)<--하단부
	}//end printDiamond
	public static void main(String[] args) {
		for(;;) {
			System.out.println();
			System.out.println("*을 이용한 다양한 도형 출력하기 프로그램");
			System.out.println("--------------------------");
			System.out.println("1.직사각형 출력\n2.직각 삼각형 출력\n3.역 직각 삼각형 출력\n4.하단 삼각형 출력\n"
					+ "5.역 하단 삼각형 출력\n6.정삼각형 출력\n7.마름모 출력\n8.별 & 알파벳 출력\n\n0.종료 하기");
			System.out.println("--------------------------");
			System.out.print("메뉴를 선택하세요 : "); int input = sc.nextInt();
			if(input < 0 || input > 8) {
				System.out.println("메뉴는 1~8번 중에서 선택해 주세요.");
				continue;
			}else if(input == 0) break;
			switch(input){
				case 1:Print_star_teamhomework.printSquare(); break;
				case 2:Print_star_teamhomework.printTriangle_v1(); break;
				case 3:Print_star_pjy.printReverseTriangle_v1(); break;
				case 4:Print_star_bsm.printTriangle_v2(); break;
				case 5:Print_star_bsm.printReverseTriangle_v2(); break;
				case 6:Print_star_teamhomework.printPyramid(); break;
				case 7:Print_star_pjy.printDiamond(); break;
				case 8:Print_star_teamhomework.printStarAndAlpha(); break;
			}//end switch
		}//end for
		System.out.println("프로그램을 종료합니다.");
	}//end main
}//end class

//백성민 문제풀이
class Print_star_bsm{
	static Scanner sc = new Scanner(System.in);
	static int input = 0;
	/**
	 * 문제 풀이 : 백성민
	 * 높이가 5인 하단 삼각형
	 */
	static void printTriangle_v2() {
		System.out.print("몇 줄을 출력하시겠습니까? : "); input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input - i; j++) {
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printTriangle_v2
	/**
	 * 문제 풀이 : 백성민
	 * 높이가 n인 하단 역삼각형
	 * input을 통해 입력 받습니다.
	 */
	static void printReverseTriangle_v2() {
		System.out.print("몇 줄을 출력하시겠습니까? : "); input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}//end for(k)
			for (int j = i; j < input; j++) {
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i_
	}//end printReverseTriangle_v2
}//end class bsm

//박진영 문제풀이
class Print_star_pjy{
	/**
	 * 문제 풀이 : 박진영
	 * 높이가 N인 역 직각 삼각형
	 * JOptionPane을 통해서 입력 받습니다.
	 */
	 static void printReverseTriangle_v1() {
		int height=0;
		int width=0;
		height = Integer.parseInt(JOptionPane.showInputDialog("행 입력"+height));
//		width = Integer.parseInt(JOptionPane.showInputDialog("열 입력"+width));
			for(int i = 0; i <= height;i++) {
				for(int j = height; j > 0; j--) {
					if(j>i) {
						System.out.print(" ");
					}//if
					else {
						System.out.print("*");
					}//else
				}//end for(j)
				System.out.println("");
				}//end for(i)
//			for(int i = 0; i < height;i++) {
//				for(int j = width;j > 0;j--){
//					if(j>i) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}//end if
//				}//end for(j)
//				System.out.println("");
//			}//end for(i)
		}//end printReverseTriangle_v1
	 /**
	  * 문제 풀이 : 박진영
	  * 높이가 N인 마름모를 출력합니다
	  * JOptionPane을 이용해 입력 받습니다.
	  */
	 static void printDiamond() {
		 int n=0;
		 n=Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요(홀수만 입력)"+n));
		 System.out.println("마름모 모양");
		 int i, j = 0;
		 int star = 0;
		 System.out.println();
		 for (i = 0; i < n; i += 2) {
			 for (j = n; j >= i; j -= 2) {
				 System.out.print("  "); // 공백이 2개
			 }//end for(j)
			 for (star = 0; star <= i ; star++) {
				 System.out.print("* "); // 별 옆에 공백이 있음
			 }//end for(star)
			 System.out.println();   //줄바꿈
		 }//end for(i)
		 for (i =0; i <= n - 2; i += 2) {
			 System.out.print("  "); //줄맞춤
			 for (j = 0; j <= i; j += 2) {
				 System.out.print("  ");// 공백이 2개
			 }//end for(j)
			 for (star = n - 2; star > i; star--) { 
				 System.out.print("* ");// 별 옆에 공백
			 }//end for(star)
			 System.out.println();
		 }//end for(i)
	 }//end printDiamond
}//end class pjy