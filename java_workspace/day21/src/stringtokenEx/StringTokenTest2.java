package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer 와 split()
 	   클래스          메서드
 */
public class StringTokenTest2 {

	public static void main(String[] args) {
		String msg ="안녕 하세요,반갑 습니다,";
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
		
		//문자열분리 클래스
		StringTokenizer st = new StringTokenizer(msg, " ,");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		msg = "x+y=t*2/1";
		//연산기호는 모두 없애고, 연산항만 갖고 오자
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
















