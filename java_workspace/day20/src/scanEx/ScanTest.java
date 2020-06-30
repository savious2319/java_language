package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
  	Scanner�� File �Է�(�б�) ���
  	
 	- Scanner Ŭ������ �̿��� Ű����κ��� �� �Է¹޾ƿ���
 	- Scanner Ŭ������ �̿��� Ư�� ���(path)�� ���� �� �Է¹޾ƿ���
 		Ư����� - C:\\data\\data.txt
 		�� ��θ� ������ ��η� �б� ����
 		File �̶�� �ڹ� Ŭ������ �ʿ��ϴ�!
 		
 	- Scanner�� 1.5 ���� ���ĺ��� ����� �Դ�.
 	1.5 ���� �������� BufferReader ���� �̿��߾���!
 	
 	- ������, �ֱٿ��� Reader/Writer Ŭ������ ���� �ִ� io ��Ű�� Ŭ������ ���� ����Ѵ�!
 */
public class ScanTest {

	public static void main(String[] args) {
		//D:\GB_0900_05_BSM(�ٸ� ������ ���� ���������ּ���)\java_language\java_resource\data.txt
		String path = "D:\\GB_0900_05_BSM(�ٸ� ������ ���� ���������ּ���)\\java_language\\java_resource\\data.txt";
					  //���͸� : ����̺� + ���� + ����
				
		File file = new File(path);		
		int sum = 0;
		try {
			Scanner sc = new Scanner(file);
			
			//Integer.parseInt(sc.next());  
			/*sc.nextInt(); // nextInt() �޼���� "100"�� ���� 100���� ���Ͻ�Ų��
			sc.nextInt();
			sc.nextInt();
			sc.nextInt();
			sc.nextInt();
			sc.hasNextInt();*/
			
			while(sc.hasNextInt()) {
				int tmp = sc.nextInt();
				sum += tmp;
				System.out.println(tmp +"��");
			}
			System.out.println("���� : "+sum);
			System.out.println("��� : "+(double)sum / 5);
			
			
			
		} catch (FileNotFoundException e) {
			//System.out.println("�ش� ��ġ�� ������ ����� : "+e.getMessage());
			System.err.println("�ش� ��ġ�� ������ ����� : "+e.getMessage());
		}
		
	}

}




























