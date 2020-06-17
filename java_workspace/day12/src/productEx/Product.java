package productEx;
/*
 	모델 클래스
 */
public class Product { // 같은 프로젝트안에서 쓸 수 있다
	private String item;
	private String prod_id;
	private String prod_name;
	private int price;
	
	public String getItem() {return item;}
	public String getProd_id() {return prod_id;}
	public String getProd_name() {return prod_name;}
	public int getPrice() {return price;}
	public void setItem(String item) {this.item = item;}
	public void setProd_id(String prod_id) {this.prod_id = prod_id;}
	public void setProd_name(String prod_name) {this.prod_name = prod_name;}
	public void setPrice(int price) {this.price = price;}
	
	public Product(String item, String prod_id, String prod_name, int price) {
		this.item = item;
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.price = price;
	}
	
	public void printProductInfo(){
		
		System.out.println("품목: "+item+"\n품번: "+prod_id+"\n제품명: "+
							prod_name+"\n가격: "+price);
		
	}
	
	
	
}

