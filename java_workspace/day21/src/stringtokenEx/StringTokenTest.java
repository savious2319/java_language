package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer �� split()
 	   Ŭ����          �޼���
 */
public class StringTokenTest {

	public static void main(String[] args) {
		String msg ="�ȳ��ϼ���,�ݰ����ϴ�,";
		String []sp = msg.split(",");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
		
		//���ڿ��и� Ŭ����
		StringTokenizer st = new StringTokenizer(msg, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
