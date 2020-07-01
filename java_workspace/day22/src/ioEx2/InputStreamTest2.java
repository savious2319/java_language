package ioEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	바이트 스트림 : 1byte 단위로 입출력을 할 수 있는 스트림
 			-동영상, 이미지, 음악, 일반 txt 파일 등
 	Char 스트림 : 문자에 특화되어 있는 스트림
 			-문자읽을 때 사용!
 	
 	스트림 : InputStream, OutputStream
 				read         write
 	  ram으로 읽어오다     HDD에 쓰다!
 	  		read()           write()
 	  		read(byte [])		     
 	  		available() : 리턴타입 -> int   읽을 수 있는 실제 byte수를 반환한다.
 	  		close() : 스트림을 열었으면 닫아야 한다!
 	  		
 	  		System.in <---- byte input stream의 대표적인 예
 	  		
 	  		FileInputStream 해당 디렉토리에 있는 모든 파일을 읽을 수 있도록 하는 클래스
 	  						파일 읽을 때, File클래스로 경로를 설정하자!
 	  						해당 파일이 없을 땐... 예외발생(FileNotFoundException)
 */
public class InputStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			// 읽어올 파일 내용 중에, 한글이 섞여 있다
			fis = new FileInputStream("fileRead2.txt");
			/*
			 비영어권 글자가 섞여 있을 때는 2byte 체제로 되어 있어, (char) 단위로 읽을 때, 글자가 깨지게 된다.
			 따라서, read를 할 때, byte[] 을 미리 만들어놓고 이후 그 byte[]을 문자열로 "생성"해서 읽으면 깨지지
			 않고 처리할 수 있게 된다!!
			//System.out.println((char)fis.read());
			int tmp = 0;  // fis.read()에서 가져오는 데이터를 담아 둘 임시 변수
			while((tmp = fis.read()) != -1) {  // 먼저 데이터를 저장하고 나서 -1인지 비교한다
				System.out.print((char)tmp);
				
			}
			*/
			
			//read해온 데이터를 담을 byte[] 을 생성하자
			//근데... 몇개 만들어야 하지?
			byte [] _read = new byte[fis.available()];
			fis.read(_read);	// _read 배열에 byte를 읽어온 byte를 담게 된다!
			
			//이 byte[]를 String 생성자한테 주면, 문자열로 생성해 준다!
			
			String str_read = new String(_read);
			System.out.println(str_read);
			

		} catch (FileNotFoundException e) { // 파일의 위치가 없더라도 예외처리를 넘기자!  (다음에는 Exception으로 모든 예외를 처리하면 된다!!)
			e.printStackTrace();
			
		} catch (IOException e) { //더이상 읽을 데이터가 없을 때, 에러를 방지하자!
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) fis.close();
			} 
			catch (IOException e) {e.printStackTrace();}
		}
		
		System.out.println("\n프로그램 종료!!!");

	}

}

















