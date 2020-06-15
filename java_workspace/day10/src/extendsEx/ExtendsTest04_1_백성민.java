package extendsEx;

import java.util.Random;
import java.util.Scanner;

/*
 	���
 	
 	�������� ���� ����
 	
 	����� ������
 	�θ� - �ڽ� Ŭ������ ���踦 �����ϱ�!
 	
 	��� - �����
 		 - ����
 		 - ������
 	���...
 	
 	��� : �θ� Ŭ����
 	�����, ����, ������, ��� : �ڽ� Ŭ����
 	
 	��� : �ν��Ͻ� ���� 3�� �̻�
 	�ڽ�Ŭ���� : �ν��Ͻ� ���� 2�� �̻�
 	
 	//�ʼ� �޼��� : ���� ���
 	//���� �޼��� : ����(����), ������ ���� ��� ��...
 	
 	1. �������̵� �����غ���
 	2. �����ε� ������ ����
 	
 	���� : /homework/java_day10/ExtendTest04_1_�鼺��.java
 	10�ñ��� ����
 	
 */

class Human{
	private String name;
	private int age;
	private String gender;
	private String hometown;
	private String dateOfBirth;
	
	public Human(){
		
	}

	public Human(String name, int age, String gender, String hometown, String dateOfBirth) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hometown = hometown;
		this.dateOfBirth = dateOfBirth;
	}
	
	void printInfo() {
		System.out.println("==== ���ǰ� �Ż� ���� ====");
		System.out.println("�̸�: "+name+"\n����: "+age+"\n����: "+gender+"\n����: "+hometown+"\n�������: "+dateOfBirth);
	}
	
	
}
class Musician extends Human{
	private String genre;
	private String instrument;
	private boolean isBand;
	private int numberOfFan;
	private double youtubeSubscribers;
	private int audience;
	private int income;
	
	static Random r = new Random();
	
	public Musician() {
		
	}
	
	public Musician(String name, int age, String gender, String hometown, String dateOfBirth, String genre, String
					instrument, boolean isBand, int numberOfFan, double youtubeSubscribers) {
		super(name, age, gender, hometown, dateOfBirth);
		this.genre = genre;
		this.instrument = instrument;
		this.isBand = isBand;
		this.numberOfFan = numberOfFan;
		this.youtubeSubscribers = youtubeSubscribers;
		this.audience = (r.nextInt(501)+0); //������ 0 ~ 500�� ����
		this.income = audience * 50000; //��� ���� Ƽ�Ϸ� 5����
		
		
	}

	public int getAudience() {
		return audience;
	}
	
	public int getIncome() {
		return income;
	}
	
	public boolean isBand() {
		return isBand;
	}

	public int getNumberOfFan() {
		return numberOfFan;
	}

	public double getYoutubeSubscribers() {
		return youtubeSubscribers;
	}
	
	
	public void setNumberOfFan(int numberOfFan) {
		this.numberOfFan = numberOfFan;
	}
	
	public void setYoutubeSubscribers(double youtubeSubscribers) {
		this.youtubeSubscribers = youtubeSubscribers;
	}
	
	public void setIncome(int income) {
		this.income = income;
	}
	

	//��ȹ
		//������ ����(��� 50000��, ������ 0~500)
		//40%Ȯ���� ���� ���� / ������ ���� 2�� ����, �� �� 2�� ����, ������ ������ �� 2�� ����
		//���� ���� ���н� ���� ���丷, �Ҽ� ���丷, ������ ������ �� ���丷
		

		int show() {
		    //Ȯ���� ������� �� �ִ� �迭 ����
			int percentage [] = new int[100];
			//�迭�� 1�� 40�� ����ִ� �۾� --> 40%�� �ǹ��Ѵ�.
			for (int i = 0; i < 40; i++) {
				int index = r.nextInt(99) + 0;
				//System.out.println(index);
				//System.out.println(percentage[index]);//�ʱⰪ�� �� 0�ε� �� 1�� ���ñ�?
													  //������ �Ȱ��� ���ڰ� �ٽ� �ݺ��Ǹ� 1�� �־���.
				if(percentage[index] != 1) {
					percentage[index]=1;		
//					System.out.println(percentage[index]);
				}	
			}
			//Ȯ���� ������� �� �ִ� �迭�� ������ 40% ���� ���� ���θ� Ȯ���ϱ�.
			int indexForShow = r.nextInt(99)+0;
			
			return percentage[indexForShow];
		}
		
