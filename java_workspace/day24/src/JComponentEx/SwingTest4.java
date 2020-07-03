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
 	JTabbedPane();	������ �� ������ �����ؼ� ǥ���� �� �ִ�.
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
		
		//�� �п��� �г� ���̱�
		pane.addTab("Model", p1);
		pane.addTab("Movie", p2);
		pane.addTab("PC Room", p3);
		
		//�ʱ⿡ ������ ���� �ε��� ��ȣ (�� 3�� �ٿ��� ������ 0~2������ �ִ�)
		pane.setSelectedIndex(0);
		label = new JLabel("");
		
		//���� �����ӿ��� �г��� ������ �����Ͷ�! // �׸��� �� �гο� pane�� ���̰ڴ�!
		getContentPane().add("Center", pane);
		//getContentPane() : ����Ÿ���� Container��!!!!
		getContentPane().add("South", label);
		
		setVisible(true);
		setBounds(300, 300, 300, 180);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new SwingTest4();
	}
	
}




















