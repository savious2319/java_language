package classEx2;
/*
 	생성자 (constructor)
 	1. 메서드
 	2. 객체를 만들때 인스턴스가 필요하다
 	   이때, 인스턴스에 넣어주는 값 = 초기값
 	   * setter로 넣어주는 값을 = 대입값
 	   
 	     int num = 0; //초기값
 	     num = 20; // 대입값
 	     
 	     obj = new Type(); //초기값  default 초기값이 들어간다
 	     obj.set(100)  // 대입값
 	
 	Type2 obj = new Type2();   obj객체는 default 값으로 초기화 됐다! -> setter로 넣자! setter는 값 수정 목적을 위해 필요하다
 	Type2 obj = new Type2(10, 5.5, "안녕");   obj객체는 초기화 됐다! -> 값을 넣고 시작하기위해 필요하다
 	
 	3. 생성자 만드는 방법
 	    1) 생성자는 기본 메서드형에서 리턴타입을 쓰지 않는다(생략한다)
 	           void 메서드(){} 에서 void를 지워야 한다.
 	                메서드명(){}  이렇게 쓰자!
 	    2) 메서드명은 반드시 클래스의 이름을 그대로 써야 한다.
 	    		Type2(){}	생성자 완료!  "default constructor" "default 생성자" "기본 생성자" 
 	    		
 	    		인스턴스를 만들때 초기값을 전달하기 위해 필요한 메서드
 	
 	4. 생성자 특징
 	    인스턴스를 만들 때, 무조건 불러야 한다!
 	    기본 생성자는 컴파일러가 자동으로 무조건 만들어 준다!
 		    단, 다른 생성자가 없을 때만 자동으로 만들어 준다!
 		
 		※ 메서드 이름은 똑같이 쓸 수 있다. 단, 매개변수의 스타일이나 갯수가 달라야 한다
 		   이렇게 똑같은 메서드 이름으로 통일해서 사용하면, 메서드 사용할때 편리하다!
 		   
 		   "오버로딩 - overloading" 사용자가 편리하게 쓰기 위해서 
 		   
 */
class Type2{  // ctrl + t ==> hierarchy
	
	private int num;
	private double d;
	//Type2 클래스의 생성자를 만들어 보세요
	public Type2(){ // 기본 생성자!  리턴 타입이 없는 메서드
		System.out.println(); // 기본 생성자는 다른 생성자가 있을때 명시적으로 써줘야 한다
	}
	public Type2(int num) { // 생성자의 기본 접근지정자는 public 상황에는 private으로 만들 수도 있다
		super();  // -> object class
		this.num = num;
	}
	public Type2(double d) {
		super();
		this.d = d;
	}
	public Type2(int num, double d) {
		super(); //상위의 뜻 ---> 나의 부모 클래스의 기본 생성자로 가라!
		this.num = num;
		this.d = d;
	}
	public Type2(double num, double d) {
		this.num = (int)num;
		this.d = d;
	}
}
/*  
  	setter : 대입
 
 	생성자 : 초기화
 	
 		기본생성자 : 1. 인스턴스에 초기값을 넣어줌 2. 리턴타입을 쓰지않음 3. 반드시 클래스 이름과 동일해야 한다
 		
 		인수있는 생성자
 		
 		생성자는 대부분 public 이지만, private 접근지정자로 생성자를 만들기도 한다
 		(싱글턴 패턴 - 인스턴스를 한개만 만들어야 할 때!)
 		
 	오버로딩
 		메서드를 같은 이름으로 여러개 중복 시킬 수 있는데, 매개변수의 스타일이
 		모두 다 달아야 적용할 수 있다!
 		-사용자가 편리하게 메서드를 사용하기 위해 오버로딩 기법을 적용하자!
 */
public class ClassTest05 {
	
		
	public static void main(String[] args) {
		
		Type2 person1 = new Type2();
		Type2 person2 = new Type2(10);
		Type2 person3 = new Type2(20.1);
		Type2 person4 = new Type2(10, 20.33);
		Type2 person5 = new Type2(10.5, 20); // 생성자를 새로 만든다!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	class Animal{
		Animal(){
			
		}
	}
	 
	class Car{
		Car() {
			
		}
	}

	class Train{
		Train(){
			
			
		}
	}
}

















