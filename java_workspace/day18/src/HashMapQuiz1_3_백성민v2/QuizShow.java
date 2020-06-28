package HashMapQuiz1_3_¹é¼º¹Îv2;

public class QuizShow implements Comparable<QuizShow> {
	private String id;
	private int score;
	private String time;
	
	public QuizShow() {}
	
	public QuizShow(String id, int score) {
		this.id = id;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public int getScore() {
		return score;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return id +  score + "Á¡" + time +"ÃÊ";
	}

	@Override
	public int compareTo(QuizShow o) {
		if(this.score > o.score) {
			return -1;
		}else if(this.score == o.score) {
			return 0;
		}
		return 1;
	}
	
	
	
	
	

}
