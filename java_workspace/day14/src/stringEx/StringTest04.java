package stringEx;

public class StringTest04 {

	public static void main(String[] args) {
		//100 ���ڿ��� ����� �;��
		
		// 1) String temp = 100 + "";  // + �� �޼��带 ã�ư���! ������ �ߺ���  (���ڿ� ���� �� ����!)
 		// 2) String temp = String.valueOf(100); // ��������� �޼��带 ����ϴ°� �� ������
											     // ��������� �����ؾ� �� �޼��带 �����߱� ������ 1)���� �� ������ �����Ѵ�
		
		String tmp = String.valueOf(100);
		System.out.println(tmp);
		
	}

}



















