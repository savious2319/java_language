package arrayEx;

public class Array01 {

	public static void main(String[] args) {
		//�迭 ����
		int [] ar = {10,20,30};
		
		//10~30���� ���
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		//�迭 �ʱⰪ �Է�
		//int [] ar;
		ar = new int[] {10,20,30,40};
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.println(ar.hashCode()); // hash code �˻��Ҷ� ���� �ڵ�
		System.out.println(ar); // hash code �˻��Ҷ� ���� �ڵ�
		
		System.out.println(sum);
		
		char [] arCh = new char[] {'A','B','C'};
		for (int i = 0; i < arCh.length; i++) {
			System.out.print(arCh[i]);
		}
		System.out.println();
		
		
		

	}

}
