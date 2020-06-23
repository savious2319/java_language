package listEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
  	ArrayList
  		-Vector�� �޼������ ���� �°��ؼ� ���
  			capacity() ���� ����
  		-capacity �� size�� ������!
 	
 	**List �迭�� Ư¡  
 	  1. ���� ��Ұ� �̹� ��� �־ �ߺ��ؼ� ��� ���� �� �ִ�!!
 	  2. ������ �����Ѵ� (�ε���)
 		
 		
 */
public class ListTest02 {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList(); //list�� Ÿ���� Object �̴�
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		
		//�Ϲ� for���� ����, ���� ���غ���
		
		//���� for������ ����, ���� ���غ���
		
		System.out.println("�Ϲ� for ����");
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) +"��");
			//sum += (Integer)list.get(i);  // ��ü�� �ڽ� Ÿ������ ����ȯ ����!
			sum += (int)list.get(i); //  auto boxing������ ����
		}
		System.out.println("�Ϲ� for���� : "+sum);
		
		
//		generic�� ���� ����ȯ ���ʿ����
//		for (int i = 0; i < list2.size(); i++) {
//			sum += list2.get(i);
//		}
		
		
		System.out.println();
		sum = 0;
		System.out.println("���� for�� ����");
		for (Object tmp : list) {
			System.out.println(tmp + "��");
			//sum += (Integer)tmp;
			sum += (int)tmp;
		}
		System.out.println("���� for�� ���� : "+sum);
		
		//30���� ã�Ƽ� 300���� ������ ������~
		if(list.contains(30)) {
			list.set(list.indexOf(30), 300);
		}else {
			System.out.println("ã�� ��Ұ� �����");
		}
		
		
//		for (Object tmp : list) {
//			if(list.contains(30)) {
//				list.set(2, 300);
//			}
//		}
		
		System.out.println(list);
		
		//10���� 20�� ���̿� 15���� �����ϼ���!
		//�����ε��� add �޼��� ����ϱ�
		
		list.add(list.indexOf(20), 15);
		System.out.println(list);
		
		//40�� 50�� �����ؼ� ����� ������
		
//		System.out.println(list.subList(list.indexOf(40), list.indexOf(60)));
		List list3 = list.subList(list.indexOf(40), list.indexOf(50)+1);  // List�� ��ȯ�ϴϱ� List�� �޾ƾ� �Ѵ�
		
		//ArrayList list3 = (ArrayList)list.subList(list.indexOf(40), list.indexOf(50)+1);
		//����ȯ ����!
		ArrayList list4 = new ArrayList(list.subList(list.indexOf(40), list.indexOf(50)+1));
		// ArrayList�� �޴´ٸ� new ArrayList�� ����ȭ ���Ѿ� �Ѵ�
		
		
		System.out.println(list2);
		System.out.println(list3);

		//��� ������ �޵�� �ش� ��� ���� ���� �˻� �Ŀ� ������ �� �ֵ��� ����
		if(list.contains(50)) {
			int idx = list.indexOf(50);
			list.remove(idx);
			System.out.println(list);
		}else {
			System.out.println("�����ϰ��� �ϴ� ��Ұ� �����ϴ�");
		}
		
		
	}

}










































