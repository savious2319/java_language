package classEx2;

/*
	사람을 주제로 클래스 구성해 보기
	
	
	
	직업
	축구 선수		야구선수		농구선수
	
	이름			이름			이름
	출생			출생			출생			
	키				키				키
	몸무게			몸무게			몸무게
	소속팀			소속팀			소속팀
	
	
 */
class SportsPlayer{
	String sportsType;
	String name;
	int year;
	int month;
	int day;
	double height;
	double weight;
	String team;
	public String getSportsType() {
		return sportsType;
	}
	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public SportsPlayer(String sportsType, String name, int year, int month, int day, double height, double weight,
			String team) {
		this.sportsType = sportsType;
		this.name = name;
		if(year>0 && year<2020)
			this.year = year;
		else
			year = -1;
		
		if(month>0 && month<13)
			this.month = month;
		else
			month = -1;
		
		if(day>0 && day<32)
			this.day = day;
		else
			day = -1;
		
		this.height = height;
		this.weight = weight;
		this.team = team;
	}
	public SportsPlayer(String sportsType, String name, int year, int month, int day, double height, double weight) {
		this.sportsType = sportsType;
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.height = height;
		this.weight = weight;
	}
	public SportsPlayer(String sportsType, String name, int year, int month, int day, double height) {
		/*this.sportsType = sportsType;
		this.name = name;
		
		if(year>0 && year<2020)
			this.year = year;
		if(month>0 && month<13)
			this.month = month;
		if(day>0 && day<32)
			this.day = day;
		
		this.height = height;*/
		
		this(sportsType, name, year, month, day, height, 0.0, "");
		
		//main에서     new SportsPlayer("육상", "칼루이스", 1945, 5, 5, 178.1);
		
	}
	public SportsPlayer(String sportsType, String name, int year, int month, int day) {
		/*this.sportsType = sportsType;
		this.name = name;
		if(year>0 && year<2020)
			this.year = year;
		
		if(month>0 && month<13)
			this.month = month;
		
		if(day>0 && day<32)
			this.day = day;*/
		
		//this();   //현재 생성자에서  this( 매개변수 ) 에 부합되는 생성자로 초기값을 갖고 가라!
		this(sportsType, name, year, month, day, 0.0, 0.0, null);
		
		
		
	}
	public SportsPlayer(String sportsType, String name) {
		//this.sportsType = sportsType;
		//this.name = name;
		//this(sportsType, name, 0, 0, 0, 0.0, 0.0, null);
		this("", "", -1, -1, -1, -1);
		
		
	}
	
	
}

public class ClassTest06_배정수2 {

	public static void main(String[] args) {
		
		
		
	}

}














