package menuCompEx;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
 	�����ӿ���
 		������ ���콺 ��ư�� ������, �޴��� ���´�.
 */
public class PopupMenuTest {

	public static void main(String[] args) {

		Frame f = new Frame("�˾� �޴�");
		
		f.setSize(300, 300);
		
		//�˾� �޴� ��ü ����
		PopupMenu pMenu = new PopupMenu("����");	//�˾� �޴� Ÿ��Ʋ�� ������ �ʴ´�.
		
		//�˾��޴��� �޴�ó��, ���� �޴��� ������ "Menu",,  ������ "MenuItem"���� �׸��� ������!
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		//�����ӿ� �˾� �޴��� �ٿ� ����
		f.add(pMenu);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//�˾��޴� �̺�Ʈ ��� - ���콺 ������ ��ư ������ �� ����
		
		f.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				//���콺 3��° ��ư
				System.out.println(e.getButton());
				if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					pMenu.show(f, e.getX(), e.getY());
				}
			}
			
			/*@Override
			public void mouseClicked(MouseEvent e) {
				
				//Button3_mask�ϰ� getModifiers() �ϰ� ������!
				if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					pMenu.show(f, e.getX(), e.getY());
				}
			}*/
		});
		
	}

}














