package componentEx;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import frameEx.MyEventListener;

/*
 	Choice
 		드롭다운 리스트에서 하나를 선택한다.
 		설정으로 여러개를 지정할 수 있다.
 */
public class ChoiceTest2 {

	static String result = "";

	public static void main(String[] args) {

		Frame f = new Frame("Choice");
		f.setBounds(500, 100, 500, 250);
		f.setLayout(null); // 자동 배치 해제
		
		
		//Component 객체
		//#1. 초이스
		Choice day = new Choice();
		day.add("요일을 선택하세요");
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
		
		//String result = "";  익명클래스는 일종의 별도 클래스라서 지역변수로 접근이 불가능하다!
		//						그래서 static 으로 선언하자!
		//static String result = ""; 지역변수로 static 선언 불가!
		//                           따라서 클래스 변수로 선언한 후,
		//                           익명클래스에서 사용할 수 있도록 하자!
		
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				result = (String)e.getItem();
				
			}
		});
		//#1-1. 버튼
		Button btnOk = new Button("선택확인");
		btnOk.setBounds(250, 40, 70, 22);
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("선택한 값 : " + result +"요일");
				
			}
		});
		
		
		//프레임 컴포넌트 배치
		f.add(day);
		f.add(btnOk);
		//프레임 설정
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());
		
		
		
		
		
		
		
		
	}

}















