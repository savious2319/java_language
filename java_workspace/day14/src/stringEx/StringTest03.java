package stringEx;

public class StringTest03 {

	public static void main(String[] args) {
		String msg = "Hello";
		int length = msg.length();
		//문자열 길이
		System.out.println("문자열 : "+length+"개");
		
		//문자열 비교 (대소문자 무시)
		System.out.println(msg.equalsIgnoreCase("AbCdEfG"));
		
		//문자열 연결
		String tmp = msg.concat("HI");
		System.out.println(tmp);
		tmp = msg + "HI";
		System.out.println(tmp);
		
		//문자열 포함여부 검사하기
		System.out.println(msg.contains("lr") ? "있다" : "없다");
		
		
		//문자열에서 끝나는 문자열 검사하기
		System.out.println(msg.endsWith("exe") ? "있다" : "없다");
		
		
		//특정 문자 or 문자열 위치 찾기
		int num = 0;
		
		num = msg.indexOf('l'); // int를 넣을때
		System.out.println(num);
		
		num = msg.indexOf("ab"); //String을 넣을때
		System.out.println(num);
		
		msg = "0123456789";
		num = msg.indexOf("45");
		System.out.println(num);
		//lastIndexOf(int)
		num = msg.lastIndexOf('3');
		System.out.println(num);
		//lastIndexOf(String)
		
		num = msg.lastIndexOf("2");
		System.out.println(num);
		
		msg = "Hello";
		
		//replace(char A, char B)
		String str = "";
		str = msg.replace("He", "She");
		System.out.println(str);
		
		
		str = msg.replace('H', 'S');
		System.out.println(str);
		
		//split()
		msg = "You, She";
		
		String[] partsOfStr = msg.split(", ");
		//System.out.println(partsOfStr[0]);
		//System.out.println(partsOfStr[1]);
		for (int i = 0; i < partsOfStr.length; i++) {
			//System.out.println(partsOfStr[i].toString());
			System.out.println(partsOfStr[i]);
		}
		
		
		//substring()
		msg = "hamburger";
		tmp = msg.substring(msg.indexOf('b')); // indexOf()를 사용하자!
		System.out.println(msg + "substring()결과" + tmp);
		
		tmp = msg.substring(msg.indexOf('h'), msg.indexOf('b'));
		System.out.println(tmp);
		
		msg = "sheismad";
		System.out.println(msg.substring(5));
		System.out.println(msg.substring(1,7));
		
		//trim()
		msg = "   Why am I so tired??    ";
		System.out.println(msg.trim());
		msg = "    Don't        know ";
		System.out.println(msg.trim());
	}

}



















