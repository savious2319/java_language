package HashMapQuiz1_3_¹é¼º¹Î;

public class QuizShow {
	private String id;
	private int score;
	
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

	@Override
	public String toString() {
		return "QuizShow [id=" + id + ", score=" + score + "]";
	}
	
	
	
	
	

}
