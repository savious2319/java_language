package componentEx;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import frameEx.MyEventListener;

/*
 	Choice
 		��Ӵٿ� ����Ʈ���� �ϳ��� �����Ѵ�.
 		�������� �������� ������ �� �ִ�.
 */
public class ChoiceTest2 {

	static String result = "";

	public static void main(String[] args) {

		Frame f = new Frame("Choice");
		f.setBounds(500, 100, 500, 250);
		f.setLayout(null); // �ڵ� ��ġ ����
		
		
		//Component ��ü
		//#1. ���̽�
		Choice day = new Choice();
		day.add("������ �����ϼ���");
		day.add("��");
		day.add("��");
		day.add("ȭ");
		day.add("��");
		day.add("��");
		day.add("��");
		day.add("��");
		
		//Component ����
		day.setSize(150, 0); //���� ũ�⿡ ���缭 ���̰� �����ȴ�! ���� ũ��� Font�� ��������
		day.setLocation(50, 100);
		
		//String result = "";  �͸�Ŭ������ ������ ���� Ŭ������ ���������� ������ �Ұ����ϴ�!
		//						�׷��� static ���� ��������!
		//static String result = ""; ���������� static ���� �Ұ�!
		//                           ���� Ŭ���� ������ ������ ��,
		//                           �͸�Ŭ�������� ����� �� �ֵ��� ����!
		
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				result = (String)e.getItem();
				
			}
		});
		//#1-1. ��ư
		Button btnOk = new Button("����Ȯ��");
		btnOk.setBounds(250, 40, 70, 22);
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("������ �� : " + result +"����");
				
			}
		});
		
		
		//������ ������Ʈ ��ġ
		f.add(day);
		f.add(btnOk);
		//������ ����
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());
		
		
		
		
		
		
		
		
	}

}















