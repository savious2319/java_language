package team_homework;

import java.util.Scanner;

/*
	*** ����� ���� ***
	
	�� ��� ������ *�� �̿��ؼ� ������ ����� ���� �����Դϴ�.
	���� �Ǵ� �ʺ� ����� ������ ����� ���� �ٶ��ϴ�.
	
	�޴� ����  : (���� Ǯ�� :    )
	1. �����簢��
	2. �����ﰢ��
	3. �� �����ﰢ��
	4. �ϴ� �ﰢ��
	5. ������
	6. ��+���ĺ�
	0. ����
	��ȣ�� ������ : 
	
 ���� : java_homework / java_day03 / Print_star ����
 			
 			Print_star_ȫ�浿_�ڹ���_������.java
 
 */

public class Print_star {
	
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * 1�� ���� Ǯ�� ���� �簢��
	 */
	static void printSquare() {
//		1. ���� �簢��  (���� Ǯ�� :  000)
//		����, �ʺ�
//		���̴�? : 3
//		�ʺ��? : 5
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
	 * 2�� ���� Ǯ�� ���� �ﰢ��
	 */
	static void printTriangle_v1() {
//		 2. ���� �ﰢ��  (���� Ǯ�� :  000)
//	 		���̴�? 4
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
	 * 3�� ���� Ǯ�� �� ���� �ﰢ��
	 */
	static void printReverseTriangle_v1() {
//		3. �� ���� �ﰢ�� : ���̴�? __  (���� Ǯ�� :  000)
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
	 * 4�� ���� Ǯ�� : �鼺�� 
	 * ���̰� 5�� �ϴ� �ﰢ��
	 */

	static void printTriangle_v2() {
//	    4. �ϴ� �ﰢ��  : ���̴�?  5  (���� Ǯ�� :  �鼺��)
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
	 * 5�� ���� Ǯ�� : �鼺�� 
	 * �ϴ� ���ﰢ��
	 */
	static void printReverseTriangle_v2() {
//		 5. �ϴ� ���ﰢ�� : ���̴�? (����Ǯ�� : �鼺��)
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
	 * 6�� ���� Ǯ�� : ������
	 */
	static void printDiamond() {
//	    6.������  :  ���̴�?   5  (���� Ǯ�� :  000)
//	    	    
//	            *
//	           ***
//	          *****
//	           ***
//	            *
//	         
//	         (¦�� ������ ��� ������ ���̰� �ȸ���!!! ó���ϱ�!!)
		//System.out.print("�������� ���̸� �Է��ϼ��� : "); int n = sc.nextInt();
		
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
	 * 7�� ���� Ǯ�� : �� ���ĺ� ���
	 */
	static void printStarAndAlpha() {

//		7. �� ���ĺ� ���  (���� Ǯ�� :  000)
//	       1) ����ڷκ��� ����(���� ����)�� �Է¹޽��ϴ�.
//	       	  ��) n�� (1��~50������ �Է¹޽��ϴ�)
//	       
//	       2) �� ��¹��  
//	          (1) ���� ���̴� ���ĺ� ��(A~Z)�� �����մϴ�.
//	          (2) ù ���� A�� ������ ������ ������ * �� �����մϴ�.
//	          (3) �������� B�� ������ ������ ������ *�� �����մϴ�.
//	          (4) �̷��� n����� �� �ٿ� ���ĺ� �ϳ��� �����մϴ�.
//	       	  
//	       3) Z���� �Ѿ�� ���� ����� ���� �ݴ�� ���ĺ��� ����ؾ� �մϴ�.
//	       
//	          ��¿�
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
			System.out.print("�� ���� ���� ��������?");
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
				System.out.println("1����� 51������� �Է¹޽��ϴ�");
			} // end of else
		} // end of while

	}

	public static void main(String[] args) {

//		// 1.���� �簢��
//		Print_star.printSquare();
//		System.out.println();
//
//		// 2.���� �ﰢ��
//		Print_star.printTriangle_v1();
//		System.out.println();
//
//		// 3.�� ���� �ﰢ��
//		Print_star.printReverseTriangle_v1();
//		System.out.println();
//
//		// 4.�ϴ� �ﰢ��
//		Print_star.printTriangle_v2();
//		System.out.println();
//
//		// 5.�ϴ� ���ﰢ��
//		Print_star.printReverseTriangle_v2();
//		System.out.println();

		// 6.������
		Print_star.printDiamond();
		System.out.println();

		// 7.�� ���ĺ� ���
		//Print_star.printStarAndAlpha();

	}// end of main

} // end class Print_star
