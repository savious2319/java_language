package wrapperEx;

public class WrapperTest01 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i == i2 ? "����" : "�ٸ���"); //�ν��Ͻ��� �ּҰ��� ���Ѵ�
		
		System.out.println(i.equals(i2) ? "����" : "�ٸ���"); //equals()�� ���ؾ����� ���� ���Ѵ�
															  //�� �񱳴� equals() �޼��带 �������
		
		
	}

}
