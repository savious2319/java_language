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
		
		//프레임의 제목을 "네번째 프레임"
		//MyFrame, MyEventListener를 이용해서 프레임 생성하세요~
		
		MyFrame mf = new MyFrame();
		
		mf.addWindowListener(new MyEventListener());
		mf.setTitle("네번째 프레임");
		
	}

}
