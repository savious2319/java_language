package exceptionEx;



/*
 	���� ��Ȳ�� ����� ���ô�!
 	�迭�� ���� �� ����
 */

public class ExceptionTest03 {

	public static void main(String[] args) {
		
		int []var = {10, 200, 3000};
		
		
		
		try { // alt + shift + z === > try/catch ��
			for (int i = 0; i <= 3; i++) {
				System.out.println("var["+i+"] :" + var[i]);
			}
		} catch (Exception e) {
			//e.printStackTrace();
			//e.getMessage();
			//e.getClass().getSimpleName();
			System.out.println("�迭 ������ �Ѿ���� : " + e.getMessage());
		}
		
		
		System.out.println("���α׷� ��ӵ˴ϴ�");
		
		
	}

}
