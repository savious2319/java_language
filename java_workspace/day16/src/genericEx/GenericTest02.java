package genericEx;

import java.util.ArrayList;
import java.util.Iterator;

/*
 	제너릭 (Generic)
 	
 	데이터 구조화
 		
 		 이름   국  수  영
 		김철수	10  20  30
 		이순희	11  21  31
 		박문수  12  22  32
 		
 	여러 타입이 복합적으로 구성되어 있을 때,
 	객체 단위로 add시킬 수 있게끔,
 	클래스로 설계해 놓자 : 모델 클래스(Model) 라고 한다!
 								     (jsp의 bean에 해당)
 	그리고, ArrayList의 제너릭에 해당 모델 클래스를 제너릭으로 걸면....
 	ArrayList<내가 만든 모델클래스> list = new ArrayList<>();
 	list에 add() 시킬 때 마다, 내가 만든 클래스의 인스턴스만 추가되게 된다!							
 */
class Student{
	private String name;
	private int bunho;
	
	
	
	public String getName() {return name;}

	public int getBunho() {return bunho;}

	public void setName(String name) {this.name = name;}

	public void setBunho(int bunho) {this.bunho = bunho;}

	public Student(String name, int bunho) {
		super();
		this.name = name;
		this.bunho = bunho;
	}

	//alt + shift+ s => toString() 재정의
	@Override
	public String toString() {
		return "name=" + name + ", bunho=" + bunho;
	}
	
}
public class GenericTest02 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		// list에는 Student 타입의 객체만 add  시킬 수 있게 됐다!
		//list.add(다른 객체 대입 불가!!!!);
		
		list.add(new Student("김철수", 10));
		
		Student std2 = new Student("이순희", 20);
		
		list.add(std2);
		
		System.out.println(list);
		
		//김철수 번호, 이순이 번호의 합
		
		System.out.println(list.get(0).getBunho() + list.get(1).getBunho());
		
		int tmp = 0;
		
		for (int i = 0; i < list.size(); i++) {
			tmp += list.get(i).getBunho();
		}
		System.out.println("김철수 10 + 이순희 20 = "+tmp);
		
		tmp = 0;
		for (Student student : list) {
			tmp += student.getBunho();
		}
		System.out.println("김철수 10 + 이순희 20 = "+tmp);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		Student temp = list.get(0);
		temp = list.get(1);
		
		
		System.out.println(list.get(0).getBunho());
		System.out.println(list.get(1).getBunho());
		
		temp = list.get(0);
		temp.getBunho();
		
		System.out.println(temp.getBunho());
		
		int sum = 0;
		for(Student std : list) {
			sum += std.getBunho();
		}
		System.out.println(sum);
		
		////////////////////////////////////////
		sum = 0;
		//Iterator로 김철수와 이순희 번호 합 구해보기! 
		
		Iterator<Student> iter = list.iterator();
		
		while(iter.hasNext()) {
			Student std = iter.next();  //std는 김철수와 번호를 상징한다!
			sum += std.getBunho();
		}
		System.out.println("김철수 번호 + 이순희 번호 : "+sum);
		
		
		//김철수 라는 사람이 있는지 검색해 보자!
		
		System.out.println("김철수 있니? list : " +list.contains("김철수"));
		System.out.println("김철수 있니? list.첫번째 요소 : " +list.get(0).getName().equals("김철수"));
														//list에서 첫번째 요소 가지고와서 이름을 가지고 그게 "김철수"와 같니 라고 물어보는 것
		
		for (int i = 0; i < list.size(); i++) {
			Student tmp1 = list.get(i);
			if(tmp1.getName().equals("김철수")) {
				System.out.println("김철수" + "가 이미 있어요. 사용할 수 없어요");
				break;
			}else {
				System.out.println("김철수"+"가 없습니다. 사용할 수 있어요");
			}
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			
//			if(list.get(i).getName() == "김철수") {
//				System.out.println("김철수가 있습니다");
//			}
//		}
		
		
		
		//이순희 라는 사람의 이름을 이순이로 변경 해보기
		for (Student student : list) {
			String name = student.getName();
			if(name.equals("이순희")) {
				name = "이순이";
				student.setName(name);
			}else {
				System.out.println("이순이" + "가 없습니다");
			}
		}
		System.out.println(list);
		
		
		
//		list.get(1).setName("이순이");
//		System.out.println(list.get(1).getName());
	}

}





























