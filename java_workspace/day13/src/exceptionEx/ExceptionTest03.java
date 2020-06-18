package exceptionEx;



/*
 	예외 상황을 만들어 봅시다!
 	배열과 관련 된 예외
 */

public class ExceptionTest03 {

	public static void main(String[] args) {
		
		int []var = {10, 200, 3000};
		
		
		
		try { // alt + shift + z === > try/catch 블럭
			for (int i = 0; i <= 3; i++) {
				System.out.println("var["+i+"] :" + var[i]);
			}
		} catch (Exception e) {
			//e.printStackTrace();
			//e.getMessage();
			//e.getClass().getSimpleName();
			System.out.println("배열 범위를 넘었어요 : " + e.getMessage());
		}
		
		
		System.out.println("프로그램 계속됩니다");
		
		
	}

}
