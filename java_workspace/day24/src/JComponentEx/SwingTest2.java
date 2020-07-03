package JComponentEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
//import javax.swing.JPanel;

public class SwingTest2 extends JFrame {

	JPanel west = new JPanel();
	JPanel south = new JPanel(new FlowLayout(FlowLayout.RIGHT)); //������ ����
	
	//�ؽ�Ʈ �ʵ忡 ����� ����
	String[]caption = {"��� : ", "�̸� : ", "��å : ", "�μ� : " ,"���� : "};
	String[]caption2 = {"��ü", "�߰�", "�˻�", "����", "����"};
	
	//��� ������ �Է¹ޱ� ���� �гθ����
	//���̺� �ؽ�Ʈ �ʵ� �迭 �����ϱ�
	JPanel jp[]	= new JPanel[5];
	JLabel jl[]	= new JLabel[5];
	JTextField tf[] = new JTextField[5];
	
	//��ư 5�� �迭 ����
	JButton[]jb = new JButton[5];
	
	//�ڱ� �Ұ��� �ޱ� ���� text area ����, ������ ����� �� �ֱ� ������,
	//��ũ�� �г��� ���� �����.
	JTextArea jta;
	JScrollPane sp;
	
	
	//�����ڿ��� ������ ��ü ����( Ư��, �迭 ��ü ����)
	public SwingTest2() {
		//setLayout(null);
		//west.setBounds(500, 200, 100, 200);
		//west �ؽ�Ʈ �ʵ� ���̱�
		west.setBackground(Color.PINK);
		west.setLayout(new GridLayout(5, 1, 10, 10));
		
		//south���� ��ư�� ���δ�
		south.setBackground(Color.YELLOW);
		for (int i = 0; i < caption.length; i++) {
			jl[i] = new JLabel(caption[i]); //String �迭���� �ϳ��� �����ͼ� label�� ������
			tf[i] = new JTextField(6); //6ĭ ������ �ʺ� ����
			
			//�г� ���� - ������ ��ȫ��
			jp[i] = new JPanel();
			jp[i].setBackground(Color.PINK);
			
			//���̺�� ��ư�� �гο� �߰�����!
			//���̺�� ��ư�� �߰��� �г��� west �гο� �߰�����!
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			
			west.add(jp[i]);	//���� 5���� �г��� west�� �ٿ���!
		}
			
			//��ũ���� �����ϴ� �гο��ٰ� text area�� ������!
			jta = new JTextArea(" �ڱ�Ұ����� ������", 25, 25);
			sp = new JScrollPane(jta);
			
			for (int i = 0; i < caption2.length; i++) {
				jb[i] = new JButton(caption2[i]); 	//��ư ����
				south.add(jb[i]);
			}
			
			//end west �гΰ�, south �г� ���� ���� �Ϸ�!
			
			//JFrame�� ������!
			add(west, BorderLayout.WEST);
			add(sp, BorderLayout.CENTER);
			add(south, BorderLayout.SOUTH);
			setVisible(true);
			//pack(); // ���� ������ ��ŭ ũ�⸦ ����ش�!
			setBounds(300, 300, 500, 280);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingTest2();
	}
}




















