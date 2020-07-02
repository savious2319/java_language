package layoutEx;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameEx.MyEventListener;

/*
 	Layout
 		-�����̳ʿ� ��ġ�ϴ� ���
 		-�����̳ʴ� �ڵ����� ���̾ƿ��� ������ �ִ�.
 				Frame, Dialog : BorderLayout
 				Panel, Applet(x) : FlowLayout �⺻����
 		-���̾ƿ� �Ŵ��� : setLayout( new BorderLayout() )
 						   setLayout( new FlowLayout() )
 						   setLayout( null ) <-- �����̳ʿ� ��ġ�� ����ǰ���� ������ ũ�⸦ ���� �־�� �Ѵ�.
 						   
 		-BorderLayout
 				: 5�� �������� ���еǾ� �ִ�.
 						Easy, West, South, North, Center
 						�⺻ ������ Center �̴�!
 						
 		-FlowLayout
 				: �������� ������� �þ�Ʈ����.
 				: â�� ũ�Ⱑ �������� �ڵ����� �Ʒ��� ��������.
 				: ����ǰ ���� ������ gap �̶�� �Ѵ�! (����, ���� ������ ����)
 		
 		-��Ÿ : GridLayout, GridBagLayout, CardLayout...
 		          ĭ - �࿭����           (�������� ī�带 �׾Ƴ��� ������� ��ġ�Ѵ�)
 */
public class BorderLayoutTest {

	static ActionListener click = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// ��ư1 ~ ��ư6 <-- ��ư�� Ÿ��Ʋ�� e.get???() ���ؼ� ���� �� �ִ�.
			// �ڹ� : switch���� ���ڿ� �񱳵� �ȴ�!
			// �ֿܼ� ��ư1 Ŭ����
			switch (e.getActionCommand()) {
			case "��":
				System.out.println(e.getActionCommand() + "�� Ŭ����");
				break;
			case "��":
				System.out.println(e.getActionCommand() + "�� Ŭ����");
				break;
			case "��":
				System.out.println(e.getActionCommand() + "�� Ŭ����");
				break;
			case "��":
				System.out.println(e.getActionCommand() + "�� Ŭ����");
				break;
			case "�߾�":
				System.out.println(e.getActionCommand() + "�� Ŭ����");
				break;
			}
		}
	};

	public static void main(String[] args) {

		Frame f = new Frame("���� ���̾ƿ�");

		//f.setLayout(new FlowLayout());
		f.setLayout(new BorderLayout());

		Button btnE = new Button("��");
		Button btnW = new Button("��");
		Button btnS = new Button("��");
		Button btnN = new Button("��");
		Button btnC = new Button("�߾�");

		// ��ư �̺�Ʈ ��
		btnE.addActionListener(click);
		btnW.addActionListener(click);
		btnS.addActionListener(click);
		btnN.addActionListener(click);
		btnC.addActionListener(click);

		f.add(btnE, BorderLayout.EAST);
		f.add(btnW, BorderLayout.WEST);
		f.add(btnS, BorderLayout.SOUTH);
		f.add(btnN, BorderLayout.NORTH);
		f.add(BorderLayout.CENTER, btnC); //�Ű������� ������ ����ŵ�, ���� ��ġ ����

		f.setSize(400, 300);
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());

	}

}
