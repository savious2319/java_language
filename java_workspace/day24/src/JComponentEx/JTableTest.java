package JComponentEx;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 	���̺� �����
 */
public class JTableTest extends JFrame{
	
	//���̺��� 2���� �迭�̴�.
	// ��, ��
	//���̺� �� ������ data
	Object [][] data = {
			{"2009-10123", "��浿", "����", 10, "naver@naver.com"},
			{"2009-10124", "�̱浿", "����", 20, "����@naver.com"},
			{"2009-10125", "ȫ�浿", "����", 30, "����@naver.com"},
	};
	//���̺� ��(column)�� �� ���� - title
	String[]columnName = {"���", "�̸�","��å", "���", "����"};
	
	//JTable ��ü ����
	JTable table  = new JTable(data, columnName); //���̺��̱� ������ ��, ��(data) �� ����(columnName)���� �ʱ�ȭ ����!!!
	
	public JTableTest() {
		//�����ӿ� �߰��� ��, ��ũ�� ������ �����ؼ� ���̺��� ��ġ�ϰ�, ��� ���� ��Ű��!
		add(new JScrollPane(table), BorderLayout.CENTER);
		setBounds(200, 200, 500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		new JTableTest();

	}

}
