package productEx;

public class TV extends Product {
	private String brand;
	private int screenSize;
	
	public String getBrand() {return brand;}
	public int getScreenSize() {return screenSize;}
	public void setBrand(String brand) {this.brand = brand;}
	public void setScreenSize(int screenSize) {this.screenSize = screenSize;}

	public TV() {
		super("없음", "없음", "없음", 0);
	}
	
	public TV(String item, String prod_id, String prod_name, int price,
			  String brand, int screenSize) {
		super(item, prod_id, prod_name, price);
		this.brand = brand;
		this.screenSize = screenSize;
		
	}
	
	public void tvInfo(){
		System.out.println("브랜드: "+brand);
		System.out.println("TV 사이즈: "+screenSize);
	}
	
	@Override
	public void printProductInfo() {
		super.printProductInfo();
		tvInfo();
	}
	
	
	
}
