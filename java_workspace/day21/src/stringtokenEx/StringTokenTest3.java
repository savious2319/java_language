package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer 와 split()
 	   클래스          메서드
 */
public class StringTokenTest3 {
	StringTokenizer st;
	//1. 인수 1개생성자
	public StringTokenTest3(String str){
		System.out.println("str :" + str);
		st = new StringTokenizer(str); //구분자가 없다... 그럼 공백으로 구분짓는다!
	}
	//2. 인수 2개 생성자
	public StringTokenTest3(String str, String delimeter){
		System.out.println("str :" + str);
		st = new StringTokenizer(str, delimeter); //구분자가 없다... 그럼 공백으로 구분짓는다!
	}
	
	
	//3. print() : 구분단어 갯수, 분리된 단어들!!!
	void print() {
		System.out.println("구분 단어 개수 : "+ st.countTokens());
		while(st.hasMoreTokens()) {
			String tmp = st.nextToken();
			
			System.out.println(tmp);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		String msg = "사랑하는 나의 어머니";  //구분자 공백 -> StringTokenizer의 기본 구분자는 공백!
		
		StringTokenTest3 st1 = new StringTokenTest3(msg);
		st1.print();
		
		String date = "2020/06/30";			  //구분자가 / 를 이용해야 한다.
		
		StringTokenTest3 st2 = new StringTokenTest3(date, "/");
		st2.print();
		
		
		
		
	}

}


































