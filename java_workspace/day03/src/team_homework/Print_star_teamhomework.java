package team_homework;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Print_star_teamhomework {
	static Scanner sc = new Scanner(System.in);
	/**
	 *	���� Ǯ�� : ����ȣ
	 * 	3�� 5���� *�� ����ϴ� �޼ҵ��Դϴ�.
	 */
	static void printSquare() {
		for(int i = 0;i<3;i++) {		//��
			for(int j = 0;j<5;j++) {	//��
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printSquare
	/**
	 * ���� Ǯ�� : ����ȣ
	 * ���̰� n�� ���� �ﰢ���� *�� ���� ����� �޼ҵ��Դϴ�.
	 */
	static void printTriangle_v1() {
		System.out.println("�� ���� ����Ͻðڽ��ϱ�?");
		int input =	sc.nextInt();
		for(int i = 0;i<input;i++) {		//��
			for(int j = 0;j<=i;j++) {	//��
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printTriangle_v1
	/**
	 * ���̰� 5�� ���� �ﰢ���� *�� ���� ����� �޼ҵ��Դϴ�.
	 * ���������� �����ϴ�.
	 */
	static void printReverseTriangle_v1() {
		System.out.println("�� ���� ����Ͻðڽ��ϱ�?");
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
	 * ���̰� 5�� ���� �ﰢ���� *�� ���� ����� �޼ҵ��Դϴ�.
	 * �ϴ����� ��µǰ� �����ϴ�.
	 */
	static void printTriangle_v2() {
		System.out.println("�� ���� ����Ͻðڽ��ϱ�?");
		int input =	sc.nextInt();
		for(int i =0;i< input;i++) {
			for(int j = 0;j<input-i;j++) {
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printTriangle_v2
	/**
	 * ���̰� 5�� ���� �ﰢ���� *�� ���� ����� �޼ҵ��Դϴ�.
	 * �ϴ�,�׸��� ���������� ��µǰ� �����ϴ�.
	 */
	static void printReverseTriangle_v2() {
		System.out.println("�� ���� ����Ͻðڽ��ϱ�?");
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
	 * �Ƕ�̵� ����� *�� ���� ����� �޼ҵ��Դϴ�.
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
	 * i�� ��� �ѹ� �����ϰ�, �ٽ� �ǵ��ƿ��� ������ �� 2�� �ݺ��� �Ǳ� ������,���ĺ��� ���� 26�� * 2�� i�� ������ < 52�� ����
	 * ���ĺ��� ������ 26���̱� ������ j�� ������ < 26���� ����
	 */
	static void printStarAndAlpha() {
		for(;;) {
			char Alpha = 'A'-1;
			int input = 0;
			System.out.println("���ڸ� �Է��ϼ��� : ");
			input = sc.nextInt();
			if(input > 51) {
				System.out.println("51���Ϸ� �Է����ּ���.");
				continue;
			}//end if(input)
				for (int i = 0; i < input;i++){								
					for(int j =0;j <26;j++){		
						if(i == j){					//i,j �� ���� �Ȱ��� ��� alpha����� alpha�� ++
							Alpha++;				//�� ���ǽ��� i�� 25�� �������� ��밡��, j�� max���� 25�̱� ������
							System.out.print(Alpha);
			
						}else if(i+j == 50){		//i>=26�� ��� �� ���ǽ��� ������ �� ���� ������, i+j=50�̶�� ���ǽ� ����
							--Alpha;				//�� ��� alpha�� �Ųٷ� ����� �Ǿ��ϱ� ������ alpha��� �� alpha--����
							System.out.print(Alpha);
						}else {
							System.out.print("*");	//�� �� ��� ���� *�� ���
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
		}//end for(i)<--��ܺ�
		for(int i = 0;i<3;i++) {
			for(int j = 0;j <2+i;j++) {
				System.out.print(" ");
			}//end for(j)
			for(int k = 0;k<3-(2*i);k++) {
				System.out.print("*");
			}//end for(k)
			System.out.println();
		}//end for(i)<--�ϴܺ�
	}//end printDiamond
	public static void main(String[] args) {
		for(;;) {
			System.out.println();
			System.out.println("*�� �̿��� �پ��� ���� ����ϱ� ���α׷�");
			System.out.println("--------------------------");
			System.out.println("1.���簢�� ���\n2.���� �ﰢ�� ���\n3.�� ���� �ﰢ�� ���\n4.�ϴ� �ﰢ�� ���\n"
					+ "5.�� �ϴ� �ﰢ�� ���\n6.���ﰢ�� ���\n7.������ ���\n8.�� & ���ĺ� ���\n\n0.���� �ϱ�");
			System.out.println("--------------------------");
			System.out.print("�޴��� �����ϼ��� : "); int input = sc.nextInt();
			if(input < 0 || input > 8) {
				System.out.println("�޴��� 1~8�� �߿��� ������ �ּ���.");
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
		System.out.println("���α׷��� �����մϴ�.");
	}//end main
}//end class

//�鼺�� ����Ǯ��
class Print_star_bsm{
	static Scanner sc = new Scanner(System.in);
	static int input = 0;
	/**
	 * ���� Ǯ�� : �鼺��
	 * ���̰� 5�� �ϴ� �ﰢ��
	 */
	static void printTriangle_v2() {
		System.out.print("�� ���� ����Ͻðڽ��ϱ�? : "); input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input - i; j++) {
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printTriangle_v2
	/**
	 * ���� Ǯ�� : �鼺��
	 * ���̰� n�� �ϴ� ���ﰢ��
	 * input�� ���� �Է� �޽��ϴ�.
	 */
	static void printReverseTriangle_v2() {
		System.out.print("�� ���� ����Ͻðڽ��ϱ�? : "); input = sc.nextInt();
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

//������ ����Ǯ��
class Print_star_pjy{
	/**
	 * ���� Ǯ�� : ������
	 * ���̰� N�� �� ���� �ﰢ��
	 * JOptionPane�� ���ؼ� �Է� �޽��ϴ�.
	 */
	 static void printReverseTriangle_v1() {
		int height=0;
		int width=0;
		height = Integer.parseInt(JOptionPane.showInputDialog("�� �Է�"+height));
//		width = Integer.parseInt(JOptionPane.showInputDialog("�� �Է�"+width));
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
	  * ���� Ǯ�� : ������
	  * ���̰� N�� ������ ����մϴ�
	  * JOptionPane�� �̿��� �Է� �޽��ϴ�.
	  */
	 static void printDiamond() {
		 int n=0;
		 n=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �Է��ϼ���(Ȧ���� �Է�)"+n));
		 System.out.println("������ ���");
		 int i, j = 0;
		 int star = 0;
		 System.out.println();
		 for (i = 0; i < n; i += 2) {
			 for (j = n; j >= i; j -= 2) {
				 System.out.print("  "); // ������ 2��
			 }//end for(j)
			 for (star = 0; star <= i ; star++) {
				 System.out.print("* "); // �� ���� ������ ����
			 }//end for(star)
			 System.out.println();   //�ٹٲ�
		 }//end for(i)
		 for (i =0; i <= n - 2; i += 2) {
			 System.out.print("  "); //�ٸ���
			 for (j = 0; j <= i; j += 2) {
				 System.out.print("  ");// ������ 2��
			 }//end for(j)
			 for (star = n - 2; star > i; star--) { 
				 System.out.print("* ");// �� ���� ����
			 }//end for(star)
			 System.out.println();
		 }//end for(i)
	 }//end printDiamond
}//end class pjy