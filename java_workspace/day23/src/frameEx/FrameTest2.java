package frameEx;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
/*
 	JFrame
 */
public class FrameTest2 {

	public static void main(String[] args) {
		
		JFrame fr = new JFrame("�ι�° Swing J������"); //ctrl + shift + o -> import�ȴ�
		//������ ȭ����� ����
		//        width height
		fr.setSize(400, 400);
		//              x    y
		fr.setLocation(500, 100);
		
		//fr.setBackground(Color.BLUE); JFrame������ Color�� �ٸ� ������� ����!
		
		
		//JFrame�� �����ʸ� ������� �ʰ� �ٷ� â�� ���� �� �ִ� �޼��� ����
		//fr.addWindowListener(new WindowListener() {});
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setVisible(true);

	}

}
