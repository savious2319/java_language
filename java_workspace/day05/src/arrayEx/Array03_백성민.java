package arrayEx;

import java.util.Random;
import java.util.Scanner;

public class Array03_�鼺�� {

	public static void main(String[] args) {
		// ���� �迭 5�� ����
		// 1 ~100���� ���� 5�� �Է��� ������
		int[] arRandom = new int[5];
		Random r = new Random();

//		for (int i = 0; i < arRandom.length; i++) {
//			arRandom[i] = r.nextInt(100) + 1;
//		}

		// �Է��� ������ ����� ������
		System.out.println("����1) 1~100 ���� ���");
		for (int i = 0; i < arRandom.length; i++) {
			arRandom[i] = r.nextInt(100) + 1;
			System.out.println("arRandom[" + i + "] = " + arRandom[i]);
		}

		// ���� 2) �����迭 6�� ���� 1~45���� ���� 6�� �־����
		arRandom = new int[6];

//		for (int i = 0; i < arRandom.length; i++) {
//			arRandom[i] = r.nextInt(45) + 1;
//		}
		// �Է��� ������ ����� ������
		System.out.println("����2) 1~45 ���� ���");
		for (int i = 0; i < arRandom.length; i++) {
			arRandom[i] = r.nextInt(45) + 1;
			System.out.println("arRandom[" + i + "] = " + arRandom[i]);
		}
		
		
		

		// ���� 3) ����2���� �Է��� ������ ��ġ�� �ʰ� 6���� ������ �Է��� ������
		// �Է��� ������ ����� ������
		System.out.println("����3) 1~45���� 6���� ���� ��ġ�� �ʰ� ���");
		// 0   1   2
		// 1   8  (1)  // [1]�� ���� [0]�� ���ϰ� �� ���ϸ� �ȴ�
		for (int i = 0; i < arRandom.length; i++) {
			arRandom[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if(arRandom[i] == arRandom[j]) {
					i--;  // [1]�� ���� [0]�� ���� ������ i�� ���ҽ��� i = 0���� ������� i++ ���������� i�� 1�� ������� �ٽ� ���� ���� �ִ´�
				}
			}
		}
		
		for (int i = 0; i < arRandom.length; i++) {
			System.out.println("arRandom[" + i + "] = " + arRandom[i]);
		}
		
		
		
		// ���� 4) ����3���� �Է��� ������ ������������ ����� ������
		System.out.println("����4) �������� ���");
		// �ӽù迭�� �ϳ� ������! arRandom�� �����͸� �����ϱ����ؼ�!
		// �ӽù迭�� ������������ ��������!
		int [] arTemp = new int[arRandom.length]; // �ӽù迭�̱⶧���� ���̰� ���ƾ� �Ѵ�! 
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
