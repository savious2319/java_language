package threadEx;

import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	���μ��� ������ �۾�����
 	�ּ��� �ϳ��� ���μ���(�������α׷�)�� �ϳ� �̻��� �����带 ������ �ִ�.
 	
 	Thread�� �̿��ؼ� ��ȭ�ϱ� - ����ó��
 	
 	�ܼ�â�� ��ȭ��
 	A : jop
 	B: �ֿܼ��� �Է�
 	
 	
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

		System.out.print(getName()+" �Է� : ");
		Scanner sc = new Scanner(System.in);
		idA = sc.nextLine();	
		return idA;
	}
	
	void print(String input) {
		System.out.println("\n"+getName()+" : "+input);
	}
	
	void exit() {
		System.out.println(getName()+"���� ��ȭ�� �����߽��ϴ�..");
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
		
			idB = JOptionPane.showInputDialog(getName()+" �Է�");
		
			return idB;
	}
	
	void print(String input) {
		System.err.println("\n"+getName()+" : "+input);
	}

	void exit() {
		System.err.println(getName()+"���� ��ȭ�� �����߽��ϴ�..");
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
//		idB = JOptionPane.showInputDialog("idB ��ȭ");
//		
//		System.out.println("idA : "+idA);
//		System.err.println("idB : "+idB);
		
		System.out.println("��ȭ�� �����Ϸ��� Q(q)�� �Է��ϼ���.");
		
		System.out.println();
		System.out.print("��ȭ�� �Է� : ");
		String user1 = new Scanner(System.in).nextLine();
		String user2 = JOptionPane.showInputDialog("��ȭ���� �Է��ϼ���");
		
		System.out.println();
		System.out.println("��ȭ�� �����մϴ�");
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
