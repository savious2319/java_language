package arrayEx;

public class Array01 {

	public static void main(String[] args) {
		//배열 선언
		int [] ar = {10,20,30};
		
		//10~30까지 출력
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		//배열 초기값 입력
		//int [] ar;
		ar = new int[] {10,20,30,40};
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.println(ar.hashCode()); // hash code 검색할때 쓰는 코드
		System.out.println(ar); // hash code 검색할때 쓰는 코드
		
		System.out.println(sum);
		
		char [] arCh = new char[] {'A','B','C'};
		for (int i = 0; i < arCh.length; i++) {
			System.out.print(arCh[i]);
		}
		System.out.println();
		
		
		

	}

}
