package JComponentEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
//import javax.swing.JPanel;

public class SwingTest2 extends JFrame {

	JPanel west = new JPanel();
	JPanel south = new JPanel(new FlowLayout(FlowLayout.RIGHT)); //오른쪽 정렬
	
	//텍스트 필드에 사용할 예정
	String[]caption = {"사번 : ", "이름 : ", "직책 : ", "부서 : " ,"메일 : "};
	String[]caption2 = {"전체", "추가", "검색", "삭제", "종료"};
	
	//사원 정보를 입력받기 위한 패널만들기
	//레이블 텍스트 필드 배열 생성하기
	JPanel jp[]	= new JPanel[5];
	JLabel jl[]	= new JLabel[5];
	JTextField tf[] = new JTextField[5];
	
	//버튼 5개 배열 생성
	JButton[]jb = new JButton[5];
	
	//자기 소개를 받기 위한 text area 설정, 내용이 길어질 수 있기 때문에,
	//스크롤 패널을 같이 만든다.
	JTextArea jta;
	JScrollPane sp;
	
	
	//생성자에서 각각의 객체 생성( 특히, 배열 객체 생성)
	public SwingTest2() {
		//setLayout(null);
		//west.setBounds(500, 200, 100, 200);
		//west 텍스트 필드 붙이기
		west.setBackground(Color.PINK);
		west.setLayout(new GridLayout(5, 1, 10, 10));
		
		//south에는 버튼을 붙인다
		south.setBackground(Color.YELLOW);
		for (int i = 0; i < caption.length; i++) {
			jl[i] = new JLabel(caption[i]); //String 배열에서 하나씩 가져와서 label에 붙이자
			tf[i] = new JTextField(6); //6칸 정도로 너비를 잡자
			
			//패널 생성 - 배경색은 분홍색
			jp[i] = new JPanel();
			jp[i].setBackground(Color.PINK);
			
			//레이블과 버튼을 패널에 추가하자!
			//레이블과 버튼이 추가된 패널을 west 패널에 추가하자!
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			
			west.add(jp[i]);	//각각 5개의 패널을 west에 붙였다!
		}
			
			//스크롤을 지원하는 패널에다가 text area를 붙이자!
			jta = new JTextArea(" 자기소개서를 쓰세요", 25, 25);
			sp = new JScrollPane(jta);
			
			for (int i = 0; i < caption2.length; i++) {
				jb[i] = new JButton(caption2[i]); 	//버튼 생성
				south.add(jb[i]);
			}
			
			//end west 패널과, south 패널 내부 구성 완료!
			
			//JFrame에 붙이자!
			add(west, BorderLayout.WEST);
			add(sp, BorderLayout.CENTER);
			add(south, BorderLayout.SOUTH);
			setVisible(true);
			//pack(); // 내부 구성자 만큼 크기를 잡아준다!
			setBounds(300, 300, 500, 280);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingTest2();
	}
}




















