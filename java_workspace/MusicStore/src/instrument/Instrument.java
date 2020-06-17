package instrument;

public class Instrument {
	private String type;
	private int price;
	private int madeYear;
	
	public String getType() {return type;}
	public int getPrice() {return price;}
	public int getMadeYear() {return madeYear;}
	public void setType(String type) {this.type = type;}
	public void setPrice(int price) {this.price = price;}
	public void setMadeYear(int madeYear) {this.madeYear = madeYear;}
	
	public Instrument(String type, int price, int madeYear) {
		this.type = type;
		this.price = price;
		this.madeYear = madeYear;
	}
	
	
	
	
}
