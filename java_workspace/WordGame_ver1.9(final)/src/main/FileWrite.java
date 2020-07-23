package main;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class FileWrite {
	
	void setNum() {
		
		try {
			File f = new File("text.txt");
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);

			byte[] _read = new byte[bis.available()];
			bis.read(_read);
			String strRead = new String(_read);
			String[] arRead = strRead.split("\n");
			for (int i = 0; i < arRead.length; i++) {
				String [] arrRead = arRead[i].split(" ");
				if(arrRead[0].equals(Login.nickname)) {
					
					String str = arRead[i].substring(arRead[i].indexOf("hunmin_play"), arRead[i].indexOf("/"));
					String str2 = arRead[i].substring(arRead[i].indexOf("hunmin_win:"), arRead[i].indexOf("hunmin_play"));
					 
					String intStr = str.replaceAll("[^\\d]", "");	
					String intStr2 = str2.replaceAll("[^\\d]", "");
	
					Member.hunmin_play = Integer.parseInt(intStr);
					Member.hunmin_win = Integer.parseInt(intStr2);
					Member.hangman_record = arRead[i].substring(arRead[i].indexOf("/")+1);
					break;
				}else {
				}
			}
			bis.close();
			fis.close();

		} catch (Exception e) {e.printStackTrace();	}
		
		
	}
	
	
	
	public void playWrite() {
		
		
		
		try {
			File f = new File("text.txt");
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);

			byte[] _read = new byte[bis.available()];
			bis.read(_read);
			String strRead = new String(_read);
			String[] arRead = strRead.split("\n");
			FileWriter fw = new FileWriter(f);
			for (int i = 0; i < arRead.length; i++) {
				String [] arrRead = arRead[i].split(" ");
				if(arrRead[0].equals(Login.nickname)) {
					
					String str = arRead[i].substring(arRead[i].indexOf("hunmin_win")); 
					String tmp = arRead[i].replace(str, "hunmin_win:"+Member.hunmin_win+"hunmin_play:"+Member.hunmin_play+"/"+Member.hangman_record);
					fw.write(tmp+"\n");
				}else {
					fw.write(arRead[i]+"\n");
				}
			}

			fw.close();
			bis.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
