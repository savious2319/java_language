package ioEx3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 	 output :
 	 메모리(RAM) 에 있는 내용을 외부 저장소(HDD)에 "쓰기 write()" 한다.
 	 
 	 기본적으로 모니터에 출력할 수 있는 스트림은 2개가 있다. System.out / System.err
 	 		"파일"에 출력해 보자!
 	 	
 	 	write(대상코드)		write(int)		int값을 byte로 변환해서 대상체(파일)에 쓰게 된다
 	 	write(byte[])
 	 	flush()			출력을 할 때, 버퍼가 꽉 차게 되면.. 한꺼번에 쓰게 된다
 	 				    그런데, 이 flush()를 만나게 되면, 버퍼가 다 차지 않아도,
 	 				    바로 대상 파일에 데이터를 보낼 수 있게 된다!
 	 	close()
 	 	
 	 	FileOutputStream
 */
public class OutputStreamTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		
		try {
			//해당 위치에 파일이 없을 때는 파일을 생성한다!
			//fos = new FileOutputStream("fileWriter.txt");
			
			//두번째 매개변수 append : 기존에 파일이 있으면 계속 이어쓰기 하겠다!
			fos = new FileOutputStream("fileWriter.txt", true);
			
			String msg = "";
			while(true) {
				if (msg.equals("exit")) {break;}
				System.out.println("입력 : ");
				msg = sc.nextLine();
				fos.write(msg.getBytes());
				fos.flush();
			}
//			String msg = "Hello, 즐거운 하루!!";
//			fos.write(msg.getBytes()); // getBytes() : String을 byte[]로 리턴해주는 메서드
//			msg = "잘지내세요?";
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {fos.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}

}
