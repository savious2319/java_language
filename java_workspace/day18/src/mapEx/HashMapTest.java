package mapEx;

import java.util.HashMap;

/*
 	HashMap<Ű, ���>
 		put(Ű, ���)
 		get(Ű)
 */
public class HashMapTest {

	public static void main(String[] args) {

		/*
		    Ű  - ���
		   ȫ�浿 96
		   �̼��� 100
		   ������ 98
		   �Ż��Ӵ� 75
		 */
		//       key      value
		HashMap<String, Integer> map = new HashMap<>();
		
		//map.put("ȫ�浿", new Integer(96));
		map.put("ȫ�浿", 96);
		map.put("�̼���", 100);
		map.put("������", 98);
		map.put("�Ż��Ӵ�", 75);
		
		// Ű�� �ٰ� ��� �ٿ�
		System.out.println(map.get("ȫ�浿"));
		System.out.println(map.get("�̼���"));
		System.out.println(map.get("������"));
		System.out.println(map.get("�Ż��Ӵ�"));
		
	}

}










