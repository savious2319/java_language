package staticInnerEx;

import java.util.Scanner;

class MySystem{
	static Out out = new Out();
	static In in = new In();
	static class Out{
		void print(String msg) { System.out.println(msg);	}
		void print(double msg) { System.out.println(msg);	}
		void print(int msg) { System.out.println(msg);	}
		void print(float msg) { System.out.println(msg);	}
	}
	static class In{
		private Scanner sc = new Scanner(System.in);
		String in() {
			return sc.next();
		}
	}
}

public class StaticInnerTest2 {

	public static void main(String[] args) {
		MySystem.out.print("안녕 내가 만든 static 내부 클래스야~~");
		
		String msg = MySystem.in.in();
		MySystem.out.print(msg);
		
		
		
		

		
	}

}






