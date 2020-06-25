package scoreEx_�鼺��2;

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
			System.out.print("�̸� : ");
			temp.setName(sc.next());
			System.out.println(temp.getIdNum());
			System.out.print("���� ���� : ");
			temp.setKorScore();
			System.out.print("���� ���� : ");
			temp.setEngScore();
			System.out.print("���� ���� : ");
			temp.setMathScore();
			list.add(temp);
			System.out.println("�� �߰� �Ͻ÷��� ���� �Ǵ� �����Ͻ÷��� q�� ��������");
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
			System.out.print("�ڷΰ���(0)\n������ ������ ��ȣ �Է� : ");
			index = sc.nextInt();
			if (index == 0)
				return;
			Score temp = new Score();
			System.out.print("�̸� : ");
			temp.setName(sc.next());
//			temp.setIdNum(++cnt);
			System.out.println(temp.getIdNum());
			System.out.print("���� ���� : ");
			temp.setKorScore();
			System.out.print("���� ���� : ");
			temp.setEngScore();
			System.out.print("���� ���� : ");
			temp.setMathScore();
			list.add(index - 1, temp);
		}
	}

	private void delete() {
		int removeIndex = 0;
		while (true) {
			adminDisplay();
			try {
				System.out.print("������ �л� ��ȣ �Է� : ");
				removeIndex = sc.nextInt();
				if (removeIndex > list.size()) {

				}

				System.out.println(list.get(removeIndex - 1).getName() + "�л��� �����͸� �����߽��ϴ�");
				list.remove(removeIndex - 1);
				break;
			} catch (Exception e) {
				System.out.println("���� �л� ��ȣ�Դϴ�. �ٽ� �Է��� �ּ���");
			}
		}

	}

	private void update() {

		int updateNum = 0;
		int choice = 0;
		while (true) {
			adminDisplay();
			try {
				System.out.print("������ �л� ��ȣ �Է� : ");
				updateNum = sc.nextInt();
				if (updateNum > list.size()) {
				}
				System.out.println(list.get(updateNum - 1).getName() + " �л��� �����͸� �����մϴ�");
			} catch (Exception e) {
				System.out.println("���� �л� ��ȣ�Դϴ�. �ٽ� �Է��� �ּ���");
				continue;
			}
			while (true) {
				System.out.println("������ �׸��� �����ϼ���\n1. �̸�\n2. �й�\n3. �����\n4. �����\n5. ���м���\n6. ��ü����\n7. ��������");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.print("������ �̸� �Է� : ");
					list.get(updateNum - 1).setName(sc.next());
					System.out.println("�̸��� "+list.get(updateNum-1).getName()+"���� ����Ǿ����ϴ�");
					break;
				case 2:
					System.out.print("������ �й� �Է� : ");
					list.get(updateNum-1).adminIdNum(sc.nextInt()); 
					System.out.println("�й��� "+list.get(updateNum-1).getIdNum()+"���� ����Ǿ����ϴ�");
					break;
				case 3:
					System.out.print("������ ����� �Է� : ");
					list.get(updateNum - 1).setKorScore();
					System.out.println("������� "+list.get(updateNum-1).getKorScore()+"���� ����Ǿ����ϴ�");
					break;
				case 4:
					System.out.print("������ ����� �Է� : ");
					list.get(updateNum - 1).setEngScore();
					System.out.println("������� "+list.get(updateNum-1).getEngScore()+"���� ����Ǿ����ϴ�");
					break;
				case 5:
					System.out.print("������ ���м��� �Է� : ");
					list.get(updateNum - 1).setMathScore();
					System.out.println("���м����� "+list.get(updateNum-1).getMathScore()+"���� ����Ǿ����ϴ�");
					break;
				case 6:
					System.out.print("������ �̸� �Է� : ");
					list.get(updateNum - 1).setName(sc.next());
					System.out.print("������ �й� �Է� : ");
					list.get(updateNum-1).adminIdNum(sc.nextInt()); 
					System.out.print("������ ����� �Է� : ");
					list.get(updateNum - 1).setKorScore();
					System.out.print("������ ����� �Է� : ");
					list.get(updateNum - 1).setEngScore();
					System.out.print("������ ���м��� �Է� : ");
					list.get(updateNum - 1).setMathScore();
					System.out.println("������ �Ϸ�Ǿ����ϴ�");
					break;
				case 7:
					return;

				}
			}
		}
	}

	private void adminDisplay() {
		int cnt = 0;
		System.out.println("  �̸�\t\t�й�\t\t�����\t�����\t���м���\t����\t\t���");
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
			System.out.println("1. �л� ���� ����");
			System.out.println("2. �л� ���� �߰�");
			System.out.println("3. �л� ���� ����");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. �ڷ� ����");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				adminDisplay(); // ��� �л� ������ ���� (�����ڿ�)
				break;

			case 2:
				add(); // �л� ������ �߰�
				break;

			case 3:
				insert(); // �л� ������ ����
				break;

			case 4:
				delete(); // �л� ������ ����
				break;

			case 5:
				update(); // �л� ������ ����
				break;
			}

		}
	}

	public void studentMode() {
		int num = 0;
		while (true) {
			boolean check = false;
			System.out.println("�� �� ���� ���� ��");
			System.out.print("�й��� �Է��ϼ��� : ");
			num = sc.nextInt();
			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getIdNum() == num) {
					System.out.println("�̸�\t�й�\t\t�����\t�����\t���м���\t����\t\t���");
					System.out.println(list.get(i));
					System.out.println();
					return;
					//�̸��� ������ ����Ʈ�� �����ְ� �й��� �����ϰ� �Ѵ�
				}
			}
			if (!check) {
				System.out.println("�й��� ã�� �� �����ϴ�. �ٽ� �Է��� �ּ���\n");
			}
		}
	}

	public void menu() {

		list.add(new Score("�鼺��", 89, 78, 88));
		list.add(new Score("�̼���", 69, 100, 67));
		list.add(new Score("ȫ�浿", 93, 67, 78));

		String id = "";
		String pw = "";
		int choice = -1;
		while (choice != 0) {
			System.out.println("�������� �ý���");
			System.out.println("1. ������ ���");
			System.out.println("2. �л� ���");
			System.out.println("0. ����");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// ������ ���
				System.out.println("������ ���\n1. �α���\n2. �ڷ� ����");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					while (true) {
						System.out.print("���̵� �Է� : ");
						id = sc.next();
						System.out.print("��й�ȣ �Է� : ");
						pw = sc.next();

						if (checkAdminId(id) && checkAdminPw(pw)) {
							System.out.println("�α��� ����");
							AdminMode();
							break;
						} else if (!checkAdminId(id)) {
							System.out.println("���̵� �߸� �Է��߽��ϴ�.");
						} else if (!checkAdminPw(pw)) {
							System.out.println("�н����带 �߸� �Է��߽��ϴ�.");

						}
					}
				case 2:
					continue;
				}
			case 2:
				// �л� ���
				studentMode();
				break;

			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�");
	}
}
