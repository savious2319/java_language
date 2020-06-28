package HashMapQuiz1_3_�鼺��v1;

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
		// ù 10����
		word.put("tiger", "ȣ����");
		word.put("��", "rain");
		word.put("laptop", "��Ʈ��");
		word.put("�Ȱ�", "glasses");
		word.put("bread", "��");
		word.put("�Ź�", "shoes");
		word.put("parasite", "�����");
		word.put("����", "summer");
		word.put("prodigy", "����");
		word.put("�迭", "array");

		int choice = -1;
		while (choice != 0) {
			// ������ �޴� (����ڿ��� �Ⱥ��� �� ���� -> syso ���� ����) 3��
			String menu = "�� ���� / �ѱ� �ܾ�Quiz ���� ��\n1. ���� �����ϱ�\n2. ���� ���� ����\n0. ����";
			try {
				choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "���ڸ� �Է����ּ���");
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
					String pw = JOptionPane.showInputDialog("������ ���\n ��й�ȣ �Է�(0000)");
					if (pw.equals(AdminPw)) {
						adminMenu();
						break;
					} else {
						JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ּ���");
					}
				}
				break;

			}
		}
		JOptionPane.showMessageDialog(null, "���� ����~");
	}

	public String createPlayerId() {
		// ���̵� �Է�
		String id = "";
		while (id.equals("")) {
			id = JOptionPane.showInputDialog("���̵� �Է����ּ���");
			if (id.equals("")) {
				JOptionPane.showMessageDialog(null, "���̵� �Է��ؾ� ������ ������ �� �ֽ��ϴ�");
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
		int cnt = 0; // ���� �� ����
		String userInput = ""; // ����� ����
		int score = 0; // ����� ����
		option = JOptionPane.showConfirmDialog(null, "Are You Ready?", "QuizShow", JOptionPane.YES_NO_OPTION);
		if (option == 1) {
			return;
		}
		Calendar start = Calendar.getInstance();
		while (iter.hasNext()) {
			String question = iter.next(); // iter�� ��ϵ� key���� question������ ��� �д�
			// System.out.println(question);
			String answer = word.get(question); // get(question)�� get(key)�� �����ϴ�. �׷��� �� key�� value�� answer�� ��´�
			// System.out.println(answer);
			startTime = start.getTimeInMillis();
			System.out.println(startTime);
			userInput = JOptionPane.showInputDialog("����" + ++cnt + ") \n" + question);
			if (answer.equalsIgnoreCase(userInput)) {
				score += 10;
				JOptionPane.showMessageDialog(null, "�����Դϴ�! (���� ���� : " + score + "��)");
			} else {
				JOptionPane.showMessageDialog(null, "Ʋ�Ƚ��ϴ� �Ф� ������ " + answer + "�Դϴ� (���� ���� : " + score + "��)");
			}

		}
		JOptionPane.showMessageDialog(null, "���� ���� (�� ���� : " + score + "��)");
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

		System.out.println(elapsedMin + "��  " + elapsedSec + "��");
		JOptionPane.showMessageDialog(null, id + "���� ���� Ǫ�µ� �ɸ� �ð�\n" + elapsedMin + "�� " + elapsedSec + "�� �ɸ��̽��ϴ�");

		playerData.setId(id);
		playerData.setMinute(elapsedMin);
		playerData.setSecond(elapsedSec);
		playerData.setScore(score);

		list.add(playerData);

	}

	void displayScore() {

		// JOptionPane.showMessageDialog(null, "���̵�\t����\t�ð�");
		String rank = "        �� Quiz ��ŷ ��\nID              Score          Time\n";
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
			playerInfo += list.get(i).getId() + "      " + list.get(i).getScore() + "��           "
					+ list.get(i).getMinute() + "�� " + list.get(i).getSecond() + "�� \n";
			System.out.println(playerInfo);
		}
		JOptionPane.showMessageDialog(null, rank + playerInfo);

//		List<Integer> setList = new ArrayList<>(); 
//		Collections.sort(setList);
	}

	void adminMenu() {
		int choice = -1;
		String adminOption = "1. ���� �߰��ϱ�\n2. ���� �����ϱ�\n0. �ڷΰ���";
		while (choice != 0) {
			int cnt = 0;
			String questionSet = "";
			Set<Map.Entry<String, String>> set = word.entrySet();
			Iterator<Map.Entry<String, String>> iter = set.iterator();
			while (iter.hasNext()) {
				Map.Entry<String, String> tmp = iter.next();
				questionSet += "���� " + (++cnt) + ") " + tmp.getKey() + " = " + tmp.getValue() + "\n";
			}
			// System.out.println(questionSet);
			try {
				choice = Integer
						.parseInt(JOptionPane.showInputDialog("�� ���� ����Ʈ ��\n" + questionSet + "\n" + adminOption));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "��ȣ�� ������ �ּ���");
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
				String question = JOptionPane.showInputDialog("�� ���� ��\n���� or �ѱ� �ܾ� �Է�");
				String answer = JOptionPane.showInputDialog("�� �� ��\n���� or �ѱ� �ܾ� �Է�");
				if (question.equals("") && answer.equals("")) {
					JOptionPane.showMessageDialog(null, "�ܾ �Է��� �ּ���");
					continue;
				}
				word.put(question, answer);
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "�ܾ �Է��� �ּ���");
				continue;
			}
			int cnt = 0;
			String questionSet = "";
			Set<Map.Entry<String, String>> set = word.entrySet();
			Iterator<Map.Entry<String, String>> iter = set.iterator();
			while (iter.hasNext()) {
				Map.Entry<String, String> tmp = iter.next();
				questionSet += "���� " + (++cnt) + ") " + tmp.getKey() + " = " + tmp.getValue() + "\n";
			}
			option = JOptionPane.showConfirmDialog(null, "�� ���� ����Ʈ ��\n" + questionSet + "\n�� �߰��Ͻðڽ��ϱ�?", "�����߰�",
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
				questionSet += "���� " + (++cnt) + ") " + tmp.getKey() + " = " + tmp.getValue() + "\n";
			}

			while (true) {
				deleteQuestion = JOptionPane.showInputDialog(questionSet + "\n������ ������ �Է����ּ���");
				if (!word.containsKey(deleteQuestion)) {
					JOptionPane.showMessageDialog(null, "������ �������ʴ� �ܾ �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
				} else
					break;
			}

			while (true) {
				deleteAnswer = JOptionPane.showInputDialog(questionSet + "\n������ ���� �Է����ּ���");

				if (!word.containsValue(deleteAnswer) || !deleteAnswer.equals(word.get(deleteQuestion))) {
					JOptionPane.showMessageDialog(null, "�信 �������ʴ� �ܾ �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
				} else
					break;
			}
			word.remove(deleteQuestion, deleteAnswer);

			option = JOptionPane.showConfirmDialog(null, "�� ���� �Ͻðڽ��ϱ�?", "���� ����", JOptionPane.YES_NO_OPTION);

		}

	}

}
