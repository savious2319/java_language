package componentEx;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import frameEx.MyEventListener;

/*
 	CheckBox - 다중 선택
 		ItemListener 를 이용해 이벤트 처리
 		CheckBoxGroup을 이용하면, 라디오버튼(여러개중에 하나만 선택) 기능 구현 할 수 있다!
 */
public class CheckBoxTest {

	public static void main(String[] args) {

		
		Frame f = new Frame();
		f.setBounds(500, 100, 800, 250);
		f.setLayout(new FlowLayout());
		
		Label question = new Label("1. 관심분야 : ");
		Checkbox news = new Checkbox("뉴스");
		Checkbox sports = new Checkbox("스포츠");
		Checkbox movies = new Checkbox("영화감상");
		Checkbox music = new Checkbox("음악감상");
		
		//news에 이벤트 걸기!
		news.addItemListener(new ItemListener() {
			
			@Override	//아이템의 상태(state)가 변하면!!!
			public void itemStateChanged(ItemEvent e) {
				System.out.println("뉴스 체크박스 상태 : "+ e.getStateChange());
				String msg = e.getStateChange() == 1 ? "체크했음 : 뉴스선택" : "뉴스 선택안함";
				System.out.println(msg);
				
			}
		});
		 
		
		f.add(question);
		f.add(news);
		
		// 라디오 버튼 : 다중 택일!!! 체크박스들을 모아서 그룹에 넣으면 여러개중 하나만 선택하는 라디오버튼 기능을 구현할 수 있다.
		Label question2 = new Label("2. 영화는 몇번 보시나요?");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox one = new Checkbox("한번", group, true); //기본 설정 체크박스!
		Checkbox two = new Checkbox("두번", group, false); 
		Checkbox three = new Checkbox("세번", group, false); 
		
		//one 을 체크하면 한달에 한번 봄
		//two는 한달에 두번..
		//three는 한달에 세번.. 각 객체에 이벤트 처리하기!
		
		one.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("한달에 한번 봅니다");
			}
		});
		two.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("한달에 두번 봅니다");
			}
		});
		three.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("한달에 세번 봅니다");
			}
		});
		
		
		
		f.add(question2);
		f.add(one);
		f.add(two);
		f.add(three);
		
		
		
		f.setVisible(true);
		
		f.addWindowListener(new MyEventListener());
	}

}















