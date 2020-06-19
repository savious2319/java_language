package stringEx;

public class StringTest04 {

	public static void main(String[] args) {
		//100 문자열로 만들고 싶어요
		
		// 1) String temp = 100 + "";  // + 는 메서드를 찾아간다! 연산자 중복점  (문자열 만들 때 편리해!)
 		// 2) String temp = String.valueOf(100); // 명시적으로 메서드를 사용하는게 더 빠르다
											     // 명시적으로 수행해야 할 메서드를 기재했기 때문에 1)보다 더 빠르게 수행한다
		
		String tmp = String.valueOf(100);
		System.out.println(tmp);
		
	}

}



















