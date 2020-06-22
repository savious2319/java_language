package staticInnerEx;


class Outer{
	
	class Inner{		//인스턴스 이너
		int num = 99;
		//static int stNum = 11; // static 변수가 에러가 난 이유?
							   // Inner라는 클래스는 인스턴스가 만들어진 후에야만 사용가능!
							   // Outer도 아직 instance가 안된 상황!!
		
		
	}
	
	static class StaticInner{		//스태틱 이너
		static int stNum = 11;		//내부 클래스도 static 이어야 하고, 멤버도 같이 static이면,
									//Outer에서 불러다가 쓸 수 있다!
		
		int value = 9999;			// 이 value를 갖고 있는 클래스를 인스턴스화 하지 않으면,
									// 사용할 수 없는 변수
	}
	
	
}

public class StaticInnerTest01 {

	public static void main(String[] args) {
		
		//num 출력해 보기
		System.out.println(new Outer().new Inner().num);
		
		//stNum 출력해 보기
		System.out.println(Outer.StaticInner.stNum); //static 클래스이기때문에 Outer 클래스에 .을 찍으면 StaticInner클래스가 나오고 그 안에
													 //static int stNum에 접근할 수 있다
		
		
		//value도 출력해 보기! -> 인스턴스 변수다! 그래서 해당 클래스를 인스턴스로 만들어야 한다!
		Outer.StaticInner obj = new Outer.StaticInner();  //StaticInner클래스는 Outer의 소속되어 있는 클래스이기 때문에 Outer의(.)StaticInner라고 해야한다
		System.out.println(obj.value);
		
		
		
		
		
		
		
		
		
	}
}
