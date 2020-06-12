package classEx4;
/*
 	인스턴스 초기화 블럭
 	
 	한 클래스에, 인스턴스 초기화 블럭 + 생성자가 동시에 있다면?
 	
 	초기화 순서는?
 	1. 인스턴스 초기화 블럭 실행하고 나서 -> 2. 생성자로 넘어가서 또 생성자 안에 있는 소스를 실행한다.
 */
class Score3{
	static int cnt = 0;
	int bun = 0;
	String name;
	int kor;
	int eng;
	int math;
	{	// 인스턴스 초기화 블럭
		// 인스턴스 만들어질 때 마다 이 블럭을 실행한다!
		System.out.println("인스턴스초기화 블럭");
		bun = ++cnt;
		
		
		name= "미정"; //name ="";
		kor = -1;
		eng = -1;
		math = -1;
		
		//모든 인스턴스들이 처음에 값을 넣고자 할 때 쓰면 편하다!
		//인스턴스를 실행할 때, 어떤 일을 고통적으로 시키고자 할 때 쓰자!
		
	}
	
	public Score3() {
		
		name= "기본 생성자"; 
		kor = -2;
		eng = -2;
		math = -2;
	
	}
	
	
	
	public void print() {
		System.out.println(bun + "번 : "+ name + " // " + kor +" // " + eng +" // " + math + "점");
	}
	
}

public class ClassTest08_1{
	
	public static void main(String[] args) {
		Score3 std1 = new Score3(); // 모든 인스턴스들이 인스턴스 초기화 블럭을 지나간다!
		Score3 std2 = new Score3();
		Score3 std3 = new Score3();
		Score3 std4 = new Score3();
		
		std1.print();
		std2.print();
		std3.print();
		std4.print();
	
		
	}

}
