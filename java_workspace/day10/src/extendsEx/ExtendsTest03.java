package extendsEx;

import java.util.Scanner;

/*
 	���
 	
 	�������� ���� ����
 */
class Animal{
	private int cnt=0;
	
	

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	

	public int getCnt() {
		return cnt;
	}



	public void sound() { // �۸�, �߿�~~~~
		System.out.println("���� ����");
	}
	
	public void sound(int cnt) { // �۸�, �߿�~~~~
		System.out.println("���� ���� Ƚ��");
	}
	
}
class Dog extends Animal{
	
	//@Override  // @ annotation
	public void sound() {
		System.out.println("�۸�");
	}
										// overloading 
										// sound()
										// sound(int cnt)
	public void sound(int cnt) {
//		super.sound(cnt);
		for (int i = 0; i < cnt; i++) {
			
			System.out.println("�۸�");
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
		
		System.out.println("�߿�");
	}
	
	public void sound(int cnt) {
//		super.sound(cnt);
		for (int i = 0; i < cnt; i++) {
			
			System.out.println("�߿�");
		}
	}
}
public class ExtendsTest03 { 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Animal some = new Animal();
		
		
		some = new Dog();
		
		
		((Dog)some).sound(5);
		
		System.out.println("���� Ƚ�� �Է�: ");
		some.setCnt(sc.nextInt());
		
		some.sound(some.getCnt()); //�۸�
		
		
		
		some = new Cat();
		
		((Cat)some).sound(2);
		System.out.println("���� Ƚ�� �Է�: ");
		some.setCnt(sc.nextInt());
		some.sound(some.getCnt()); //�߿�
		
		

	}

}





















