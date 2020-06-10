package arrayEx;

import java.util.Random;

import javax.swing.JOptionPane;

public class Array05_06_�鼺�� {
	/*
	 * ���� �߱�����
	 * 
	 * cpu : ���� ���� 3�� �Է¹޴´�. (�迭) ���� ���� 1~9���� �� �ڸ���
	 * 
	 * cpu ���� ���ڿ� ������ �θ� ������ ��ġ�� ������, strike ���ڴ� �����ϴµ�, ��ġ�� �ٸ��� ball �θ� �����ϰ� cpu��
	 * ���ڰ� �ϳ��� �´°� ������, out
	 * 
	 * ��) cpu ���� : 581 ���� �θ��� 1ȸ : 490 �ϳ��� �´°� ����, 3 out ���� �θ��� 2ȸ : 502 �ϳ� �´°�
	 * �ְ�(5), �ڸ��� �Ȱ���, 1 strike ���� �θ��� 3ȸ : 510 �ڸ��� 1�� �´°�(5), �ڸ����� �ٸ���(1) 1 strike,
	 * 1ball .... �̷��� ������ ���ؼ� ������ ��ġ�� ������ ���糪����. ��ȸ���� ��ĥ �� �ִ��� ī��Ʈ ����! 2���� ���� cpu��
	 * ����ؼ� ī��Ʈ ���� ���� ����� �̱��!
	 * 
	 * Joption���� _____�� 1ȸ �Է� :
	 */
	public static void main(String[] args) {

		Random r = new Random();

		// cpu ���� �迭
		int[] cpuNum = new int[3];

		// �÷��̾� �̸� �迭
		String[] player = new String[2];
		
		//���� �÷��̾� ���� Ƚ�� �迭
		int[] playCnt = new int[2];
		
		String msg = "�ڼ��� �߱����ӡ�\n��ǻ���� 3�ڸ� ���ڿ� ��ġ�ϴ� ���ڸ� �Է��ϸ� �˴ϴ�\n"
				+ "���� ��ġ�ϴ� ���ڰ� ������ 3 out�� ���ɴϴ�\n���� ��ġ�ϴ� ���ڰ� �ִµ� �ڸ��� �ٸ��� 1 ball�� �˴ϴ�\n"
				+ "���� ��ġ�ϴ� ���ڰ� �ְ� �ڸ��� ������ 1 strike�� �˴ϴ�\n";

		JOptionPane.showMessageDialog(null, msg);

		int ball = 0;
		int strike = 0;
		int out = 0;
		int cnt = 0;
		String gameResult = " ";

		
		while(true) {
		
		//���� ����
		for (int k = 0; k < player.length; k++) {
			
			// cpu ���� ��ġ���ʰ� �Է¹ޱ�
			for (int i = 0; i < cpuNum.length; i++) {
				cpuNum[i] = r.nextInt(9) + 1;
				for (int j = 0; j < i; j++) {
					if (cpuNum[i] == cpuNum[j]) {
						i--;
						break;
					} // if
				} // j for
			} // i for
			// ��
			for (int i = 0; i < cpuNum.length; i++) {
				System.out.print(cpuNum[i] + " ");
			}
			System.out.println();
			
			player[k] = JOptionPane.showInputDialog("�÷��̾��� �̸��� �Է��ϼ���");
			
			while (true) {
				ball = 0;
				strike = 0;
				out = 0;
				
				cnt++;

				String userNum = JOptionPane.showInputDialog(null, player[k] + "��\n" + cnt + "ȸ\n" + gameResult + "3�ڸ� ���ڸ� �Է��ϼ���");
				//String userNum = JOptionPane.showInputDialog(player[k] + "��\n" + cnt + "ȸ\n" + gameResult + "3�ڸ� ���ڸ� �Է��ϼ���");

				for (int i = 0; i < cpuNum.length; i++) {
					for (int j = 0; j < cpuNum.length; j++) {
						if (cpuNum[i] == Integer.parseInt(userNum.charAt(j) + "")) {
							ball++;
						}
					} // j for
					if (cpuNum[i] == Integer.parseInt(userNum.charAt(i) + "")) {
						strike++;
						ball--; // cpuNum�� 231�ε� ����� ���ڰ� 243�� ���, ball--�� �����ָ�
								// 2 ball 1 strike�� �ȴ�. 1 ball 1 strike�� �Ǳ� ���ؼ� ball--�� ���־�� �Ѵ�.
					}
				} // i for
//			if(strike == 0 && ball == 0) {
//				out++;
//			}

				gameResult = "�Է� ��ȣ : " + userNum + "\n";
				if (strike > 0) {
					gameResult += strike + "strike\n";
				}
				if (ball > 0) {
					gameResult += ball + "ball\n";
				}
				
				if (strike == 0 && ball == 0) {
					gameResult += "3 out\n";
				}

				JOptionPane.showMessageDialog(null, gameResult);

				if (strike == 3) {
					JOptionPane.showMessageDialog(null, "���߼̽��ϴ�!");
					break;
				}

			} // while
			
			playCnt[k] = cnt;
			
			cnt = 0;

		} // k for
		String gameWinner = "";
//		gameWinner += player[0] + "�� ���� : " + playCnt[0] +"ȸ\n";
//		gameWinner += player[1] + "�� ���� : " + playCnt[1] +"ȸ\n";
		for (int j = 0; j < player.length; j++) {
			gameWinner += player[j] + "�� ���� : " + playCnt[j] +"ȸ\n";
		}
		
		if(playCnt[0] > playCnt[1]) {
			gameWinner += player[1] +"����" + playCnt[1] + "ȸ�� �̱�̽��ϴ�!";
		}
		else if(playCnt[0] < playCnt[1]) {
			gameWinner += player[0] +"����" + playCnt[0] + "ȸ�� �̱�̽��ϴ�!";
		}
		else {
			gameWinner += playCnt[0] +"ȸ�� �����Դϴ�";
		}
		
		JOptionPane.showMessageDialog(null, gameWinner);
		
		int choice = JOptionPane.showConfirmDialog(null, "�ٽ� ���� �Ͻðڽ��ϱ�?", "�絵��", JOptionPane.YES_NO_OPTION);
		
		if(choice == 1) {
			break;
		}
		}//while
//		JOptionPane.showInputDialog(message);
//		JOptionPane.showInputDialog(null, message);
		

	}// main

}// class
