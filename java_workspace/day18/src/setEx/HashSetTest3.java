package setEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest3 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		setA.add("6");

		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		setB.add("9");
		setB.add("0");

		// ������ : �� ���հ��� ���� ��Ҹ� ��� ���� ���� -> 5, 6
		// ������ : A-B A���� �ִ� �� (B�� ���� ��Ҹ� ���� ��Ų ��) -> 1,2,3,4
		// B-A B���� �ִ� �� -> 7,8,9,0,
		// ������ : A�� B�� ��Ҹ� ��� ��ģ ��, ���� ��Ҵ� ���� -> 0 ~ 9 �ϳ��� ������!

		HashSet setHap = new HashSet(); // 0,1,2,3,4,5,6,7,8,9
		HashSet setKyo = new HashSet(); // 5,6
		HashSet setChaA_B = new HashSet(); // 1~4
		HashSet setChaB_A = new HashSet(); // 7~0

		// ��Ҹ� �ϳ������ͼ�, A ���տ� ���ԵǾ� �ִ�? ��, �׷� �����տ� �߰�����!
		// Iterator ����ؼ� ���� ������!
		Iterator iter = setB.iterator();
		while (iter.hasNext()) {
			Object temp = iter.next();

			if (setA.contains(temp)) {

				setKyo.add(temp);
			}
		}

		System.out.println("setA�� setB�� ������ : "+setKyo);

		// ������ A-B:
		iter = setA.iterator();
		while(iter.hasNext()){
		Object temp = iter.next();
		if(!setB.contains(temp))
		setChaA_B.add(temp);
		}
		System.out.println("������ A-B : "+setChaA_B);
		// ������ B-A:
		iter = setB.iterator();
		while(iter.hasNext()){
			Object temp = iter.next();
			if(!setA.contains(temp))
				setChaB_A.add(temp);
		}
		System.out.println("������ B-A : "+setChaB_A);
		
		//HashSet ������
//		iter = setA.iterator();
//		while(iter.hasNext()) {
//			Object temp = iter.next();
//			setHap.add(temp);
//		}
//		iter = setB.iterator();
//		while(iter.hasNext()) {
//			Object temp = iter.next();
//			setHap.add(temp);
//		}
		iter = setB.iterator();
		while(iter.hasNext()) {
			setHap.add(iter.next());
		}
		iter = setA.iterator();
		while(iter.hasNext()) {
			setHap.add(iter.next()); //setHap�� setB�� ���� �ִ�. �� ���¿��� setA�� �߰���Ű��! �̶�, �̹� ����ִ� ��Ҵ�
									 //�˾Ƽ� ������ �� ���� ��Ҹ� �ְ� �ȴ�!! Set!
		}
		System.out.println("HashSet ������ : "+setHap);
		
		
		//ArrayList ������
		ArrayList ar = new ArrayList();
		
		iter = setA.iterator();
		while(iter.hasNext()) {
			Object temp = iter.next();
			ar.add(temp);
		}
		iter = setB.iterator();
		while(iter.hasNext()) {
			Object temp = iter.next();
			ar.add(temp);
		}
		System.out.println("ArrayList ������ : "+ar);
	}

}


















