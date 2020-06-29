package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
  	Scanner의 File 입력(읽기) 기능

	Scanner에서 useDelimiter("구분자, 구분기호") == String 클래스의 split(",")과 비슷한 기능
				- 구분자 단위로 데이터를 잘라준다!
				
 */
public class ScanTest4 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("data4.txt"));
		int cnt = 0;
		int cntTotal = 0;
		int total = 0;
		int rowTotal = 0;
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			// System.out.println(line);

			Scanner scLine = new Scanner(line).useDelimiter(",");

			// System.out.println(scLine.nextInt() + scLine.nextInt());
			int sum = 0;

			while (scLine.hasNextInt()) {
				sum += scLine.nextInt();
				cnt++;
			}
			rowTotal += cnt;
			cntTotal += rowTotal;
			total += sum;
			System.out.println(line + " : " + "총점 : "+sum +" / 평균 : " + sum / (double)rowTotal);
			rowTotal = 0;
			cnt = 0;
			sum = 0;
		}
		System.out.println("총점 : "+ total+"점");
		System.out.println("평균 : "+ (double)total / cntTotal +"점");
	}
		
}














