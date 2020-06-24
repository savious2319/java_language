package scoreEx_백성민;

public class Score {
	private String name;
	private int IdNum;
	private int korScore;
	private int engScore;
	private int mathScore;
	private int totalScore;
	private double avgScore;
	
	public Score() {}
	
	public Score(String name, int idNum, int korScore, int engScore, int mathScore, int totalScore, double avgScore) {
		super();
		this.name = name;
		IdNum = idNum;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.totalScore = totalScore;
		this.avgScore = avgScore;
	}

	public String getName() {
		return name;
	}

	public int getIdNum() {
		return IdNum;
	}

	public int getKorScore() {
		return korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public double getAvgScore() {
		return avgScore;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdNum(int idNum) {   //관리자의 경우에만 바꿀 수 있다   (관리자 모드와 일반 학생 모드)
		IdNum = idNum;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}
	
	
	
	
}
