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

		//��ư, ��� �̹��� ����
		img_back = new ImageIcon("src\\image\\�ƹ��������.jpg");
		background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(img_back.getImage(), 0, 0, img_back.getIconWidth(), img_back.getIconHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}; 
		};
		
		img_Start = new ImageIcon("src\\image\\���۹�ư.png");
		JButton btn_Start = new JButton(img_Start);
		btn_Start.setBounds(50, 380, 150, 40);
		
		img_Explain = new ImageIcon("src\\image\\�����ư.png");
		JButton btn_Explain = new JButton(img_Explain);
		btn_Explain.setBounds(50, 330, 150, 40);
		
		img_Home = new ImageIcon("src\\image\\Ȩ��ư.png");
		JButton btn_Home = new JButton(img_Home);
		btn_Home.setBounds(353, 0, 80, 80);
		

		//ȭ��-------------------
		//������ ������ ����
		setTitle("�ƹ����� ����");
		setSize(img_back.getIconWidth() + 5, img_back.getIconHeight() + 30);
		setResizable(false);	//����ڰ� ũ������ ���ϰ��ϱ�
		setLocationRelativeTo(null);	//����� �߾ӿ� �˾�
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//�⺻ ����
		
		
		//��ư �׼Ǹ�����
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
		

		//�����ӿ� �߰�
		add(btn_Home);
		add(btn_Explain);
		add(btn_Start);
		add(background);

		//������ ���̱�
		setVisible(true);
	}

}
