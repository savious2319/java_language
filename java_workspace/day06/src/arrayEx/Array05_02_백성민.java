package arrayEx;

import java.util.Random;

public class Array05_02_�鼺�� {

	public static void main(String[] args) {
//	����2)
//	10���� ������ ������ �Է¹޾� �迭�� ������ �� 
//	¦�� ��° �Էµ� ���� �հ� Ȧ�� ��° �Էµ� ���� ����� 
//	����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//	����� �ݿø��Ͽ� �Ҽ�ù°�ڸ����� ����Ѵ�.
//
//	* String.format("���Ĺ���", ��)
//
//	����� �� :  99, 45, 34, 67, ...  10���Է�
//	¦�� �ε��� �� : 0, 2, 4, 6, 8��° ��
//		        (99+34+...n) / ���� = 56.789  56.7
//	Ȧ�� �ε��� �� : 1, 3, 5, 7, 9
//		        (45+67+...) / ���� = 5.6777   5.6
	Random r = new Random();	
	int[]arNum = new int[10];
	int sum = 0;
	double avg = 0.0;
	for (int i = 0; i < arNum.length; i++) {
		arNum[i] = r.nextInt(100);

	}
	System.out.println("����� ��");
	for (int i = 0; i < arNum.length; i++) {
		System.out.print(arNum[i] + " ");
	}
	
	System.out.println("\n");
	
	System.out.println("¦�� �ε��� ��");
	for (int i = 0; i < arNum.length; i++) {
		if(i % 2 == 0) { // i�� ¦���϶��� ����Ѵ�
		sum += arNum[i];
		System.out.print(arNum[i] + " ");
		}
	}
	System.out.println();
	avg = (sum + 0.0) / 5;
	System.out.println("¦�� �ε��� ��� ��" + String.format("%.1f", avg));
	
	
	System.out.println("\n");
	sum = 0;
	System.out.println("Ȧ�� �ε��� ��");
	for (int i = 0; i < arNum.length; i++) {
		if(i % 2 == 1) { // i�� Ȧ���϶��� ����Ѵ�
		sum += arNum[i];
		System.out.print(arNum[i] + " ");
		}
	}
	System.out.println();
	avg = (sum + 0.0) / 5;
	System.out.println("Ȧ�� �ε��� ��� ��" + String.format("%.1f", avg));
	
	
	
	
	//String msg = String.format("%d %.1f %c", 10, 1.32, 'A');	
	//System.out.println(msg);  	
		
	}

}
