package stringbufferEx;
/*
 	String immutable : 수정불가
 				String 은 문자열자체에 데이터를 수정할 수 없는 상수값이다!
 				
 	StringBufffer mutable : 수정가능한(변경가능)
 				기존 문자열을 heap에 가져다 놓고 쓴다!
 				
 	StringBuffer : 문자열 안에다..
 		insert()
 		replace()
 */
public class StringBufferTest {

	public static void main(String[] args) {

		String msg = "abc";
		
		
		//StringBuffer msgF = "abc"; //????? String은 문자열 가공할 때 새로운 문자열을 만들지만\
										// StringBuffer는 자기 자신을 새로 가공하기때문에 메모리에 낭비가 없다
										// String하고 비슷하지만, 생성자로 인스턴스를 만들어야 쓸수 있음
		StringBuffer msgF = new StringBuffer(msg);
		
		StringBuffer tmp = msgF.insert(2, "12"); // index 2 앞에다가 "12"를 넣어라
		System.out.println(tmp);
		
		String tmp2 = msgF.insert(2, "12").toString(); // buffer에 있는 문자열을 String 으로 고정시키겠다!
		System.out.println(tmp2);
		
		System.out.println(tmp);
		
		tmp =  new StringBuffer("0123456");
		
		tmp = tmp.replace(1, 3, "AB");  // 1 <= "AB" < 3
		System.out.println(tmp);
		
		tmp = tmp.replace(1, 5, "AB");
		System.out.println(tmp);
		
		
		
	}

}




















