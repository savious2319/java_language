package starPrintEx;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grimpan extends JFrame implements MouseMotionListener {

//	@Override
//	public void paint(Graphics g) {
//	}
	int x = 0;
	int y = 0;
	DrawPanel dr; //내부 클래스 객체
	
	
	class DrawPanel extends JPanel{
	
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.BLUE);
			g.drawString("#", x, y);
			
			//프레임의 크기만큼 해당 영역을 clear하게 된다!
			g.clearRect(0, 0, 300, 300);  
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		this.x = e.getX()-10;  // -10, -20, 화살표 꼭지점에서 그릴 수 있도록 좌표값 조정
		y = e.getY()-22;
		dr.repaint(); //그림을 유지하고 계속 그릴 수 있게 하자! 그림을 반영한다!
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public Grimpan(String title) {
		super(title);
		setBackground(Color.WHITE);
		add(dr = new DrawPanel());  // 내부 페널 붙이기!
		addMouseMotionListener(this); //Grimpan
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Grimpan("그림판");

	}

}










