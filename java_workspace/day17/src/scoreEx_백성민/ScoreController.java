package scoreEx_�鼺��;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreController {
	static Scanner sc = new Scanner(System.in);
	private static final String ManagerPw = "5238";
	private ArrayList<Score> list = new ArrayList<>();

	public void add() {
		int cnt = 0;

		Score temp = new Score();
		System.out.print("�̸� : ");
		temp.setName(sc.next());
		temp.setIdNum(++cnt);
		System.out.print("���� ���� : ");
		temp.setKorScore(sc.nextInt());
		System.out.print("���� ���� : ");
		temp.setEngScore(sc.nextInt());
		System.out.print("���� ���� : ");
		temp.setMathScore(sc.nextInt());
		list.add(temp);
	}

	public void insert() {

	}

	public void delete() {

	}

	public void update() {

	}

	public void display() {

	}
	
	public boolean checkPw(String pw) {
		
		if(pw.equals(ManagerPw)) {
			return true;
		}
		return false;
	}

	public void managerMode() {

	}

	public void studentMode() {
		System.out.println("�� ���� ����");
		
	}

	public void menu() {
		
		list.add(new Score("�鼺��",))
		
		String pw = "";
		int choice = -1;
		while(choice != 0) {
		System.out.println("�������� �ý���");
		System.out.println("1. ������ ���");
		System.out.println("2. �л� ���");
		System.out.println("0. ����");
		choice = sc.nextInt();
		switch(choice) {
		case 1: 
		//������ ���
		System.out.print("��й�ȣ �Է� : "); pw = sc.next();
		
		if(checkPw(pw)) {
		
		managerMode();
		}else {
			System.out.println("��й�ȣ�� Ʋ���ϴ�.");
		}
		case 2:
		//�л� ���
		studentMode();
		
		
		}
		}
	}
}













