package setEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();		
		HashSet setB = new HashSet();
		
		//add()�޼���� ���� �ִ´� 
		setA.add("1"); 	setA.add("2"); 	setA.add("3");
		setA.add("4"); 	setA.add("5"); 	setA.add("6");
		
		setB.add("5"); 	setB.add("6"); 	setB.add("7");
		setB.add("8"); 	setB.add("9"); 	setB.add("0");
		
		System.out.println("setA : "+setA);
		System.out.println("setB : "+setB);
		
		//setA�� Iterator�� ��Ͻ�Ų��
		Iterator iter = setA.iterator();
		
		//�� �о�� ��Ұ� ���������� ���ѹݺ� ���Ѽ� ���� ����Ѵ�
		while(iter.hasNext()) {
		Object temp = iter.next(); //���� �ӽú��� temp�� ��´� 
		System.out.print(temp + " ");
		}
		
		System.out.println();
		//setB�� ������ ����!
		iter = setB.iterator();
		
		while(iter.hasNext()) {
			Object temp = iter.next();
			System.out.print(temp+ " ");
		}
		
		
	}

}
