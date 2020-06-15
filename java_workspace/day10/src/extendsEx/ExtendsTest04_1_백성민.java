package extendsEx;

import java.util.Random;
import java.util.Scanner;

/*
 	상속
 	
 	다형성과 동적 결합
 	
 	사람을 주제로
 	부모 - 자식 클래스의 관계를 설정하기!
 	
 	사람 - 운동선수
 		 - 군인
 		 - 개발자
 	등등...
 	
 	사람 : 부모 클래스
 	운동선수, 군인, 개발자, 등등 : 자식 클래스
 	
 	사람 : 인스턴스 변수 3개 이상
 	자식클래스 : 인스턴스 변수 2개 이상
 	
 	//필수 메서드 : 정보 출력
 	//선택 메서드 : 월급(연봉), 직종별 정보 출력 등...
 	
 	1. 오버라이딩 적용해보기
 	2. 오버로딩 적용해 보기
 	
 	제출 : /homework/java_day10/ExtendTest04_1_백성민.java
 	10시까지 제출
 	
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
		System.out.println("==== 음악가 신상 정보 ====");
		System.out.println("이름: "+name+"\n나이: "+age+"\n성별: "+gender+"\n고향: "+hometown+"\n생년월일: "+dateOfBirth);
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
		this.audience = (r.nextInt(501)+0); //관객수 0 ~ 500명 랜덤
		this.income = audience * 50000; //명당 공연 티켓료 5만원
		
		
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
	

	//기획
		//관객수 랜덤(명당 50000원, 관객수 0~500)
		//40%확률로 공연 성공 / 성공시 수입 2배 증가, 팬 수 2배 증가, 유투브 구독자 수 2배 증가
		//만약 공연 실패시 수입 반토막, 팬수 반토막, 유투브 구독자 수 반토막
		

		int show() {
		    //확률을 계산해줄 수 있는 배열 생성
			int percentage [] = new int[100];
			//배열에 1을 40개 집어넣는 작업 --> 40%를 의미한다.
			for (int i = 0; i < 40; i++) {
				int index = r.nextInt(99) + 0;
				//System.out.println(index);
				//System.out.println(percentage[index]);//초기값이 다 0인데 왜 1이 나올까?
													  //이유는 똑같은 숫자가 다시 반복되면 1이 넣어짐.
				if(percentage[index] != 1) {
					percentage[index]=1;		
//					System.out.println(percentage[index]);
				}	
			}
			//확률을 계산해줄 수 있는 배열을 가지고 40% 공연 성공 여부를 확인하기.
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
			System.out.println("축하합니다! 성공적인 공연이였습니다!");
			System.out.println("현재 재산: " + income + "원\n팬 수: " + fan + "만명\n유투브 채널 구독자 수: " 
								+ youtube +"k subscribers");
			
		}
		
		//전 재산 반토막 / 팬수 반토막 / 유투브 조회 수 반토막
		void failedShowResults() {
			int income = 0;
			int fan = 0;
			double youtube = 0.0;
			
			income = this.income / 2;//this.income *= 0.5; // this.income = 12325000
			fan = this.numberOfFan / 2;//this.numberOfFan *= 0.5;
			youtube = this.youtubeSubscribers * 0.5;//this.youtubeSubscribers =  Double.parseDouble(String.format("%.1f", youtubeSubscribers * 0.5));
			System.out.println("예상했던 관객수를 채우지 못해 성공적인 공연을 거두지 못했습니다..");
			System.out.println("현재 재산: " + income + "원\n팬 수: " + fan + "만명\n유투브 채널 구독자 수: " + 
								+ youtube +"k subscribers");
			
		}
	
	void musicianInfo() {
		System.out.println("==== 상세 정보 ====");
		System.out.println("음악장르: "+genre);
		System.out.println("악기: " + instrument);
		System.out.println("음악가 유형: " + (isBand ? "밴드 아티스트" : "솔로 아티스트"));
		System.out.println("팬 수: "+ numberOfFan +"만명");
		System.out.println("유투브 채널 구독자 수: "+ youtubeSubscribers + "k subscribers");
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
		
		System.out.println("공연 관객수: "+getAudience()+"명");
		System.out.println("현재 수입(명당 5만원): "+ getIncome() +"원");
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
		
		System.out.println("공연 관객수: "+getAudience()+"명");
		System.out.println("현재 수입(명당 5만원): "+ getIncome() +"원");
		System.out.println();
				
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		super.musicianInfo();
		pianistInfo();
	}
	
	
	
}

public class ExtendsTest04_1_백성민 { 
	
	public static void main(String[] args) {

		Guitarist gtr1 = new Guitarist("Al Di Meola", 65, "남성","미국 뉴저지", "1954/7/22", "재즈퓨젼", "기타",
										false, 50, 19.7);

		Pianist piano1 = new Pianist("Chick Corea", 78, "남성", "미국 메사츄세츠", "1941/6/12", "재즈퓨젼", "피아노",
									true, 120, 71.2);
//		Human artist = null;
//		artist = gtr1;
		
		gtr1.printInfo();
		
		
		System.out.println("Al Di Meola의 공연 결과");
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
		System.out.println("Chick Corea의 공연 결과");
		int chickResult = piano1.show();
//		System.out.println(result);
		if(chickResult==1) {
			gtr1.successfulShow();
		}else if(chickResult==0) {
			gtr1.failedShowResults();
		}
		
		

	}

}





















