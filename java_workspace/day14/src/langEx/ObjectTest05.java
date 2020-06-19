package langEx;

/*
 	Object Ŭ����
 	-equals()
 	-hashCode()
 	-toString()
 */
class Score{
	String name;
	int kor;
	int eng;
	int math;
	@Override
//	public int hashCode() {
//		final int prime = 31; //�Ҽ�
//		int result = 1;
//		result = 0; // ���� ������ ������ ����
//		result = prime * result + kor;
//		result = prime * result + math;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	/*
	 	new �� ������, ��ü�� �ؽ��� ��� �ٸ���!
	 	�׷��� ������ �ٸ����� ���� �񱳰� �Ұ������� "���-HashSet �÷��ǿ���."�� �߻��Ѵ�!
	 	hashCode() �� �Ȱ��� ����, (���ϰ��� 0���� �Ѵٴ���)
	 	���� ����� �� ��, equals() �޼��忡�� Ư�� ��(�ν��Ͻ�)�� ���ؼ�
	 	�ٸ��� ������ ���θ� ������ �� �ֵ��� ����
	 	�׷��� hashCode()�� equals()�� ���ÿ� �������̵� �ϴ� ��찡 ����!
	 */
	public int hashCode() {
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class ObjectTest05 {

	public static void main(String[] args) {
		
		
		
		
		
	}

}















