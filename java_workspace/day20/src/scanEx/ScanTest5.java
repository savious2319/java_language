package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
  	Scanner의 File 입력(읽기) 기능

	Scanner에서 useDelimiter("구분자, 구분기호") == String 클래스의 split(",")과 비슷한 기능
				- 구분자 단위로 데이터를 잘라준다!
	
	외부 파일에 5줄이 있다!
	한줄씩 읽어올 때마다,
				번호   이름      국어       영어       수학
		.add(	nextInt(), next(), nextInt(), nextInt(), nextInt()  )
		
			     1     홍길동    90          89         88
				
 */

public class ScanTest5 {

	public static void main(String[] args) throws FileNotFoundException {
		//main에서 file Scan을 하자!
		ScoreControl scontrol = new ScoreControl();
		
		Scanner sc = new Scanner(new File("data5.txt"));
		
		
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner scLine = new Scanner(line).useDelimiter(",");
			scontrol.add(scLine.nextInt(), scLine.next(), scLine.nextInt(), scLine.nextInt(), scLine.nextInt());
			
			
			
		}
		
		scontrol.outputScoreList();
		
		
		
		
		
		
	}
		
}














