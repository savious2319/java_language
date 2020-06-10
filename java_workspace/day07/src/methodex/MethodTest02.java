package methodex;

import java.util.Scanner;

public class MethodTest02 {
	int num;
	int num2;
	private int add() { //private은 같은 클래스안에서는 쓸 수 있다
		return this.num + this.num2;
		
	}
	private int sub() {
		return this.num - this.num2;
		
	}
	private double div() {
		
		double rst = 0;
		if(num2 != 0) {
		rst =  (double)num / num2;
		}
		rst = (double)num / num2;
		return rst;
		
	}
	private int mul() {
		return this.num * this.num2;
		
	}
	public void printCalcResult() {
		System.out.println("덧셈 결과: " + this.add());
		System.out.println("뺄셈 결과: " + this.sub());
		System.out.println("나숫셈 결과: " + div()); //this를 생략할 수 있다!
		System.out.println("곱셈 결과: " + this.mul());
		
	}
	public static void main(String[] args) {
		//인스턴스 변수 num, num2에 값을 입력받은 후,
		//printCalc 메서드를 이용해 사칙연산 결과값을 출력하세요
		//printCalc 메서드 내부에서는 각각 add() ~ mul()를 이용해야 한다!
		Scanner sc = new Scanner(System.in);
		
		MethodTest02 cal = new MethodTest02();
		
		System.out.print("첫번째 정수 입력 : ");
		cal.num = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		cal.num2 = sc.nextInt();
		
		System.out.println(cal.add());
		cal.printCalcResult();
		
		MethodTest02 cal2 = new MethodTest02();
		
		System.out.print("첫번째 정수 입력 : ");
		cal2.num = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		cal2.num2 = sc.nextInt();
		
		System.out.println(cal2.add());
		cal2.printCalcResult();
		

		
	}
}
