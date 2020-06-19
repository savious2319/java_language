package langEx;

/*
 	Object Ŭ����
 	-equals()
 	-hashCode()
 	-toString()
 */
class Value{
	int value;
	
	Value(int val){
		this.value = val;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//return this.value �ϰ� obj�� value�ϰ� ����? �ٸ���;
		if(obj instanceof Value) { //obj�� �ν��Ͻ��� Value Ÿ���϶���....
			return this.value == ((Value)obj).value; // <--- ����ȯ�� �����ϴ�!
		}else {
			return false;  // Value Ÿ���� �ƴϸ� ����
		}
		
			
	}
}

public class ObjectTest03 {

	public static void main(String[] args) {
		
		Value objA = new Value(10);
		Value objB = new Value(10);
		
		if(objA == objB) {
			System.out.println("��ü�� �ν��Ͻ� �ؽ��� ����");
			
		}else {
			System.out.println("�ؽ� �ڵ尡 �ٸ���!");
		}
		
		
		if(objA.equals(objB)) { // ��ü ���Ҷ��� equals()�� �������!
			System.out.println("���� ���Դϴ�");
		}else {
			System.out.println("�ؽ� �ڵ尡 �ٸ���!");
		}
		
		
		
		
		
		
		
		
	}

	
}



























