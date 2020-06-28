package HashMapQuiz1_3_백성민v1;

public class QuizShow {
	private String id;
	private int score;
	private long minute;
	private long second;

	public QuizShow() {
	}

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

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	public void setMinute(long minute) {
		this.minute = minute;
	}

	public void setSecond(long second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return id + "    " + score + "점    " + minute + "분    " + second + "초";
	}

}
