package singleEx;

import java.awt.Toolkit;
import java.util.Calendar;

/*
 	�̱��� ����
 	1. �����ڴ� private
 	2. static �ʵ� ��ü
 	3. ���� �޼��� �ϳ��� static public ���� ����� ����!!!
 	
 */
class Singleton{
	
	private static Singleton single; //�� ������ ���� getInstance �޼��忡�� ��ü ������ �Ǵ��ϰ� �ȴ�!
									 //single�� �ʱⰪ�� null �̴�
	private Singleton() {}
	
	public static Singleton getInstance() {
		//Ŭ���� ����, single�� �ִ� ���� null �̶��, �ѹ��� �ν��Ͻ��� ������ ���� ���� �Ŵ�!
		//�׷��� �����ڸ� ���� �ν��Ͻ��� ���Խ��� ����!
		
		//�׷��� �� ���Ŀ� �ٽ� getInstance()�� ȣ���ϰ� �Ǹ�,
		//���̻� single�� null�� �ƴϰ� �� ���̴�(ó�� ����� ���� ������)
		//�׷��� ó�� ����� ���� single�� �״�� ���Ͻ�Ű��!
		if(single == null) {
			single = new Singleton();
		}
		return single;
	}
}
public class SingleTest2 {

	public static void main(String[] args) {
		
		//new Singleton();  //����
		Singleton single = Singleton.getInstance();
		System.out.println(single);
		
		Singleton single2 = Singleton.getInstance();
		System.out.println(single2);
		
		Singleton single3 = Singleton.getInstance();
		System.out.println(single2);
		
		Singleton single4 = Singleton.getInstance();
		System.out.println(single2);
		
	}

}


























