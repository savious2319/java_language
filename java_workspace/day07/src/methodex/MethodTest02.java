package methodex;

import java.util.Scanner;

public class MethodTest02 {
	int num;
	int num2;
	private int add() { //private�� ���� Ŭ�����ȿ����� �� �� �ִ�
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
		System.out.println("���� ���: " + this.add());
		System.out.println("���� ���: " + this.sub());
		System.out.println("������ ���: " + div()); //this�� ������ �� �ִ�!
		System.out.println("���� ���: " + this.mul());
		
	}
	public static void main(String[] args) {
		//�ν��Ͻ� ���� num, num2�� ���� �Է¹��� ��,
		//printCalc �޼��带 �̿��� ��Ģ���� ������� ����ϼ���
		//printCalc �޼��� ���ο����� ���� add() ~ mul()�� �̿��ؾ� �Ѵ�!
		Scanner sc = new Scanner(System.in);
		
		MethodTest02 cal = new MethodTest02();
		
		System.out.print("ù��° ���� �Է� : ");
		cal.num = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		cal.num2 = sc.nextInt();
		
		System.out.println(cal.add());
		cal.printCalcResult();
		
		MethodTest02 cal2 = new MethodTest02();
		
		System.out.print("ù��° ���� �Է� : ");
		cal2.num = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		cal2.num2 = sc.nextInt();
		
		System.out.println(cal2.add());
		cal2.printCalcResult();
		

		
	}
}
