package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
  	Scanner의 File 입력(읽기) 기능
  	
 	- Scanner 클래스를 이용해 키보드로부터 값 입력받아오기
 	- Scanner 클래스를 이용해 특정 경로(path)로 부터 값 입력받아오기
 		특정경로 - C:\\data\\data.txt
 		이 경로를 파일의 경로로 읽기 위해
 		File 이라는 자바 클래스가 필요하다!
 		
 	- Scanner는 1.5 버전 이후부터 사용해 왔다.
 	1.5 버전 이전에는 BufferReader 등을 이용했었다!
 	
 	- 하지만, 최근에도 Reader/Writer 클래스를 갖고 있는 io 패키지 클래스를 자주 사용한다!
 */
public class ScanTest3 {

	public static void main(String[] args) {
		//D:\GB_0900_05_BSM(다른 폴더나 파일 넣지말아주세요)\java_language\java_worksapce\day20\data2.txt
		
		//            "절대 경로 : 루트 디렉토리부터 명시적으로 작성하는 것"
		String path = "D:\\GB_0900_05_BSM(다른 폴더나 파일 넣지말아주세요)\\java_language\\java_worksapce\\day20\\src\\data3.txt";
					  //디렉터리 : 드라이브 + 폴더 + 파일
		
		// 상대경로 : "최종 목적 파일의 위치를 기준으로 경로를 명시하는 것"
		path = "src\\data3.txt";
		
		File file = new File(path);		
		int sum = 0;
		try {
			Scanner sc = new Scanner(file);
			
			//Integer.parseInt(sc.next());  
			/*sc.nextInt(); // nextInt() 메서드는 "100"을 정수 100으로 리턴시킨다
			sc.nextInt();
			sc.nextInt();
			sc.nextInt();
			sc.nextInt();
			sc.hasNextInt();*/
			int cnt = 0;
			while(sc.hasNextInt()) {
				int tmp = sc.nextInt();
				sum += tmp;
				System.out.println(tmp +"점");
				cnt++;
			}
			System.out.println("총합 : "+sum);
			System.out.println("평균 : "+(double)sum / cnt);
			//System.out.printf("평균 : %.2f", (double)sum / 5);
			
			
			
		} catch (FileNotFoundException e) {
			//System.out.println("해당 위치에 파일이 없어요 : "+e.getMessage());
			System.err.println("해당 위치에 파일이 없어요 : "+e.getMessage());
		}
		
	}

}





























