package classEx2;
/*
 	������ (constructor)
 	1. �޼���
 	2. ��ü�� ���鶧 �ν��Ͻ��� �ʿ��ϴ�
 	   �̶�, �ν��Ͻ��� �־��ִ� �� = �ʱⰪ
 	   * setter�� �־��ִ� ���� = ���԰�
 	   
 	     int num = 0; //�ʱⰪ
 	     num = 20; // ���԰�
 	     
 	     obj = new Type(); //�ʱⰪ  default �ʱⰪ�� ����
 	     obj.set(100)  // ���԰�
 	
 	Type2 obj = new Type2();   obj��ü�� default ������ �ʱ�ȭ �ƴ�! -> setter�� ����! setter�� �� ���� ������ ���� �ʿ��ϴ�
 	Type2 obj = new Type2(10, 5.5, "�ȳ�");   obj��ü�� �ʱ�ȭ �ƴ�! -> ���� �ְ� �����ϱ����� �ʿ��ϴ�
 	
 	3. ������ ����� ���
 	    1) �����ڴ� �⺻ �޼��������� ����Ÿ���� ���� �ʴ´�(�����Ѵ�)
 	           void �޼���(){} ���� void�� ������ �Ѵ�.
 	                �޼����(){}  �̷��� ����!
 	    2) �޼������ �ݵ�� Ŭ������ �̸��� �״�� ��� �Ѵ�.
 	    		Type2(){}	������ �Ϸ�!  "default constructor" "default ������" "�⺻ ������" 
 	    		
 	    		�ν��Ͻ��� ���鶧 �ʱⰪ�� �����ϱ� ���� �ʿ��� �޼���
 	
 	4. ������ Ư¡
 	    �ν��Ͻ��� ���� ��, ������ �ҷ��� �Ѵ�!
 	    �⺻ �����ڴ� �����Ϸ��� �ڵ����� ������ ����� �ش�!
 		    ��, �ٸ� �����ڰ� ���� ���� �ڵ����� ����� �ش�!
 		
 		�� �޼��� �̸��� �Ȱ��� �� �� �ִ�. ��, �Ű������� ��Ÿ���̳� ������ �޶�� �Ѵ�
 		   �̷��� �Ȱ��� �޼��� �̸����� �����ؼ� ����ϸ�, �޼��� ����Ҷ� ���ϴ�!
 		   
 		   "�����ε� - overloading" ����ڰ� ���ϰ� ���� ���ؼ� 
 		   
 */
class Type2{  // ctrl + t ==> hierarchy
	
	private int num;
	private double d;
	//Type2 Ŭ������ �����ڸ� ����� ������
	public Type2(){ // �⺻ ������!  ���� Ÿ���� ���� �޼���
		System.out.println(); // �⺻ �����ڴ� �ٸ� �����ڰ� ������ ��������� ����� �Ѵ�
	}
	public Type2(int num) { // �������� �⺻ ���������ڴ� public ��Ȳ���� private���� ���� ���� �ִ�
		super();  // -> object class
		this.num = num;
	}
	public Type2(double d) {
		super();
		this.d = d;
	}
	public Type2(int num, double d) {
		super(); //������ �� ---> ���� �θ� Ŭ������ �⺻ �����ڷ� ����!
		this.num = num;
		this.d = d;
	}
	public Type2(double num, double d) {
		this.num = (int)num;
		this.d = d;
	}
}
/*  
  	setter : ����
 
 	������ : �ʱ�ȭ
 	
 		�⺻������ : 1. �ν��Ͻ��� �ʱⰪ�� �־��� 2. ����Ÿ���� �������� 3. �ݵ�� Ŭ���� �̸��� �����ؾ� �Ѵ�
 		
 		�μ��ִ� ������
 		
 		�����ڴ� ��κ� public ������, private ���������ڷ� �����ڸ� ����⵵ �Ѵ�
 		(�̱��� ���� - �ν��Ͻ��� �Ѱ��� ������ �� ��!)
 		
 	�����ε�
 		�޼��带 ���� �̸����� ������ �ߺ� ��ų �� �ִµ�, �Ű������� ��Ÿ����
 		��� �� �޾ƾ� ������ �� �ִ�!
 		-����ڰ� ���ϰ� �޼��带 ����ϱ� ���� �����ε� ����� ��������!
 */
public class ClassTest05 {
	
		
	public static void main(String[] args) {
		
		Type2 person1 = new Type2();
		Type2 person2 = new Type2(10);
		Type2 person3 = new Type2(20.1);
		Type2 person4 = new Type2(10, 20.33);
		Type2 person5 = new Type2(10.5, 20); // �����ڸ� ���� �����!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	class Animal{
		Animal(){
			
		}
	}
	 
	class Car{
		Car() {
			
		}
	}

	class Train{
		Train(){
			
			
		}
	}
}

















