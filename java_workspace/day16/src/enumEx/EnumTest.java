package enumEx;

import java.util.Enumeration;
import java.util.Vector;

/*
 	Enumeration �������̽� 
 	
 	�÷��ǿ� �����ؼ� ��Ҹ� ã�ư��� ����!
 	
 	(�÷����� Enumeration�� ����ϱ�)     : elements()
 	(�÷��ǿ��� �� �о�� ��Ұ� �ֳ���?) : hasMoreElements() true, false
 	(�׷� �� ���� ��Ҹ� �о�Ͷ�!)		  : nextElement()
 	
 	
 */
public class EnumTest {

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
		
		//vec ��Ҹ� Enumeration(������)�� �̿��ؼ� ����� ����!
		//1. vec�� ��Ͻ�Ű��: elements()
		//2. vec�� ��Ұ� �ִ��� �˻����� : hasMoreElements()
		//3. vec�� ��Ҹ� ��������! : nextElement()
		
		
		
		//��ü = vec.elements();
		Enumeration<String> en = vec.elements();
		/*System.out.print(en.hasMoreElements() + " ");
		System.out.println(en.nextElement());
		
		System.out.print(en.hasMoreElements() + " ");
		System.out.println(en.nextElement());
		
		System.out.print(en.hasMoreElements() + " ");
		System.out.println(en.nextElement());
		
		System.out.print(en.hasMoreElements() + " ");
		System.out.println(en.nextElement());
		
		System.out.print(en.hasMoreElements() + " ");*/
		//System.out.println(en.nextElement());
		
		
		while(en.hasMoreElements()) {  // fase�� ���ö����� ���ѹݺ��Ѵ�
			System.out.println(en.nextElement());
		}
	}

}













