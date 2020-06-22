package wrapperEx;

public class WrapperTest02 {

	public static void main(String[] args) {

		//100, 'A', true, 기본 자료형의 리터럴 상수들!
		//객체화 시킬 수 있다!
		//이때 사용하는 클래스들을 wrapper 클래스라고 한다.
		
		Boolean b = new Boolean(true);
		Boolean b2 = new Boolean("true");
		
		System.out.println("b : " + b); //toString() 이 생략되어 있다.
		System.out.println("b2 : "+b2);
		System.out.println("b : " + b.toString()); //toString()이 오버라이딩 되어 있네
		System.out.println("b2 : "+b2.toString());
		
		Byte byte1 = new Byte((byte)10);
		Byte byte2 = new Byte("10");
		
		System.out.println("byte1 : "+byte1);
		System.out.println("byte2 : "+byte2);
		
		float f1 = new Float(10.1);
		float f2 = new Float("10.1"); 
		// 기본형들을 객체로 변환시키고 있다 "포장" "wrapping" "boxing"
		
		
		
	}

}
