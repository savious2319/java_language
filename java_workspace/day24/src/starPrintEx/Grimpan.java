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
	DrawPanel dr; //���� Ŭ���� ��ü
	
	
	class DrawPanel extends JPanel{
	
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.BLUE);
			g.drawString("#", x, y);
			
			//�������� ũ�⸸ŭ �ش� ������ clear�ϰ� �ȴ�!
			g.clearRect(0, 0, 300, 300);  
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		this.x = e.getX()-10;  // -10, -20, ȭ��ǥ ���������� �׸� �� �ֵ��� ��ǥ�� ����
		y = e.getY()-22;
		dr.repaint(); //�׸��� �����ϰ� ��� �׸� �� �ְ� ����! �׸��� �ݿ��Ѵ�!
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public Grimpan(String title) {
		super(title);
		setBackground(Color.WHITE);
		add(dr = new DrawPanel());  // ���� ��� ���̱�!
		addMouseMotionListener(this); //Grimpan
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Grimpan("�׸���");

	}

}










