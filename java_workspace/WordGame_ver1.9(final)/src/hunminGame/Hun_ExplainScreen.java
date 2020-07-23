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

		//��ư, ��� �̹��� ����
		img_background = new ImageIcon("src\\image\\���ӹ�� ���.jpg");
		background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(img_background.getImage(), 0, 0, img_background.getIconWidth(), img_background.getIconHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}; 
		};
		
		img_start = new ImageIcon("src\\image\\���۹�ư.png");
		JButton btn_Start = new JButton(img_start);
		btn_Start.setBounds(450, 600, 180, 60);
		
//		img_back = new ImageIcon("src\\image\\�ڷι�ư.png");
//		JButton btn_back = new JButton(img_back);
//		btn_back.setBounds(50, 330, 150, 40);
		

		//ȭ��-------------------
		//������ ������ ����
		setTitle("�ƹ����� ���� ����");
		setSize(img_background.getIconWidth() + 5, img_background.getIconHeight() + 30);
		setResizable(false);	//����ڰ� ũ������ ���ϰ��ϱ�
		setLocationRelativeTo(null);	//����� �߾ӿ� �˾�
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//�⺻ ����
		
		
		//��ư �׼Ǹ�����
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
		

		//�����ӿ� �߰�
//		add(btn_back);
		add(btn_Start);
		add(background);

		//������ ���̱�
		setVisible(true);
	}

}
