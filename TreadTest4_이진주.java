package threadEx;

import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	프로세스 내부의 작업단위
 	최소한 하나의 프로세스(응용프로그램)는 하나 이상의 스레드를 가지고 있다.
 	
 	Thread를 이용해서 대화하기 - 병렬처리
 	
 	콘솔창이 대화장
 	A : jop
 	B: 콘솔에서 입력
 	
 	
 */

class Host extends Thread{
	public Host(String name) {
		super(name);
	}
	
	
	public void run() {
		//System.out.println(getName());
		while (true) {
			String conver = put();
			Date day = new Date();		
			SimpleDateFormat time = new SimpleDateFormat("aa hh:mm:ss");
		
			if (conver.equalsIgnoreCase("q")) {
				exit();
				break;
			} else {
				print(conver+" "+time.format(day));
				conver = "";
			} 
		}
	}
	
	String put() {
		String idA = "";

		System.out.print(getName()+" 입력 : ");
		Scanner sc = new Scanner(System.in);
		idA = sc.nextLine();	
		return idA;
	}
	
	void print(String input) {
		System.out.println("\n"+getName()+" : "+input);
	}
	
	void exit() {
		System.out.println(getName()+"님이 대화를 종료했습니다..");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class Guest extends Thread{
	public Guest(String name) {
		super(name);
	}
	
	public void run() {
		//System.err.println(getName());
		//print(put());
		
		while (true) {
			String conver = put();
			Date day = new Date();		
			SimpleDateFormat time = new SimpleDateFormat("aa hh:mm:ss");
			
			
			if (conver.equalsIgnoreCase("q")) {
				exit();
				break;
			}
			else {
				print(conver+" "+time.format(day));
				conver = "";
			}
		}
	}
	
	String put() {
		String idB = "";
		
			idB = JOptionPane.showInputDialog(getName()+" 입력");
		
			return idB;
	}
	
	void print(String input) {
		System.err.println("\n"+getName()+" : "+input);
	}

	void exit() {
		System.err.println(getName()+"님이 대화를 종료했습니다..");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class TreadTest4 {

	public static void main(String[] args) {
//		
//		String idA = "";
//		String idB = "";
//		
//		Scanner sc = new Scanner(System.in);
//		idA = sc.nextLine();
//		
//		idB = JOptionPane.showInputDialog("idB 대화");
//		
//		System.out.println("idA : "+idA);
//		System.err.println("idB : "+idB);
		
		System.out.println("대화를 종료하려면 Q(q)를 입력하세요.");
		
		System.out.println();
		System.out.print("대화명 입력 : ");
		String user1 = new Scanner(System.in).nextLine();
		String user2 = JOptionPane.showInputDialog("대화명을 입력하세요");
		
		System.out.println();
		System.out.println("대화를 시작합니다");
		try {
			
			Host host = new Host(user1);
			Guest guest = new Guest(user2);
			
			host.start();
			guest.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		new Host("host").start();
//		new Guest("guest").start();
		
		
		
	}

}
