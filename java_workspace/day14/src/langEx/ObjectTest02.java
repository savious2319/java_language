package langEx;

/*
 	Object Ŭ����
 	-equals()
 	-hashCode()
 	-toString()
 */
class TypeC{
	
}

public class ObjectTest02 {

	public static void main(String[] args) {
		
		System.out.println(new TypeC());
		
		TypeC obj = new TypeC();
		System.out.println(obj);
	
		System.out.println(obj.hashCode());
		System.out.println(String.format("%x", obj.hashCode()));  //obj.hashCode()�� 16������ ���
		
		String tmp = String.format("%x", obj.hashCode()); //hashCode ���� tmp�� ����
		System.out.println(tmp);
		
		System.out.println(obj.getClass().getName() +"@" + String.format("%x", obj.hashCode())); //Ŭ���� + Ŭ���� �̸� + �ؽ��ڵ�
		System.out.println(obj.getClass().getName() +"@" + tmp);
		
		//////////////////////////////////////////////////////////
		TypeC obj2 = new TypeC();
		TypeC obj3 = new TypeC();
		
		if(obj2 == obj3) { // �ؽ��ڵ尪 ��!!!
			System.out.println(obj2.hashCode() + "vs" + obj3.hashCode() + ">>>>���� ��ü");
		}else {
			System.out.println(obj2.hashCode() + " vs " + obj3.hashCode() + ">>>>�ٸ� ��ü");
		}
		
		obj3 = obj2; // obj2�� ��ü ����(�ؽ��ڵ�)�� obj3�� ���Խ�Ű��,, ���� ��ü
				     // �̶�, ������ obj3�� ���� �ִ� �ν��Ͻ��� ������ ������� �ȴ�
		
		if(obj2 == obj3) {
			System.out.println(obj2.hashCode() + " vs " + obj3.hashCode() + ">>>>���� ��ü");
		}else {
			System.out.println(obj2.hashCode() + " vs " + obj3.hashCode() + ">>>>�ٸ� ��ü");
		}
		
		
		
		
	}

}



























