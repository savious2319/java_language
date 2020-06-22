package wrapperEx;

public class WrapperTest04 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100); //생성자를 이용해서 담는 방법
		
		// "100" 이 있는데, 객체 i3에 담고자 한다!
		Integer i3 = new Integer("100");
		int var2 = i3.intValue();
		
		int var = Integer.parseInt("100");
		
		Integer i4 = Integer.valueOf(100); //valueOf()라는 메서드를 이용해서 담는 방법
		i4 = Integer.valueOf("111");
		var = Integer.valueOf("111").intValue();
		
		///////////////////////////////////////////////////////////////////////////////////
		//진법에 관련된 내용
		//두 인자 중
		//앞에 인자를 뒤에 있는 인자가 설명하고 있다.
		//앞에 있는 인자가 어떤 진법인가? -> 그래서 십진수로 변환해서 알려줘!
		int var3 = Integer.parseInt("100", 2); //100은 2진수이다! 십진수로 변경해라
		System.out.println(var3);			   // 0B10101010 -> 0B이면 2진수
		
		var3 = Integer.parseInt("100", 8); //100은 8진수이다. 십진수로...
		System.out.println(var3);		//01234567 -> 0이면 8진수
		
		var3 = Integer.parseInt("100", 16); //100은 16진수이다 십진수로..
		System.out.println(var3);		// 0x234FABC -> 0x이면 16진수
		
		var3 = Integer.parseInt("FF", 16); //100은 16진수이다 십진수로..
		System.out.println(var3);
		
		
		
	}

}
