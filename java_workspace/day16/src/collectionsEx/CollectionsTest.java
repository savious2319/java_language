package collectionsEx;

import java.util.ArrayList;
import java.util.Collections;

/*
 	Collections : Ŭ����  (Collection�� �������̽�)
 	
 	- �÷����� ����� �� �ִ� �޼������ ���� �ִ� Ŭ����
 */
public class CollectionsTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		System.out.println(list);
		
		//1�ڿ� 0�� �ְ� �ʹ�!
		//list.add(0);
		System.out.println(list);
		
		list.add(list.indexOf(1)+1, 0); // +1�� �� ���� ��°�� �ǹ� 
		System.out.println(list);
		
		//10,20  10�� 20 ���̿� 15�� ��������!
		//20�� indexOf�� ã�Ƽ� 15�� add() ���״�!
		//�׷��� �̹����� 1�� ���������̾���!
		//�׷���, �׳� 1�� ã���� 1�� �ڸ��� 0�� ����,
		//1�� �ڷ� �и��� �ȴ�!
		//�׷��� indexOf(1) "+1" �� ���� ��Ҹ� �˷��� �� �����ߴ�
		
		/////////////////////////////////////////////////////////
		// Collections : static �޼��带 �����ϰ� �ִ�!
		System.out.println(Collections.max(list));

		ArrayList<Integer> cpyList = new ArrayList<>(list);
		
		
		Collections.sort(cpyList);
		System.out.println("���� : "+list);
		System.out.println("sort() : "+cpyList);  //������������ list��ü�� ����
		
		Collections.shuffle(cpyList); //����
		System.out.println("Collections.shuffle(cpyList) : "+cpyList);
		
		//cpyList�� ������������ �����ϰ� �ʹ�!
		//sort() : ��������!!!
		//reverse()
		Collections.reverse(cpyList);
		System.out.println("Collections.reverse(cpyList) : "+cpyList);
		
		Collections.sort(cpyList);   //������������ �� ����
		Collections.reverse(cpyList); //�װ��� �Ųٷ� �����ϸ� ���������� �ȴ�
		System.out.println("Collections.sort(cpyList) + Collections.reverse(cpyList) : "+ cpyList);
		
	}

}


























