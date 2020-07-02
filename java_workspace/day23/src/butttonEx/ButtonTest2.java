package butttonEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameEx.MyEventListener;

/*
 	Button
 		- Container�� ����ǰ �� �ϳ�
 		- Container�� �⺻������ ���̾ƿ��� ���� �ִµ�, ���̾ƿ��� ������ ���� ��ư�� ũ�Ⱑ �ڵ����� �����ȴ�.
 		- Container ���̾ƿ��� ������ null�� �����, ��ư�� ũ���� ������ �� �ְ� �ȴ�.
 		
 		�� Container : Frame, Panel ��
 					�⺻ ���̾ƿ��� BorderLayout
 */
public class ButtonTest2 {

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
					
					System.out.println("��ư�� ���Ƚ��ϴ�");
				}
			});
			
			btnClose.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("��ư�� ���Ƚ��ϴ�");
					
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



















