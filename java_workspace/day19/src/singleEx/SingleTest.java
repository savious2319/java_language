package singleEx;

import java.awt.Toolkit;
import java.util.Calendar;

/*
 	�̱��� ����
 	
 	�ν��Ͻ��� �ϳ��� ���� ����ؾ� �� �� �����ϴ� "�ν��Ͻ� �������"
 	
 	- �����ڴ� �ܺο� �����Ű�� �ȵȴ�
 		Type type = new Type();  ����!!! (�ܺο��� new�� ��Ű�� �ȵȴ�!)
 		-private ���������ڷ� �����ڸ� ������ �Ѵ�!
 	(2���� ���� ����)
 	- ����Ÿ���� �ν��Ͻ� ��ü�� static���� ������ �Ѵ�
 	- ���� �޼��带 static public���� ������Ѿ� �Ѵ�!
 	- ���� �޼���(Ŭ�����޼���, ����ƽ �޼���)���� ��ü�� �ν��Ͻ� ���θ� �Ǵ� �� ��
 	  �ν��Ͻ��� ������ ���� �ν��Ͻ��� ���Ͻ�Ű��, �ν��Ͻ��� ������(null) �����ڸ� ����
 	  ������ �ν��Ͻ��� ���Ͻ��� �ָ� �ȴ�!
 */
public class SingleTest {

	public static void main(String[] args) {
		//new Toolkit();   //�ν��Ͻ��� �������� ���ϵ��� �����ڸ� ���Ƴ��´�
						   // abstract �Ǵ� �����ڸ� private������ ���´�!
						   // ���, Ư�� �޼��� �ϳ��� ����
						   // �ν��Ͻ��� ������ �� �ֵ��� �Ѵ�!
		
		Toolkit tool = Toolkit.getDefaultToolkit();  //�̱��� ������ ����Ǿ���!!
		//getDefaultToolKit() �޼��带 ����, �ν��Ͻ��� ����� �°�,
		//tool ��ü�� ����, ToolKit Ŭ������ �޼��带 ����� �� �ְ� �ƴ�.
		
		Calendar cal = Calendar.getInstance();
		
		

	}

}


























