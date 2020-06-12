package classEx4;
/*
 	this() : this 생성자
 */

//성적은 0~100점만 들어올 수 있다.
//어떤 사람은 한과목도 안볼 수 있고,
//어떤 사람은 한과목만 볼수도 있는 상황이다!  <== 초기값이 몇개니?
//(단, 이름은 반드시 존재한다)
//생성자 갯수는 이름만, 이름+국어, 이름+국어+영어, 이름+국어+영어+수학
//이때, 각 과목별로 0~100점 사이 제어를 해야한다!
//생성자는 this()를 이용해서 재활용할 수 있도록 하자!
public class ClassTest07 {
	String name;
	int kor;
	int eng;
	int math;
	
	public ClassTest07(String name, int kor, int eng, int math) {
		
		this.name = name;
		
		if(kor >= 0 && kor <= 100) {
			this.kor = kor;
		}else {
			this.kor = -1;
		}
		if(eng >= 0 && eng <= 100) {
			this.eng = eng;
		}else {
			this.eng = -1;
		}
		if(math >= 0 && math <= 100) {
			this.math = math;
		}else {
			this.math = -1;
		}
	}

	public ClassTest07(String name, int kor, int eng) {
		this(name, kor, eng, -1);
		
	}

	public ClassTest07(String name, int kor) {
		this(name, kor, -1, -1);
	}
	public ClassTest07(String name) {
		
		this(name, -1, -1, -1);
	}

	//출력용만 만들기 (gets/set 생략)
	
	void printScore() {
		
		System.out.println(name + "\t" + kor + "점\t" + eng + "점\t" + math + "점");
	}




	public static void main(String[] args) {
		//객체 3개 만든 후
		//각 객체는 초기값이 모두 다르다!
		//그리고 출력해 보세요!
		
		ClassTest07 hgd = new ClassTest07("홍길동");
		ClassTest07 pms = new ClassTest07("박문수", 70, 120);
		ClassTest07 lss = new ClassTest07("이순신", 40, 30, 20);
		
		System.out.println("이름\t국어\t영어\t수학");
		hgd.printScore();
		pms.printScore();
		lss.printScore();
		
	}

}
