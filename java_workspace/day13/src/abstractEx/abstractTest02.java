package abstractEx;

//??추상 클래스를 정의할 수 있다!
//??추상 메서드를 선언 할 수 있다

//추상 클래스

abstract class Shape{
	private int x, y;  // 공통된 요소만 인스턴스변수로 뺀다
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
		System.out.println("삼각형을 "+x+", "+y+"좌표에 그립니다");
		System.out.println("삼각형을 "+getX()+", "+getY()+"좌표에 그립니다");
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
//		System.out.println("원을 그리다");
//	}
	
	@Override
	void draw(int x, int y) {
		System.out.println("원을 "+getX()+", "+getY()+"좌표에 그립니다");
		System.out.println("원을 "+x+", "+y+"좌표에 그립니다");
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
//		System.out.println("직사각형을 그리다");
//	}
	@Override
	void draw(int x, int y) {
		System.out.println("직사각형을 "+getX()+", "+getY()+"좌표에 그립니다");
		System.out.println("직사각형을 "+x+", "+y+"좌표에 그립니다");
	}
	@Override
	void print() {
		draw(3, 4);
	}
	
}

public class abstractTest02 {

	public static void main(String[] args) {

		//삼각형 객체.print();
		//원 객체.print();
		//직사각형 객체.print();
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
