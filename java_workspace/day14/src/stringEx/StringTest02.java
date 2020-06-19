package stringEx;
/*
 	문자열
 	
 	문자열 관리하는 메서드들!!!
 	length() - int
 	charAt(정수==인덱스) - char
 	equals(Object)
 	equalsIgnoreCase(문자열)	str.equalsIgnoreCase("Abc"); abc 대소문자 상관없이 str과 같은지 비교해 주세요.
 	
 	
 	concat(문자열) -> String(리턴타입) 	str.concat("bcd"); str과 "bcd"를 붙여서 새로운 문자열을 리턴한다!
 				 str +"bcd"
 	contains(CharSequence) -> boolean(리턴타입) 	str.contains("bcd");	str에 "bcd"가 포함되어있니?
 	CharSequence는 String 클래스의 상위클래스 (문자열 쓰면된다)  
 		String s = "abcdef";
 		s.contains("cd");	-> true
 		
 	endsWith(문자열) -> boolean(리턴타입)	str.endsWith("txt"); 	str문자열이 txt로 끝나니?
 	
 	indexOf(int)	-> int 	String msg = "Hello";
 							int index = msg.indexOf('o'); -> msg라는 문자열에 o라는 문자는 몇번째 위치에 있니?
 																4번 인덱스에 있어요~
 																없으면 : -1을 리턴한다!
 																
    indexOf(String)		msg.indexOf("el");		리턴값 1을 준다!
    
    lastIndexOf(int) 	-> int		뒤에서부터 (오른쪽 -> 왼쪽) 찾고자 하는 내용의 번호를    								
    lastIndexOf(String) -> int     	검색해서 위치를 알려준다
    
    replace(char A, char B)  -> String 		A:  기존 문자 		B:  새로 바꿀 문자!
        									String tmp = msg.replace('H', 'C');
        									tmp : Cello
        									
    replace("ll", "LL")		msg => Hello		HeLLoLLo
    
    ★★★★★★★★★★★★★★★★★★★★★
    
    문자열.split(문자열 분리자=regex) -> String[]
    	문자열("dog, cat, cow").split(",")	,콤마로 구분하자!
    	"dog"
    	"cat"
    	"cow"
    
    subString(int begin)	
            			
     문자열.substring(5);	5부터 시작해서 나머지 문자열을 반환해줘!
     
      0123456
     "abcdefg".substring(5);				fg를 리턴해 준다
     
     substring(0, 5);						첫번째 : 포함 0"부터"
     										두번째(end값) : exclusive 미만! 4까지만!!!
     										
                0 <= 문자열 인덱스 < 5 잘라서 가져와라! 
                
     trim()		:    문자열에서 좌우 공백이 있을 경우, 공백을 없애고 실제 문자열만 가져와라!
     
     String id = "     dog  ";
     String tmp = id.trim();		tmp에는 "dog"만 온다!
     id = "   do  g " ;
     id.trim();    <---- "do  g"  이렇게 갖고 온다!
     
                                											
 */
public class StringTest02 {

	public static void main(String[] args) {
		
		
		
	}

}



















