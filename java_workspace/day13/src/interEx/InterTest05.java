package interEx;

interface Animator {} // markup Interface

class Cinema { // 영화
	private String title;

	public Cinema(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}

class Film extends Cinema {

	public Film(String title) {
		super(title);
	}

}

class Animation extends Cinema implements Animator {

	public Animation(String title) {
		super(title);
	}

}

class MovieWatching {
	static void watchCheck(Cinema[] arCinema) {
		// Film인지, Animation인지 체크하기!
		for (int i = 0; i < arCinema.length; i++) {
			if (arCinema[i] instanceof Animator) { //Animator 마크 인터페이스로 체크한다
				System.out.println(arCinema[i].getClass().getSimpleName() +"의 제목은 " +arCinema[i].getTitle() + "입니다");
			} else if(arCinema[i] instanceof Film){
				System.out.println(arCinema[i].getClass().getSimpleName() +"의 제목은 " +arCinema[i].getTitle() + "입니다");
			}

		}
	}
}

public class InterTest05 {

	public static void main(String[] args) {

		Film ryan = new Film("라이언일병구하기");
		Film iron = new Film("아이언맨");
		Film spider = new Film("스파이더맨");

		Animation digimon = new Animation("디지몬");
		Animation frozen = new Animation("겨울왕국");
		Animation coco = new Animation("코코");

		Cinema[] arCinema = { ryan, digimon, frozen, coco, spider, iron };  // 다형성 대입

		MovieWatching.watchCheck(arCinema); // "~~~제목은 영화입니다
											// "~~~"은 만화입니다.

	}

}
