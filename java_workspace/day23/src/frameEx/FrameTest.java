package frameEx;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameTest {

	public static void main(String[] args) {
		
		Frame fr = new Frame("ù ������");
		//������ ȭ����� ����
		//           x     y  width height
		//                    ����   ����
		fr.setBounds(800, 100, 400, 300);
		
		fr.setBackground(Color.BLUE);
		
		
		//Event���� �������� �����Ѵ�
		fr.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("������ ����!!!");
				System.exit(0); //�޸𸮸� �����ض�!
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		fr.setVisible(true);

	}

}
