package foreachEx;

import java.util.Iterator;

/*
 	���� for�� (foreach) - �÷��ǿ����� ��밡��!
 	
 	for( A : B ){		B : �÷���(�迭, list, set...) ������ ����!
 						A : �÷��ǿ��� ��� �ϳ��� ������ �� �����ؾ��� �ӽ� ����!
 						
 						
 	}
 	
 	for(      int tmp : new int[]{10,20,30}){
 	
 	
 	
 	}
 */
public class ForEachTest {

	public static void main(String[] args) {
		
		int [] ar = {10,20,30};
		/*
		for(�ӽú������� : �÷���) {
			
			�νú����� Ȱ������
		}
		*/
		
		for(int x : ar) {
			System.out.println(x);
			
		}

		String [] str = {"�̼���","�ڹ���","ȫ�浿"};
		
		
		for(String tmp : str) {
			System.out.println(tmp);
		}
	}

}












