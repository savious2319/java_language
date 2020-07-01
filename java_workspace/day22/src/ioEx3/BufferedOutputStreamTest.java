package ioEx3;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("fileWrite2.txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5); //버퍼크기가 5가 된다!
			// 한번에 담을 수 있는 크기는 5개 데이터만 버퍼에 머물다가...
			// 5개가 다 차게 되면, 자동으로 파일로 전송된다!
			// '1' ~ '9' 하나씩 write()를 할건데...
			// '1' ~ '5' 까지 버퍼에 다 차게 되면, 파일로 보내지게 되고...(자동)
			// '6' ~ '9' 까지는 버퍼에 남게 된다!
			
			for (int i = '1'; i <= '9'; i++) {
				
				bos.write(i);
				// 1~5까지만 출력!! -> 6~9까지는 버퍼에 남아 있는 상황이다.
			}
			
			
			
			//모니터에 출력하지 말고 -> 파일에 출력해 보자!
			//System.out.println("버퍼크기만큼인 1~5까지가 출력됐어요");
			//System.out.println("나머지 6~9까지는 flush해서 출력할께요");
			
			String msg = "버퍼크기만큼인 1~5까지가 출력됐어요";
			bos.write(msg.getBytes());
			
			//String msg2 = "나머지 6~9까지는 flush해서 출력할께요";
			//bos.write(msg2.getBytes());
			
			//bos.flush();
			
			
			
			
			//bos.close();
			//fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
