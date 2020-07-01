package ioEx3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 	
 			javaTest.txt
 	
 	C:\Users\Administrator\Desktop\�� ����
 	
 	1. �ش� ������ ���ϵ��� �� �����ش�.
 	2. �о�� ���ϸ��� �Է��Ѵ�.
 	3. ������ ������ �ֿܼ� �������!
 	4. ������ ���� ���ϸ��� cpy ���� ������!
 			java_day01cpy.txt �����Ű��!
 					  (1)
 					  (2)
 					  (3)
 			
 */
public class BufferedOutputStreamTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		String path = "C:\\Users\\Administrator\\Desktop\\�� ����\\";
		File f = new File(path);
		//System.out.println(f.getAbsolutePath());
		
		File[] files = f.listFiles();
		for (File memo : files) {
			String fullPath = memo.getAbsolutePath();
			int pos = fullPath.lastIndexOf("\\");
			String fileName = fullPath.substring(pos + 1);
			System.out.println(fileName);
		}

		String file = "";
		System.out.print("�о�� ���ϸ��� �Է��ϼ��� : ");
		file = sc.next();
		File filePath = new File(f, file);
		
		System.out.println(filePath);
		int pos = file.lastIndexOf(".");
		String fName = file.substring(0, pos);
		System.out.println(fName);
		String ext = file.substring(pos);
		System.out.println(ext); // .txt
		System.out.println();
		try {

			// fis = new FileInputStream("D:\\GB_0900_05_BSM(�ٸ� ������ ���ϳ��������ּ���)\\java_language\\java_memo\\" + file);
			// fis = new FileInputStream(path + "\\" + file);
			fis = new FileInputStream(filePath); //FileInputStream�� filePath�� ������ �����´�!
			bis = new BufferedInputStream(fis); // ������ BufferedInputStream�� ��Ƶд�!
			byte[] b = new byte[bis.available()];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);

			
			sc.nextLine();
			System.out.println("���� �Է��� ����: ");
			String msg = sc.nextLine();
			
			int cnt = 0;
			String choice = "";
			String newFile = fName + "cpy" + ext;
			//File cpyFile = null;
			//File cpyFile = new File(f, newFile);
			File cpyFile = new File(f + "\\" + newFile);
			
			while (true) {
				System.out.println("������ �����Ͻðڽ��ϱ�? [y/n]");
				choice = sc.next();
				if (choice.equalsIgnoreCase("n"))
					break;
				if (choice.equalsIgnoreCase("y")) {
					while (true) {
						if (!cpyFile.exists()) {
							FileOutputStream fos = new FileOutputStream(cpyFile); //javaTestcpy.txt (x) C:\\Users\\Administrator\\Desktop\\�� ����\\javaTestcpy.txt
							BufferedOutputStream bos = new BufferedOutputStream(fos); // fos�� ������ ��� ������ �ִ�
							bos.write(msg.getBytes()); // fos�� ���ڳ������ HDD�� ����
//					bos.flush();
					
					bos.close(); //close()�� �����Ҷ�  flush()�� ȣ���Ѵ�
					fos.close();
							System.out.println(cpyFile.getName() + "����Ϸ�");
							break;
						} else {
							++cnt;
							newFile = fName + "cpy(" + cnt + ")" + ext;
							cpyFile = new File(f + "\\" + newFile);
						}
					} // end of while
				} //end of if 
			} // end of while
			
//					if(filePath.exists()) {
//						String newFile2 = fName + "cpy" + ext;
//						FileOutputStream fos = new FileOutputStream(newFile2);
//						//BufferedOutputStream bos = new BufferedOutputStream(fos);
//						fos.write(b);
//					}

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

		System.out.println("���α׷� ����");

	}

}
