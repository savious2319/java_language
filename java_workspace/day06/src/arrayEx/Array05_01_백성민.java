package arrayEx;

import java.util.Scanner;

public class Array05_01_�鼺�� {

	public static void main(String[] args) {
//	����1)
//	100 ���� ������ ������ �� �ִ� �迭�� �����ϰ� ������ ���ʷ� �Է¹޴ٰ�
//	0 �� �ԷµǸ� 0 �� �����ϰ� �� ������ �Էµ� ������ ����ϵ�,
//	���� ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է� �� : 10, 9, 8, 4, 80, 40, 0   (0������ ����)
//	��� �� : 40 80 4, 8, 9, 10 
		
		int cnt = 0;
		int[]arNum = new int[100];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�Է� �� : ");
		for (int i = 0; i < arNum.length; i++) {
			arNum[i] = sc.nextInt();
			if(arNum[i] != 0) {
				cnt++;
			}
			if(arNum[i] == 0) {
				break;
			}
		}
		System.out.println("��� ��");
		for (int i = 1; i < cnt+1; i++) {
			System.out.print(arNum[cnt - i] + " ");
		}

	}

}
