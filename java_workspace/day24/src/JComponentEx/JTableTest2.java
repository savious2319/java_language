package JComponentEx;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/*
 	���̺� �����
 */
//�߻�ȭ�� ���̺� ���̴�. �÷��� ������ ��Ÿ ��� ���̺� ����� ���� ����!
class JTableMyModel extends AbstractTableModel{
	
	Object [][] data = {
			{"2009-10123", "��浿", "����", 10, "naver@naver.com"},
			{"2009-10124", "�̱浿", "����", 20, "����@naver.com"},
			{"2009-10125", "ȫ�浿", "����", 30, "����@naver.com"},
	};
	
	String[]columnName = {"���", "�̸�","��å", "���", "����"};
	
	@Override
	public int getRowCount() {
		return data.length;  //data�� ������ 3��	data[0]�� ������ 5��!
	}

	@Override
	public int getColumnCount() {
		return columnName.length;
	}

	@Override		//�����͸� ��, ��, ������ ä�� �ִ´�! �� ���� ä����?? data�迭�� ��Ҹ� �����ϸ�,,,
					// rowCount, colCount������ �ϳ��� ä�� �ְ� �ȴ�!
	public Object getValueAt(int rowIndex, int columnIndex) {
		//return data[0][0] ~ data[n][m];
		return data[rowIndex][columnIndex];
	}  
	
	//�ʼ��� �ƴ�!!
	@Override 	//���̺� ���� ��� ���� ����!
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		//return super.isCellEditable(rowIndex, columnIndex);
		return columnIndex != 0 ? true : false;  //0�� Į��(���) �� ���� ������ 1~4�� Į���� ������ �����ϴ�!
	}
	@Override
	public String getColumnName(int column) {  //�÷��� ���� ��ŭ �� �޼��带 �ݺ� ȣ���ؼ�, ĭ�� �̸��� �ϳ��� �ο��Ѵ�.
		//return super.getColumnName(column);
		return columnName[column];
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		//super.setValueAt(aValue, rowIndex, columnIndex);
		data[rowIndex][columnIndex] = aValue; //Ư�� ��(ĭ)�� aValue���� ���� �Ǹ�, �� ���� �״�� �ش� �쿡 �ݿ��Ѵ�.
		
	}
	
}
public class JTableTest2 extends JFrame{
	
	JTable table;
	JTableMyModel model;  // �߻�ȭ�� ���̺��� ���� �ִ�! �÷�, �ο�, ������... ���� -> �������Է±��� ����� ����!
	
	public JTableTest2() {
		
		//����ڸ� ��ü ����
		model = new JTableMyModel();
		
		//����ڸ� �ν��Ͻ��� ���̺� Ŭ������ ��������!
		table = new JTable(model); //����� ������ �𵨷� ���̺��� �����ߴ�!
		add(new JScrollPane(table));
		
		
//		add(new JScrollPane(table), BorderLayout.CENTER);
		setBounds(200, 200, 500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		new JTableTest2();

	}

}
