package testEx;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test02_3_백성민 {

	public static void main(String[] args) {
		//문제3) 도형 출력
		// 3-1) 직사각형
		//높이와 너비를 입력받은 후,
		// 1부터 행당 면적만큼 출력한다.
		// 높이 : 4
		// 너비 : 3
		//|- 너비 --!   -
		// 1  2  3      |
		// 4  5  6     높이
		// 7  8  9      |
		// 10 11 12     -
		
//		Scanner sc = new Scanner(System.in);
//		int width = 0;
//		int height = 0;
//		int cnt = 0;
//		System.out.println("너비 입력 : "); width = sc.nextInt();
//		System.out.println("높이 입력 : "); height = sc.nextInt();
//		
//		for (int i = 0; i < height; i++) {
//			for (int j = 0; j < width; j++) {
//				System.out.printf("%2d ", ++cnt);
//			}
//			System.out.println();
//		}
		
		
		//문3) 도형 출력
				// 3-1) 직사각형 높이 너비 입력 받고 해당 면적만큼 1부터 출력
				
				int hang=0, yool=0;
				int i, j ;
				//System.out.println("사각형을 출력하는 프로그램입니다.");
				String message = "사각형을 출력하는 프로그램입니다.\n" 
						+"원하는 크기로 가로 세로를 입력하세요\n";
				
				hang = Integer.parseInt(JOptionPane.showInputDialog(message, "가로 입력"));
				yool = Integer.parseInt(JOptionPane.showInputDialog(message, "세로 입력"));
				
		 		//꽉찬 사각형 그리기
//				for(j=0; j<yool; j++)
//				{
//					for(i=0; i<hang;i++)
//					{
//						System.out.print("■");
//					}
//					System.out.println(" ");
//					
//				}
			
				//가운데가 비어있는 사각형 그리기
				for(j=0; j<yool; j++)
				{
					
					if( j==0 || j==yool-1)
					{
						for(i=0; i<hang;i++)
						{
							System.out.print("■");
						}
						System.out.println("");
					}
					else
					{
						System.out.print("■");
						for(i=1; i<hang-1;i++)
						{
							System.out.print("□");
						}
						System.out.println("■");
						
					}
					
				}
		
		
	}

}
