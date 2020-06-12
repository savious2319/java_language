package classEx4;
/*
 	static 초기화 블럭
 	
 	클래스 시작시 맨 처음 한번만 실행하는 초기화 블럭
 	
 	static{
 	
 	
 */
class Score4{
	static int cnt = 0;
	int bun = 0;
	String name;
	int kor;
	int eng;
	int math;
	//static int art;
	
	static{
		
		System.out.println("스태틱 초기화 블럭");
		System.out.println("스태틱 초기화 블럭은 인스턴스 만들어지는 횟수와 상관없이,"
							+ "무조건 한번만 실행된다!");
		System.out.println();
		System.out.println();
		
		//art = 999;
		cnt++;
		
		
	}
	
	{	// 인스턴스 초기화 블럭
		// 인스턴스 만들어질 때 마다 이 블럭을 실행한다!
		System.out.println("인스턴스초기화 블럭");
		bun = cnt;
		
		
		name= "미정"; //name ="";
		kor = -1;
		eng = -1;
		math = -1;
		
		//모든 인스턴스들이 처음에 값을 넣고자 할 때 쓰면 편하다!
		//인스턴스를 실행할 때, 어떤 일을 고통적으로 시키고자 할 때 쓰자!
		
	}
	
	public Score4() {
		
		name= "기본 생성자"; 
		kor = -2;
		eng = -2;
		math = -2;
	
	}
	
	
	
	public void print() {
		System.out.println(bun + "번 : "+ name + " // " + kor +" // " + eng +" // " + math + "점");
	}
	
}

public class ClassTest08_2{
	
	public static void main(String[] args) {
		Score4 std1 = new Score4(); // 모든 인스턴스들이 인스턴스 초기화 블럭을 지나간다!
		Score4 std2 = new Score4();
		Score4 std3 = new Score4();
		Score4 std4 = new Score4();
		
		std1.print();
		std2.print();
		std3.print();
		std4.print();
	
		
	}

}
