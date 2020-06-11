package classEx2;

class Type{
	
	private int bunho;
	private String name;
	private int height;
	private double weight;
	
	//getter
	//setter 만들기
	//출력용 메서드 만들기
	
	//alt +shift + s -> r  getter/setter 자동완성 단축키
	
	public int getBunho() {
		return bunho;
	}
	
	public void setBunho(int bunho) {
		this.bunho = bunho;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		if(height > 0) {
		this.height = height;
		}else {
			System.out.println("0보다 큰 수로 입력 해주세요");
		}
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if(weight > 0) {
		this.weight = weight;
		}else {
			System.out.println("0보다 큰 수로 입력 해주세요");
		}
	}
	
	
	public void setData(int bunho, String name, int height, double weight) {
		this.bunho = bunho;
		this.name = name;
		setHeight(height); //this.height = height; 반복하지말고 setter 메서드를 부르자!
		setWeight(weight); //this.weight = weight;
		
	}

	
	public void printType() {
		
		System.out.println("번호 : " + bunho + "\n이름 : " + name + "\n키 : " + height + "\n몸무게 : " + weight);
	}
	
}
 
 
public class ClassTest04 {
	
		
	public static void main(String[] args) {
		
		Type person1 = new Type();
		
//		person1.setBunho(1);
//		person1.setName("백성민");
//		person1.setHeight(178);
//		person1.setWeight(78.8);
		
		
		//setter 메서드 하나 하나를 불러와서 값을 입력하는 것보다 아래 메서드 하나로 한번에 해결할 수 있다
		person1.setData(1,"백성민",178, 78.5);  // 비즈니스 메서드
		
		person1.printType();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

















