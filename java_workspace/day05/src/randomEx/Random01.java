package randomEx;

import java.util.Random;

/*
 	���� �����
 	1) Random Ŭ����
 		nextInt(������) : �ν��Ͻ� �޼���
 		
 		��ü rand �� ������!
 		
 	2) ������ ������ �ֱ�
 		������(BOUND)�� �׻� 0 ���� �����Ѵ�.
 		10 : 0~9 ���� 10��
 		8 : 0~7 ���� 8��
 		
 		1���� �������� �Ϸ���!
 	
 */
public class Random01 {

	public static void main(String[] args) {

		//0~9���� ���� �ϳ� ����ϱ�!
		
		//Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//System.out.println(randNum);
		
		for (int i = 0; i < 10; i++) {
			int randNum = rand.nextInt(10);
			System.out.println(randNum);// the upper bound(exclusive) 10 is excluded from the random number
												 // 0~9���� "10"�� �߿� ���� �ϳ�!
		}
				
		// ���� �ϳ��� ����ϸ�ȴ�!
		// new Random() -> �ν��Ͻ� ����
		
		System.out.println(new Random().nextInt(10));
		
		System.out.println("1~100���� ���� ���");
		for (int i = 0; i < 50; i++) {
			// ���� ��������
			int randNum = rand.nextInt(100) + 1; //1���� ��� ��	���� 0~99�������µ�,
												//					(0~99)���ٰ� +1�� �ϴϱ�
												//  (1~100)���� �߿� ���� �ϳ��� �������Եȴ�.
			System.out.println(randNum);
		}
		
		
		
		
		
		
		
		
		
		

	}//end of main

}//end of class
