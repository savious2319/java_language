package genericEx;

import java.util.ArrayList;

/*
 	���ʸ� (Generic)
 	�÷��� Ŭ����<���ʸ�> ��ü = �ν��Ͻ�();
 	ArrayList<String> list = ArrayList<String>();
 	
 	�÷��� ��ü�� ���� ��, ���� ����ؼ�, �̸� add() �� ���� Ÿ���� ������ �� �ִ�!
 */
public class GenericTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		int num = 1234;
		list.add("�ȳ�");
		list.add("�ڹ���");
		list.add(num+"");			// �� �����ʹ� add ��ų ���� ����??!! Ȯ��!!
									// Ÿ���� üũ�� �� �ִ�
		list.add(String.valueOf(num));
		list.add("ȫ�浿");
		
		
	}

}
