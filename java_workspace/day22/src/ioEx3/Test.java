package ioEx3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		String path = "C:\\Users\\Administrator\\Desktop\\새 폴더\\";
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
		System.out.print("읽어올 파일명을 입력하세요 : ");
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

			// fis = new FileInputStream("D:\\GB_0900_05_BSM(다른 폴더나 파일넣지말아주세요)\\java_language\\java_memo\\" + file);
			// fis = new FileInputStream(path + "\\" + file);
			fis = new FileInputStream(filePath); //FileInputStream은 filePath의 파일을 가져온다!
			bis = new BufferedInputStream(fis); // 파일을 BufferedInputStream에 담아둔다!
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
			
			while (true) {
				System.out.println("파일을 저장하시겠습니까? [y/n]");
				choice = sc.next();
				if (choice.equalsIgnoreCase("n"))
					break;
				if (choice.equalsIgnoreCase("y")) {
					while (true) {
						if (!cpyFile.exists()) {
							FileOutputStream fos = new FileOutputStream(cpyFile); //javaTestcpy.txt (x) C:\\Users\\Administrator\\Desktop\\새 폴더\\javaTestcpy.txt
							BufferedOutputStream bos = new BufferedOutputStream(fos, 200); // fos의 파일을 잠시 가지고 있다
							bos.write(msg.getBytes()); 
							bos.flush();
							System.out.println("다시 입력 : ");
							msg = sc.next();
							
							bos.write(msg.getBytes());
							bos.write(msg.getBytes()); 
					bos.close(); //close()를 실행할때  flush()도 호출한다
					fos.close();
							System.out.println(cpyFile.getName() + "저장완료");
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

		System.out.println("프로그램 종료");

	
	}
}
