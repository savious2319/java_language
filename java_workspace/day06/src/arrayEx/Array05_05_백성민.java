package arrayEx;

import java.util.Random;

public class Array05_05_�鼺�� {

	public static void main(String[] args) {
//	����5)
//	100 �̸��� ���� �������� ������ �־�����.  30�̸����� ������ �� �ִ�
//	������ �迭 20���� �Է¹��� ��,
//	�Է¹��� ������ ���� ����� ����ؾ� �Ѵ�.
//	�̶�, ���� ������ ��� ��ġ���� ����ؾ� �Ѵ�.
//	��, ī��Ʈ�� 0���� ���ڴ� ������� �ʴ´�.
//
//	1 : 5��
//	2 : 6��
//	45 : 1��
//	67 : 4��
//	99 : 1��

		
		
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
//				System.out.println(arNum[i] + " : " + tempCnt[i] + "��");
//			}
//		}
		
		System.out.println();

//		for (int i = 0; i < arNum.length; i++) {
//				if (i == arNum.length-1) {
//					if (arNum[i-1]==arNum[i]) {
//						System.out.println(arNum[i] + " : " + tempCnt[i] + "��");
//					}
//						else{
//						System.out.println(arNum[i] + " : " + tempCnt[i] + "��");
//					}
//				}else {
//					if (arNum[i] == arNum[i + 1]) { //arNum[0]�� arNum[1]�� ���ٸ� arNum[0]�� ����� ���Ѵ�.
//													//arNum[1]�� arNum[2]�� �ٸ��� arNum[1]�� ��µȴ�.
//													//arNum[18]�� arNum[19]�� ���ٸ� arNum[18]�� ��¾ȵǰ� continue�ȴ�.
//													//i(19) == arNum.length-1�� ���� arNum[19]�� ����Ѵ�
//													//arNum[18]�� arNum[19]�� �ٸ��� arNum[18]�� ��µȴ�.
//													//�� ���� i(19) == arNum.length-1�� ���� arNum[18]�� arNum[19]��
//													//�ٸ��⶧���� else���� ���� arNum[19]�� ��µȴ�.
//						continue;
////				} else if (i == arNum.length) {
////					System.out.println(arNum[i] + " : " + tempCnt[i] + "��");
////				} 
//					}else {
//						System.out.println(arNum[i] + " : " + tempCnt[i] + "��");
//					}
//				}
//		}

		
//		for (int i = 1; i < arNum.length; i++) {  // i = 0, j = i +1   j > i
//			for (int j = i-1; j < i; j++) {
//				if (arNum[i] != arNum[j]) {  
//					System.out.println(arNum[j] + " : " + tempCnt[j] + "��");  // arNum[i]
//				}
//				if(i == (arNum.length-1)) {	
//					System.out.println(arNum[i] + " : " + tempCnt[i] + "��");  // arNum[j]
//				}
//			}// j for
//		
//
//		} // i for
		
		for (int i = 0; i < arNum.length; i++) {  // i = 0, j = i +1   j > i
			for (int j = i+1; j > i; j++) {
				if (arNum[i] != arNum[j]) {  
					System.out.println(arNum[i] + " : " + tempCnt[i] + "��");  // arNum[i]
				}
				if(j == (arNum.length-1)) {	
					System.out.println(arNum[j] + " : " + tempCnt[j] + "��");  // arNum[j]
				}
			}// j for
		

		} // i for

		
		
		
		
		
		// ����ȣ�� �ҽ��ڵ�
//	for (int i = 0; i < arNum.length; i++) {
//		for (int j = 0; j < arNum.length; j++) {
//			if(i == arNum[j]) {
//				cnt++;
//			}//if
//		}// j for
//		if(cnt >= 1) {
//		System.out.println(i + " : " + cnt + "��");
//		}
//		cnt = 0;
//	}// i for
	}

}
