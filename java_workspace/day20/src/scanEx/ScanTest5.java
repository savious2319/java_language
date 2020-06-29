package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
  	Scanner�� File �Է�(�б�) ���

	Scanner���� useDelimiter("������, ���б�ȣ") == String Ŭ������ split(",")�� ����� ���
				- ������ ������ �����͸� �߶��ش�!
	
	�ܺ� ���Ͽ� 5���� �ִ�!
	���پ� �о�� ������,
				��ȣ   �̸�      ����       ����       ����
		.add(	nextInt(), next(), nextInt(), nextInt(), nextInt()  )
		
			     1     ȫ�浿    90          89         88
				
 */

public class ScanTest5 {

	public static void main(String[] args) throws FileNotFoundException {
		//main���� file Scan�� ����!
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














