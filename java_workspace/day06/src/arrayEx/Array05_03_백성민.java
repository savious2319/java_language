package arrayEx;

import java.util.Scanner;

public class Array05_03_�鼺�� {

	public static void main(String[] args) {
//	����3)
//	������ �̸����� �ʱ�ȭ �� ���ڹ迭�� �����!
//	��) honggildong = {'h' 'o' 'n' 'g' ....  'd', 'o', 'n', 'g'} ���� �ʱ�ȭ
//	���� �� ���� �Է¹޾� �迭������ ��ġ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	ù ��° ��ġ�� 0���̸� �迭�� ���� ���ڰ� �ԷµǸ� "none" ��� 
//	�޽����� ����ϰ� ������ �մϴ�.
//	ã�� ���� : o
//	���� ��ġ : 2��°, 9��°
	
	Scanner sc = new Scanner(System.in);	
		
	char [] name = {'b','a','e','k','s','e','o','n','g','m','i','n'};
	char input = ' ';
	//int cnt = 0;
	boolean check = false;
	System.out.print("ã�� ���� �Է� : ");
	input = sc.next().charAt(0);
	
//	for (int i = 0; i < name.length; i++) {
//		if(name[i] == input) {
//			
//			System.out.println("���� ��ġ : " +  (i+1) + "��°");
//		}else {
//			cnt++;
//		}
//	}// end i for
	
//	if(cnt == name.length) {
//		
//		System.out.println("none");
//	}
	String str = "���� ��ġ : ";
	for (int i = 0; i < name.length; i++) {
		if(name[i] == input) {
			str +=  + (i+1) + "��°" + " ";
//			System.out.print((i+1) + "��°" + " ");
			check = true;
		}
	}// end i for
	
	if(!check) {
		str = "none";
	}
	
	System.out.println(str);

	}

}
