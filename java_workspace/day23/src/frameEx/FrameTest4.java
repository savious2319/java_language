package frameEx;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
/*
 	Frame
 		
 */
public class FrameTest4 {

	public static void main(String[] args) {
		
		//�������� ������ "�׹�° ������"
		//MyFrame, MyEventListener�� �̿��ؼ� ������ �����ϼ���~
		
		MyFrame mf = new MyFrame();
		
		mf.addWindowListener(new MyEventListener());
		mf.setTitle("�׹�° ������");
		
	}

}
