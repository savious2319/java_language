package hangman;

public class EasyWords {
	// ������ ������ �ܾ��
	private String[][] words = {
				{ "DOCTOR", "TEACHER", "CHEF", "WAITER", "DANCER" },
				{ "LION", "FLY", "GOAT", "BUTTERFLY", "FOX" }, 
				{ "TED", "MATRIX", "FROZEN", "LALA LAND", "RING" },
				{ "NEW YORK", "KOREA", "PARIS", "SEOUL", "LA" },
				{ "CAR", "TAXI", "TRAIN", "SHIP", "BUS" },
				{ "DAD", "MOM", "BROTHER", "SISTER", "BABY" },
				{ "DONALD TRUMP", "BILL GATES", "STEVE JOBS", "PSY", "KIM JONG EUN" }
			};
	
	// ������ ������ �ܾ� Ǯ��
	private String[][] meanings = { 
				{ "�ǻ�", "������", "�丮��(�ֹ���)", "������", "�����(��)" },
				{ "����", "�ĸ�", "����", "����", "����" },
				{ "19�� �׵�", "��Ʈ����", "�ܿ�ձ�", "��󷣵�", "��" },
				{ "����", "�ѱ�", "�ĸ�", "����", "������" },
				{ "�ڵ���", "�ý�", "����", "��", "����" },
				{ "�ƺ�", "����", "��, ����, ������", "����, ���, ������", "�Ʊ�" },
				{ "������ Ʈ����", "�� ������", "��Ƽ�� �⽺", "����", "������" }
			};

	// �Ű������� ���õ� ������ �Ѱ� �޴´�
	public EasyWords(String theme) {
		String[] gameWords = {}; // ������ ���õ� �ܾ���� ��� ���ڿ� �迭
		// StartHangmanŬ������ �ִ� HashMap ��ü themes�� �ҷ� key���� ������ �ָ�
		// value�� ���� ������ �ش�. �� ������ words[0], [1], [2]... �� �ҷ����� �ش� �ε��� ��ȣ�� �ܾ����
		// gameWords�� ����
		
		String[] wordDefinitions = {};
		
		String gameLevel = "EASY";
		gameWords = words[StartHangman.themes.get(theme)]; //������ key�� �ָ� value�� �ε��� ��ȣ�� �޴´�
		wordDefinitions = meanings[StartHangman.wordDefinitions.get(theme)];

		
		new HangmanPlayScreen(gameWords, wordDefinitions, theme, gameLevel);

	}

}
