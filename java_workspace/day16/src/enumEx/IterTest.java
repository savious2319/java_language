package enumEx;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
  	Enumeration : "������" ������!!!
 	
 	Iterator �������̽� : "�ݺ���"  �Ź���!!!
 	
 	
 	
 	�÷��ǿ� �����ؼ� ��Ҹ� ã�ư��� ����!
 	
 	(�÷����� Iterator�� ����ϱ�)     : iterator()
 	(�÷��ǿ��� �� �о�� ��Ұ� �ֳ���?) : hasNext() 	true, false
 	(�׷� �� ���� ��Ҹ� �о�Ͷ�!)		  : next()
 	
 	
 */
public class IterTest {

	public static void main(String[] args) {

		String[]arStr = {"�ȳ�","ȫ�浿","�̼���","�ڹ���"};
		
		Vector<String> vec = new Vector<String>();
		
		//�迭 String == vec<String>�� ����� Ÿ���� �����ϰ� �ƴ�
		//������ Ÿ������ �������!
		
		//vec���ٰ� add(�迭�� ��Ҹ�) ��ų �� �ְ� �ƴ�!
		
		for (int i = 0; i < arStr.length; i++) {
			vec.add(arStr[i]);
		}
		
		System.out.println(vec);
		
		
		//Iterator�� �����ؼ� ����� ����!
		
		//��ü = vec.iterator();
		Iterator<String> iter = vec.iterator();
		
		//��ü.��Ұ� �ִ�?
		while(iter.hasNext()) {
			//��ü���� ������ -> ��¹��� �־�!
			//Object obj = iter.next();  //���� ����
			System.out.println(iter.next());  //�� ���
											  // next() �޼���� �÷��ǿ��� ���� ��ҷ� Ŀ���� �ű��� ��
											  // next()�� ����� ������ ����� ��ġ�� ����ȴ�!
		}
		//next()�� ���ؼ� ������ ������, ���̻� ��Ҹ� ����ų �� ����.
		//�׷��� �ݺ���(������)�� ����ϰ� ������, �ٽ� ��Ͻ�Ű��!
		iter = vec.iterator(); //�ٽ� ���
		System.out.println(iter.next());  //�� ���
		
		
		
	}

}













