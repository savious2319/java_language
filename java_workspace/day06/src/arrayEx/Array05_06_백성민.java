package arrayEx;

import java.util.Random;

import javax.swing.JOptionPane;

public class Array05_06_백성민 {
	/*
	 * 숫자 야구게임
	 * 
	 * cpu : 난수 정수 3개 입력받는다. (배열) 난수 정수 1~9까지 각 자리값
	 * 
	 * cpu 난수 숫자와 상대방이 부른 숫자의 위치가 같으면, strike 숫자는 존재하는데, 위치가 다르면 ball 부른 숫자하고 cpu의
	 * 숫자가 하나도 맞는게 없으면, out
	 * 
	 * 예) cpu 난수 : 581 숫자 부르기 1회 : 490 하나도 맞는게 없네, 3 out 숫자 부르기 2회 : 502 하나 맞는게
	 * 있고(5), 자리가 똑같음, 1 strike 숫자 부르기 3회 : 510 자리값 1개 맞는거(5), 자리값이 다른거(1) 1 strike,
	 * 1ball .... 이렇게 판정을 통해서 숫자의 위치와 순서를 맞춰나간다. 몇회만에 맞칠 수 있는지 카운트 하자! 2명이 각각 cpu와
	 * 대결해서 카운트 값이 적은 사람이 이긴다!
	 * 
	 * Joption으로 _____님 1회 입력 :
	 */
	public static void main(String[] args) {

		Random r = new Random();

		// cpu 난수 배열
		int[] cpuNum = new int[3];

		// 플레이어 이름 배열
		String[] player = new String[2];
		
		//각각 플레이어 게임 횟수 배열
		int[] playCnt = new int[2];
		
		String msg = "★숫자 야구게임★\n컴퓨터의 3자리 숫자와 일치하는 숫자를 입력하면 됩니다\n"
				+ "만약 일치하는 숫자가 없으면 3 out이 나옵니다\n만약 일치하는 숫자가 있는데 자리가 다르면 1 ball이 됩니다\n"
				+ "만약 일치하는 숫자가 있고 자리도 같으면 1 strike가 됩니다\n";

		JOptionPane.showMessageDialog(null, msg);

		int ball = 0;
		int strike = 0;
		int out = 0;
		int cnt = 0;
		String gameResult = " ";

		
		while(true) {
		
		//게임 시작
		for (int k = 0; k < player.length; k++) {
			
			// cpu 난수 겹치지않게 입력받기
			for (int i = 0; i < cpuNum.length; i++) {
				cpuNum[i] = r.nextInt(9) + 1;
				for (int j = 0; j < i; j++) {
					if (cpuNum[i] == cpuNum[j]) {
						i--;
						break;
					} // if
				} // j for
			} // i for
			// 답
			for (int i = 0; i < cpuNum.length; i++) {
				System.out.print(cpuNum[i] + " ");
			}
			System.out.println();
			
			player[k] = JOptionPane.showInputDialog("플레이어의 이름을 입력하세요");
			
			while (true) {
				ball = 0;
				strike = 0;
				out = 0;
				
				cnt++;

				String userNum = JOptionPane.showInputDialog(null, player[k] + "님\n" + cnt + "회\n" + gameResult + "3자리 숫자를 입력하세요");
				//String userNum = JOptionPane.showInputDialog(player[k] + "님\n" + cnt + "회\n" + gameResult + "3자리 숫자를 입력하세요");

				for (int i = 0; i < cpuNum.length; i++) {
					for (int j = 0; j < cpuNum.length; j++) {
						if (cpuNum[i] == Integer.parseInt(userNum.charAt(j) + "")) {
							ball++;
						}
					} // j for
					if (cpuNum[i] == Integer.parseInt(userNum.charAt(i) + "")) {
						strike++;
						ball--; // cpuNum이 231인데 사용자 숫자가 243인 경우, ball--를 안해주면
								// 2 ball 1 strike가 된다. 1 ball 1 strike가 되기 위해서 ball--를 해주어야 한다.
					}
				} // i for
//			if(strike == 0 && ball == 0) {
//				out++;
//			}

				gameResult = "입력 번호 : " + userNum + "\n";
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
					JOptionPane.showMessageDialog(null, "맞추셨습니다!");
					break;
				}

			} // while
			
			playCnt[k] = cnt;
			
			cnt = 0;

		} // k for
		String gameWinner = "";
//		gameWinner += player[0] + "의 성적 : " + playCnt[0] +"회\n";
//		gameWinner += player[1] + "의 성적 : " + playCnt[1] +"회\n";
		for (int j = 0; j < player.length; j++) {
			gameWinner += player[j] + "의 성적 : " + playCnt[j] +"회\n";
		}
		
		if(playCnt[0] > playCnt[1]) {
			gameWinner += player[1] +"님이" + playCnt[1] + "회로 이기셨습니다!";
		}
		else if(playCnt[0] < playCnt[1]) {
			gameWinner += player[0] +"님이" + playCnt[0] + "회로 이기셨습니다!";
		}
		else {
			gameWinner += playCnt[0] +"회로 동점입니다";
		}
		
		JOptionPane.showMessageDialog(null, gameWinner);
		
		int choice = JOptionPane.showConfirmDialog(null, "다시 도전 하시겠습니까?", "재도전", JOptionPane.YES_NO_OPTION);
		
		if(choice == 1) {
			break;
		}
		}//while
//		JOptionPane.showInputDialog(message);
//		JOptionPane.showInputDialog(null, message);
		

	}// main

}// class
