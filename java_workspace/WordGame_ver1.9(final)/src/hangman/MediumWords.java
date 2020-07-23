package hangman;

public class MediumWords {

	private String[][] words = { { "PROFESSOR", "FIREMAN", "BUTCHER", "COMEDIAN", "POLICEMAN" },
			{ "DRAGONFLY", "SHRIMP", "GIRAFFE", "LADYBUG", "OSTRICH" },
			{ "HARRY POTTER", "MAD MAX", "BIG", "INCEPTION", "GOODFELLAS" },
			{ "BANGKOK", "KENYA", "AUSTRALIA", "SAN FRANCISCO", "PHILIPPINES" },
			{ "VAN", "BICYCLE", "AIRPLANE", "SUBWAY", "TRUCK" }, { "UNCLE", "AUNT", "GRANDSON", "DAUGHTER", "NEPHEW" },
			{ "PARK GEUN HYE", "KOBE BRYANT", "WINSTON CHURCHILL", "KEN JEONG", "SAM HAMMINGTON" } };

	private String[][] meanings = { { "교수", "소방관", "정육점 주인(도살업자)", "개그맨", "남자 경찰관" },
			{ "잠자리", "새우", "기린", "무당벌레", "타조" },
			{ "해리포터", "매드맥스", "빅", "인셉션", "좋은 친구들" },
			{ "방콕", "파키스탄", "호주", "샌프란시스코", "필리핀" },
			{ "승합차", "자전거", "비행기", "지하철", "트럭" }, { "삼촌, 외삼촌, 고모부, 이모부", "고모, 이모, (외)숙모", 
			  "손자, 외손자", "딸", "조카" },
			{ "박근혜", "코비 브라이언트(농구 선수)", "윈스턴 처칠(영국 수상)", "켄정(의사겸 영화 배우)", "샘 해밍턴" } };

	public MediumWords(String theme) {
		String[] gameWords = {};
		String[] wordDefinitions = {};
		String gameLevel = "MEDIUM";
		gameWords = words[StartHangman.themes.get(theme)];
		wordDefinitions = meanings[StartHangman.wordDefinitions.get(theme)];
		new HangmanPlayScreen(gameWords, wordDefinitions, theme, gameLevel);
	}
}
