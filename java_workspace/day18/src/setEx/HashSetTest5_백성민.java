package setEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class HashSetTest5_�鼺�� {

	public static void main(String[] args) {
		//�ζ� �����!
		
		// 1~45����, 6���� ������(����)�� ����Ѵ�!
		
		// 6���� ������ HashSet���� �޴´� �ֳ��ϸ� �ߺ��Ǵ� ���� ���� �Է��� ���� �� �ֱ⶧����!
		// HashSet size�� 6�� �ɶ����� ��� ���ѷ����� ������
		// while������ ������!
		
		// 1. �̶�, ������ ������ � �־����� ����� ����!
		
		//      ��� ���� 6�� ä���������� ����� ����
		
		//
		
		Random r = new Random();
		
		HashSet set1 = new HashSet(); //set1�� ���� 6���� ���� ��ü
		HashSet set2 = new HashSet(); //set2�� �ߺ��� ������ ���� ��ü
		int cnt1 = 0; //��ü ī��Ʈ
		int cnt2 = 0; // ������ ���� ���� ī��Ʈ
		int rNum = 0; // ������ ������ ����
//		while(true){
//			rNum = r.nextInt(45)+1;
//			if(!set1.add(rNum)){
//				set2.add(rNum);
//				cnt2++;
//			}
//			cnt1++;
//			if(set1.size() == 6) {
//				break;
//			}
//		}
		while(set1.size() < 6){   //set1.size() < 6 --> set1�� ������ �ε���[0],[1],[2],[3],[4],[5]������ ���´�.
																//[6] < 6 �� while���� ������ 6���� ������ ����Ѵ�
			rNum = r.nextInt(45)+1; //1~45������ ������ rNum�� ���Եȴ�
			if(!set1.add(rNum)){  //ó���� ������ �Էµȴ�
				set2.add(rNum);   //�Է��� �����Ǹ� true�� ���ϵǰ� !�����ڶ����� false�� �Ǽ� if���� ����������
				cnt2++;           //�׸��� cnt1�� �����ȴ�.
			}                     //���� ���� ���ڰ� ������ false�� ���ϵǰ� !�����ڶ����� true�� �Ǽ� if���� ��
			cnt1++;               //set2.add(rNum)�� �Էµǰ� ������ ������ ���� �����ִ� cnt2�� ������ �ȴ�
								  //�׸��� if���� ���ͼ� �ٽ� cnt1�� �ٽ� �����̵ȴ�. �׷��� �� ������� 6���� ä��������
							   	  //�� �� �ִ�
	
		}
		System.out.println("set1(6���� ����) : " + set1 +" \n"+cnt1+"�� ���� �ζǼ��ڰ� ä������");
		System.out.println("set2(������ ����) : " + set2 +" "+cnt2+"��");
		
		
		
		
		// 2. ���� 6�� ���
		// 2-1. ���� �������� ����!
		//Collections.sort �޼���� ���� ���� List���� HashSet���� List Ÿ������ �ٲپ���� �Ѵ�.
		//ListŸ���� (ArrayList)�����ڰ��� set1���� �Ѵ�.
		
		//ArrayList setList = new ArrayList(set1); 
		List setList = new ArrayList(set1); 
		Collections.sort(setList);
		
		
		System.out.println("�ζǹ�ȣ �������� : " +setList);
		
		
		
		
		
		
		
	}

}


















