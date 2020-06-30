package threadEx;

import java.awt.Font;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 	GUI에 시간을 출력해 보자
 	
 	java.awt		javax.swing.
 	- Frame           JFrame			윈도우 창 만들 때 쓰는 클래스
 	- Label			  JLabel			레이블 - 라벨 : 텍스트 입력할 때 쓴다
 	- Font			  Font				글자 크기, 모양 등을 설정 할 때 쓴다.
 	
 */
class DigitalClock extends JFrame implements Runnable {

	private Thread th;
	private JLabel lbl;

	public DigitalClock() {
		super("디지털 시계"); // 부모 클래스 JFrame
		lbl = new JLabel(); // 문장을 표시할 수 있는 Label 객체 생성
		lbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		lbl.setHorizontalAlignment(JLabel.CENTER);

		if (th == null) {
			th = new Thread(this); // DigitalClock을 start 시키고 싶다
			th.start();
		}

		this.add(lbl);

		// 프레임 위치 (좌표), 크기(가로세로)
		this.setBounds(200, 100, 350, 100);
		setVisible(true);  //프레임이 보이게 할지 말지 정하는 메서드

		setDefaultCloseOperation(EXIT_ON_CLOSE); // JFrame의 닫을 때 설정하는 메서드 JFrame은 DigitalClock꺼니까 생략해도 된다
	}

	@Override
	public void run() {
		StringBuffer now = new StringBuffer();
		while (true) {
			Calendar cal = Calendar.getInstance();  // cal이 while문에 있어야 시간이 refresh된다 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date(cal.getTimeInMillis());

			now = new StringBuffer(sdf.format(date));

			lbl.setText(now.toString()); // .toString()을 쓰면 StringBuffer로 형변환 시킬 수 있다
			// lbl.setText("2020-06-30 14:46:30");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();} // 한줄로 관용적으로 쓰자
		}
	}

}

public class ThreadTest6_1 {

	public static void main(String[] args) {

		new DigitalClock(); // 프레임이 등장 -> Label에 시간이 흘러간다!

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
