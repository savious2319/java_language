package JComponentEx;

import javax.swing.JFrame;

/*
 	Swing�� awt �ļ� GUI ��Ű���̴�.
 	awt���� �淮ȭ �Ǿ� �ִ�(�ҽ��뷮, ����ӵ�, ���Ǽ��� ������)
 	���������Ͽ� ���� ��ȭ�� �ִ�(���� �������̺�Ʈ, ��Ʈ �� �鵵�� �� ��Ű���� �׷��� awt�� ���)
 */
public class SwingTest extends JFrame {
	public SwingTest() {
		super("���� ����");
		setLocation(100, 100);
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // dipose �� exit
													// dispose�� ���� �ɷ��ִ� ������Ʈ�� �޸𸮿��� ���ִ� ��
													// exit�� �������� GUI ���α׷� ��ü�� �޸𸮿��� ���ִ� ��
	}
	public static void main(String[] args) {

			new SwingTest();
	}

}
