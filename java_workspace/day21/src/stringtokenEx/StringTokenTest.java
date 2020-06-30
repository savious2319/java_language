package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer 와 split()
 	   클래스          메서드
 */
public class StringTokenTest {

	public static void main(String[] args) {
		String msg ="안녕하세요,반갑습니다,";
		String []sp = msg.split(",");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
		
		//문자열분리 클래스
		StringTokenizer st = new StringTokenizer(msg, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
