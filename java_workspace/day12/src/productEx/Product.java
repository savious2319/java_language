package productEx;
/*
 	�� Ŭ����
 */
public class Product { // ���� ������Ʈ�ȿ��� �� �� �ִ�
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
		
		System.out.println("ǰ��: "+item+"\nǰ��: "+prod_id+"\n��ǰ��: "+
							prod_name+"\n����: "+price);
		
	}
	
	
	
}

