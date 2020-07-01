package ioEx;

import java.io.File;
import java.io.IOException;

/*
 	File 클래스
 		-생성자
 		-여러 메서드
 		
 */
public class FileTest3 {

	public static void main(String[] args) {
		String path = "D:\\GB_0900_05_BSM(다른 폴더나 파일 넣지말아주세요)\\java_language\\java_memo\\java_day22_1.txt";

		File file = new File(path);
		
		try {
			
			//creatNewFile()는 파일을 생성하는 메서드
			//기존에 동일한 파일이 있으면 생성하지 않는다!
			//IOException을 걸어줘야 사용가능!
			System.out.println(file.createNewFile()?"생성했음" :"생성하지 않았음");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//path에서 마지막 개체하고 상위개체하고 분리하고 싶다!
		//java_22_1.txt 와 그 상위 폴더들을 따로 출력하자
		
		System.out.println(file.getName());
		String fullPath = file.getAbsolutePath();
		System.out.println(fullPath);
		int pos = fullPath.lastIndexOf("\\");
		String parentPath = fullPath.substring(0, pos);
		System.out.println(parentPath);
		String fileName = fullPath.substring(pos+1);
		System.out.println(fileName);
		
		//기존 문자열 조합으로 새로운 File 시스템을 만들 수 있다
		//new File(parentPath, fileName);
		
//		String javaFile = path.substring(path.indexOf("o")+2);
//		System.out.println(javaFile);
		
		
		//파일명에서 확장자하고 파일명하고 분리해 보자
		pos = fileName.lastIndexOf(".");   //"data.txt.txt"
		String fName = fileName.substring(0, pos);
		System.out.println(fName);
		String ext = fileName.substring(pos+1);
		System.out.println(ext);
		
		//운영체제마다 디렉터리/파일   을 구분할 때 쓰는 문자들이 다르다!
		//그래서 해당 운영체제의 구분기호를 보여준다!
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		System.out.println(file.delete());  //java_day22_1
		System.out.println(file.getAbsolutePath());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}














