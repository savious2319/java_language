package addressHomework;

/*
 	�ּ� ã�� ����
 	����) �迭�� 5���� �ּҸ� �Է��� ���� �����ߴ�!
 	
 	=> �⺻ 2�� �ּҰ� �Է��� ����
 		����� ������ ������ 111
 		����� ���ʱ� ���ʵ� 222
 		
 	=> 3��° ���ʹ� �߰��� �� �ִ�!
 	
 	=> ��Ŭ���� 
 	class Address{
 		String si;
 		String gu;
 		String dong;
 		int bunji;		// 111, 222, 333, 444...
 	
 		// equals(), contains()
 		searchDong(){}		// �Է� : 00�� -> ������ �� ���� �Դϴ�!
 		
 		// add()
 		insertDong(){}		// ���ο� �ּ� �߰� -> �ø� �Է��ϼ���
 												-> ���� �Է��ϼ���
 												-> ���� �Է��ϼ���
 												-> ������ �Է��ϼ���
 		// set()										
 		update(){}			// ���� �ּ� ����	-> 00�� ���� : 
 												-> 00�� ���� :
 												-> 00�� ���� :
 												-> 00���� ���� :
 		//remove()										
 		delete(){}			// ���� �ּ� ����
 		
 		//����for�� toString() �������̵�
 		allAddress(){}		// ��� �ּ� ����
 		}
 		
 	=> ArrayList<Address> list = new ArrayList<Address>();
 		list.add(������ ������);
 		list.add(���ʱ� ���ʵ�);
 		
 		
 */


public class AddressMain_�鼺�� {

	public static void main(String[] args) {
		
		new AddressController().menu();

	}

}