		void successfulShow() {
			int income = 0;
			int fan = 0;
			double youtube = 0.0;
			
			income = this.income * 2; // this.income = income * 2;
			fan = this.numberOfFan * 2; //this.numberOfFan(100) = this.numberOfFan(50) * 2
			youtube = this.youtubeSubscribers * 0.5;
			System.out.println("�����մϴ�! �������� �����̿����ϴ�!");
			System.out.println("���� ���: " + income + "��\n�� ��: " + fan + "����\n������ ä�� ������ ��: " 
								+ youtube +"k subscribers");
			
		}
		
		//�� ��� ���丷 / �Ҽ� ���丷 / ������ ��ȸ �� ���丷
		void failedShowResults() {
			int income = 0;
			int fan = 0;
			double youtube = 0.0;
			
			income = this.income / 2;//this.income *= 0.5; // this.income = 12325000
			fan = this.numberOfFan / 2;//this.numberOfFan *= 0.5;
			youtube = this.youtubeSubscribers * 0.5;//this.youtubeSubscribers =  Double.parseDouble(String.format("%.1f", youtubeSubscribers * 0.5));
			System.out.println("�����ߴ� �������� ä���� ���� �������� ������ �ŵ��� ���߽��ϴ�..");
			System.out.println("���� ���: " + income + "��\n�� ��: " + fan + "����\n������ ä�� ������ ��: " + 
								+ youtube +"k subscribers");
			
		}
	
	void musicianInfo() {
		System.out.println("==== �� ���� ====");
		System.out.println("�����帣: "+genre);
		System.out.println("�Ǳ�: " + instrument);
		System.out.println("���ǰ� ����: " + (isBand ? "��� ��Ƽ��Ʈ" : "�ַ� ��Ƽ��Ʈ"));
		System.out.println("�� ��: "+ numberOfFan +"����");
		System.out.println("������ ä�� ������ ��: "+ youtubeSubscribers + "k subscribers");
	}

	
}

class Guitarist extends Musician{
	
	private int guitaristIncome;
	
	public Guitarist() {
		
	}
	
	public Guitarist(String name, int age, String gender, String hometown, String dateOfBirth, String genre,
			String instrument, boolean isBand, int numberOfFan, double youtubeSubscribers) {
		super(name, age, gender, hometown, dateOfBirth, genre, instrument, isBand, numberOfFan, youtubeSubscribers);
		
		
	}
	
	
	void guitaristInfo(){
		
		System.out.println("���� ������: "+getAudience()+"��");
		System.out.println("���� ����(��� 5����): "+ getIncome() +"��");
		System.out.println();
				
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		super.musicianInfo();
		guitaristInfo();
	}
	
}

class Pianist extends Musician{
	
	private int pianistIncome;
	
	public Pianist() {
		
	}

	public Pianist(String name, int age, String gender, String hometown, String dateOfBirth, String genre,
			String instrument, boolean isBand, int numberOfFan, double youtubeSubscribers) {
		super(name, age, gender, hometown, dateOfBirth, genre, instrument, isBand, numberOfFan, youtubeSubscribers);
	}
	
	void pianistInfo(){
		
		System.out.println("���� ������: "+getAudience()+"��");
		System.out.println("���� ����(��� 5����): "+ getIncome() +"��");
		System.out.println();
				
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		super.musicianInfo();
		pianistInfo();
	}
	
	
	
}

public class ExtendsTest04_1_�鼺�� { 
	
	public static void main(String[] args) {

		Guitarist gtr1 = new Guitarist("Al Di Meola", 65, "����","�̱� ������", "1954/7/22", "����ǻ��", "��Ÿ",
										false, 50, 19.7);

		Pianist piano1 = new Pianist("Chick Corea", 78, "����", "�̱� �޻�����", "1941/6/12", "����ǻ��", "�ǾƳ�",
									true, 120, 71.2);
//		Human artist = null;
//		artist = gtr1;
		
		gtr1.printInfo();
		
		
		System.out.println("Al Di Meola�� ���� ���");
		int alResult = gtr1.show();
//		System.out.println(result);
		if(alResult==1) {
			gtr1.successfulShow();
		}else if(alResult==0) {
			gtr1.failedShowResults();
		}
		System.out.println();
		
		//artist = piano1;
		
		piano1.printInfo();
		System.out.println("Chick Corea�� ���� ���");
		int chickResult = piano1.show();
//		System.out.println(result);
		if(chickResult==1) {
			gtr1.successfulShow();
		}else if(chickResult==0) {
			gtr1.failedShowResults();
		}
		
		

	}

}





















