package arrayEx;

import java.util.Random;

public class Array05_04_�鼺�� {

	public static void main(String[] args) {
//	����4) thread.sleep ���
//	10�� ������ �迭���� �� �ڸ� ������ ������ ������ �Է� ���� �� 
//	�� ������ �Էµ� �ִ밪�� �ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	���� : 100, 200, 300 ...  10�� �Է� �Ϸ�ƽ��ϴ�!
//	�ִ밪 : 756�Դϴ�.
//	�ּҰ� : 121 �Դϴ�.

	int[]arNum = new int[10];
	Random r = new Random();
	
	for (int i = 0; i < arNum.length; i++) {
		arNum[i] = r.nextInt(900) + 100;
	}
	
	for (int i = 0; i < arNum.length; i++) {
		System.out.print(arNum[i] + " ");
	}
	
	int MAX = arNum[0];
	int MIN = arNum[0];
	
	System.out.println();
	for (int i = 1; i < arNum.length; i++) {
		if(arNum[i] > MAX) {
		 MAX = arNum[i];
			
		}
		
		if(arNum[i] < MIN) {
		 MIN = arNum[i];	
		}
	}
	System.out.println("�ִ밪 : " + MAX);
	System.out.println("�ּҰ� : " + MIN);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
