package abstractEx;

//??�߻� Ŭ������ ������ �� �ִ�!
//??�߻� �޼��带 ���� �� �� �ִ�

//�߻� Ŭ����

abstract class Shape{
	private int x, y;  // ����� ��Ҹ� �ν��Ͻ������� ����
//	int width, height, radius;
	

	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	abstract void draw(int x, int y);
	abstract void print();
}

class Triangle extends Shape{
	int width, height;
	
	public Triangle() {
		super(0,0);
	}
	
	public Triangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	void draw(int x, int y) {
		System.out.println("�ﰢ���� "+x+", "+y+"��ǥ�� �׸��ϴ�");
		System.out.println("�ﰢ���� "+getX()+", "+getY()+"��ǥ�� �׸��ϴ�");
	}
	@Override
	void print() {
		draw(5,4);
		
	}
	
}

class Circle extends Shape{
	int radius;
	
	public Circle() {
		super(0,0);
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
//	void draw(int x, int y, int radius) {
//		System.out.println("���� �׸���");
//	}
	
	@Override
	void draw(int x, int y) {
		System.out.println("���� "+getX()+", "+getY()+"��ǥ�� �׸��ϴ�");
		System.out.println("���� "+x+", "+y+"��ǥ�� �׸��ϴ�");
	}

@Override
void print() {
	draw(3,4);
}
	
}

class Rectangle extends Shape{
	int width, height;
	
	public Rectangle() {
		super(0,0);
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
//	void draw() {
//		System.out.println("���簢���� �׸���");
//	}
	@Override
	void draw(int x, int y) {
		System.out.println("���簢���� "+getX()+", "+getY()+"��ǥ�� �׸��ϴ�");
		System.out.println("���簢���� "+x+", "+y+"��ǥ�� �׸��ϴ�");
	}
	@Override
	void print() {
		draw(3, 4);
	}
	
}

public class abstractTest02 {

	public static void main(String[] args) {

		//�ﰢ�� ��ü.print();
		//�� ��ü.print();
		//���簢�� ��ü.print();
		Triangle tri = new Triangle(4,7,0,0);
		tri.print();
		tri.setX(100);
		tri.setY(200);
		tri.print();
		
		//new Triangle().print();
		
		Circle cir = new Circle(44, 44,0);
		cir.print();
		cir.setX(34);
		cir.setY(25);
		cir.print();
		
		Rectangle rec = new Rectangle();
		rec.print();
		rec.setX(77);
		rec.setY(88);
		rec.print();
		
		
	}

}
