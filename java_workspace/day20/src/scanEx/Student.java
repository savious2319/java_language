package scanEx;
//¸ðµ¨
public class Student {
	int bun;
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(int bun, String name, int kor, int eng, int math) {
		super();
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}
	
	String getAvg() {
		return String.format("%.1f", getTotal() / (double)3);
	}

	@Override
	public String toString() {
		return bun +"\t"+ name +"\t"+ kor +"\t"+ eng +"\t"+ math +"\t"+ getTotal() +"\t"+ getAvg();
	}
}
