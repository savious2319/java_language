package genericEx;

import java.util.ArrayList;
import java.util.Iterator;

/*
 	���ʸ� (Generic)
 	
 	������ ����ȭ
 		
 		 �̸�   ��  ��  ��
 		��ö��	10  20  30
 		�̼���	11  21  31
 		�ڹ���  12  22  32
 		
 	���� Ÿ���� ���������� �����Ǿ� ���� ��,
 	��ü ������ add��ų �� �ְԲ�,
 	Ŭ������ ������ ���� : �� Ŭ����(Model) ��� �Ѵ�!
 								     (jsp�� bean�� �ش�)
 	�׸���, ArrayList�� ���ʸ��� �ش� �� Ŭ������ ���ʸ����� �ɸ�....
 	ArrayList<���� ���� ��Ŭ����> list = new ArrayList<>();
 	list�� add() ��ų �� ����, ���� ���� Ŭ������ �ν��Ͻ��� �߰��ǰ� �ȴ�!							
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

	//alt + shift+ s => toString() ������
	@Override
	public String toString() {
		return "name=" + name + ", bunho=" + bunho;
	}
	
}
public class GenericTest02 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		// list���� Student Ÿ���� ��ü�� add  ��ų �� �ְ� �ƴ�!
		//list.add(�ٸ� ��ü ���� �Ұ�!!!!);
		
		list.add(new Student("��ö��", 10));
		
		Student std2 = new Student("�̼���", 20);
		
		list.add(std2);
		
		System.out.println(list);
		
		//��ö�� ��ȣ, �̼��� ��ȣ�� ��
		
		System.out.println(list.get(0).getBunho() + list.get(1).getBunho());
		
		int tmp = 0;
		
		for (int i = 0; i < list.size(); i++) {
			tmp += list.get(i).getBunho();
		}
		System.out.println("��ö�� 10 + �̼��� 20 = "+tmp);
		
		tmp = 0;
		for (Student student : list) {
			tmp += student.getBunho();
		}
		System.out.println("��ö�� 10 + �̼��� 20 = "+tmp);
		
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
		//Iterator�� ��ö���� �̼��� ��ȣ �� ���غ���! 
		
		Iterator<Student> iter = list.iterator();
		
		while(iter.hasNext()) {
			Student std = iter.next();  //std�� ��ö���� ��ȣ�� ��¡�Ѵ�!
			sum += std.getBunho();
		}
		System.out.println("��ö�� ��ȣ + �̼��� ��ȣ : "+sum);
		
		
		//��ö�� ��� ����� �ִ��� �˻��� ����!
		
		System.out.println("��ö�� �ִ�? list : " +list.contains("��ö��"));
		System.out.println("��ö�� �ִ�? list.ù��° ��� : " +list.get(0).getName().equals("��ö��"));
														//list���� ù��° ��� ������ͼ� �̸��� ������ �װ� "��ö��"�� ���� ��� ����� ��
		
		for (int i = 0; i < list.size(); i++) {
			Student tmp1 = list.get(i);
			if(tmp1.getName().equals("��ö��")) {
				System.out.println("��ö��" + "�� �̹� �־��. ����� �� �����");
				break;
			}else {
				System.out.println("��ö��"+"�� �����ϴ�. ����� �� �־��");
			}
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			
//			if(list.get(i).getName() == "��ö��") {
//				System.out.println("��ö���� �ֽ��ϴ�");
//			}
//		}
		
		
		
		//�̼��� ��� ����� �̸��� �̼��̷� ���� �غ���
		for (Student student : list) {
			String name = student.getName();
			if(name.equals("�̼���")) {
				name = "�̼���";
				student.setName(name);
			}else {
				System.out.println("�̼���" + "�� �����ϴ�");
			}
		}
		System.out.println(list);
		
		
		
//		list.get(1).setName("�̼���");
//		System.out.println(list.get(1).getName());
	}

}





























