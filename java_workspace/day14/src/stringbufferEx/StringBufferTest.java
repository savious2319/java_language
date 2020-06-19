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
		StringBuffer mutuableMsg = new StringBuffer(msg);
		
		mutuableMsg.insert(2, "12"); // index 2 앞에다가 "12"를 넣어라
		//System.out.println(tmp);
		System.out.println("msgF == "+mutuableMsg.toString());
		mutuableMsg.insert(2, "이태원");
		String immutableMsg = mutuableMsg.toString(); // buffer에 있는 문자열을 String 으로 고정시키겠다!
		
		System.out.println("immutableMsg == " +immutableMsg);
		
		
		StringBuffer mutableMsg2 =  new StringBuffer("Travis");
		
		mutableMsg2.replace(1, 3, "Brian");  // 1 <= "AB" < 3
		System.out.println("mutableMsg2 == " + mutableMsg2);
		
		mutableMsg2.replace(3, 6, "2020");
		System.out.println("mutableMsg2 == "+ mutableMsg2);
		
		
		
	}

}




















