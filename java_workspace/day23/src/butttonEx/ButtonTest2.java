package butttonEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameEx.MyEventListener;

/*
 	Button
 		- Container에 구성품 중 하나
 		- Container는 기본적으로 레이아웃을 갖고 있는데, 레이아웃의 설정에 따라 버튼의 크기가 자동으로 결정된다.
 		- Container 레이아웃의 설정을 null로 만들면, 버튼의 크기대로 설정할 수 있게 된다.
 		
 		※ Container : Frame, Panel 등
 					기본 레이아웃은 BorderLayout
 */
public class ButtonTest2 {

	public static void main(String[] args) {

			Frame f = new Frame("버튼 테스트");
			f.setBounds(300, 200, 400, 400);
			
			f.setLayout(null); //레이아웃 자동 설정을 끈다!
							   //그러면, 프레임에 add되는 구성품들 고유의 위치와
							   //크기를 정하는데로, 표시할 수 있게 된다!
			
			//#1.버튼 만들기
			//#1-1. 구현
			Button btnOk = new Button("확인");
			Button btnClose = new Button("닫기");
			//70,90,100,50
			btnOk.setBounds(70, 90, 100, 50);
			btnClose.setBounds(btnOk.getBounds());
								//확인버튼
			btnClose.setLocation(btnOk.getX()+btnOk.getWidth() + 10, btnOk.getY());
			
			//#1-2. 이벤트 처리하기
			btnOk.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					System.out.println("버튼이 눌렸습니다");
				}
			});
			
			btnClose.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("버튼이 눌렸습니다");
					
				}
			});
			
			//버튼 붙이기
			f.add(btnOk);
			f.add(btnClose);
			
			//프레임 보이기
			f.setVisible(true);
			
			//프레임 종료 이벤트 처리
			f.addWindowListener(new MyEventListener());
	}

}



















