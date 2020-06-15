package extendsEx;

import java.util.Scanner;

/*
 	惑加
 	
 	促屈己苞 悼利 搬钦
 */
class Animal{
	private int cnt=0;
	
	

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	

	public int getCnt() {
		return cnt;
	}



	public void sound() { // 港港, 具克~~~~
		System.out.println("悼拱 匡澜");
	}
	
	public void sound(int cnt) { // 港港, 具克~~~~
		System.out.println("悼拱 匡澜 冉荐");
	}
	
}
class Dog extends Animal{
	
	//@Override  // @ annotation
	public void sound() {
		System.out.println("港港");
	}
										// overloading 
										// sound()
										// sound(int cnt)
	public void sound(int cnt) {
//		super.sound(cnt);
		for (int i = 0; i < cnt; i++) {
			
			System.out.println("港港");
		}
		
	}
}
class Cat extends Animal{
//	int cnt;
//	
//	
//	public Cat(int cnt) {
//		this.cnt = cnt;
//	}
	
	

	public void sound() {
		
		System.out.println("具克");
	}
	
	public void sound(int cnt) {
//		super.sound(cnt);
		for (int i = 0; i < cnt; i++) {
			
			System.out.println("具克");
		}
	}
}
public class ExtendsTest03 { 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Animal some = new Animal();
		
		
		some = new Dog();
		
		
		((Dog)some).sound(5);
		
		System.out.println("窿绰 冉荐 涝仿: ");
		some.setCnt(sc.nextInt());
		
		some.sound(some.getCnt()); //港港
		
		
		
		some = new Cat();
		
		((Cat)some).sound(2);
		System.out.println("窿绰 冉荐 涝仿: ");
		some.setCnt(sc.nextInt());
		some.sound(some.getCnt()); //具克
		
		

	}

}





















