package randomEx;

import java.util.Random;

/*
 	���� �����
 	1) Math Ŭ����
 		random() �̶�� Ŭ���� �޼���(����ƽ �޼���) �� �̿��Ѵ�. (����ƽ �޼���(Ŭ���� �޼���) : Ŭ������ �̿��ؼ� ȣ���� �� �ִ� �޼���)
 		100�� �����ؼ� ��µǴ� ������ ���¸� ������ ������
 */
public class Random02 {
	
	static void fct() {
		
	}
	public static void main(String[] args) {
		
		//Random02.fct(); // static method�̱� ������ .�� �̿��ؼ� ȣ���� �� �ִ�.
		
		for (int i = 0; i < 100; i++) {
			System.out.println( (int) (Math.random()*10) + 1 );
											//   ���۰�   ����
			
		}
		
		
		
		
	}//end of main

}//end of class
