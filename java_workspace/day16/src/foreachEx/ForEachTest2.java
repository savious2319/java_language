package foreachEx;

import java.util.Iterator;

/*
 	���� for�� (foreach) - �÷��ǿ����� ��밡��!
 	
 	for( A : B ){		B : �÷���(�迭, list, set...) ������ ����!
 						A : �÷��ǿ��� ��� �ϳ��� ������ �� �����ؾ��� �ӽ� ����!
 						
 						
 	}
 	
 	for(      int tmp : new int[]{10,20,30}){
 	
 	
 	
 	}
 */
public class ForEachTest2 {

	public static void main(String[] args) {
		
		int[][] arScore = { 
				{10,20,30,40},	//1��
				{50,60,70,80},	//2��
				{51,61,71,81},	//3��
		};
		//�⼧�� for���� �̿��ؼ�
		//��ȣ, �� ����, ����
		//��ȣ, �� ����, ����
		//��ȣ, �� ����, ����
		int cnt = 0;
		int sum = 0;
		int i = 0;
//		for (int[]num  : arScore) {
//			System.out.println(++i + "��");
//			for (int score : num) {
//				System.out.print(score +"�� ");
//				sum += score;
//				cnt++;
//				if(cnt == 4) {
//					System.out.println("\n���� : " +sum +"��\n");
//					sum = 0;
//					cnt = 0;}
//			}
//		}
		for (int[] arTemp  : arScore) {   //2���� �迭�� �κп�Ҵ� �ٽ� �迭�̴�(1����)
			System.out.println(++i + "��");
			for (int score : arTemp) {   // 1���� �迭�� �κп�Ҵ� int�̴�. �ӽú��� score
				System.out.print(score +"�� ");
				sum += score;
			}
			System.out.println("\n���� : " +sum +"��\n");
			sum = 0;
		}
	}

}












