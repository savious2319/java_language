package langEx;

/*
 	Object 클래스
 	-equals()
 	-hashCode()
 	-toString()
 */
class MyClass {

}

class TypeA {
	String name;
	int kor;
	{
		name = "홍길동";
		kor = 100;
	}

	@Override
	public String toString() {

		return name +" "+kor+"점";
	}
}
class TypeB{
	String bunho;
	int eng;
	int math;
	public TypeB(String bunho, int eng, int math) {
		super();
		this.bunho = bunho;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public String toString() {  //alt +shitf + s -> Generate toString()
		return "TypeB [bunho=" + bunho + ", eng=" + eng + ", math=" + math + "]"; // 문자열을 가공할 수 있다
	}
	void printScore() {
		System.out.println(toString());
		
	}
	
//	@Override
//		public String toString() {
//		
//			return bunho + " " +eng +"점 "+math+"점";
//		}
	
	
}
public class ObjectTest01 {

	public static void main(String[] args) {

		MyClass obj = new MyClass();
		System.out.println(obj.toString()); // 이 패키지의 이 클래스의 hashCode 값을 출력한다
		System.out.println(obj); // obj 옆에는 항상 .toString()이 생략되어 있는 거다!

		TypeA aObj = new TypeA();
		System.out.println(aObj); // aObj옆에는 .toString()가 있다
		
		TypeB bOjb = new TypeB("1번", 10, 20);
		System.out.println(bOjb);
	
		
		
	}

}





