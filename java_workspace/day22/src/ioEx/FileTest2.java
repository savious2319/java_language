package ioEx;

import java.io.File;

/*
 	File 클래스
 		-생성자
 		-여러 메서드
 		
 */
public class FileTest2 {

	public static void main(String[] args) {
		//C:\Program Files\Java\jdk1.8.0_201
		
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_201");
		
		//file.list() : 이 메서드에 대해서 리턴타입 확인
		//활용할 수 있도록 소스파일을 완성해 보세요!
		
		String[] arStr = file.list();
		
//		for (int i = 0; i < arStr.length; i++) {
//			System.out.print(arStr[i] +"\t");
//			File f = new File(file, arStr[i]);
//			System.out.println(f.getAbsolutePath() + "\t");
//			System.out.println(f.isDirectory() ? "폴더\t" : "파일\t");
//			if(f.isFile()) {
//			System.out.println(f.length() + "byte");
//			}
//			
//		}
		
		//file.listFiles();
		
		File[] arFile = file.listFiles();
		
		for (File file2 : arFile) {
			System.out.print(file2.getAbsolutePath() + "\t");
			System.out.println(file2.isDirectory()? "폴더\t":"파일\t");
			if(file2.isFile()) {
				System.out.println(file2.length()+"byte");
			}
		}
		
//		for (int i = 0; i < arFile.length; i++) {
//			if(arFile[i].isDirectory()) {
//				System.out.println(arFile[i] + "는 디렉토리입니다");
//			}else if(arFile[i].isFile()) {
//				System.out.println(arFile[i] + "는 파일입니다");
//			}
//		}
		
	
		
		
		
	}

}












