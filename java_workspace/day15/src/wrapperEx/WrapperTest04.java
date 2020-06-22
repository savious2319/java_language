package wrapperEx;

public class WrapperTest04 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100); //�����ڸ� �̿��ؼ� ��� ���
		
		// "100" �� �ִµ�, ��ü i3�� ����� �Ѵ�!
		Integer i3 = new Integer("100");
		int var2 = i3.intValue();
		
		int var = Integer.parseInt("100");
		
		Integer i4 = Integer.valueOf(100); //valueOf()��� �޼��带 �̿��ؼ� ��� ���
		i4 = Integer.valueOf("111");
		var = Integer.valueOf("111").intValue();
		
		///////////////////////////////////////////////////////////////////////////////////
		//������ ���õ� ����
		//�� ���� ��
		//�տ� ���ڸ� �ڿ� �ִ� ���ڰ� �����ϰ� �ִ�.
		//�տ� �ִ� ���ڰ� � �����ΰ�? -> �׷��� �������� ��ȯ�ؼ� �˷���!
		int var3 = Integer.parseInt("100", 2); //100�� 2�����̴�! �������� �����ض�
		System.out.println(var3);			   // 0B10101010 -> 0B�̸� 2����
		
		var3 = Integer.parseInt("100", 8); //100�� 8�����̴�. ��������...
		System.out.println(var3);		//01234567 -> 0�̸� 8����
		
		var3 = Integer.parseInt("100", 16); //100�� 16�����̴� ��������..
		System.out.println(var3);		// 0x234FABC -> 0x�̸� 16����
		
		var3 = Integer.parseInt("FF", 16); //100�� 16�����̴� ��������..
		System.out.println(var3);
		
		
		
	}

}
