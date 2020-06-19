package stringEx;

public class StringTest03 {

	public static void main(String[] args) {
		String msg = "Hello";
		int length = msg.length();
		//���ڿ� ����
		System.out.println("���ڿ� : "+length+"��");
		
		//���ڿ� �� (��ҹ��� ����)
		System.out.println(msg.equalsIgnoreCase("AbCdEfG"));
		
		//���ڿ� ����
		String tmp = msg.concat("HI");
		System.out.println(tmp);
		tmp = msg + "HI";
		System.out.println(tmp);
		
		//���ڿ� ���Կ��� �˻��ϱ�
		System.out.println(msg.contains("lr") ? "�ִ�" : "����");
		
		
		//���ڿ����� ������ ���ڿ� �˻��ϱ�
		System.out.println(msg.endsWith("exe") ? "�ִ�" : "����");
		
		
		//Ư�� ���� or ���ڿ� ��ġ ã��
		int num = 0;
		
		num = msg.indexOf('l'); // int�� ������
		System.out.println(num);
		
		num = msg.indexOf("ab"); //String�� ������
		System.out.println(num);
		
		msg = "0123456789";
		num = msg.indexOf("45");
		System.out.println(num);
		//lastIndexOf(int)
		num = msg.lastIndexOf('3');
		System.out.println(num);
		//lastIndexOf(String)
		
		num = msg.lastIndexOf("2");
		System.out.println(num);
		
		msg = "Hello";
		
		//replace(char A, char B)
		String str = "";
		str = msg.replace("He", "She");
		System.out.println(str);
		
		
		str = msg.replace('H', 'S');
		System.out.println(str);
		
		//split()
		msg = "You, She";
		
		String[] partsOfStr = msg.split(", ");
		//System.out.println(partsOfStr[0]);
		//System.out.println(partsOfStr[1]);
		for (int i = 0; i < partsOfStr.length; i++) {
			//System.out.println(partsOfStr[i].toString());
			System.out.println(partsOfStr[i]);
		}
		
		
		//substring()
		msg = "hamburger";
		tmp = msg.substring(msg.indexOf('b')); // indexOf()�� �������!
		System.out.println(msg + "substring()���" + tmp);
		
		tmp = msg.substring(msg.indexOf('h'), msg.indexOf('b'));
		System.out.println(tmp);
		
		msg = "sheismad";
		System.out.println(msg.substring(5));
		System.out.println(msg.substring(1,7));
		
		//trim()
		msg = "   Why am I so tired??    ";
		System.out.println(msg.trim());
		msg = "    Don't        know ";
		System.out.println(msg.trim());
	}

}



















