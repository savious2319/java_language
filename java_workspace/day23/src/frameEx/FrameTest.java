package frameEx;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameTest {

	public static void main(String[] args) {
		
		Frame fr = new Frame("첫 프레임");
		//위에는 화면단을 구성
		//           x     y  width height
		//                    가로   세로
		fr.setBounds(800, 100, 400, 300);
		
		fr.setBackground(Color.BLUE);
		
		
		//Event단을 마지막에 구성한다
		fr.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("윈도우 닫힘!!!");
				System.exit(0); //메모리를 해제해라!
				
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
