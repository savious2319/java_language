package setEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest4 {

	public static void main(String[] args) {
		// �� 6���� ��Ұ� �ִ�!
		String[]str = {"C���", "�ڹ�", "XML", "C���", "HTML","�ڹ�"};
		
		//����, C���, �ڹٰ� ��ġ�� ����̴�!
		HashSet hs1 = new HashSet();
		HashSet hs2 = new HashSet();
		
		//h1���� �ߺ������� ��� ��Ҹ� �ִ´�
		//h2���� �ߺ��� ��Ҹ� ��� ���´�!
		
		
		//���� for������ ������ ����!
		
		//1. hs1�� tmp�� �߰��Ѵ�.
		//2. �����ϸ� �״�� hs1�� ��´� �׸���
		//3. ���ϰ��� true�� �ȴ�.
		//4. �� �Ŀ� ! �����ڷ����� false�� �ȴ�.
		//5. ���� if�� ���� ������ ������ ���ϰ�, for������ �̵�!
		//6. ���� hs1�� tmp�� add ��ų��,,
		//7. �����ϸ�(������ ��Ұ� �ִٸ�), false�� ���´�
		//8. false�� !�����ڷ� ���� true ���� �ǰ�
		//9. if�� ������ ���´�.
		//10. ������ ���� �����ϴ� hs2�� �����ϰ� �ȴ�
		//�� add()�� ��Ҹ� �߰��� �� hashCode() �� equals()�� ���ϰ� �ȴ�!
		// �� ��, ������ hashCode() ���� �����ϸ�, add ��Ű�� �ʰ� false�� �ְ� �ȴ�!

		for (String tmp : str) {
			if(!hs1.add(tmp)) { 
				hs2.add(tmp); 
			}
		}
		System.out.println("�ߺ������� ��� ��� hs1 : "+hs1);
		System.out.println("�ߺ��� ��� ��� hs2 : "+hs2);
		
		//removeAll �޼��� - ��ġ�� ��Ҹ� ����
		hs1.removeAll(hs2);
		System.out.println("hs2�� ��ġ�� ��Ҹ� hs1���� ���� : "+hs1);
		
		System.out.println("set�� �ִ� ��Ұ� ��� �ִ�? : "+hs1.isEmpty());
		hs1.clear();
		System.out.println("set�� �ִ� ��Ұ� ��� �ִ�? : "+hs1.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


















