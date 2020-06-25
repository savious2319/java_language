package setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
/*
 	�� Ŭ������ HashSet
 	
 	-�ν��Ͻ� ��ü�� add() ��ų ����
 	 hashCode() �� equals() �޼��带 �����ϰ� �������̵� �ؾ� �Ѵ�!
 	 
 */

public class HashSetTest6 {

	public static void main(String[] args) {
		
		HashSet<Person> set = new HashSet<>();
		
		Person hgd = new Person("ȫ�浿", 1234567);
		Person iss = new Person("�̼���", 2234567);
		Person pms = new Person("�ڹ���", 3234567);
		
		set.add(hgd);
		set.add(iss);
		set.add(pms);

		//�ű� ȸ���� �����Ϸ��� �Ѵ�!!
		//����Ǿ� �ִ� set�� ��ҵ�� �ű�ȸ�� ������ ����,
		//�ű�ȸ���� add �� �� �ִ��� ������ ���θ� ���캸��!
		
		Person newMember = new Person("�ƹ���", 1234567); //�ֹι�ȣ�� ������ ��ü�� set�� ���� �ϰ� �ִ�!
		
		set.add(newMember);
		//hashCode()�� �θ���!  ���� 3���� �ؽ��ڵ��ϰ� �ٸ��� ������!!!
		//set�� �߰��� �� �ִ�!
		//equals() �޼��带 �θ� �ʿ䰡 ��������!
		
		System.out.println(set);
		
		//������ 1234567 �̶�� �ֹι�ȣ�� �̹� set�ȿ� ��� �ִµ�
		//newMember�� ���� �� ���̴�!
		
		//�׷���, ��ü�� �ؽ��ڵ带 ��ȯ�ϴ� hashCode() �޼���δ� �ν��Ͻ��� �񱳰� �Ұ��ϴ�!
		
		//hashCode() �޼��忡���� ��� �ν��Ͻ� �ؽ��ڵ尪�� �����ϰ�!!!!
		//�� ������ equals()�� �ҷ��� ��ü �ȿ� ����(������)�� ���ϰ� �ȴ�!
		
		//hashCode()�� equals()�� �������̵� �� �� �ۿ� ����!
		
		
	}

}


















