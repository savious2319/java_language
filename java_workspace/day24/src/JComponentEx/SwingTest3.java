package JComponentEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
//import javax.swing.JPanel;
/*
 	라디오버튼
 	버튼그룹
 	체크박스
 	보더레이아웃의 영역을 지정한다(*) JFrame에서만!!!
 */
public class SwingTest3 extends JFrame {
	//라디오버튼
	String[]strMem = {"비회원", "회원", "골드회원"};
	JRadioButton[]rbMem = new JRadioButton[strMem.length];
	
	ButtonGroup bgMem = new ButtonGroup(); // 버튼 그룹!! = 버튼을 하나의 그룹으로 설정
	
	JComboBox<Object> combo = new JComboBox<>(); //콤보 박스
	
	String[] strFood = {"음료수", "라면", "과자", "아이스크림"};
	JCheckBox[] cbFood = new JCheckBox[strFood.length];
	
	//리스트 박스
	JList<Object> list;
	
	//패널
	JPanel mainCenter = new JPanel();
	JPanel mainEast = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	//생성자
	public SwingTest3() {
		mainCenter.setLayout(new BorderLayout()); // 패널은 FlowLayout -> Border로 변경한 다음,
												  // 패널의 영역을 별도로 설정할 예정
		add(mainCenter, BorderLayout.CENTER);
		add(mainEast, BorderLayout.EAST);
		
		mainCenter.add(p1, BorderLayout.NORTH); //p1을 메인의 북쪽에 붙인다
		mainCenter.add(p2, BorderLayout.CENTER); //p1을 메인의 중앙에 붙인다
		
		//p1 패널 영역 설정
		p1.setLayout(new GridLayout(1, 0)); // 1줄짜리 그리드레이아웃 설정(라디오버튼 배치)
		
		//p1에 들어갈 라디오버튼 설정
		for (int i = 0; i < strMem.length; i++) {
			rbMem[i] = new JRadioButton(strMem[i]);
			bgMem.add(rbMem[i]);
			p1.add(rbMem[i]);
		}
		
		//콤보박스 - 여러개 아이템을 설정할 수 있는 구성품
		//콤보박스에 시간을 설정하자
		for (int i = 0; i <= 48; i++) {
			combo.addItem(i+"시간");
		}
		//p1 패널에 콤보박스 붙이기
		p1.add(combo);
		
		//★ p2 패널은 border의 영역을 별도로 지정할 예정
		// setBorder : 윈도우 화면에 타이틀 버튼 등이 들어갈 테두리 영역을 설정한다.
		p2.setBorder(new TitledBorder(new EtchedBorder(), "먹을거리", TitledBorder.LEFT, TitledBorder.TOP, new Font("굴림", Font.PLAIN, 11),Color.GREEN));
		
		//p2의 영역 설정 종료 (윈도우 화면의 틀 지정 종료)
		
		//설정된 영역을 GridLayout으로 변경하자! <--- 윈도우 내부에 영역을 Grid로 변경
		p2.setLayout(new GridLayout(1,0));
		
		for (int i = 0; i < strFood.length; i++) {
			cbFood[i] = new JCheckBox(strFood[i]);
			p2.add(cbFood[i]);
		}
		p1.setBorder(new TitledBorder(new EtchedBorder(), "사용시간", TitledBorder.LEFT, TitledBorder.TOP, new Font("굴림", Font.PLAIN, 11),Color.GREEN));
		
		
		//ArrayList<String> arrList = new ArrayList<>(); // JList에서는 ArrayList를 지원하지 않는다!
		Vector<String> arrList = new Vector<>();
		
		for (int i = 0; i <= 100; i++) {
			arrList.add(i + "000원 쿠폰");
		}
		list = new JList<>(arrList); //리스트는 여러개의 항목을 나열하고 선택할 수 있도록 하는 구성품
									 //컬렉션 중에 Vector를 지원하기 때문에,, ArrayList -> Vector로 수정
		
		list.setVisibleRowCount(4); //처음 보여질 때, 4개 항목정도를 미리 보여주자!
									//나머지는 스크롤로 볼 수 있다.
		
		mainEast.add(new JScrollPane(list));
		mainEast.setBorder(new TitledBorder(new EtchedBorder(), "쿠폰", TitledBorder.LEFT, TitledBorder.TOP, new Font("굴림", Font.PLAIN, 11),Color.GREEN));
		setVisible(true);
		setBounds(300, 300, 600, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new SwingTest3();
		
	}
	
	
}




















