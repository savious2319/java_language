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
 	JFrame
 		
 		모니터의 해상도를 기준으로 가운데 정렬
 		
 		1. 실행중인 모니터의 해상도 알아내기 : ToolKit 클래스 사용하자
 		2. 가로 세로 구할 수 있는 메서드 찾아보자!
 		
 		3. Frame의 크기는 400, 300 으로 맞추기!
 */
public class FrameTest3 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("세번째 - 모니터 중앙 좌표에 프레임 그리기");
		
		//jf 크기 - 400, 300
		//        width height
		jf.setSize(400, 300);
		
		//모니터 해상도 알아내기 - ToolKit 싱글턴 패턴
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		//모니터 중앙 좌표 알아내기
		Dimension di = tool.getScreenSize();
//		System.out.println(di.width);
//		System.out.println(di.height);
		int mWid = di.width;
		int mHeight = di.height;
		
		
		
//		int height = tool.getScreenSize().height;
//		int width = tool.getScreenSize().width;
//		int centerHeight = height / 2;
//		int centerWidth = width / 2;
		
		//프레임의 절반만큼 중앙좌표에서 빼기
		//mWid/2 - 프레임의 가로크기 / 2
		int x = mWid/2 - jf.getWidth() / 2;
		int y = mHeight/2 - jf.getHeight() / 2;
//		int x = centerHeight - jf.getHeight();
//		int y = centerWidth - jf.getWidth();
		
		//프레임의 위치(location) 정하기
		//             x  y
		jf.setLocation(x, y);  //중앙에 위치시키자!
		
		
		
		jf.setVisible(true);
		
		jf.addWindowListener(new WindowAdapter() { //WindowAdapter를 그냥 명시적으로 추상클래스로 지정했지만 이미 메서드가 다 재정의 됐기때문에
												   //원하는 메서드를 갖다 다시 재정의 해서 쓰면 된다
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		
		
		
		
	}

}
