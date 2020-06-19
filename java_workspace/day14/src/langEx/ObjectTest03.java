package langEx;

/*
 	Object 클래스
 	-equals()
 	-hashCode()
 	-toString()
 */
class Value{
	int value;
	
	Value(int val){
		this.value = val;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//return this.value 하고 obj의 value하고 같니? 다르니;
		if(obj instanceof Value) { //obj에 인스턴스가 Value 타입일때만....
			return this.value == ((Value)obj).value; // <--- 형변환이 가능하다!
		}else {
			return false;  // Value 타입이 아니면 거짓
		}
		
			
	}
}

public class ObjectTest03 {

	public static void main(String[] args) {
		
		Value objA = new Value(10);
		Value objB = new Value(10);
		
		if(objA == objB) {
			System.out.println("객체의 인스턴스 해싱이 같다");
			
		}else {
			System.out.println("해시 코드가 다르다!");
		}
		
		
		if(objA.equals(objB)) { // 객체 비교할때는 equals()를 사용하자!
			System.out.println("같은 값입니다");
		}else {
			System.out.println("해시 코드가 다르다!");
		}
		
		
		
		
		
		
		
		
	}

	
}



























