package ioEx;

import java.io.File;
import java.io.IOException;

/*
 	File Ŭ����
 		-������
 		-���� �޼���
 		
 */
public class FileTest3 {

	public static void main(String[] args) {
		String path = "D:\\GB_0900_05_BSM(�ٸ� ������ ���� ���������ּ���)\\java_language\\java_memo\\java_day22_1.txt";

		File file = new File(path);
		
		try {
			
			//creatNewFile()�� ������ �����ϴ� �޼���
			//������ ������ ������ ������ �������� �ʴ´�!
			//IOException�� �ɾ���� ��밡��!
			System.out.println(file.createNewFile()?"��������" :"�������� �ʾ���");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//path���� ������ ��ü�ϰ� ������ü�ϰ� �и��ϰ� �ʹ�!
		//java_22_1.txt �� �� ���� �������� ���� �������
		
		System.out.println(file.getName());
		String fullPath = file.getAbsolutePath();
		System.out.println(fullPath);
		int pos = fullPath.lastIndexOf("\\");
		String parentPath = fullPath.substring(0, pos);
		System.out.println(parentPath);
		String fileName = fullPath.substring(pos+1);
		System.out.println(fileName);
		
		//���� ���ڿ� �������� ���ο� File �ý����� ���� �� �ִ�
		//new File(parentPath, fileName);
		
//		String javaFile = path.substring(path.indexOf("o")+2);
//		System.out.println(javaFile);
		
		
		//���ϸ��� Ȯ�����ϰ� ���ϸ��ϰ� �и��� ����
		pos = fileName.lastIndexOf(".");   //"data.txt.txt"
		String fName = fileName.substring(0, pos);
		System.out.println(fName);
		String ext = fileName.substring(pos+1);
		System.out.println(ext);
		
		//�ü������ ���͸�/����   �� ������ �� ���� ���ڵ��� �ٸ���!
		//�׷��� �ش� �ü���� ���б�ȣ�� �����ش�!
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		System.out.println(file.delete());  //java_day22_1
		System.out.println(file.getAbsolutePath());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}














