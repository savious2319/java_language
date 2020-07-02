package componentEx;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import frameEx.MyEventListener;

/*
 	Choice
 		드롭다운 리스트에서 하나를 선택한다.
 		설정으로 여러개를 지정할 수 있다.
 */
public class ChoiceTest {

	public static void main(String[] args) {

		Frame f = new Frame("Choice");
		f.setBounds(500, 100, 500, 250);
		f.setLayout(null); // 자동 배치 해제
		
		
		//Component 객체
		Choice day = new Choice();
		day.add("일");
		day.add("월");
		day.add("화");
		day.add("수");
		day.add("목");
		day.add("금");
		day.add("토");
		
		//Component 설정
		day.setSize(150, 0); //글자 크기에 맞춰서 높이가 결정된다! 글자 크기는 Font로 설정가능
		day.setLocation(50, 100);
		
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("아이디 : "+ e.getID());
				System.out.println("소스 : "+ e.getSource());
				System.out.println("소스.클래스.이름 : "+ e.getSource().getClass().getName());
				System.out.println("상태변화 : "+ e.getStateChange());
				System.out.println("컴포넌트 이름 : "+day.getName());
				System.out.println("day.selectedItem(String) : "+day.getSelectedItem());
				System.out.println("day.selectedIndex(int) : "+day.getSelectedIndex());
				System.out.println("e.getItem() : "+e.getItem());
			}
		});
		
		//프레임 컴포넌트 배치
		f.add(day);
		
		//프레임 설정
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());
		
		
		
		
		
		
		
		
	}

}















