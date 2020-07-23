package hunminGame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Hun_MainScreen extends JFrame{
	
	private JPanel background;
	private ImageIcon img_Home;
	private ImageIcon img_back;
	private ImageIcon img_Start;
	private ImageIcon img_Explain;
	
	
	public Hun_MainScreen() {

		//버튼, 배경 이미지 삽입
		img_back = new ImageIcon("src\\image\\훈민정음배경.jpg");
		background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(img_back.getImage(), 0, 0, img_back.getIconWidth(), img_back.getIconHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}; 
		};
		
		img_Start = new ImageIcon("src\\image\\시작버튼.png");
		JButton btn_Start = new JButton(img_Start);
		btn_Start.setBounds(50, 380, 150, 40);
		
		img_Explain = new ImageIcon("src\\image\\설명버튼.png");
		JButton btn_Explain = new JButton(img_Explain);
		btn_Explain.setBounds(50, 330, 150, 40);
		
		img_Home = new ImageIcon("src\\image\\홈버튼.png");
		JButton btn_Home = new JButton(img_Home);
		btn_Home.setBounds(353, 0, 80, 80);
		

		//화면-------------------
		//프레임 사이즈 조정
		setTitle("훈민정음 게임");
		setSize(img_back.getIconWidth() + 5, img_back.getIconHeight() + 30);
		setResizable(false);	//사용자가 크기조정 못하게하기
		setLocationRelativeTo(null);	//모니터 중앙에 팝업
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//기본 종료
		
		
		//버튼 액션리스너
		btn_Home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new main.Menu();
			}
		});
		btn_Start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				GameStart.main(null);
			}
		});
		btn_Explain.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Hun_ExplainScreen();
			}
		});
		

		//프레임에 추가
		add(btn_Home);
		add(btn_Explain);
		add(btn_Start);
		add(background);

		//프레임 보이기
		setVisible(true);
	}

}
