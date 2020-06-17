package productEx;

public class Phone extends Product {
	private String brand;
	private String screen;
	
	public Phone() {
		super("없음","없음","없음", 0);
	}
	
	public Phone(String item, String prod_id, String prod_name, int price,
				 String brand, String screen) {
		super(item, prod_id, prod_name, price);
		this.brand = brand;
		this.screen = screen;
	}
	
	public void phoneInfo() {
		System.out.println("브랜드: "+brand);
		System.out.println("스크린: "+screen);
	}
	
	@Override
	public void printProductInfo() {
		super.printProductInfo();
		phoneInfo();
	}
	
}
