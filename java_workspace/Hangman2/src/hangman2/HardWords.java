package hangman2;

public class HardWords {

	private String[][] words = { { "GYNECOLOGIST", "PHYSICIST", "ACCOUNTANT", "STUNTMAN", "FLIGHT ATTENDANT" },
			{ "COCKROACH", "MANTIS", "LEOPARD", "RHINOCEROS", "SPOTTED OWL" },
			{ "THE PARENT TRAP", "INFERNAL AFFAIRS", "MISS CONGENIALITY", "MILLION DOLLAR BABY", "BEAUTY AND THE BEAST" },
			{ "KAZAKHSTAN", "SALZBURG", "ISRAEL", "PALERMO", "MADAGASCAR" },
			{ "CARRIAGE", "AMBULENCE", "BULLDOZER", "FORKLIFT", "TOW TRUCK" },
			{ "SIBLING", "RELATIVE", "POLYGAMY", "STEPMOTHER", "MATERNAL GRANDMOTHER" },
			{ "DWAYNE JOHNSON", "PABLO PICASSO", "MIKE POMPEO", "OPRAH WINFREY", "MARK ZUCKERBERG" }, };

	private String[][] meanings = { { "부인과 의사", "물리학자", "회계사", "스턴트맨", "비행기 승무원" },
			{ "바퀴벌레", "사마귀", "표범", "코뿔소", "반점 올빼미" },
			{ "페어런트 트랩", "무간도", "미스 에이젼트", "밀리언 달러 베이비", "미녀와 야수" },
			{ "카자흐스탄", "잘츠부르크\n오스트리아 중서부의 도시, Mozart의 탄생지", "이스라엘", "팔레르모\n이탈리아 Sicily섬 북부의 항구", 
			  "마다가스카르" },
			{ "마차", "구급차", "불도저", "지게차", "견인차" },
			{ "형제자매", "친척", "일부다처제", "의붓어머니", "외할머니" },
			{ "드웨인 존슨(영화배우)", "파블로 피카소(화가)", "마이크 폼페이오(정치가)", "오프라 윈프리(토크쇼 진행자)", 
			  "마크 저커버그(Facebook 설립자)" }, 
			};

	public HardWords(String theme) {
		String[] gameWords = {};
		String[] wordDefinitions = {};
		String gameLevel = "HARD";
		
		new HangmanPlayScreen(gameWords, wordDefinitions, theme, gameLevel);
	}

}
