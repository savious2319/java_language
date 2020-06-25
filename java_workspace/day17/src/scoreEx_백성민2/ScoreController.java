package scoreEx_백성민2;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreController {
	static Scanner sc = new Scanner(System.in);
	Score score = new Score();
	private static final String AdminId = "sbaek3";
	private static final String AdminPw = "5238";
	private ArrayList<Score> list = new ArrayList<>();

	private void add() {

		while (true) {
			Score temp = new Score();
			System.out.print("이름 : ");
			temp.setName(sc.next());
			System.out.println(temp.getIdNum());
			System.out.print("국어 성적 : ");
			temp.setKorScore();
			System.out.print("영어 성적 : ");
			temp.setEngScore();
			System.out.print("수학 성적 : ");
			temp.setMathScore();
			list.add(temp);
			System.out.println("더 추가 하시려면 엔터 또는 종료하시려면 q를 누르세요");
			sc.nextLine();
			String choice = "";
			choice = sc.nextLine();
			if (choice.equals("q"))
				break;
		}
	}

	private void insert() {

		int index = 0;
		while (true) {
			adminDisplay();
			System.out.print("뒤로가기(0)\n성적을 삽입할 번호 입력 : ");
			index = sc.nextInt();
			if (index == 0)
				return;
			Score temp = new Score();
			System.out.print("이름 : ");
			temp.setName(sc.next());
//			temp.setIdNum(++cnt);
			System.out.println(temp.getIdNum());
			System.out.print("국어 성적 : ");
			temp.setKorScore();
			System.out.print("영어 성적 : ");
			temp.setEngScore();
			System.out.print("수학 성적 : ");
			temp.setMathScore();
			list.add(index - 1, temp);
		}
	}

	private void delete() {
		int removeIndex = 0;
		while (true) {
			adminDisplay();
			try {
				System.out.print("삭제할 학생 번호 입력 : ");
				removeIndex = sc.nextInt();
				if (removeIndex > list.size()) {

				}

				System.out.println(list.get(removeIndex - 1).getName() + "학생의 데이터를 삭제했습니다");
				list.remove(removeIndex - 1);
				break;
			} catch (Exception e) {
				System.out.println("없는 학생 번호입니다. 다시 입력해 주세요");
			}
		}

	}

	private void update() {

		int updateNum = 0;
		int choice = 0;
		while (true) {
			adminDisplay();
			try {
				System.out.print("수정할 학생 번호 입력 : ");
				updateNum = sc.nextInt();
				if (updateNum > list.size()) {
				}
				System.out.println(list.get(updateNum - 1).getName() + " 학생의 데이터를 수정합니다");
			} catch (Exception e) {
				System.out.println("없는 학생 번호입니다. 다시 입력해 주세요");
				continue;
			}
			while (true) {
				System.out.println("수정할 항목을 선택하세요\n1. 이름\n2. 학번\n3. 국어성적\n4. 영어성적\n5. 수학성적\n6. 전체수정\n7. 수정종료");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.print("수정할 이름 입력 : ");
					list.get(updateNum - 1).setName(sc.next());
					System.out.println("이름이 "+list.get(updateNum-1).getName()+"으로 변경되었습니다");
					break;
				case 2:
					System.out.print("수정할 학번 입력 : ");
					list.get(updateNum-1).adminIdNum(sc.nextInt()); 
					System.out.println("학번이 "+list.get(updateNum-1).getIdNum()+"으로 변경되었습니다");
					break;
				case 3:
					System.out.print("수정할 국어성적 입력 : ");
					list.get(updateNum - 1).setKorScore();
					System.out.println("국어성적이 "+list.get(updateNum-1).getKorScore()+"으로 변경되었습니다");
					break;
				case 4:
					System.out.print("수정할 영어성적 입력 : ");
					list.get(updateNum - 1).setEngScore();
					System.out.println("영어성적이 "+list.get(updateNum-1).getEngScore()+"으로 변경되었습니다");
					break;
				case 5:
					System.out.print("수정할 수학성적 입력 : ");
					list.get(updateNum - 1).setMathScore();
					System.out.println("수학성적이 "+list.get(updateNum-1).getMathScore()+"으로 변경되었습니다");
					break;
				case 6:
					System.out.print("수정할 이름 입력 : ");
					list.get(updateNum - 1).setName(sc.next());
					System.out.print("수정할 학번 입력 : ");
					list.get(updateNum-1).adminIdNum(sc.nextInt()); 
					System.out.print("수정할 국어성적 입력 : ");
					list.get(updateNum - 1).setKorScore();
					System.out.print("수정할 영어성적 입력 : ");
					list.get(updateNum - 1).setEngScore();
					System.out.print("수정할 수학성적 입력 : ");
					list.get(updateNum - 1).setMathScore();
					System.out.println("수정이 완료되었습니다");
					break;
				case 7:
					return;

				}
			}
		}
	}

	private void adminDisplay() {
		int cnt = 0;
		System.out.println("  이름\t\t학번\t\t국어성적\t영어성적\t수학성적\t총점\t\t평균");
		for (Score tmp : list) {
			System.out.print(++cnt + ". ");
			System.out.println(tmp);
		}
		System.out.println();

	}

	public boolean checkAdminId(String id) {

		if (id.equals(AdminId)) {
			return true;
		}
		return false;
	}

	public boolean checkAdminPw(String pw) {

		if (pw.equals(AdminPw)) {
			return true;
		}
		return false;
	}

	private void AdminMode() {
		int choice = -1;
		while (choice != 0) {
			System.out.println("1. 학생 성적 보기");
			System.out.println("2. 학생 성적 추가");
			System.out.println("3. 학생 성적 삽입");
			System.out.println("4. 학생 성적 삭제");
			System.out.println("5. 학생 성적 수정");
			System.out.println("0. 뒤로 가기");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				adminDisplay(); // 모든 학생 데이터 보기 (관리자용)
				break;

			case 2:
				add(); // 학생 데이터 추가
				break;

			case 3:
				insert(); // 학생 데이터 삽입
				break;

			case 4:
				delete(); // 학생 데이터 삭제
				break;

			case 5:
				update(); // 학생 데이터 수정
				break;
			}

		}
	}

	public void studentMode() {
		int num = 0;
		while (true) {
			boolean check = false;
			System.out.println("◆ 내 성적 보기 ◆");
			System.out.print("학번을 입력하세요 : ");
			num = sc.nextInt();
			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getIdNum() == num) {
					System.out.println("이름\t학번\t\t국어성적\t영어성적\t수학성적\t총점\t\t평균");
					System.out.println(list.get(i));
					System.out.println();
					return;
					//이름이 같으면 리스트를 보여주고 학번을 선택하게 한다
				}
			}
			if (!check) {
				System.out.println("학번을 찾을 수 없습니다. 다시 입력해 주세요\n");
			}
		}
	}

	public void menu() {

		list.add(new Score("백성민", 89, 78, 88));
		list.add(new Score("이순신", 69, 100, 67));
		list.add(new Score("홍길동", 93, 67, 78));

		String id = "";
		String pw = "";
		int choice = -1;
		while (choice != 0) {
			System.out.println("성적관리 시스템");
			System.out.println("1. 관리자 모드");
			System.out.println("2. 학생 모드");
			System.out.println("0. 종료");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// 관리자 모드
				System.out.println("관리자 모드\n1. 로그인\n2. 뒤로 가기");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					while (true) {
						System.out.print("아이디 입력 : ");
						id = sc.next();
						System.out.print("비밀번호 입력 : ");
						pw = sc.next();

						if (checkAdminId(id) && checkAdminPw(pw)) {
							System.out.println("로그인 성공");
							AdminMode();
							break;
						} else if (!checkAdminId(id)) {
							System.out.println("아이디를 잘못 입력했습니다.");
						} else if (!checkAdminPw(pw)) {
							System.out.println("패스워드를 잘못 입력했습니다.");

						}
					}
				case 2:
					continue;
				}
			case 2:
				// 학생 모드
				studentMode();
				break;

			}
		}
		System.out.println("프로그램이 종료되었습니다");
	}
}
