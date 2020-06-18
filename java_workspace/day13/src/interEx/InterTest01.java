package interEx;
interface InterA{
	void update();
}
interface InterB{
	void delete();
}
interface Controllable extends InterA, InterB{ //~albe : 어쩌면 interface
													  // 가이드를 만들때 interface를 쓰면 좋다
	
}
class Control implements Controllable{

	@Override
	public void update() {
		System.out.println("Control 클래스의 update");
	}

	@Override
	public void delete() {
		System.out.println("Control 클래스의 delete");
		
	}
	
}
class ControlB implements Controllable{
	@Override
	public void delete() {
		System.out.println("ControlB 클래스의 delete");
		
	}
	@Override
	public void update() {
		System.out.println("ControlB 클래스의 update");
		
	}
}
//제 3의 클래스!!!
class Some{
	void fct(Controllable obj) {  //인터페이스도 타입이다! 다형성
		obj.delete();
		obj.update();
	}
}
public class InterTest01 {

	public static void main(String[] args) {

		new Some().fct(new Control());
		new Some().fct(new ControlB());
		
		
	}

}






