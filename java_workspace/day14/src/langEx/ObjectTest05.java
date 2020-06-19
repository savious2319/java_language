package langEx;

/*
 	Object 클래스
 	-equals()
 	-hashCode()
 	-toString()
 */
class Score{
	String name;
	int kor;
	int eng;
	int math;
	@Override
//	public int hashCode() {
//		final int prime = 31; //소수
//		int result = 1;
//		result = 0; // 영어 점수는 비교하지 않음
//		result = prime * result + kor;
//		result = prime * result + math;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	/*
	 	new 할 때마다, 객체의 해싱은 모두 다르다!
	 	그래서 같은지 다른지에 대해 비교가 불가해지는 "경우-HashSet 컬렉션에서."가 발생한다!
	 	hashCode() 를 똑같은 조건, (리턴값을 0으로 한다던지)
	 	으로 만들어 준 후, equals() 메서드에서 특정 값(인스턴스)을 비교해서
	 	다른지 같은지 여부를 결정할 수 있도록 하자
	 	그래서 hashCode()와 equals()를 동시에 오버라이딩 하는 경우가 많다!
	 */
	public int hashCode() {
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class ObjectTest05 {

	public static void main(String[] args) {
		
		
		
		
		
	}

}















