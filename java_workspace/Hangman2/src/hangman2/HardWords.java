package hangman2;

public class HardWords {

	private String[][] words = { { "GYNECOLOGIST", "PHYSICIST", "ACCOUNTANT", "STUNTMAN", "FLIGHT ATTENDANT" },
			{ "COCKROACH", "MANTIS", "LEOPARD", "RHINOCEROS", "SPOTTED OWL" },
			{ "THE PARENT TRAP", "INFERNAL AFFAIRS", "MISS CONGENIALITY", "MILLION DOLLAR BABY", "BEAUTY AND THE BEAST" },
			{ "KAZAKHSTAN", "SALZBURG", "ISRAEL", "PALERMO", "MADAGASCAR" },
			{ "CARRIAGE", "AMBULENCE", "BULLDOZER", "FORKLIFT", "TOW TRUCK" },
			{ "SIBLING", "RELATIVE", "POLYGAMY", "STEPMOTHER", "MATERNAL GRANDMOTHER" },
			{ "DWAYNE JOHNSON", "PABLO PICASSO", "MIKE POMPEO", "OPRAH WINFREY", "MARK ZUCKERBERG" }, };

	private String[][] meanings = { { "���ΰ� �ǻ�", "��������", "ȸ���", "����Ʈ��", "����� �¹���" },
			{ "��������", "�縶��", "ǥ��", "�ڻԼ�", "���� �û���" },
			{ "��Ʈ Ʈ��", "������", "�̽� ������Ʈ", "�и��� �޷� ���̺�", "�̳�� �߼�" },
			{ "ī���彺ź", "�����θ�ũ\n����Ʈ���� �߼����� ����, Mozart�� ź����", "�̽���", "�ȷ�����\n��Ż���� Sicily�� �Ϻ��� �ױ�", 
			  "���ٰ���ī��" },
			{ "����", "������", "�ҵ���", "������", "������" },
			{ "�����ڸ�", "ģô", "�Ϻδ�ó��", "�Ǻ׾�Ӵ�", "���ҸӴ�" },
			{ "����� ����(��ȭ���)", "�ĺ�� ��ī��(ȭ��)", "����ũ �����̿�(��ġ��)", "������ ������(��ũ�� ������)", 
			  "��ũ ��Ŀ����(Facebook ������)" }, 
			};

	public HardWords(String theme) {
		String[] gameWords = {};
		String[] wordDefinitions = {};
		String gameLevel = "HARD";
		
		new HangmanPlayScreen(gameWords, wordDefinitions, theme, gameLevel);
	}

}
