package menuCompEx;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 	awt �޴��� Ȱ���� ����!
 	
 	�޴�
 		�޴� ��
 			- �޴�
 				-�޴� ������
 	
 */
public class MenuTest {

	public static void main(String[] args) {

		Frame f = new Frame("�޴� ����");
		f.setSize(300, 200);
		f.setLocation(500, 100);
		
		//�޴��� ���̴� ��ü �޴��ٰ� �ʿ��ϴ�!
		MenuBar mb = new MenuBar();
		
		Menu mFile = new Menu("����");  //1. New, Open, Save, Print(�޴�), �ݱ�
		//new, open, save
		MenuItem m_new = new MenuItem("New");
		MenuItem m_open = new MenuItem("Open");
		MenuItem m_save = new MenuItem("Save");
		//�μ� print -> ����Ʈ�ϱ�, �̸�����, ����Ʈ ����.... �����޴��� ���鿹���̴�
		Menu print = new Menu("Print");
		MenuItem printSetup = new MenuItem("����Ʈ ����");
		MenuItem printPreview = new MenuItem("�̸�����");
		print.add(printSetup); print.add(printPreview);
		
		MenuItem close = new MenuItem("�ݱ�");
		
		mFile.add(m_new);	// <--- �޴�������
		mFile.add(m_open);
		mFile.add(m_save);
		mFile.add(print);	// <--- �޴�
		mFile.add(close);
		
		//�޴� �ٿ� ���� �޴��� �߰�
		mb.add(mFile);
		
		f.setMenuBar(mb); //�޴��ٴ� Component : MenuComponent
		//f.add(mb);
		
		f.setLayout(null);
		
		//��ư�� �̹����� ����� ���� �� �ִ�.
		//�̰�, JButton�� �ȴ�! Button�� ������!!
		//ImageIcon
		ImageIcon img = new ImageIcon("image/button01.gif"); //jpg, gif -> png ����
		
		//img.getIconHeight();
		//img.getIconWidth()
		
		JButton btn = new JButton(img);
		btn.setBounds(0, 100, img.getIconWidth(), img.getIconHeight());
		f.add(btn);
		
		//�޴������ۿ� �̺�Ʈ ����ϱ�
		printSetup.addActionListener(new MyMenuListener());
		close.addActionListener(new MyMenuListener());
		
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}

}















