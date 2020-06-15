package extendsEx;
/*
 	���
 	
 	private  ����� super ������!
 	
 	1. �ڽ� Ÿ������ �ʱⰪ�� �ִ� �����ڸ� �������.
 	2. �ڽ� ������(�Ű����� 4��¥��)������ �ʱⰪ 4���� �ν��Ͻ� ������ �ʱ�ȭ �� �־�� �Ѵ�.
 	3. �̶�, �ռ� 3�� ���ڴ� �θ�����ڿ��� �ٽ� �����ؾ� �Ѵ�. : �̶�, super() �� �������!
 	4. �׸��� �ڽ��� ���� �ִ� �������Ը� �ʱ�ȭ�� �����ϸ� �ȴ�.
 	5. printScore�� �θ� ���� �ִ� �޼����ε�, �θ�� �ڽ��� art�� ���� �ִ��� �𸥴�!
 	   ��ؾ�, �̸�, ����, ����, �̼� ���� ����� �� ������ ����غ���!
 */

class Score{
	private String name;
	private int kor;
	private int eng;
	
	public Score(String name, int kor, int eng) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	
	public String getName() {
		return name;
	}



	public int getKor() {
		return kor;
	}



	public int getEng() {
		return eng;
	}



	void printScore() {
		System.out.println("�̸�: " + name+ "\n���� ����: "+kor+"\n���� ����: "+eng); //art�� ������ ����. �ڽ� ���̱� ������
	}
		
}
class SchoolArt extends Score{ // SchoolArts Ŭ������ �θ� Ŭ������ Score�� ��ӹ޴´�
	private int art;

	public SchoolArt(String name, int kor, int eng, int art) { //���� �θ� Ŭ�������� 3���� �����ؾ��Ѵ�. �׸��� ������ art���� �Ѿ�´�
															   //�޼��� ��Ÿ���� ���� ������ �� �޼���� �´�
		super(name, kor, eng); 
		this.art = art;
	}

//	void printScore() {
//		System.out.println("�̸�: " + name+ "\n���� ����: "+kor+"\n���� ����: "+eng+"\n�̼� ����: "+art);
//	}
	
	//�������̵�
	//1. �θ� �޼����� ���� (���ȿ� �ִ� ����{}) �� ���� �ȵ� ��,
	//2. �ڽ�Ŭ���������� �θ��� �޼��� ����ο� �Ȱ��� �ۼ��� ��, 
	//3. �޼��� ���ο� ���� ���� �ҽ��� �ٽ� �ۼ��ϸ� �ȴ�!
	//		�̰� �������̵� = �ٽ� �ۼ� = ������ ��� �Ѵ�!!
	//4. ��ӿ����� �ߵ��ȴ�! override(�����ϴ�, �Ⱒ�ϴ�)
	// 		- �θ� �޼���� �ڽ��� �Ȱ��� �ۼ��ϴ� �ٶ���, ȣ�⿡�� ���� ���ϰ� �ȴ�!
	
	@Override
		void printScore() { // <--- �̰� ���� �ڽ� ��!!
			// (this.)printScore(); // this�� ������ �Ǿ��ִ�
			super.printScore(); // �θ��� printScore�� ȣ���϶�!
			System.out.println("�̼� ����: "+art);
			
		}
	
	
//	void printSchoolArt() {
//		System.out.println("�̸�: " + getName()+ "\n���� ����: "+getKor()+"\n���� ����: "+getEng()+"\n�̼� ����: "+art);
//	}
	
}
public class ExtendsTest02 { //������ �θ���� �ǰ� garbage collector�� �ڽĺ��� �޸� ������ �Ѵ�

	public static void main(String[] args) {
		
//		SchoolArt hgd = new SchoolArt("ȫ�浿",100, 100, 100);
		
		Score hgd = new SchoolArt("ȫ�浿",100, 100, 100);
		
		//�ڹٴ� ���������� ������������
		//�ν��Ͻ��� ���� � �ν��Ͻ��� �޼��带 ȣ������ �����Ѵ�
		//�ν��Ͻ� Ÿ�Կ� ���� �����ϴ� ���� �������� (dynamic binding) �̶�� �Ѵ�.
		//�ν��Ͻ��� �����ϰ� �ִ� �޼��带 �����Ѵ�
		
//		hgd.printSchoolArt();
		
		hgd.printScore(); // printScore()�� ȣ���ϸ� SchoolArtŬ������ ���� �θ� �� �ϳ�, �ڽ� �� �ϳ��� �ִ�!
						  // �̶�, ������ �ڽ� printScore()�� ȣ��ȴ�!
		
	}

}





















