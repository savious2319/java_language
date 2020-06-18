package interEx;
interface InterA{
	void update();
}
interface InterB{
	void delete();
}
interface Controllable extends InterA, InterB{ //~albe : ��¼�� interface
													  // ���̵带 ���鶧 interface�� ���� ����
	
}
class Control implements Controllable{

	@Override
	public void update() {
		System.out.println("Control Ŭ������ update");
	}

	@Override
	public void delete() {
		System.out.println("Control Ŭ������ delete");
		
	}
	
}
class ControlB implements Controllable{
	@Override
	public void delete() {
		System.out.println("ControlB Ŭ������ delete");
		
	}
	@Override
	public void update() {
		System.out.println("ControlB Ŭ������ update");
		
	}
}
//�� 3�� Ŭ����!!!
class Some{
	void fct(Controllable obj) {  //�������̽��� Ÿ���̴�! ������
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






