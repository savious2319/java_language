package ioEx;

import java.io.File;

/*
 	File Ŭ����
 		-������
 		-���� �޼���
 		
 */
public class FileTest2 {

	public static void main(String[] args) {
		//C:\Program Files\Java\jdk1.8.0_201
		
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_201");
		
		//file.list() : �� �޼��忡 ���ؼ� ����Ÿ�� Ȯ��
		//Ȱ���� �� �ֵ��� �ҽ������� �ϼ��� ������!
		
		String[] arStr = file.list();
		
//		for (int i = 0; i < arStr.length; i++) {
//			System.out.print(arStr[i] +"\t");
//			File f = new File(file, arStr[i]);
//			System.out.println(f.getAbsolutePath() + "\t");
//			System.out.println(f.isDirectory() ? "����\t" : "����\t");
//			if(f.isFile()) {
//			System.out.println(f.length() + "byte");
//			}
//			
//		}
		
		//file.listFiles();
		
		File[] arFile = file.listFiles();
		
		for (File file2 : arFile) {
			System.out.print(file2.getAbsolutePath() + "\t");
			System.out.println(file2.isDirectory()? "����\t":"����\t");
			if(file2.isFile()) {
				System.out.println(file2.length()+"byte");
			}
		}
		
//		for (int i = 0; i < arFile.length; i++) {
//			if(arFile[i].isDirectory()) {
//				System.out.println(arFile[i] + "�� ���丮�Դϴ�");
//			}else if(arFile[i].isFile()) {
//				System.out.println(arFile[i] + "�� �����Դϴ�");
//			}
//		}
		
	
		
		
		
	}

}












