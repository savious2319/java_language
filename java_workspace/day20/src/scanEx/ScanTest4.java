package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
  	Scanner�� File �Է�(�б�) ���

	Scanner���� useDelimiter("������, ���б�ȣ") == String Ŭ������ split(",")�� ����� ���
				- ������ ������ �����͸� �߶��ش�!
				
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
			System.out.println(line + " : " + "���� : "+sum +" / ��� : " + sum / (double)rowTotal);
			rowTotal = 0;
			cnt = 0;
			sum = 0;
		}
		System.out.println("���� : "+ total+"��");
		System.out.println("��� : "+ (double)total / cntTotal +"��");
	}
		
}














