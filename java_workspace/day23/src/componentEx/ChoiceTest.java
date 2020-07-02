package componentEx;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import frameEx.MyEventListener;

/*
 	Choice
 		��Ӵٿ� ����Ʈ���� �ϳ��� �����Ѵ�.
 		�������� �������� ������ �� �ִ�.
 */
public class ChoiceTest {

	public static void main(String[] args) {

		Frame f = new Frame("Choice");
		f.setBounds(500, 100, 500, 250);
		f.setLayout(null); // �ڵ� ��ġ ����
		
		
		//Component ��ü
		Choice day = new Choice();
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
		
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("���̵� : "+ e.getID());
				System.out.println("�ҽ� : "+ e.getSource());
				System.out.println("�ҽ�.Ŭ����.�̸� : "+ e.getSource().getClass().getName());
				System.out.println("���º�ȭ : "+ e.getStateChange());
				System.out.println("������Ʈ �̸� : "+day.getName());
				System.out.println("day.selectedItem(String) : "+day.getSelectedItem());
				System.out.println("day.selectedIndex(int) : "+day.getSelectedIndex());
				System.out.println("e.getItem() : "+e.getItem());
			}
		});
		
		//������ ������Ʈ ��ġ
		f.add(day);
		
		//������ ����
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());
		
		
		
		
		
		
		
		
	}

}















