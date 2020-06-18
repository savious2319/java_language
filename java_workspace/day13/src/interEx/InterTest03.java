package interEx;

class TypeA{
	
}
class TypeB extends TypeA implements InterAA{ //자식 클래스중에 검사가 필요할 경우 
											  // makrup 인터페이스(표시용 인터페이스)를 쓰면된다!
										      // 체크할 사용한다
	
}

class TypeC extends TypeA implements InterBB{
	
}

class SomeA{
	void fct(TypeA obj) {
		if(obj instanceof TypeB) {
			System.out.println(obj.getClass().getSimpleName()+"는 TypeB 클래스입니다");
		}
		else if(obj instanceof TypeC) {
			System.out.println(obj.getClass().getSimpleName()+"는 TypeC 클래스입니다");
		
		}
		if(obj instanceof InterAA) {
			System.out.println(obj.getClass().getSimpleName()+"은 InterAA의 지원을 받고 있습니다");
		}
		if(obj instanceof InterBB) {
			System.out.println(obj.getClass().getSimpleName()+"은 InterBB의 지원을 받고 있습니다");
		}
	}
}
public class InterTest03 {

	public static void main(String[] args) {
		
		SomeA some = new SomeA();
		
		some.fct(new TypeB());
		some.fct(new TypeC());
		
	}

}






