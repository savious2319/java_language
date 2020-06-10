package arrayEx;

import java.util.Random;
import java.util.Scanner;

public class Array03_백성민 {

	public static void main(String[] args) {
		// 정수 배열 5개 만들어서
		// 1 ~100까지 난수 5개 입력해 보세요
		int[] arRandom = new int[5];
		Random r = new Random();

//		for (int i = 0; i < arRandom.length; i++) {
//			arRandom[i] = r.nextInt(100) + 1;
//		}

		// 입력한 난수를 출력해 보세요
		System.out.println("문제1) 1~100 난수 출력");
		for (int i = 0; i < arRandom.length; i++) {
			arRandom[i] = r.nextInt(100) + 1;
			System.out.println("arRandom[" + i + "] = " + arRandom[i]);
		}

		// 문제 2) 정수배열 6개 만들어서 1~45까지 난수 6개 넣어보세요
		arRandom = new int[6];

//		for (int i = 0; i < arRandom.length; i++) {
//			arRandom[i] = r.nextInt(45) + 1;
//		}
		// 입력한 난수를 출력해 보세요
		System.out.println("문제2) 1~45 난수 출력");
		for (int i = 0; i < arRandom.length; i++) {
			arRandom[i] = r.nextInt(45) + 1;
			System.out.println("arRandom[" + i + "] = " + arRandom[i]);
		}
		
		
		

		// 문제 3) 문제2에서 입력한 난수가 겹치지 않게 6개의 정수를 입력해 보세요
		// 입력한 난수를 출력해 보세요
		System.out.println("문제3) 1~45부터 6개의 정수 겹치지 않게 출력");
		// 0   1   2
		// 1   8  (1)  // [1]의 값은 [0]의 값하고 만 비교하면 된다
		for (int i = 0; i < arRandom.length; i++) {
			arRandom[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if(arRandom[i] == arRandom[j]) {
					i--;  // [1]의 값이 [0]의 값과 같으면 i를 감소시켜 i = 0으로 만든다음 i++ 증가식으로 i를 1로 만든다음 다시 랜덤 수를 넣는다
				}
			}
		}
		
		for (int i = 0; i < arRandom.length; i++) {
			System.out.println("arRandom[" + i + "] = " + arRandom[i]);
		}
		
		
		
		// 문제 4) 문제3에서 입력한 난수를 오름차순으로 출력해 보세요
		System.out.println("문제4) 오름차순 출력");
		// 임시배열을 하나 만들자! arRandom의 데이터를 보존하기위해서!
		// 임시배열에 오름차순으로 정렬하자!
		int [] arTemp = new int[arRandom.length]; // 임시배열이기때문에 길이가 같아야 한다! 
		for (int i = 0; i < arTemp.length; i++) {
			arTemp[i] = arRandom[i];
		}
		for (int i = 0; i < arTemp.length; i++) {
			for (int j = i+1; j < arTemp.length; j++) {  
				if(arTemp[i] > arTemp[j]) {
					int temp = arTemp[i];
					arTemp[i] = arTemp[j];
					arTemp[j] = temp;
				}
			}
		}

		for (int i = 0; i < arTemp.length; i++) {
			System.out.println("arTemp[" + i + "] = " + arTemp[i]);
		}
	}

}
