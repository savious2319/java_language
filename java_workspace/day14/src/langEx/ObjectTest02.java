package langEx;

/*
 	Object 클래스
 	-equals()
 	-hashCode()
 	-toString()
 */
class TypeC{
	
}

public class ObjectTest02 {

	public static void main(String[] args) {
		
		System.out.println(new TypeC());
		
		TypeC obj = new TypeC();
		System.out.println(obj);
	
		System.out.println(obj.hashCode());
		System.out.println(String.format("%x", obj.hashCode()));  //obj.hashCode()를 16진수로 출력
		
		String tmp = String.format("%x", obj.hashCode()); //hashCode 값을 tmp에 담음
		System.out.println(tmp);
		
		System.out.println(obj.getClass().getName() +"@" + String.format("%x", obj.hashCode())); //클래스 + 클래스 이름 + 해쉬코드
		System.out.println(obj.getClass().getName() +"@" + tmp);
		
		//////////////////////////////////////////////////////////
		TypeC obj2 = new TypeC();
		TypeC obj3 = new TypeC();
		
		if(obj2 == obj3) { // 해쉬코드값 비교!!!
			System.out.println(obj2.hashCode() + "vs" + obj3.hashCode() + ">>>>같은 객체");
		}else {
			System.out.println(obj2.hashCode() + " vs " + obj3.hashCode() + ">>>>다른 객체");
		}
		
		obj3 = obj2; // obj2의 객체 정보(해쉬코드)를 obj3에 대입시키면,, 같은 객체
				     // 이때, 기존에 obj3가 갖고 있던 인스턴스의 정보는 사라지게 된다
		
		if(obj2 == obj3) {
			System.out.println(obj2.hashCode() + " vs " + obj3.hashCode() + ">>>>같은 객체");
		}else {
			System.out.println(obj2.hashCode() + " vs " + obj3.hashCode() + ">>>>다른 객체");
		}
		
		
		
		
	}

}



























