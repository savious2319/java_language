package threadEx;
/*
 	Thread�� �̿��ؼ� ��ȭ�ϱ�! - ����ó��
 	
 	�ܼ�â�� ��ȭâ
 	
 	A : JOptionPane���� ��ȭ�� �Է�����
 	B : �ܼ�â���� (Scanner�� �̿��ؼ�) ��ȭ ����!
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Host extends Thread {
	public Host(String name) {
		super(name);
	}

	public void run() {
		Date hostTime = new Date();
		System.err.println(getName() + "���� �����ϼ̽��ϴ�");
		String msg = "";
		JOptionPane jopt = new JOptionPane();
		while (!msg.equalsIgnoreCase("q")) {
			SimpleDateFormat sdf = new SimpleDateFormat("aa hh:mm:ss");
			String str = sdf.format(hostTime);
			msg = JOptionPane.showInputDialog(getName() + "�� ��ȭ" + str);
			if (msg.equalsIgnoreCase("q"))
				break;

			else
				System.err.println(getName() + "�� : " + msg +" " +str);
		}
		System.err.println(getName() + "���� ��ȭâ�� �������ϴ�");
	}

}

class Guest extends Thread {
	public Guest(String name) {
		super(name);
	}

	public void run() {
		Date guestTime = new Date();
		System.out.println(getName() + "���� �����ϼ̽��ϴ�");
		String msg = "";
		while (true) {
			SimpleDateFormat sdf = new SimpleDateFormat("aa hh:mm:ss");
			String str = sdf.format(guestTime);
			Scanner sc = new Scanner(System.in);
			msg = sc.nextLine();
			// if (!msg.equals("q") || !msg.equals("Q") ) { // || (OR ���ǽ�) �ϳ��� ���̸� if����
			// �����Ѵ�
			if (msg.equalsIgnoreCase("q"))
				break;
			else
				System.out.println(getName() + "�� : " + msg +" "+ str);
		}
		System.out.println(getName() + "���� ��ȭâ�� �������ϴ�");
	}
}

public class ThreadTest4 {

	public static void main(String[] args) {
//		String idA = "";
//		String idB = "";
//		
		Scanner sc = new Scanner(System.in);
//		idA = sc.nextLine();
//		
//		idB = JOptionPane.showInputDialog("idB�� ��ȭ");
//		
//		System.out.println("idA : " +idA);
//		System.err.println("idB : " +idB); //sys + ctrl + space => err
		
		
		
		System.out.print("Host ID �Է� : ");
		String hostName = sc.nextLine();

		System.out.print("Guest ID �Է� : ");
		String guestName = sc.nextLine();

		// thread�� ����ó�������� Host�� Guest�� ���ÿ� ������ �����ϴ�
		new Host(hostName).start();
		new Guest(guestName).start();
	}

}
