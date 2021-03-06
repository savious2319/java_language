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
 	java 메모장
 			java_day01.txt
 	
 	D:\GB_0900_05_BSM(다른 폴더나 파일 넣지말아주세요)\java_language\java_memo
 	
 	1. 해당 폴더에 파일들을 쭉 보여준다.
 	2. 읽어올 파일명을 입력한다.
 	3. 파일의 내용을 콘솔에 출력하자!
 	4. 저장할 때는 파일명끝에 cpy 등을 붙이자!
 			java_day01cpy.txt 저장시키자!
 					  (1)
 					  (2)
 					  (3)
 			
 */
public class BufferedOutputStreamTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		String path = "D:\\GB_0900_05_BSM(다른 폴더나 파일 넣지말아주세요)\\java_language\\java_memo";
		File f = new File(path);

		File[] files = f.listFiles();
		for (File memo : files) {
			String fullPath = memo.getAbsolutePath();
			int pos = fullPath.lastIndexOf("\\");
			String fileName = fullPath.substring(pos + 1);
			System.out.println(fileName);
		}

		String file = "";
		System.out.print("읽어올 파일명을 입력하세요 : ");
		file = sc.next();
		File filePath = new File(f, file);
		
		//System.out.println(filePath);
		int pos = file.lastIndexOf(".");   //java
		String fName = file.substring(0, pos);
		System.out.println(fName);
		String ext = file.substring(pos);
		System.out.println(ext); // .txt
		System.out.println();
		
		try {

			// fis = new FileInputStream("D:\\GB_0900_05_BSM(다른 폴더나 파일넣지말아주세요)\\java_language\\java_memo\\" + file);
			// fis = new FileInputStream(path + "\\" + file);
			fis = new FileInputStream(filePath);
			bis = new BufferedInputStream(fis);
			byte[] b = new byte[bis.available()];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);

			sc.nextLine();
			System.out.println("새로 입력할 내용: ");
			String msg = sc.nextLine();
			
			
			int cnt = 0;
			String choice = "";
			String newFile = fName + "cpy" + ext;
			//File cpyFile = null;
			//File cpyFile = new File(f, newFile);
			File cpyFile = new File(f + "\\" + newFile);
			
			
				System.out.println("파일을 저장하시겠습니까? [y/n]");
				choice = sc.next();
				if (choice.equalsIgnoreCase("y")) {
					
						if (!cpyFile.exists()) {
							FileOutputStream fos = new FileOutputStream(cpyFile);
							BufferedOutputStream bos = new BufferedOutputStream(fos);
							bos.write(msg.getBytes());
//					bos.flush();
//					
					bos.close();
					fos.close();
							System.out.println(cpyFile.getName() + "저장완료");
						} 					
				}
				else if(choice.equalsIgnoreCase("n")) {}
			
			
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

		System.out.println("프로그램 종료");

	}

}
