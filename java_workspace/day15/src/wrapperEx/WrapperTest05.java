package wrapperEx;

public class WrapperTest05 {

	public static void main(String[] args) {
		//jdk ���� 1.5 �̻���͸� ������ ���!
		
		//wrapper�� �⺻�� ������ ���� ���԰���!
		//�⺻���� wrapper�� ���� ���԰���! (������ ���� �ʿ����)
		
		int var = new Integer(100).intValue(); //��������� ���� �޼ҵ带 ��� ó������(�ӵ��鿡��)�� ��������!
		var = new Integer(100); //intValue()�� �����Ǿ���
									//�ν��Ͻ��� �⺻�� ������ ���� �����ϰ� �ִ�!
									//wrapper�ϱ� �����ϴ�
		
		//�ڵ�����(�Ʒ��� �θ��� ��Ī), auto boxing
		Integer objI = 100;			//�⺻���� ��ü�� ���� �ְ� �ִ�!
									//�ν��Ͻ� ������ �����ƴµ��� ������ �ǰ� �ִ�!
		
		// �⺻���ϰ� �ν��Ͻ����� ���굵 �����ϴ�!
		System.out.println("�⺻�� + ��ü : "+ (var + objI));
									// objI.intValue() auto unboxing
									// ���� ������ �θ��� ��Ī
		
		
	}

}
