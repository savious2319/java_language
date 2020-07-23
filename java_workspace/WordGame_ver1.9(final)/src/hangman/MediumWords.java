package hangman;

public class MediumWords {

	private String[][] words = { { "PROFESSOR", "FIREMAN", "BUTCHER", "COMEDIAN", "POLICEMAN" },
			{ "DRAGONFLY", "SHRIMP", "GIRAFFE", "LADYBUG", "OSTRICH" },
			{ "HARRY POTTER", "MAD MAX", "BIG", "INCEPTION", "GOODFELLAS" },
			{ "BANGKOK", "KENYA", "AUSTRALIA", "SAN FRANCISCO", "PHILIPPINES" },
			{ "VAN", "BICYCLE", "AIRPLANE", "SUBWAY", "TRUCK" }, { "UNCLE", "AUNT", "GRANDSON", "DAUGHTER", "NEPHEW" },
			{ "PARK GEUN HYE", "KOBE BRYANT", "WINSTON CHURCHILL", "KEN JEONG", "SAM HAMMINGTON" } };

	private String[][] meanings = { { "����", "�ҹ��", "������ ����(�������)", "���׸�", "���� ������" },
			{ "���ڸ�", "����", "�⸰", "�������", "Ÿ��" },
			{ "�ظ�����", "�ŵ�ƽ�", "��", "�μ���", "���� ģ����" },
			{ "����", "��Ű��ź", "ȣ��", "�������ý���", "�ʸ���" },
			{ "������", "������", "�����", "����ö", "Ʈ��" }, { "����, �ܻ���, ����, �̸��", "���, �̸�, (��)����", 
			  "����, �ܼ���", "��", "��ī" },
			{ "�ڱ���", "�ں� ����̾�Ʈ(�� ����)", "������ óĥ(���� ����)", "����(�ǻ�� ��ȭ ���)", "�� �ع���" } };

	public MediumWords(String theme) {
		String[] gameWords = {};
		String[] wordDefinitions = {};
		String gameLevel = "MEDIUM";
		gameWords = words[StartHangman.themes.get(theme)];
		wordDefinitions = meanings[StartHangman.wordDefinitions.get(theme)];
		new HangmanPlayScreen(gameWords, wordDefinitions, theme, gameLevel);
	}
}
