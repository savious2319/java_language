package hunminGame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Hun_ExplainScreen extends JFrame{
	
	private JPanel background;
	private ImageIcon img_background;
	private ImageIcon img_start;
	
	
	public Hun_ExplainScreen() {

		//버튼, 배경 이미지 삽입
		img_background = new ImageIcon("src\\image\\게임방법 배경.jpg");
		background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(img_background.getImage(), 0, 0, img_background.getIconWidth(), img_background.getIconHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}; 
		};
		
		img_start = new ImageIcon("src\\image\\시작버튼.png");
		JButton btn_Start = new JButton(img_start);
		btn_Start.setBounds(450, 600, 180, 60);
		
//		img_back = new ImageIcon("src\\image\\뒤로버튼.png");
//		JButton btn_back = new JButton(img_back);
//		btn_back.setBounds(50, 330, 150, 40);
		

		//화면-------------------
		//프레임 사이즈 조정
		setTitle("훈민정음 게임 설명");
		setSize(img_background.getIconWidth() + 5, img_background.getIconHeight() + 30);
		setResizable(false);	//사용자가 크기조정 못하게하기
		setLocationRelativeTo(null);	//모니터 중앙에 팝업
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//기본 종료
		
		
		//버튼 액션리스너
		btn_Start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				GameStart.main(null);
			}
		});
//		btn_back.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//				new Hun_MainScreen();
//			}
//		});
		

		//프레임에 추가
//		add(btn_back);
		add(btn_Start);
		add(background);

		//프레임 보이기
		setVisible(true);
	}

}
