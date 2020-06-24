package scoreEx_백성민;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreController {
	static Scanner sc = new Scanner(System.in);
	private static final String ManagerPw = "5238";
	private ArrayList<Score> list = new ArrayList<>();

	public void add() {
		int cnt = 0;

		Score temp = new Score();
		System.out.print("이름 : ");
		temp.setName(sc.next());
		temp.setIdNum(++cnt);
		System.out.print("국어 성적 : ");
		temp.setKorScore(sc.nextInt());
		System.out.print("영어 성적 : ");
		temp.setEngScore(sc.nextInt());
		System.out.print("수학 성적 : ");
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
		System.out.println("내 성적 보기");
		
	}

	public void menu() {
		
		list.add(new Score("백성민",))
		
		String pw = "";
		int choice = -1;
		while(choice != 0) {
		System.out.println("성적관리 시스템");
		System.out.println("1. 관리자 모드");
		System.out.println("2. 학생 모드");
		System.out.println("0. 종료");
		choice = sc.nextInt();
		switch(choice) {
		case 1: 
		//관리자 모드
		System.out.print("비밀번호 입력 : "); pw = sc.next();
		
		if(checkPw(pw)) {
		
		managerMode();
		}else {
			System.out.println("비밀번호가 틀립니다.");
		}
		case 2:
		//학생 모드
		studentMode();
		
		
		}
		}
	}
}













