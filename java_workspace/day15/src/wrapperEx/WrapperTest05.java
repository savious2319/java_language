package wrapperEx;

public class WrapperTest05 {

	public static void main(String[] args) {
		//jdk 버전 1.5 이상부터만 가능한 기능!
		
		//wrapper는 기본형 변수에 직접 대입가능!
		//기본형도 wrapper에 직접 대입가능! (생성자 등이 필요없음)
		
		int var = new Integer(100).intValue(); //명시적으로 직접 메소드를 써야 처리과정(속도면에서)이 빨라진다!
		var = new Integer(100); //intValue()가 생략되었다
									//인스턴스를 기본형 변수에 직접 대입하고 있다!
									//wrapper니까 가능하다
		
		//자동포장(아래를 부르는 명칭), auto boxing
		Integer objI = 100;			//기본형을 객체에 직접 넣고 있다!
									//인스턴스 과정이 생략됐는데도 대입이 되고 있다!
		
		// 기본형하고 인스턴스간에 연산도 가능하다!
		System.out.println("기본형 + 객체 : "+ (var + objI));
									// objI.intValue() auto unboxing
									// 위의 연산을 부르는 명칭
		
		
	}

}
