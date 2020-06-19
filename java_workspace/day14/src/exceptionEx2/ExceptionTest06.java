package exceptionEx2;

import java.io.IOException;

/*
 	throws 예외이름
 	
 	- 예외 사항을 메서드 만들 때 적용하자
 	- 호출하는 쪽에서는 예외 항목에 맞춰 try catch() 블럭을 사용해
 	  행당 메서드를 안전하게 사용할 수 있게 된다.
 	  
 	- 예외 발생에 대한 소스 기재가 필요할 때는 try-catch 블럭을 만들어서
 		catch() 에 필요한 소스를 기재하자!
 	- 예외 발생시 조치사항이 필요없을 때는 throws 를 통해서 예외사항을 보내자!
 */
class CharInput{
	int nInput = 0;
	public char getInput() throws IOException{
		
		nInput = System.in.read(); // Scanner 대신 System.in 객체를 이용해 값을 입력 받는다.
		
		return (char)nInput;
	}
}

public class ExceptionTest06 {

	public static void main(String[] args) {

		try {
			System.out.println(new CharInput().getInput());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
