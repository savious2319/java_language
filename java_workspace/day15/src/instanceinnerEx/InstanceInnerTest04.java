package instanceinnerEx;


class Outer3{
	int x = 11;
	class Inner{
		int x = 22;
		void fct() {
			int x = 33;
			System.out.println("fct()¿« x : "  + x);
			System.out.println("Inner¿« x : "  + this.x);
			System.out.println("Outer3¿« x : " + Outer3.this.x);
		}
	}
	
}

public class InstanceInnerTest04 {

	public static void main(String[] args) {
		
		new Outer3().new Inner().fct();
		
		
		
		
		
	}

}






