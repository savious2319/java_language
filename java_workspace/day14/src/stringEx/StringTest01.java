package stringEx;
/*
 	���ڿ�
 	100, 200, 1.1, 'A'  <--- ���ͷ� ��� : ������ ��ü�� ���� ũ�Ⱑ �̹� �����Ǿ� �ִ� ��!
 							100 -> ������� ����̾�(��), 4byte�� (ũ��)
 	��ũ�� ��� #define PI 3.14
 	�ɺ��� ��� const int MAX = 5;
 	->�ڹ� final int MAX = 5;
 	
 	"abc"  ���! -> �ν��Ͻ��� ó���ϴ� ���       (���� �� ���� ���� ���ͷ� ����� �ƴϴ�. ���� �����Ǿ� �ִ�.)
 	�׷��ٺ���, "��ü"�� �ʿ��� ����!
 	string msg = "abc";
 	
 	String msg = "abc"; // msg��� ��ü�� �־�� "abc"�� ���� �� �ִ�

	--------------------------
 	String msg = new String("abc"); �׷���, ������ String �� ������ ���� �ν��Ͻ��� ���Թ��� �� �ִ�!
 	�� ������ ����ȭ, ����ȭ�� �� �� �־��� ������ "abc"�� �ν��Ͻ��� ������� ������... ����ȭ�� �� �� �ִ�!
 	
 	�׷��� ���ڿ��� ���ͷ������ ���� Ư�� ��츦 �޴´�!
 	
 	
 */
public class StringTest01 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";
		String s1 = "100";
		String s3 = new String("100");
		
		//str1�� str2 �� ������?
		System.out.println(str1 == str2 ? "����" : "�ٸ���");
		System.out.println(str1.equals(str2) ? "����" : "�ٸ���");
		System.out.println(s1 == s3 ? "����" : "�ٸ���");
		System.out.println(s1.equals(s3) ? "����" : "�ٸ���");
		
	}

}



















