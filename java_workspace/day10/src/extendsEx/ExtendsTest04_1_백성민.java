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
	
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getHometown() {
		return hometown;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	void printInfo() {
		System.out.println("==== ���ǰ� �Ż� ���� ====");
		System.out.println("�̸�: "+name+"\n����: "+age+"\n����: "+gender+"\n���: "+hometown+"\n�������: "+dateOfBirth);
	}
	
	
}
class Musician extends Human{
	private String genre;
	private String instrument;
	private boolean isBand;
	private String artistType;
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
		return Double.parseDouble(String.format("%.1f",youtubeSubscribers));
	}
	
	public String getGenre() {
		return genre;
	}
	public String getInstrument() {
		return instrument;
	}
	
	
	public String getArtistType() {
		return artistType;
	}
	
	

	public void setAudience(int a) {
		this.audience = a;
	}

	public void setArtistType(String artistType) {
		this.artistType = artistType;
	}

	public void setNumberOfFan(int numberOfFan) {
		this.numberOfFan = numberOfFan;
	}
	
	public void setYoutubeSubscribers(double youtubeSubscribers) {
		this.youtubeSubscribers = youtubeSubscribers;
	}
	
	public void setIncome() {
		this.income = audience * 50000;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
	public void setBand(boolean isBand) {
		if(isBand == true) {
			setArtistType("��� ��Ƽ��Ʈ");
		}
		else{
			setArtistType("�ַ� ��Ƽ��Ʈ");
		}
		this.isBand = isBand;
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
//			int income = 0;
//			int fan = 0;
//			double youtube = 0.0;
			
			//income = this.income * 2; 
			this.income *= 2;
			//fan = this.numberOfFan * 2; 
			this.numberOfFan *= 2;
			//youtube = this.youtubeSubscribers * 0.5;
			this.youtubeSubscribers *= 2;
			System.out.println("�����մϴ�! �������� �����̿����ϴ�!");
			System.out.println("���� ���: " + income + "��\n�� ��: " + numberOfFan + "����\n������ ä�� ������ ��: " 
								+ youtubeSubscribers +"k subscribers");
			
		}
		
		//�� ��� ���丷 / �Ҽ� ���丷 / ������ ��ȸ �� ���丷
		void failedShowResults() {
//			int income = 0;
//			int fan = 0;
//			double youtube = 0.0;
			
			//income = this.income / 2;
			this.income *= 0.5;
			//fan = this.numberOfFan / 2;
			this.numberOfFan *= 0.5;
			//youtube = this.youtubeSubscribers * 0.5;
			this.youtubeSubscribers =  Double.parseDouble(String.format("%.1f", youtubeSubscribers * 0.5));
			System.out.println("�����ߴ� �������� ä���� ���� �������� ������ �ŵ��� ���߽��ϴ�..");
			System.out.println("���� ���: " + income + "��\n�� ��: " + numberOfFan + "����\n������ ä�� ������ ��: " + 
								+ youtubeSubscribers +"k subscribers");
			
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

class NewArtist extends Musician{
	static Scanner sc = new Scanner(System.in);
	public NewArtist() {
		
	}
	
	
	
	public NewArtist(String name, int age, String gender, String hometown, String dateOfBirth, String genre,
			String instrument, boolean isBand, int numberOfFan, double youtubeSubscribers) {
		super(name, age, gender, hometown, dateOfBirth, genre, instrument, isBand, numberOfFan, youtubeSubscribers);
	}



	static void addArtist(NewArtist[]na){
		for (int i = 0; i < na.length; i++) {
			System.out.print("�̸� : "); na[i].setName(sc.next());
			System.out.print("���� : "); na[i].setAge(sc.nextInt());
			System.out.print("���� : "); na[i].setGender(sc.next());
			System.out.print("��� : "); na[i].setHometown(sc.next());
			System.out.print("������� : "); na[i].setDateOfBirth(sc.next());
			System.out.print("���� �帣 : "); na[i].setGenre(sc.next());
			System.out.print("�Ǳ� : "); na[i].setInstrument(sc.next());
			System.out.print("���� : \n1) ��� ��Ƽ��Ʈ \n2) �ַ� ��Ƽ��Ʈ");
			int num = sc.nextInt();
			if(num == 1) {
				na[i].setBand(true);
			}
			else if(num == 2) {
				na[i].setBand(false);
			}
			System.out.println("�� ��(�� ����) : "); na[i].setNumberOfFan(sc.nextInt());
			System.out.println("������ ä�� ������ ��(k ����) : "); na[i].setYoutubeSubscribers(sc.nextDouble());
		}
		
	}
	
	static void showArtist(NewArtist[]na) {
		System.out.println("�̸�\t����\t����\t���\t\tDOB\t���� �帣\t�Ǳ�\t��Ƽ��Ʈ ����\t�� ��\t������ ä�� ������ ��\t���� ����");
		for (int i = 0; i < na.length; i++) {
			na[i].setAudience(r.nextInt(501)+0);
			na[i].setIncome();
			System.out.print(na[i].getName()+"\t"+ na[i].getAge()+"\t"+ na[i].getGender()+"\t\t" + na[i].getHometown() + "\t" +
					na[i].getDateOfBirth() + "\t"+  na[i].getGenre() +"\t" + na[i].getInstrument() + "\t" + 
					na[i].getArtistType()+ "\t" + na[i].getNumberOfFan() + "��\t" +
					na[i].getYoutubeSubscribers()+ "��\t"+na[i].getIncome() + "����\n");
			
		}
	}
	
}

public class ExtendsTest04_1_�鼺�� { 
	
	static NewArtist[] na = new NewArtist[1];
	
	public static void main(String[] args) {

		Guitarist gtr1 = new Guitarist("Al Di Meola", 65, "����","�̱� ������", "1954/7/22", "����ǻ��", "��Ÿ",
										false, 50, 19.7);

		Pianist piano1 = new Pianist("Chick Corea", 78, "����", "�̱� �޻�����", "1941/6/12", "����ǻ��", "�ǾƳ�",
									true, 120, 71.2);
//		Human artist = null;
//		artist = gtr1;
		
		for (int i = 0; i < na.length; i++) {
			na[i] = new NewArtist();
		}
		
		NewArtist.addArtist(na);
		
		NewArtist.showArtist(na);
		
		
		int result = na[0].show();
		if(result==1) {
			na[0].successfulShow();
		}else if(result==0) {
			na[0].failedShowResults();
		}
		
				
		
		//gtr1.printInfo();
//		
//		
//		System.out.println("Al Di Meola�� ���� ���");
//		int alResult = gtr1.show();
////		System.out.println(result);
//		if(alResult==1) {
//			gtr1.successfulShow();
//		}else if(alResult==0) {
//			gtr1.failedShowResults();
//		}
//		System.out.println();
//		
//		//artist = piano1;
//		
//		piano1.printInfo();
//		System.out.println("Chick Corea�� ���� ���");
//		int chickResult = piano1.show();
////		System.out.println(result);
//		if(chickResult==1) {
//			piano1.successfulShow();
//		}else if(chickResult==0) {
//			piano1.failedShowResults();
//		}
		
		

	}

}





















