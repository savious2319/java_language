package arrayEx;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array04_�鼺�� {

	public static void main(String[] args) {
		//��5) ���� 4�ڸ��� �Է¹޴´�
		//     �ѱ۷� ������ ����
		//     1024 -> �ϰ��̻�
		//     ��й�ȣ 4 ���� -> �ѱ۷� Ǯ���!
		//	   815 ���Ͽ�
		// hint) syso("���� �Է� : ");  String strData = sc.next();
		//							�ε���         0 1 2 3 4 5 6 7 8 9
		//		���ع��ڿ�!! String hangleToNum = "�����̻�����ĥ�ȱ�";
		//       for( ���ڿ��� ���� ) 
		//		       ���ڿ��� ��� (��, ����)
		//             ��)  "345"   0���濡 �ִ� �ε��� '3'
		//						    1���濡 �ִ� ��Ұ� '4'
		//							2���濡 �ִ� ��Ұ� '5'
		Scanner sc = new Scanner(System.in);
		String strData = "";
		String result = "";
		//System.out.print("���� 4�ڸ� �Է� : ");
//		strData = JOptionPane.showInputDialog("���� 4�ڸ� �Է� : ");
		strData = JOptionPane.showInputDialog(null, "���� 4�ڸ� �Է� : ");
		
		//strData = sc.next();
		
		
		String hangleToNum = "�����̻�����ĥ�ȱ�";
		for (int i = 0; i < strData.length(); i++) {
			result += hangleToNum.charAt(strData.charAt(i) - 48);
		}
		//System.out.println(result);
		JOptionPane.showMessageDialog(null, "��й�ȣ�� " + result + "�Դϴ�");
		
//		String [] hangleToNum = {"��","��","��","��","��","��","��","ĥ","��","��"};
//		for (int i = 0; i < strData.length(); i++) {
//			int index = strData.charAt(i) - 48;
//			System.out.print(hangleToNum[index] + "");
//		}
		
		
		//System.out.println("1" - 48);	// <-���ڿ��̶� ���� X
		//System.out.println('1' - 48);	// <-�ڵ�����ȯ�Ǽ� 49 - 48 = 1
		
		
	}

}
