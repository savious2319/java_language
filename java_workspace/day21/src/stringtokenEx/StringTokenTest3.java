package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer �� split()
 	   Ŭ����          �޼���
 */
public class StringTokenTest3 {
	StringTokenizer st;
	//1. �μ� 1��������
	public StringTokenTest3(String str){
		System.out.println("str :" + str);
		st = new StringTokenizer(str); //�����ڰ� ����... �׷� �������� �������´�!
	}
	//2. �μ� 2�� ������
	public StringTokenTest3(String str, String delimeter){
		System.out.println("str :" + str);
		st = new StringTokenizer(str, delimeter); //�����ڰ� ����... �׷� �������� �������´�!
	}
	
	
	//3. print() : ���дܾ� ����, �и��� �ܾ��!!!
	void print() {
		System.out.println("���� �ܾ� ���� : "+ st.countTokens());
		while(st.hasMoreTokens()) {
			String tmp = st.nextToken();
			
			System.out.println(tmp);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		String msg = "����ϴ� ���� ��Ӵ�";  //������ ���� -> StringTokenizer�� �⺻ �����ڴ� ����!
		
		StringTokenTest3 st1 = new StringTokenTest3(msg);
		st1.print();
		
		String date = "2020/06/30";			  //�����ڰ� / �� �̿��ؾ� �Ѵ�.
		
		StringTokenTest3 st2 = new StringTokenTest3(date, "/");
		st2.print();
		
		
		
		
	}

}


































