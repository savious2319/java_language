package hangman;

public class EasyWords {
	// 각각의 주제별 단어들
	private String[][] words = {
				{ "DOCTOR", "TEACHER", "CHEF", "WAITER", "DANCER" },
				{ "LION", "FLY", "GOAT", "BUTTERFLY", "FOX" }, 
				{ "TED", "MATRIX", "FROZEN", "LALA LAND", "RING" },
				{ "NEW YORK", "KOREA", "PARIS", "SEOUL", "LA" },
				{ "CAR", "TAXI", "TRAIN", "SHIP", "BUS" },
				{ "DAD", "MOM", "BROTHER", "SISTER", "BABY" },
				{ "DONALD TRUMP", "BILL GATES", "STEVE JOBS", "PSY", "KIM JONG EUN" }
			};
	
	// 각각의 주제별 단어 풀이
	private String[][] meanings = { 
				{ "의사", "선생님", "요리사(주방장)", "종업원", "무용수(댄서)" },
				{ "사자", "파리", "염소", "나비", "여우" },
				{ "19곰 테드", "매트릭스", "겨울왕국", "라라랜드", "링" },
				{ "뉴욕", "한국", "파리", "서울", "엘에이" },
				{ "자동차", "택시", "기차", "배", "버스" },
				{ "아빠", "엄마", "형, 오빠, 남동생", "누나, 언니, 여동생", "아기" },
				{ "도날드 트럼프", "빌 게이츠", "스티브 잡스", "싸이", "김정은" }
			};

	// 매개변수로 선택된 주제를 넘겨 받는다
	public EasyWords(String theme) {
		String[] gameWords = {}; // 주제에 관련된 단어들을 담는 문자열 배열
		// StartHangman클래스에 있는 HashMap 객체 themes를 불러 key값인 주제를 주면
		// value의 값인 정수를 준다. 그 정수가 words[0], [1], [2]... 로 불러져서 해당 인덱스 번호의 단어들이
		// gameWords에 들어간다
		
		String[] wordDefinitions = {};
		
		String gameLevel = "EASY";
		gameWords = words[StartHangman.themes.get(theme)]; //주제를 key로 주면 value로 인덱스 번호를 받는다
		wordDefinitions = meanings[StartHangman.wordDefinitions.get(theme)];

		
		new HangmanPlayScreen(gameWords, wordDefinitions, theme, gameLevel);

	}

}
