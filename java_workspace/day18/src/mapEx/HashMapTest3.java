package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 	HashMap<Ű, ���>
 		put(Ű, ���)
 		get(Ű)
 */
public class HashMapTest3 {

	public static void main(String[] args) {
		//       key      value
		HashMap<String, String> map = new HashMap<>();
		//       id        pw
		map.put("�̼���", "100");
		map.put("������", "120");
		map.put("������", "130");
		map.put("�ڹ���", "140");

		System.out.println(map);
		//�������� pw�� 133���� �����ϰ��� �Ѵ�!
		map.put("������", "133");
		System.out.println(map);
		
		//���̵� pw �Է¹޾Ƽ� put ���Ѻ���!
		Scanner sc = new Scanner(System.in);
		System.out.print("id : "); String id = sc.nextLine().trim();
		System.out.print("pw : "); String pw = sc.nextLine().trim();
		
		map.put(id, pw);
		
		System.out.println(map);
	}

}










