package listEx;

import java.util.Vector;

/*
  	ArrayList	Vector		LinkedList 		Stack ���� Ŭ���� ����....  => List  �������̽� �Ҽ�
  	
  		List �������̽� -> Collection �������̽� �Ҽ�!
  		
  	List �������̽� Ư¡
  		-�ݵ�� ������ �����Ǿ� �ִ�. (�迭�� �ε��� ��ȣ�� ���� �ִ�)
  		-�ϰ����� �������� (sequence)
  		-�迭�� ����! ��Ұ� ������ �ʴ´�
  		-������, List�� ����� ������ �����ų �� �ִ�!
  		
  		
  	Vector				ArrayList
  	(������)			(�Ź���)
 	�ʱⰪ 10��
 		(��Ҵ� Object�� �޾ƾ� �Ѵ�)
 		
 		add(�߰��ϰ��ϴ� ���)					��Ҹ� �߰��Ѵ�.
 		equals(���)							���ϰ��� �ϴ� ����� ���� ���θ� Ȯ��
 		get(�ε��� ������)						�ش� ��ȣ�� ��Ҹ� �����Ͷ�! (�迭�� ������ ����. 0������ ����)
 		indexOf(���)							��Ұ� ��� �ִ� ��ġ�� ��ȯ�ض�!
 		size() == �迭�� length					����� ������ �˷��ش� (���� �� �ִ� �뷮)
 		capacity()								���� ���� �� �ִ� �� �뷮 (RAM�� üũ�Ҷ� ����) - Vector���� ����. ArrayList���� ����!
 		remove(����)							�����Ҷ�, �ش� ����(index)   remove(0) 0���濡 �ִ� ��Ҹ� ������ �ּ���!
 		remove(���)							(���) �ش� ��Ұ� �ִ��� ã�ư��� ���� �ּ���!
 		set(�ε���, ���)						�ش� �ε����� ã�ư��� ��Ҹ� �����ض�!
 		trimToSize()							�뷮�� ������ �°� �����Ѵ� - Vector���� ����. ArrayList���� ����!
 		subList(int fromIndex, int toIndex)		from���� to���� ����� ��ü�� ��ȯ�ض�! ���ϰ��� List�� ��ȯ�Ѵ�
 												��? List �������̽��� �����ϸ�, Vector, ArrayList, LinkedList ���� ��Ҹ�
 												��ȯ �޾� �� �� �ִ�!
 												{10, 20, 30, "�ȳ�", 10.5, 6} .toArray();
 		
 		toArray()					������ �÷����� �迭�� ��ȯ�Ѵ�.
 									Object[] �� ���ϰ��� ���ƿ´�!
 									
 		removeAllElements()  clear() �޼���� ����!		��� ��Ҹ� �����ض�!
 		
 		
 		
 */
public class ListTest01 {

	public static void main(String[] args) {

		
		Vector vec = new Vector();
		System.out.println("�� �뷮 : "+vec.capacity());
		
		vec = new Vector(5);
		System.out.println("�� �뷮 : "+vec.capacity());

		//��� �߰�
		vec.add(10);
		vec.add("�ȳ�");
		vec.add(1.1);
		vec.add(true);
		vec.add('A');
		System.out.println("�� �뷮 : "+vec.capacity());
		
		vec.add(20);	//�ѿ뷮 5�� ��, 6��° �����͸� �־���.
		System.out.println("�� �뷮 : "+vec.capacity());
		
		vec.trimToSize();
		System.out.println("�� �뷮 : "+vec.capacity());
		
		vec.add(30);	//�ѿ뷮 5�� ��, 6��° �����͸� �־���.
		System.out.println("�� �뷮 : "+vec.capacity());
		
		//���� ����� ���� : size()
		System.out.println("�� ���� : "+ vec.size());
		
		System.out.println(vec.contains(1.1));
		System.out.println(vec.contains("�ȳ�"));
		
		System.out.println(vec);  //vec.toString() ����� ������ �� �� �ְ� �س��Ҵ�
		
		System.out.println("�Ϲ� for��");
		for (int i = 0; i < vec.size(); i++) {
			System.out.println((i+1)+"�� "+vec.get(i));
		}
		System.out.println();
		for (int i = 0; i < vec.size(); i++) {
			System.out.println((i)+"�� �ε��� "+vec.get(i));
		}
		
		
		System.out.println("���� for��");
		for (Object tmp : vec) {
			System.out.println(tmp);
		}
		
		System.out.println("clear() �޼��� ���� ��");
		vec.clear();
		for (Object tmp : vec) {
			System.out.println(tmp);
		}
	}

}


















