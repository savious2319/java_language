package HashMapQuiz1_3_백성민v1;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class QuizShowController {
	private static final String AdminPw = "0000";
	QuizShow quizShow = new QuizShow();
	ArrayList<QuizShow> list = new ArrayList<>();
	HashMap<String, String> word = new HashMap<>();

	void quizMenu() {
		// 첫 10문제
		word.put("tiger", "호랑이");
		word.put("비", "rain");
		word.put("laptop", "노트북");
		word.put("안경", "glasses");
		word.put("bread", "빵");
		word.put("신발", "shoes");
		word.put("parasite", "기생충");
		word.put("여름", "summer");
		word.put("prodigy", "영재");
		word.put("배열", "array");

		int choice = -1;
		while (choice != 0) {
			// 관리자 메뉴 (사용자에게 안보일 수 있음 -> syso 하지 않음) 3번
			String menu = "★ 영어 / 한글 단어Quiz 게임 ★\n1. 게임 시작하기\n2. 게임 성적 보기\n0. 종료";
			try {
				choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "숫자를 입력해주세요");
				continue;
			}
			switch (choice) {
			case 1:
				String id = createPlayerId();
				startQuiz(id);
				break;
			case 2:
				displayScore();
				break;
			case 3:
				while (true) {
					String pw = JOptionPane.showInputDialog("관리자 모드\n 비밀번호 입력(0000)");
					if (pw.equals(AdminPw)) {
						adminMenu();
						break;
					} else {
						JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다. 다시 입력해 주세요");
					}
				}
				break;

			}
		}
		JOptionPane.showMessageDialog(null, "게임 종료~");
	}

	public String createPlayerId() {
		// 아이디 입력
		String id = "";
		while (id.equals("")) {
			id = JOptionPane.showInputDialog("아이디를 입력해주세요");
			if (id.equals("")) {
				JOptionPane.showMessageDialog(null, "아이디를 입력해야 게임을 시작할 수 있습니다");
			}
		}
		return id;
	}

	public void startQuiz(String id) {
		Set<String> set = word.keySet();
		List noun = new ArrayList(set);
		Collections.shuffle(noun);
		Iterator<String> iter = noun.iterator();
		QuizShow playerData = new QuizShow();
		int option = 0;
		long startTime = 0;
		int cnt = 0; // 문제 수 증가
		String userInput = ""; // 사용자 정답
		int score = 0; // 사용자 점수
		option = JOptionPane.showConfirmDialog(null, "Are You Ready?", "QuizShow", JOptionPane.YES_NO_OPTION);
		if (option == 1) {
			return;
		}
		Calendar start = Calendar.getInstance();
		while (iter.hasNext()) {
			String question = iter.next(); // iter에 등록된 key값을 question변수에 담아 둔다
			// System.out.println(question);
			String answer = word.get(question); // get(question)은 get(key)와 동일하다. 그래서 각 key의 value를 answer에 담는다
			// System.out.println(answer);
			startTime = start.getTimeInMillis();
			System.out.println(startTime);
			userInput = JOptionPane.showInputDialog("문제" + ++cnt + ") \n" + question);
			if (answer.equalsIgnoreCase(userInput)) {
				score += 10;
				JOptionPane.showMessageDialog(null, "정답입니다! (현재 점수 : " + score + "점)");
			} else {
				JOptionPane.showMessageDialog(null, "틀렸습니다 ㅠㅠ 정답은 " + answer + "입니다 (현재 점수 : " + score + "점)");
			}

		}
		JOptionPane.showMessageDialog(null, "퀴즈 종료 (총 점수 : " + score + "점)");
		Calendar end = Calendar.getInstance();
		long endTime = end.getTimeInMillis();
		System.out.println(endTime);
		// String sec = String.format("%.3f", (end.getTimeInMillis() -
		// start.getTimeInMillis()) / (double) 1000);
		long diff = endTime - startTime;
//		System.out.printf("%.3f",sec);
		long elapsedSec = diff / 1000;
		long elapsedMin = elapsedSec / 60;
		if (elapsedSec > 60) {
			elapsedSec -= 60;
		}

		System.out.println(elapsedMin + "분  " + elapsedSec + "초");
		JOptionPane.showMessageDialog(null, id + "님이 문제 푸는데 걸린 시간\n" + elapsedMin + "분 " + elapsedSec + "초 걸리셨습니다");

		playerData.setId(id);
		playerData.setMinute(elapsedMin);
		playerData.setSecond(elapsedSec);
		playerData.setScore(score);

		list.add(playerData);

	}

	void displayScore() {

		// JOptionPane.showMessageDialog(null, "아이디\t점수\t시간");
		String rank = "        ● Quiz 랭킹 ●\nID              Score          Time\n";
		String playerInfo = "";
		// List set = new ArrayList(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getScore() < list.get(j).getScore()) {
					QuizShow tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
			playerInfo += list.get(i).getId() + "      " + list.get(i).getScore() + "점           "
					+ list.get(i).getMinute() + "분 " + list.get(i).getSecond() + "초 \n";
			System.out.println(playerInfo);
		}
		JOptionPane.showMessageDialog(null, rank + playerInfo);

