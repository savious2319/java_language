package scanEx;
//��Ʈ�ѷ�
import java.util.ArrayList;

public class ScoreControl{
	ArrayList<Student> stdList = new ArrayList<>();
	//�߰�
	void add(int bun, String stdName, int kScore, int eScore, int mScore) {
		//Student Ÿ������ ��ü�� ������ ��,
		//stdList�� add() ��Ű�� �ȴ�!
		Student tmp = new Student(bun, stdName, kScore, eScore, mScore);
		stdList.add(tmp);
	}
	//�񺸱�
	void outputScoreList() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		//stdList�� �ִ� �����͸� ����� ����!
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
		System.out.println("���� ���� : " +kTotal+" / ��� : " +kTotal/(double)5);
		System.out.println("���� ���� : " +eTotal+" / ��� : " +eTotal/(double)5);
		System.out.println("���� ���� : " +mTotal+" / ��� : " +mTotal/(double)5);
		
		//�̶�, ���� ������ ��յ� �������
		//���� ���� : 000�� / ��� : 00��
		//���� ���� : 000�� / ��� : 00��
		//���� ���� : 000�� / ��� : 00��
		
	}
	
	
	
}