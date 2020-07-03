package menuCompEx;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
 	프레임에서
 		오른쪽 마우스 버튼을 누르면, 메뉴가 나온다.
 */
public class PopupMenuTest {

	public static void main(String[] args) {

		Frame f = new Frame("팝업 메뉴");
		
		f.setSize(300, 300);
		
		//팝업 메뉴 객체 생서
		PopupMenu pMenu = new PopupMenu("편집");	//팝업 메뉴 타이틀은 보이지 않는다.
		
		//팝업메뉴도 메뉴처럼, 하위 메뉴가 있으면 "Menu",,  없으면 "MenuItem"으로 항목을 만들자!
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		//프레임에 팝업 메뉴를 붙여 놓자
		f.add(pMenu);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//팝업메뉴 이벤트 등록 - 마우스 오른쪽 버튼 눌렀을 때 등장
		
		f.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				//마우스 3번째 버튼
				System.out.println(e.getButton());
				if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					pMenu.show(f, e.getX(), e.getY());
				}
			}
			
			/*@Override
			public void mouseClicked(MouseEvent e) {
				
				//Button3_mask하고 getModifiers() 하고 비교하자!
				if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					pMenu.show(f, e.getX(), e.getY());
				}
			}*/
		});
		
	}

}














