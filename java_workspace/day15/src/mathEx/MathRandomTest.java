package mathEx;

import java.util.Random;

public class MathRandomTest {

	public static void main(String[] args) {
		
		String []lucky = {"������ �������� ��︳�ϴ�.",
						  "����� ���ڴ� 6�Դϴ�.",
						  "���� �ȴ� Ⱦ����� �ְڳ׿�~",
						  "���� �Ϸ�� �ǰ��� �Ϸ簡 �� �ſ���~"};
		
		
		//������ �߻�����,
		//������ ��� ����� ����!
		//Math.random()
		int num = 0;
		System.out.println("������ �");
//		for (int i = 0; i < lucky.length; i++) {
//			num = (int)(Math.random() * 4);
//			System.out.println(lucky[num]);
//			break;
//		}
//		
		num = (int)(Math.random() * 4);
		System.out.println(lucky[num]);
		System.out.println();
		/////////////////////////////////////////////////////////////////
		//Random Ŭ���� ���
		String []gift = {"TV", "Radio", "�����", "��"};
		
	
		//Random Ŭ������ ����ؼ� �����ϳ��� ����� ������
		Random r = new Random();
		System.out.println("������ ����");
//		for (int i = 0; i < gift.length; i++) {
//			num = r.nextInt(4);
//			System.out.println(gift[num]);
//			break;
//		}
		
		num = r.nextInt(4);
		System.out.println(gift[num]);

	}

}
