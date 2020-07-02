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
		
		JFrame fr = new JFrame("두번째 Swing J프레임"); //ctrl + shift + o -> import된다
		//위에는 화면단을 구성
		//        width height
		fr.setSize(400, 400);
		//              x    y
		fr.setLocation(500, 100);
		
		//fr.setBackground(Color.BLUE); JFrame에서는 Color를 다른 방법으로 지원!
		
		
		//JFrame은 리스너를 사용하지 않고 바로 창을 닫을 수 있는 메서드 제공
		//fr.addWindowListener(new WindowListener() {});
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setVisible(true);

	}

}
