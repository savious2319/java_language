package JComponentEx;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 	테이블 만들기
 */
public class JTableTest extends JFrame{
	
	//테이블은 2차원 배열이다.
	// 행, 열
	//테이블에 들어갈 데이터 data
	Object [][] data = {
			{"2009-10123", "김길동", "차장", 10, "naver@naver.com"},
			{"2009-10124", "이길동", "차장", 20, "다음@naver.com"},
			{"2009-10125", "홍길동", "차장", 30, "구글@naver.com"},
	};
	//테이블 열(column)에 들어갈 내용 - title
	String[]columnName = {"사번", "이름","직책", "사번", "메일"};
	
	//JTable 객체 생성
	JTable table  = new JTable(data, columnName); //테이블이기 때문에 행, 열(data) 와 제목(columnName)으로 초기화 가능!!!
	
	public JTableTest() {
		//프레임에 추가할 때, 스크롤 패인을 적용해서 테이블을 배치하고, 가운데 정렬 시키자!
		add(new JScrollPane(table), BorderLayout.CENTER);
		setBounds(200, 200, 500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		new JTableTest();

	}

}
