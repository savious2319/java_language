package productEx;

public class Phone extends Product {
	private String brand;
	private String screen;
	
	public Phone() {
		super("����","����","����", 0);
	}
	
	public Phone(String item, String prod_id, String prod_name, int price,
				 String brand, String screen) {
		super(item, prod_id, prod_name, price);
		this.brand = brand;
		this.screen = screen;
	}
	
	public void phoneInfo() {
		System.out.println("�귣��: "+brand);
		System.out.println("��ũ��: "+screen);
	}
	
	@Override
	public void printProductInfo() {
		super.printProductInfo();
		phoneInfo();
	}
	
}
