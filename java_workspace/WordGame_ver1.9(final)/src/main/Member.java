package main;


public class Member {
	
	//�г���, ��� ��, �ƹ� ��
	String nickname;
	String id;
	String pw;

	public static int hunmin_win;
	public static int hunmin_play;
	public static String hangman_record = "";
	
	public Member() {
	}

	public Member(String nickname, String id, String pw) {
		this.nickname = nickname;
		this.id = id;
		this.pw = pw;
	}
	
	
}


