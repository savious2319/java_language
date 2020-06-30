package threadEx;

import java.awt.Font;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 	GUI�� �ð��� ����� ����
 	
 	java.awt		javax.swing.
 	- Frame           JFrame			������ â ���� �� ���� Ŭ����
 	- Label			  JLabel			���̺� - �� : �ؽ�Ʈ �Է��� �� ����
 	- Font			  Font				���� ũ��, ��� ���� ���� �� �� ����.
 	
 */
class DigitalClock extends JFrame implements Runnable {

	private Thread th;
	private JLabel lbl;

	public DigitalClock() {
		super("������ �ð�"); // �θ� Ŭ���� JFrame
		lbl = new JLabel(); // ������ ǥ���� �� �ִ� Label ��ü ����
		lbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		lbl.setHorizontalAlignment(JLabel.CENTER);

		if (th == null) {
			th = new Thread(this); // DigitalClock�� start ��Ű�� �ʹ�
			th.start();
		}

		this.add(lbl);

		// ������ ��ġ (��ǥ), ũ��(���μ���)
		this.setBounds(200, 100, 350, 100);
		setVisible(true);  //�������� ���̰� ���� ���� ���ϴ� �޼���

		setDefaultCloseOperation(EXIT_ON_CLOSE); // JFrame�� ���� �� �����ϴ� �޼��� JFrame�� DigitalClock���ϱ� �����ص� �ȴ�
	}

	@Override
	public void run() {
		StringBuffer now = new StringBuffer();
		while (true) {
			Calendar cal = Calendar.getInstance();  // cal�� while���� �־�� �ð��� refresh�ȴ� 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date(cal.getTimeInMillis());

			now = new StringBuffer(sdf.format(date));

			lbl.setText(now.toString()); // .toString()�� ���� StringBuffer�� ����ȯ ��ų �� �ִ�
			// lbl.setText("2020-06-30 14:46:30");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();} // ���ٷ� ���������� ����
		}
	}

}

public class ThreadTest6_1 {

	public static void main(String[] args) {

		new DigitalClock(); // �������� ���� -> Label�� �ð��� �귯����!

//		while(true) {
//			Date date = new Date();
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			System.out.println(sdf.format(date));
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
