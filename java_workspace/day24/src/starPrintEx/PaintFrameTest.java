package starPrintEx;
/*
 	�׷��� ���� ������Ʈ
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
		
		//scroll �ٰ� �� ��ġ�� ũ�� ����
		sb.setBounds(20, 250, 260, 20);
		
		add(sb);
		add(lblSpeed);
		
		//��ũ�ѹٿ� �̺�Ʈ �ɱ�
		sb.addAdjustmentListener(new MyHandler());
		addWindowListener(new MyHandler());
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		
	}
	
	//���� Ŭ������,, �̺�Ʈ�� �ٷ�� �ڵ鷯�� �ϳ� ����� ����
	class MyHandler extends WindowAdapter implements AdjustmentListener{ //�����ؼ� ����!
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		//��ũ�ѹ��� ���� �ɲ��̶� ����Ǹ� ������ ȣ��Ǵ� �޼����̴�!!!
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sb.getValue(); //���� ���� �󸶴�?
			lblSpeed.setText("Speed : "+speed);
			
			
		}
		
	}
	
	
	
}
public class PaintFrameTest {

	public static void main(String[] args) {

		PaintFrame p = new PaintFrame("��ũ�ѹٸ� �̿��� ������ ����");
		
		Graphics g = p.getGraphics();	//p�� �������� ���� �ִ�. �� �����ӿ��� �׷��� ��� �޼��带 ��������� ȣ�� 
		
		g.setColor(Color.RED);
		
		for(int i = 0; true; i+= p.speed) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//���� ��ǥ�� �̵��ؼ� ���� ���־� �Ѵ�!!!
			g.clearRect(0,0, 300, 300); //�������� ������ refresh�ؾ� �̵��ϴ� �� ó�� ���̰� �ȴ�.
			
			//g�� �׸��� �׸���.
			g.drawString("Hello", i, 150);
			
			//i ���� ���� ���� �ٴٸ���... �ٽ� 0���� ���۵ȴ�.
			i = (i<300) ? i : 0;
		}
		
	}

}















