package classEx2;

class Type{
	
	private int bunho;
	private String name;
	private int height;
	private double weight;
	
	//getter
	//setter �����
	//��¿� �޼��� �����
	
	//alt +shift + s -> r  getter/setter �ڵ��ϼ� ����Ű
	
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
			System.out.println("0���� ū ���� �Է� ���ּ���");
		}
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if(weight > 0) {
		this.weight = weight;
		}else {
			System.out.println("0���� ū ���� �Է� ���ּ���");
		}
	}
	
	
	public void setData(int bunho, String name, int height, double weight) {
		this.bunho = bunho;
		this.name = name;
		setHeight(height); //this.height = height; �ݺ��������� setter �޼��带 �θ���!
		setWeight(weight); //this.weight = weight;
		
	}

	
	public void printType() {
		
		System.out.println("��ȣ : " + bunho + "\n�̸� : " + name + "\nŰ : " + height + "\n������ : " + weight);
	}
	
}
 
 
public class ClassTest04 {
	
		
	public static void main(String[] args) {
		
		Type person1 = new Type();
		
//		person1.setBunho(1);
//		person1.setName("�鼺��");
//		person1.setHeight(178);
//		person1.setWeight(78.8);
		
		
		//setter �޼��� �ϳ� �ϳ��� �ҷ��ͼ� ���� �Է��ϴ� �ͺ��� �Ʒ� �޼��� �ϳ��� �ѹ��� �ذ��� �� �ִ�
		person1.setData(1,"�鼺��",178, 78.5);  // ����Ͻ� �޼���
		
		person1.printType();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

















