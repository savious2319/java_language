package threadEx;

import java.awt.HeadlessException;
import java.rmi.server.SocketSecurityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	프로세스 내부에 작업단위
 	최소한 하나의 프로세스( 응용프로그램 ) 는 하나의 쓰레드 이상을 갖고 있다.
 	
 	Thread를 이용해서 대화하기! - 병결처리
 	
 		콘솔창이 대화창
 		
 		A : JOptionPane에서 대화를 입력하자
 		B : 콘솔창(Scanner를 이용해서) 대화 하자!
 		
 */

class Time{

	Date toDate;
	String now;
	class Host extends Thread{



		public Host(String mal) {
			super(mal);
		}

		public void run() {

			String idA = "";
			Scanner scan = new Scanner(System.in);
			int button = 1;
			while(button != 0) {
				idA = scan.nextLine();
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				toDate = new Date();
				now = sdf.format(toDate);
				//now = sdf.format(toDate);
				//System.out.println("idA : ");
				System.out.println("idA : "+idA+"       "+now);
				
				if(idA.equalsIgnoreCase("y")) {
					button--;
					System.out.println("idA님이 퇴장하셨습니다.");
					break;
				}
			}
		}
	}
	class Guest extends Thread{
		public Guest(String mal) {
			super(mal);
		}
		public void run() {
			String idB = "";
			int button = 1;

			while(button != 0) {
				
				if(idB.equalsIgnoreCase("y")) {
					System.out.println("idB님이 퇴장 하셨습니다.");
					button--; 
					break;
				}
				idB = JOptionPane.showInputDialog("idB");
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				toDate = new Date();
				now = sdf.format(toDate);
				System.out.println("idB : "+idB+"       "+now);
				
				System.out.println("방을 나가실려면 y입력");
			}

		}
	}

}
public class ThreadTest4_1 {

	public static void main(String[] args) {
		
		
		new Time().new Host("대화명").start();
		new Time().new Guest("대화명").start();
		
		
		
		
	}
}
