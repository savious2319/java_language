package threadEx;

import java.awt.HeadlessException;
import java.rmi.server.SocketSecurityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	���μ��� ���ο� �۾�����
 	�ּ��� �ϳ��� ���μ���( �������α׷� ) �� �ϳ��� ������ �̻��� ���� �ִ�.
 	
 	Thread�� �̿��ؼ� ��ȭ�ϱ�! - ����ó��
 	
 		�ܼ�â�� ��ȭâ
 		
 		A : JOptionPane���� ��ȭ�� �Է�����
 		B : �ܼ�â(Scanner�� �̿��ؼ�) ��ȭ ����!
 		
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
					System.out.println("idA���� �����ϼ̽��ϴ�.");
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
					System.out.println("idB���� ���� �ϼ̽��ϴ�.");
					button--; 
					break;
				}
				idB = JOptionPane.showInputDialog("idB");
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				toDate = new Date();
				now = sdf.format(toDate);
				System.out.println("idB : "+idB+"       "+now);
				
				System.out.println("���� �����Ƿ��� y�Է�");
			}

		}
	}

}
public class ThreadTest4_1 {

	public static void main(String[] args) {
		
		
		new Time().new Host("��ȭ��").start();
		new Time().new Guest("��ȭ��").start();
		
		
		
		
	}
}
