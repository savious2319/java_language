package methodex;

class A{
	
	//�ν��Ͻ�
	
	//�޼���
		
}
//�޼��带 ������ �� ����!


public class MethodTest01 {
	
	// �ʵ�(�ν��Ͻ� ����) ����
	int kor, eng, math;
	
	// �޼��� ����
	// 1)�޼��� �з�
	//    �Ϲ� �޼��� (�����Ͻ� �޼���)
	//    getter/setter
	//    ������
	//    �߻�޼���
	
	// 2) �����Ͻ� �޼���
//	void prinScore(int mK, int mE, int mM) {
//		
//		System.out.println("���� ���� : " + this.mK + "��");
//		System.out.println("���� ���� : " + this.mE + "��");
//		System.out.println("���� ���� : " + this.mM + "��");
//		
//	}
	void printScore() {
		//this ��� ������ �޼��� ���ο� �����ϰ� �ִ�!!!
		//�� this�� ��ü�� �����ϴ� ���������̴�!
		//���� ������ ������, �޼��� ���ο� �����ϰ� �ֱ� ������
		//������ ��������� ����� �� �ִ�.
			
		//�� this�� �����ϰ� �ֱ� ������ �����Ѵ�!
		// this�� ��ü�� ����Ѵ�! �׷��� ��ü�� ����� �� �ִ� 
		// �ν��Ͻ� ������ ����ȴ�!
		System.out.println("���� ���� : " + this.kor + "��");  //this -> hgd �Ǵ� �ٸ� ��ü�� ��ü�Ѵ�
		System.out.println("���� ���� : " + this.eng + "��");  //     -> ��ü�� �ٸ������� this�� �� ��ü�� ����Ѵ�
		System.out.println("���� ���� : " + math + "��"); //this�� �����ص� �ȴ�
		System.out.println(this);
	}
	
	void printScoreAr(int [] arScore) {
		
		System.out.println("��ȫ�浿 ������ ������");
		String[]sub = {"����", "����", "����"};
		for (int i = 0; i < arScore.length; i++) {
			System.out.println(sub[i] + "���� : " + arScore[i] + "��");
		}
		
	}
	
	public static void main(String[] args) {
	
	//ȫ�浿�� ���� = 10, �� = 20, �� = 30
	//printScore(������) ���	
	MethodTest01 hgd = new MethodTest01();
	
	hgd.kor = 10;
	hgd.eng = 20;
	hgd.math = 30;
	//hgd.printScore(hgd.kor, hgd.eng, hgd.math); kor�� ���ڷ� �ָ� kor�� static ������ �ƴϹǷ� ��� ���Ѵ� 
												 // ���ڸ� ���� �ʿ䰡 ����! this�� �˾Ƽ� �������ֱ� �����̴�!
	System.out.println("��ȫ�浿 ������ ������");
	hgd.printScore(); //kor�� ���ڷ� �ָ� kor�� static ������ �ƴϹǷ� ��� ���Ѵ�
	
	MethodTest01 iss = new MethodTest01();
	iss.kor = 11;
	iss.eng = 21;
	iss.math = 31;
	System.out.println("���̼��� ������ ������");
	iss.printScore();
	
    System.out.println();
	//int [] arScore = {ȫ�浿 ����}
	//printScoreAr(arScore) �������!
	
	int[] arScore = {hgd.kor, hgd.eng, hgd.math};  //{10,20,30};
	hgd.printScoreAr(arScore); //arScore�� ���������̴�. �׷��� �׳� argument�� ������ �ȴ�
		
		
		
		
		
		
		
		

	}

}
