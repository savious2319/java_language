package butttonEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameEx.MyEventListener;

/*
 	Button
 		��ư �̺�Ʈ ó��
 					
 					
 */
public class ButtonTest3 {

	public static void main(String[] args) {

			Frame f = new Frame("��ư �׽�Ʈ");
			f.setBounds(300, 200, 400, 400);
			
			f.setLayout(null); //���̾ƿ� �ڵ� ������ ����!
							   //�׷���, �����ӿ� add�Ǵ� ����ǰ�� ������ ��ġ��
							   //ũ�⸦ ���ϴµ���, ǥ���� �� �ְ� �ȴ�!
			
			//#1.��ư �����
			//#1-1. ����
			Button btnOk = new Button("Ȯ��");
			Button btnClose = new Button("�ݱ�");
			//70,90,100,50
			btnOk.setBounds(70, 90, 100, 50);
			btnClose.setBounds(btnOk.getBounds());
								//Ȯ�ι�ư
			btnClose.setLocation(btnOk.getX()+btnOk.getWidth() + 10, btnOk.getY());
			
			//#1-2. �̺�Ʈ ó���ϱ�
			btnOk.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					System.out.println("Ȯ�� ��ư�� ���Ƚ��ϴ�");
					System.out.println("�׼� Ŀ�ǵ� : " + e.getActionCommand());
					System.out.println("�׼� ���̵� : " + e.getID());
					System.out.println("�׼� getName() : " + e.getClass().getName());
					System.out.println("�׼� Modifier : " + e.getClass().getModifiers());
					System.out.println("�׼� getWhen : " + e.getWhen());
					
				}
			});
			
			btnClose.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("�ݱ� ��ư�� ���Ƚ��ϴ�");
					System.out.println("�׼� Ŀ�ǵ� : " + e.getActionCommand());
					System.out.println("�׼� ���̵� : " + e.getID());
					System.out.println("�׼� getName() : " + e.getClass().getName());
					System.out.println("�׼� Modifier : " + e.getClass().getModifiers());
					System.out.println("�׼� getWhen : " + e.getWhen());
					
				}
			});
			
			btnClose.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//System.out.println("��ư�� ���Ƚ��ϴ�");
					System.exit(0);
				}
			});
			
			//��ư ���̱�
			f.add(btnOk);
			f.add(btnClose);
			
			//������ ���̱�
			f.setVisible(true);
			
			//������ ���� �̺�Ʈ ó��
			f.addWindowListener(new MyEventListener());
	}

}



















