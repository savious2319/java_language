package JComponentEx;

import javax.swing.JFrame;

/*
 	Swing은 awt 후속 GUI 패키지이다.
 	awt보다 경량화 되어 있다(소스용량, 실행속도, 편의성이 높아짐)
 	디자인패턴에 많은 변화가 있다(기존 리스너이벤트, 폰트 등 백도어 쪽 패키지는 그래도 awt를 사용)
 */
public class SwingTest extends JFrame {
	public SwingTest() {
		super("스윙 연습");
		setLocation(100, 100);
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // dipose 와 exit
													// dispose는 현재 걸려있는 컴포넌트만 메모리에서 없애는 것
													// exit는 실행중인 GUI 프로그램 자체를 메모리에서 없애는 것
	}
	public static void main(String[] args) {

			new SwingTest();
	}

}
