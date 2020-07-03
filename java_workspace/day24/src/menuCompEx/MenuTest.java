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
 	awt 메뉴를 활용해 보자!
 	
 	메뉴
 		메뉴 바
 			- 메뉴
 				-메뉴 아이템
 	
 */
public class MenuTest {

	public static void main(String[] args) {

		Frame f = new Frame("메뉴 예제");
		f.setSize(300, 200);
		f.setLocation(500, 100);
		
		//메뉴를 붙이는 객체 메뉴바가 필요하다!
		MenuBar mb = new MenuBar();
		
		Menu mFile = new Menu("파일");  //1. New, Open, Save, Print(메뉴), 닫기
		//new, open, save
		MenuItem m_new = new MenuItem("New");
		MenuItem m_open = new MenuItem("Open");
		MenuItem m_save = new MenuItem("Save");
		//인쇄 print -> 프린트하기, 미리보기, 프린트 설정.... 하위메뉴를 만들예정이다
		Menu print = new Menu("Print");
		MenuItem printSetup = new MenuItem("프린트 설정");
		MenuItem printPreview = new MenuItem("미리보기");
		print.add(printSetup); print.add(printPreview);
		
		MenuItem close = new MenuItem("닫기");
		
		mFile.add(m_new);	// <--- 메뉴아이템
		mFile.add(m_open);
		mFile.add(m_save);
		mFile.add(print);	// <--- 메뉴
		mFile.add(close);
		
		//메뉴 바에 파일 메뉴를 추가
		mb.add(mFile);
		
		f.setMenuBar(mb); //메뉴바는 Component : MenuComponent
		//f.add(mb);
		
		f.setLayout(null);
		
		//버튼에 이미지로 배경을 만들 수 있다.
		//이건, JButton만 된다! Button은 미지원!!
		//ImageIcon
		ImageIcon img = new ImageIcon("image/button01.gif"); //jpg, gif -> png 지원
		
		//img.getIconHeight();
		//img.getIconWidth()
		
		JButton btn = new JButton(img);
		btn.setBounds(0, 100, img.getIconWidth(), img.getIconHeight());
		f.add(btn);
		
		//메뉴아이템에 이벤트 등록하기
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















