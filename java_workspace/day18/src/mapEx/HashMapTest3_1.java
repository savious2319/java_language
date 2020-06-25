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
public class HashMapTest3_1 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		// id pw
		map.put("�̼���", "100");
		map.put("������", "120");
		map.put("������", "130");
		map.put("�ڹ���", "140");

		// �α��� ó��
		// 1. Ű�� ���̵� �̴�
		// 2. �Է��� ���̵� map�� �ִ� �� �˻�����!
		// 2-1. ���̵� ������ �ٽ� �Է�
		// 2-2. ���̵� �����ϸ� 3
		// 3. ��й�ȣ�� map�� �ִ� value�� ������ �˻�����
		// 4. �α��� �Ǿ����ϴ�!
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("pw : ");
			String pw = sc.nextLine().trim();

			// Set<String> set = map.keySet();
			map.keySet();
			if (map.containsKey(id)) {
				// �ִٸ�
				if (map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�");
					break;
				} else {
					System.out.println("��й�ȣ ����! ID ����� �ٽ� �Է��� �ּ���");
					continue;
				}
			} else {
				// ���ٸ�
				System.out.println(id + "�� �����ϴ�. �ٽ� �Է��� �ּ���");
			}
		}

	}

}
