package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer �� split()
 	   Ŭ����          �޼���
 */
public class StringTokenTest2 {

	public static void main(String[] args) {
		String msg ="�ȳ� �ϼ���,�ݰ� ���ϴ�,";
		String []sp = msg.split(",");
//		String[]sp1 = sp[0].split(" ");
//		String[]sp2 = sp[1].split(" ");
		for (int i = 0; i < sp.length; i++) {
			//System.out.println(sp[i]);
			String []sp2 = sp[i].split(" ");
			for (int j = 0; j < sp2.length; j++) {
				System.out.println(sp2[j]);
			}
			
		}
		
		System.out.println();
		
		//���ڿ��и� Ŭ����
		StringTokenizer st = new StringTokenizer(msg, " ,");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		msg = "x+y=t*2/1";
		//�����ȣ�� ��� ���ְ�, �����׸� ���� ����
		st = new StringTokenizer(msg, "+=*/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("///////////////////////////////////////////////////////////////////");
		st = new StringTokenizer(msg, "+=*/", true);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
	}

}
















