package JComponentEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
//import javax.swing.JPanel;
/*
 	JTabbedPane();	영역을 탭 단위로 구분해서 표시할 수 있다.
 */
public class SwingTest4 extends JFrame {
	
	JTabbedPane pane;
	JLabel label;
	PanelOne p1;
	PanelTwo p2;
	PanelThree p3;
	
	public SwingTest4() {
		pane = new JTabbedPane();
		p1 = new PanelOne();
		p2 = new PanelTwo();
		p3 = new PanelThree();
		
		//탭 패엔에 패널 붙이기
		pane.addTab("Model", p1);
		pane.addTab("Movie", p2);
		pane.addTab("PC Room", p3);
		
		//초기에 보여질 탭의 인덱스 번호 (탭 3개 붙였기 때문에 0~2번까지 있다)
		pane.setSelectedIndex(0);
		label = new JLabel("");
		
		//현재 프레임에서 패널의 정보를 가져와라! // 그리고 그 패널에 pane을 붙이겠다!
		getContentPane().add("Center", pane);
		//getContentPane() : 리턴타입은 Container임!!!!
		getContentPane().add("South", label);
		
		setVisible(true);
		setBounds(300, 300, 300, 180);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new SwingTest4();
	}
	
}




















