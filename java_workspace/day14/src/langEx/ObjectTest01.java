package langEx;

/*
 	Object Ŭ����
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
		name = "ȫ�浿";
		kor = 100;
	}

	@Override
	public String toString() {

		return name +" "+kor+"��";
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
		return "TypeB [bunho=" + bunho + ", eng=" + eng + ", math=" + math + "]"; // ���ڿ��� ������ �� �ִ�
	}
	void printScore() {
		System.out.println(toString());
		
	}
	
//	@Override
//		public String toString() {
//		
//			return bunho + " " +eng +"�� "+math+"��";
//		}
	
	
}
public class ObjectTest01 {

	public static void main(String[] args) {

		MyClass obj = new MyClass();
		System.out.println(obj.toString()); // �� ��Ű���� �� Ŭ������ hashCode ���� ����Ѵ�
		System.out.println(obj); // obj ������ �׻� .toString()�� �����Ǿ� �ִ� �Ŵ�!

		TypeA aObj = new TypeA();
		System.out.println(aObj); // aObj������ .toString()�� �ִ�
		
		TypeB bOjb = new TypeB("1��", 10, 20);
		System.out.println(bOjb);
	
		
		
	}

}





