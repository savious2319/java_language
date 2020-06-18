package interEx;

interface Animator {} // markup Interface

class Cinema { // ��ȭ
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
		// Film����, Animation���� üũ�ϱ�!
		for (int i = 0; i < arCinema.length; i++) {
			if (arCinema[i] instanceof Animator) { //Animator ��ũ �������̽��� üũ�Ѵ�
				System.out.println(arCinema[i].getClass().getSimpleName() +"�� ������ " +arCinema[i].getTitle() + "�Դϴ�");
			} else if(arCinema[i] instanceof Film){
				System.out.println(arCinema[i].getClass().getSimpleName() +"�� ������ " +arCinema[i].getTitle() + "�Դϴ�");
			}

		}
	}
}

public class InterTest05 {

	public static void main(String[] args) {

		Film ryan = new Film("���̾��Ϻ����ϱ�");
		Film iron = new Film("���̾��");
		Film spider = new Film("�����̴���");

		Animation digimon = new Animation("������");
		Animation frozen = new Animation("�ܿ�ձ�");
		Animation coco = new Animation("����");

		Cinema[] arCinema = { ryan, digimon, frozen, coco, spider, iron };  // ������ ����

		MovieWatching.watchCheck(arCinema); // "~~~������ ��ȭ�Դϴ�
											// "~~~"�� ��ȭ�Դϴ�.

	}

}
