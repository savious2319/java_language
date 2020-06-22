package wrapperEx;

public class WrapperTest03 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		//래퍼 객체에서 기본형 값을 추출하자
		int var = i.intValue();
		int var2 = i2.intValue();
		
		//기본형은 연산자로 비교!
		System.out.println(var == var2 ? "같다" : "다르다");
		
		
	}

}
