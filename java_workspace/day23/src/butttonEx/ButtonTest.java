package butttonEx;

import java.awt.Button;
import java.awt.Frame;

import frameEx.MyEventListener;

/*
 	Button
 		- Container�� ����ǰ �� �ϳ�
 		- Container�� �⺻������ ���̾ƿ��� ���� �ִµ�, ���̾ƿ��� ������ ���� ��ư�� ũ�Ⱑ �ڵ����� �����ȴ�.
 		- Container ���̾ƿ��� ������ null�� �����, ��ư�� ũ���� ������ �� �ְ� �ȴ�.
 		
 		�� Container : Frame, Panel ��
 					�⺻ ���̾ƿ��� BorderLayout
 */
public class ButtonTest {

	public static void main(String[] args) {

			Frame f = new Frame("��ư �׽�Ʈ");
			f.setBounds(300, 200, 400, 400);
			
			f.setLayout(null); //���̾ƿ� �ڵ� ������ ����!
							   //�׷���, �����ӿ� add�Ǵ� ����ǰ�� ������ ��ġ��
							   //ũ�⸦ ���ϴµ���, ǥ���� �� �ְ� �ȴ�!
			
			//��ư �����
			Button btnOk = new Button("Ȯ��");
			Button btnClose = new Button("�ݱ�");
			
			//70,90,100,50
			//              x   y  width height
			btnOk.setBounds(70, 90, 100, 50);
			btnClose.setBounds(btnOk.getBounds());
								//Ȯ�ι�ư
			//                     btnClose�� x ��ǥ                   y ��ǥ
			btnClose.setLocation(btnOk.getX()+btnOk.getWidth() + 10, btnOk.getY());
			
			//��ư ���̱�
			f.add(btnOk);
			f.add(btnClose);
			
			//������ ���̱�
			f.setVisible(true);
			
			//������ ���� �̺�Ʈ ó��
			f.addWindowListener(new MyEventListener());
	}

}



















