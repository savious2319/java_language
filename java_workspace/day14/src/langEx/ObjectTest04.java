package langEx;

/*
 	Object Ŭ����
 	-equals()
 	-hashCode()
 	-toString()
 */
class Member {
	String name;
	long juminbunho; // ������ϱ�����!

	public Member(String name, long juminbunho) {
		super();
		this.name = name;
		this.juminbunho = juminbunho;
	}

	@Override
	public int hashCode() {
		
		return this.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj !=null && obj instanceof Member) {
			return this.name.equals((((Member)obj).name));
			//return this.juminbunho == ((Member)obj).juminbunho;
		} else {
			return false;
		}
	}

}

public class ObjectTest04 {

	public static void main(String[] args) {
		Member m1 = new Member("ȫ�浿", 9010101061234L);
		Member m2 = new Member("�̼���", 9010101061234L);

		// m1�� m2�� ���� ȸ�� �Դϱ�? �� ���� ȸ�� �Դϴ�. �ֿ�? �ֹι�ȣ�� ���ƿ�~
		//m2�� �̹� ������ �ֱ� ������ ������ �� �����~
		if (m1.equals(m2)) {
			System.out.println("���� ȸ�� : ������ �� �����");
		}else {
			System.out.println("ȸ�� ���� ���� : ������ �� �ֽ��ϴ�");
		
		}

	}

}















