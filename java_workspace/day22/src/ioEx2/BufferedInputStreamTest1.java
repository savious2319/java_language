package ioEx2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	FileInputStream : 물리적인 저장소에서 직접 read()를 진행한다!
 	
 	Buffer : 논리적인 메모리 - 임시 저장소
 			 물리적인 저장소에서 읽어올 데이터를 Buffer라는 임시 저장소에 두고,
 			 메모리에서 데이터를 읽어오게 시킨다.  (버스정류장이 Buffer라고 생각하면 된다)
 			 
 		HDD -> 논리적인장치(버퍼) -> RAM(논리적인장치) 전송되니까 더 빠르다!
 		
 	방법
 	
 		FileInputStream fis = 객체생성;
 		BufferedInputStream bis = new BufferedInputStream(fis);
 		
 		bis.read();
 */
public class BufferedInputStreamTest1 {

	public static void main(String[] args) {

		FileInputStream fis = null;  // try {} 밖에서 (초기화)선언해야지 finally{}안에 bis와 fis가 인식을 할 수 있
		BufferedInputStream bis = null;  // fis와 bis가 try{} 안에 있으면 그 안에서만 효력이 있다
		//byte[] b = new byte[100]; // 100칸을 선언하면 뒤에 공백이 있다! 그래서 밑에서 String(b).trim()을 해주자!

		try {
			fis = new FileInputStream("fileRead3.txt");
			bis = new BufferedInputStream(fis);
			byte[] b = new byte[bis.available()];
			bis.read(b);
			System.out.println(new String(b).trim());
			System.out.println("!!!!!!!!!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		System.out.println("프로그램 종료");

	}

}
