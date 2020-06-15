package extendsEx;
/*
 	상속
 	
 	private  멤버와 super 생성자!
 	
 	1. 자식 타입으로 초기값이 있는 생성자를 만들었다.
 	2. 자식 생성자(매개변수 4개짜리)에서는 초기값 4개를 인스턴스 변수에 초기화 해 주어야 한다.
 	3. 이때, 앞선 3개 인자는 부모생성자에게 다시 전달해야 한다. : 이때, super() 를 사용하자!
 	4. 그리고 자신이 갖고 있는 변수에게만 초기화를 진행하면 된다.
 	5. printScore는 부모가 갖고 있는 메서드인데, 부모는 자식이 art를 갖고 있는지 모른다!
 	   어떡해야, 이름, 국어, 영어, 미술 까지 출력할 수 있을지 고민해보자!
 */

class Score{
	private String name;
	private int kor;
	private int eng;
	
	public Score(String name, int kor, int eng) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	
	public String getName() {
		return name;
	}



	public int getKor() {
		return kor;
	}



	public int getEng() {
		return eng;
	}



	void printScore() {
		System.out.println("이름: " + name+ "\n국어 점수: "+kor+"\n영어 점수: "+eng); //art를 쓸수가 없다. 자식 것이기 때문에
	}
		
}
class SchoolArt extends Score{ // SchoolArts 클래스가 부모 클래스인 Score를 상속받는다
	private int art;

	public SchoolArt(String name, int kor, int eng, int art) { //먼저 부모 클래스에게 3개를 전달해야한다. 그리고 마지막 art으로 넘어온다
															   //메서드 스타일이 같기 때문에 이 메서드로 온다
		super(name, kor, eng); 
		this.art = art;
	}

//	void printScore() {
//		System.out.println("이름: " + name+ "\n국어 점수: "+kor+"\n영어 점수: "+eng+"\n미술 점수: "+art);
//	}
	
	//오버라이드
	//1. 부모 메서드의 내용 (블럭안에 있는 내용{}) 이 맘에 안들 때,
	//2. 자식클래스에서는 부모의 메서드 선언부와 똑같이 작성한 후, 
	//3. 메서드 내부에 쓰고 싶은 소스를 다시 작성하면 된다!
	//		이걸 오버라이드 = 다시 작성 = 재정의 라고 한다!!
	//4. 상속에서만 발동된다! override(무시하다, 기각하다)
	// 		- 부모 메서드는 자식이 똑같이 작성하는 바람에, 호출에서 무시 당하게 된다!
	
	@Override
		void printScore() { // <--- 이건 이제 자식 거!!
			// (this.)printScore(); // this가 생략이 되어있다
			super.printScore(); // 부모의 printScore를 호출하라!
			System.out.println("미술 점수: "+art);
			
		}
	
	
//	void printSchoolArt() {
//		System.out.println("이름: " + getName()+ "\n국어 점수: "+getKor()+"\n영어 점수: "+getEng()+"\n미술 점수: "+art);
//	}
	
}
public class ExtendsTest02 { //생성은 부모부터 되고 garbage collector는 자식부터 메모리 해제를 한다

	public static void main(String[] args) {
		
//		SchoolArt hgd = new SchoolArt("홍길동",100, 100, 100);
		
		Score hgd = new SchoolArt("홍길동",100, 100, 100);
		
		//자바는 정적결합을 지원하지않음
		//인스턴스를 보고 어떤 인스턴스의 메서드를 호출할지 결정한다
		//인스턴스 타입에 따라 결정하는 것을 동적결합 (dynamic binding) 이라고 한다.
		//인스턴스가 보유하고 있는 메서드를 실행한다
		
//		hgd.printSchoolArt();
		
		hgd.printScore(); // printScore()를 호출하면 SchoolArt클래스에 가서 부모 거 하나, 자식 거 하나가 있다!
						  // 이때, 무조건 자식 printScore()이 호출된다!
		
	}

}





















