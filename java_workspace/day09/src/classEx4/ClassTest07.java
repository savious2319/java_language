package classEx4;
/*
 	this() : this ������
 */

//������ 0~100���� ���� �� �ִ�.
//� ����� �Ѱ��� �Ⱥ� �� �ְ�,
//� ����� �Ѱ��� ������ �ִ� ��Ȳ�̴�!  <== �ʱⰪ�� ���?
//(��, �̸��� �ݵ�� �����Ѵ�)
//������ ������ �̸���, �̸�+����, �̸�+����+����, �̸�+����+����+����
//�̶�, �� ���񺰷� 0~100�� ���� ��� �ؾ��Ѵ�!
//�����ڴ� this()�� �̿��ؼ� ��Ȱ���� �� �ֵ��� ����!
public class ClassTest07 {
	String name;
	int kor;
	int eng;
	int math;
	
	public ClassTest07(String name, int kor, int eng, int math) {
		
		this.name = name;
		
		if(kor >= 0 && kor <= 100) {
			this.kor = kor;
		}else {
			this.kor = -1;
		}
		if(eng >= 0 && eng <= 100) {
			this.eng = eng;
		}else {
			this.eng = -1;
		}
		if(math >= 0 && math <= 100) {
			this.math = math;
		}else {
			this.math = -1;
		}
	}

	public ClassTest07(String name, int kor, int eng) {
		this(name, kor, eng, -1);
		
	}

	public ClassTest07(String name, int kor) {
		this(name, kor, -1, -1);
	}
	public ClassTest07(String name) {
		
		this(name, -1, -1, -1);
	}

	//��¿븸 ����� (gets/set ����)
	
	void printScore() {
		
		System.out.println(name + "\t" + kor + "��\t" + eng + "��\t" + math + "��");
	}




	public static void main(String[] args) {
		//��ü 3�� ���� ��
		//�� ��ü�� �ʱⰪ�� ��� �ٸ���!
		//�׸��� ����� ������!
		
		ClassTest07 hgd = new ClassTest07("ȫ�浿");
		ClassTest07 pms = new ClassTest07("�ڹ���", 70, 120);
		ClassTest07 lss = new ClassTest07("�̼���", 40, 30, 20);
		
		System.out.println("�̸�\t����\t����\t����");
		hgd.printScore();
		pms.printScore();
		lss.printScore();
		
	}

}
