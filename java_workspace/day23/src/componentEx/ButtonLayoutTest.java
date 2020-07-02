package componentEx;

import java.awt.*;

import javax.swing.border.Border;

import frameEx.MyEventListener;

public class ButtonLayoutTest {

	public static void main(String[] args) {

		Frame f = new Frame();
		//f.setLayout(new BorderLayout());  //���� ����, �⺻�� Border ��!!!
		
		Button [] btns = new Button[5];
		String [] btnText = {"�ݱ�", "����", "���", "Ȯ��", "�ȳ�"};
		for (int i = 0; i < btnText.length; i++) {
			btns[i] = new Button(btnText[i]);
		}
		
		f.add((btns[0]), BorderLayout.EAST);
		f.add((btns[1]), BorderLayout.WEST);
		//f.add(btns[1], "West");
		f.add((btns[2]), BorderLayout.SOUTH);
		f.add((btns[3]), BorderLayout.NORTH);
		f.add((btns[4]), BorderLayout.CENTER);
		
		f.pack(); //size�� ���� ����ǰ ũ�⸸ŭ �����ؼ� ����� �ش�!
		
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());
		
	}

}
