package wrapperEx;

public class WrapperTest03 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		//���� ��ü���� �⺻�� ���� ��������
		int var = i.intValue();
		int var2 = i2.intValue();
		
		//�⺻���� �����ڷ� ��!
		System.out.println(var == var2 ? "����" : "�ٸ���");
		
		
	}

}
