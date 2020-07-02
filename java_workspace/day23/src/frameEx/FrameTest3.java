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
 		
 		������� �ػ󵵸� �������� ��� ����
 		
 		1. �������� ������� �ػ� �˾Ƴ��� : ToolKit Ŭ���� �������
 		2. ���� ���� ���� �� �ִ� �޼��� ã�ƺ���!
 		
 		3. Frame�� ũ��� 400, 300 ���� ���߱�!
 */
public class FrameTest3 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("����° - ����� �߾� ��ǥ�� ������ �׸���");
		
		//jf ũ�� - 400, 300
		//        width height
		jf.setSize(400, 300);
		
		//����� �ػ� �˾Ƴ��� - ToolKit �̱��� ����
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		//����� �߾� ��ǥ �˾Ƴ���
		Dimension di = tool.getScreenSize();
//		System.out.println(di.width);
//		System.out.println(di.height);
		int mWid = di.width;
		int mHeight = di.height;
		
		
		
//		int height = tool.getScreenSize().height;
//		int width = tool.getScreenSize().width;
//		int centerHeight = height / 2;
//		int centerWidth = width / 2;
		
		//�������� ���ݸ�ŭ �߾���ǥ���� ����
		//mWid/2 - �������� ����ũ�� / 2
		int x = mWid/2 - jf.getWidth() / 2;
		int y = mHeight/2 - jf.getHeight() / 2;
//		int x = centerHeight - jf.getHeight();
//		int y = centerWidth - jf.getWidth();
		
		//�������� ��ġ(location) ���ϱ�
		//             x  y
		jf.setLocation(x, y);  //�߾ӿ� ��ġ��Ű��!
		
		
		
		jf.setVisible(true);
		
		jf.addWindowListener(new WindowAdapter() { //WindowAdapter�� �׳� ��������� �߻�Ŭ������ ���������� �̹� �޼��尡 �� ������ �Ʊ⶧����
												   //���ϴ� �޼��带 ���� �ٽ� ������ �ؼ� ���� �ȴ�
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		
		
		
		
	}

}
