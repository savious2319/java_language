package threadEx;
/*
 	Thread를 이용해서 대화하기! - 병렬처리
 	
 	콘솔창이 대화창
 	
 	A : JOptionPane에서 대화를 입력하자
 	B : 콘솔창에서 (Scanner를 이용해서) 대화 하자!
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
		System.err.println(getName() + "님이 입장하셨습니다");
		String msg = "";
		JOptionPane jopt = new JOptionPane();
		while (!msg.equalsIgnoreCase("q")) {
			SimpleDateFormat sdf = new SimpleDateFormat("aa hh:mm:ss");
			String str = sdf.format(hostTime);
			msg = JOptionPane.showInputDialog(getName() + "님 대화" + str);
			if (msg.equalsIgnoreCase("q"))
				break;

			else
				System.err.println(getName() + "님 : " + msg +" " +str);
		}
		System.err.println(getName() + "님이 대화창을 나갔습니다");
	}

}

class Guest extends Thread {
	public Guest(String name) {
		super(name);
	}

	public void run() {
		Date guestTime = new Date();
		System.out.println(getName() + "님이 입장하셨습니다");
		String msg = "";
		while (true) {
			SimpleDateFormat sdf = new SimpleDateFormat("aa hh:mm:ss");
			String str = sdf.format(guestTime);
			Scanner sc = new Scanner(System.in);
			msg = sc.nextLine();
			// if (!msg.equals("q") || !msg.equals("Q") ) { // || (OR 조건식) 하나라도 참이면 if문을
			// 실행한다
			if (msg.equalsIgnoreCase("q"))
				break;
			else
				System.out.println(getName() + "님 : " + msg +" "+ str);
		}
		System.out.println(getName() + "님이 대화창을 나갔습니다");
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
//		idB = JOptionPane.showInputDialog("idB님 대화");
//		
//		System.out.println("idA : " +idA);
//		System.err.println("idB : " +idB); //sys + ctrl + space => err
		
		
		
		System.out.print("Host ID 입력 : ");
		String hostName = sc.nextLine();

		System.out.print("Guest ID 입력 : ");
		String guestName = sc.nextLine();

		// thread는 병렬처리때문에 Host와 Guest가 동시에 실행이 가능하다
		new Host(hostName).start();
		new Guest(guestName).start();
	}

}
