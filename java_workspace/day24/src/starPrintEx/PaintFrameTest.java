package starPrintEx;
/*
 	그래픽 관련 컴포넌트
 */

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class PaintFrame extends Frame{
	int speed = 1;
	Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5,0, 50);
	Label lblSpeed = new Label("Spped : 1");
	
	public PaintFrame(String title) {
		super(title);
		lblSpeed.setBackground(Color.YELLOW);
		lblSpeed.setBounds(10, 30, 65, 15);
		
		//scroll 바가 들어갈 위치와 크기 설정
		sb.setBounds(20, 250, 260, 20);
		
		add(sb);
		add(lblSpeed);
		
		//스크롤바에 이벤트 걸기
		sb.addAdjustmentListener(new MyHandler());
		addWindowListener(new MyHandler());
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		
	}
	
	//내부 클래스로,, 이벤트를 다루는 핸들러를 하나 만들어 놓자
	class MyHandler extends WindowAdapter implements AdjustmentListener{ //절약해서 쓰자!
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		//스크롤바의 값이 쪼끔이라도 변경되면 무조건 호출되는 메서드이다!!!
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sb.getValue(); //현재 값이 얼마니?
			lblSpeed.setText("Speed : "+speed);
			
			
		}
		
	}
	
	
	
}
public class PaintFrameTest {

	public static void main(String[] args) {

		PaintFrame p = new PaintFrame("스크롤바를 이용한 데이터 변경");
		
		Graphics g = p.getGraphics();	//p는 프레임을 갖고 있다. 그 프레임에서 그래픽 담당 메서드를 명시적으로 호출 
		
		g.setColor(Color.RED);
		
		for(int i = 0; true; i+= p.speed) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//이전 좌표로 이동해서 값을 없애야 한다!!!
			g.clearRect(0,0, 300, 300); //프레임의 내용을 refresh해야 이동하는 것 처럼 보이게 된다.
			
			//g로 그림을 그린다.
			g.drawString("Hello", i, 150);
			
			//i 값이 범위 끝에 다다르면... 다시 0으로 시작된다.
			i = (i<300) ? i : 0;
		}
		
	}

}















