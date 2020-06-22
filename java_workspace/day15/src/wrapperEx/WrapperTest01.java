package wrapperEx;

public class WrapperTest01 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i == i2 ? "같다" : "다르다"); //인스턴스의 주소값을 비교한다
		
		System.out.println(i.equals(i2) ? "같다" : "다르다"); //equals()로 비교해야지만 값을 비교한다
															  //값 비교는 equals() 메서드를 사용하자
		
		
	}

}
