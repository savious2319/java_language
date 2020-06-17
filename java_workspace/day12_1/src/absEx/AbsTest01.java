package absEx;

 /*
 	추상 클래스 - 추상 메서드 - 추상메서드는 하위에서 반드시 재정의
 	"안그러면, 인스턴스를 만들 수 없음"
 */

abstract class A{	// A를 추상클래스로 만들자!
	int kor;
	int eng;
	A(int k, int e){}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	
	abstract public void printScore();
	// 추상클래스는 일반 클래스와 똑같은데 추상메서드가 하나만 있어도 인스턴스화 못시킨다
	// 하위 클래스에서 재정의 하지않을까봐 강제성을 부여하기 위해 추상 클래스/추상 메서드를 쓴다
	abstract public void inputScore();
	abstract public void updateScore();
	abstract public void deleteScore();
}
abstract class C extends A{

	C() {
		super(0, 0);
	}
}

class B extends A{
	B(){
		super(0,0);
	}

	@Override
	public void printScore() {
		System.out.println("추상 메스드를 재정의 했습니다!");
	}

	@Override
	public void inputScore() {
		
	}

	@Override
	public void updateScore() {
		
	}

	@Override
	public void deleteScore() {
		
	}
	
}
public class AbsTest01 {

	public static void main(String[] args) {

		
	}

}
