package classEx4;

class Score{
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
		//인스턴스를 실행할 때, 어떤 일을 공통적으로 시키고자 할 때 쓰자!
		
	}
	public void print() {
		System.out.println(bun + "번 : "+ name + " // " + kor +" // " + eng +" // " + math + "점");
	}
	
}

public class ClassTest08{
	
	public static void main(String[] args) {
		Score std1 = new Score(); // 모든 인스턴스들이 인스턴스 초기화 블럭을 지나간다!
		Score std2 = new Score();
		Score std3 = new Score();
		Score std4 = new Score();
		
		std1.print();
		std2.print();
		std3.print();
		std4.print();
	
		
	}

}