//		List<Integer> setList = new ArrayList<>(); 
//		Collections.sort(setList);
	}

	void adminMenu() {
		int choice = -1;
		String adminOption = "1. 문제 추가하기\n2. 문제 삭제하기\n0. 뒤로가기";
		while (choice != 0) {
			int cnt = 0;
			String questionSet = "";
			Set<Map.Entry<String, String>> set = word.entrySet();
			Iterator<Map.Entry<String, String>> iter = set.iterator();
			while (iter.hasNext()) {
				Map.Entry<String, String> tmp = iter.next();
				questionSet += "문제 " + (++cnt) + ") " + tmp.getKey() + " = " + tmp.getValue() + "\n";
			}
			// System.out.println(questionSet);
			try {
				choice = Integer
						.parseInt(JOptionPane.showInputDialog("★ 퀴즈 리스트 ★\n" + questionSet + "\n" + adminOption));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "번호를 선택해 주세요");
				continue;
			}
			switch (choice) {
			case 1:
				addQuiz();
				break;
			case 2:
				deleteQuiz();
				break;
			}
		}
	}

	void addQuiz() {
		int option = 0;
		while (option != 1) {
			try {
				String question = JOptionPane.showInputDialog("◆ 문제 ◆\n영어 or 한글 단어 입력");
				String answer = JOptionPane.showInputDialog("◆ 답 ◆\n영어 or 한글 단어 입력");
				if (question.equals("") && answer.equals("")) {
					JOptionPane.showMessageDialog(null, "단어를 입력해 주세요");
					continue;
				}
				word.put(question, answer);
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "단어를 입력해 주세요");
				continue;
			}
			int cnt = 0;
			String questionSet = "";
			Set<Map.Entry<String, String>> set = word.entrySet();
			Iterator<Map.Entry<String, String>> iter = set.iterator();
			while (iter.hasNext()) {
				Map.Entry<String, String> tmp = iter.next();
				questionSet += "문제 " + (++cnt) + ") " + tmp.getKey() + " = " + tmp.getValue() + "\n";
			}
			option = JOptionPane.showConfirmDialog(null, "★ 퀴즈 리스트 ★\n" + questionSet + "\n더 추가하시겠습니까?", "문제추가",
					JOptionPane.YES_NO_OPTION);
		}
	}

	void deleteQuiz() {
		int option = 0;
		String deleteQuestion = "";
		String deleteAnswer = "";

		while (option != 1) {
			int cnt = 0;
			String questionSet = "";
			Set<Map.Entry<String, String>> set = word.entrySet();
			Iterator<Map.Entry<String, String>> iter = set.iterator();
			while (iter.hasNext()) {
				Map.Entry<String, String> tmp = iter.next();
				questionSet += "문제 " + (++cnt) + ") " + tmp.getKey() + " = " + tmp.getValue() + "\n";
			}

			while (true) {
				deleteQuestion = JOptionPane.showInputDialog(questionSet + "\n삭제할 문제를 입력해주세요");
				if (!word.containsKey(deleteQuestion)) {
					JOptionPane.showMessageDialog(null, "문제에 속하지않는 단어를 입력하셨습니다. 다시 입력해 주세요");
				} else
					break;
			}

			while (true) {
				deleteAnswer = JOptionPane.showInputDialog(questionSet + "\n삭제할 답을 입력해주세요");

				if (!word.containsValue(deleteAnswer) || !deleteAnswer.equals(word.get(deleteQuestion))) {
					JOptionPane.showMessageDialog(null, "답에 속하지않는 단어를 입력하셨습니다. 다시 입력해 주세요");
				} else
					break;
			}
			word.remove(deleteQuestion, deleteAnswer);

			option = JOptionPane.showConfirmDialog(null, "더 삭제 하시겠습니까?", "문제 삭제", JOptionPane.YES_NO_OPTION);

		}

	}

}
