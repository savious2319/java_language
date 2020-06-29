package scanEx;
//컨트롤러
import java.util.ArrayList;

public class ScoreControl{
	ArrayList<Student> stdList = new ArrayList<>();
	//추가
	void add(int bun, String stdName, int kScore, int eScore, int mScore) {
		//Student 타입으로 객체를 생성한 후,
		//stdList에 add() 시키면 된다!
		Student tmp = new Student(bun, stdName, kScore, eScore, mScore);
		stdList.add(tmp);
	}
	//목보기
	void outputScoreList() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		//stdList에 있는 데이터를 출력해 주자!
		int kTotal = 0;
		int eTotal = 0;
		int mTotal = 0;
		for (int i = 0; i < stdList.size(); i++) {
			kTotal += stdList.get(i).kor;
			eTotal += stdList.get(i).eng;
			mTotal += stdList.get(i).math;
			System.out.println(stdList.get(i));
		}
		
		System.out.println();
		System.out.println("국어 총점 : " +kTotal+" / 평균 : " +kTotal/(double)5);
		System.out.println("영어 총점 : " +eTotal+" / 평균 : " +eTotal/(double)5);
		System.out.println("수학 총점 : " +mTotal+" / 평균 : " +mTotal/(double)5);
		
		//이때, 과목별 총점과 평균도 출력하자
		//국어 총점 : 000점 / 평균 : 00점
		//영어 총점 : 000점 / 평균 : 00점
		//수학 총점 : 000점 / 평균 : 00점
		
	}
	
	
	
}