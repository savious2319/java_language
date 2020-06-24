package user;

import java.util.ArrayList;
import java.util.Scanner;

public class UserField {
	
	private ArrayList<User> list = new ArrayList<>(); //�ܺο��� ȣ���� �ʿ䰡 ��� private�� �տ� ��
	private static final int KEY_CODE = 3;  //��ȣȭ, ��ȣȭ �� �� ����� Ű��!
	
	
	//�ߺ� �˻�
	public User checkId(String id) {
		/*����Ʈ ��� �߿��� id�� ������ ��, �Ű����� id�ϰ� ���Ѵ�!
		������ id�� �ִ� ��Ҹ� �߰��ϸ�, �� ��Ҹ� �����ϰ� �ȴ�.
		������ null ���� ���ϵȴ�.*/
		User user = null;
		
		//����Ʈ���� �ϳ��� �������⸦ �ݺ��Ѵ�! - ���� for��
		//��� �ϳ��� �����ö����� tmp�� ���� �ǰ�,
		//tmp���� id�� ������ �ڿ�, �Ű����� id�ϰ� ������!
		for (User tmp : list) {
			if(tmp.getId().equals(id)){ // <-- ������ id�� �����ϴ� �ν��Ͻ� (tmp)
				user = tmp;				// �� �ν��Ͻ��� ��ȯ ��Ű��!
			}
		}
		
		return user;					// ���� ������ id�� ���ٸ�, null ���� ���ϵȴ�!
		
	}
	
	//ȸ������
	private boolean join(User user) {
		//1. id�� null�̰ų� ���ڿ�
		if(checkId(user.getId())== null) {  // checkId() �޼���� ������ ���̵� �ִٸ�, �� ��ü��
											// �ٰ��̰�, ������ ���̵� ���ٸ�, null ��ü�� ��ȯ�� ���̴�!
			
			
			//null �̱� ������ !!-> ������ ��ų �� �ְԵƴ�! list.add(�ش� �ν��Ͻ�)
			//list.add(user);  �ϱ� ����!!!! pw�� ��ȣȭ ����! ������ ������ �����ؼ� �˾ƺ��� ���� �������� pw�� ������Ѿ� �Ѵ�
																											//->encrypt()
			user.setPw(encrypt(user.getPw()));
			
			list.add(user); //list�� �ϼ��� user�� �����Ų��! ���� �������� list!!
			
			return true; //ȸ�������� �ƾ��!!!!
			
		}
		return false; //ȸ�������� ���еƾ�� -> ��? -> id�� �ߺ��Ʊ� ������!!! �������ؼ�? : checkId()�� ���ؼ� �˰� ����!
					  //checkId�� ����Ÿ���� User Ÿ�� ��ü Ÿ��!!! �ν��Ͻ��� ������ ȸ������ ���� ���θ� Ȯ���ϴ� �Ŵ�!!
	}
	
	//�α���
	public boolean login(String id, String pw) {
		
		User user = checkId(id);
		
		//1. user�� ���̶�� �� -> ���̵� ���ٶ�� ��!
		if(user != null) {
			
			//�н����� ��
			//����Ʈ�� �ִ� getPw()�� �Ű����� pw�� ���ؾ� �Ѵ�!
			//������ ����Ʈ�� �ִ� getPw()�� enc �� pw�̴�!
			//���� �Ű����� pw�� ���ϱ� ����...
			//decrypt() �޼��带 ���ؼ� ��ȭ�� �����ͷ�, pw�� ���ؾ� �Ѵ�!
			
			//1. list���� checkId �� ���� �� ��ü�� ����� �ִ��� �ε��� �� ��������!
			//2. �� �ν��Ͻ����� ����� ��������
			//3. �� ����� decrypt ����
			//4. decrypt�� �����͸� pw�� ������!
			//1~4���� �ѹ������� if���� ����!
			//decrypt(user.getPw()).equals(pw);
			if(decrypt(list.get(list.indexOf(user)).getPw()).equals(pw)) {
			//	(4)			(3)			(1)         (2)       (5)
			
			return true;
			}
		}
		
		return false; //�α��� ����! -> 1. ���̵� ���� �� 2. id�� pw�� �ٸ���,
	}
	
	//��ȣȭ
	public String encrypt(String pw) {
		String enc_pw = "";
		
		//pw�� ����ִ� ���� pw�� Ư�� ���� �ο��ؼ� ��ȯ ��Ű��!
		//pw�� ���ڿ��� ���ڴ����� �߶󳻼�, ���� Ư����(key��)�� �����Ű�� �ȴ�!
		//���ڴ����� ������ �ڵ尪�� �ִµ�, �ڵ尪���� Ű���� ����Ǿ�,
		//���ڿ��� �����Ű�� �����ϰ��� �ϴ� ��ȣ������ ó���ȴ�.
		//�̶�, key ���� "��ȣȭ" �� ���� �ʿ��ϴϱ�...
		//�ν��Ͻ� ����� �� ����!
		
		//pw�� ���ڿ��� ���ڴ����� �����ͼ� KEY_CODE�� ������!
		//�׸��� enc_pw�� �����Ű��!
		
		for (int i = 0; i < pw.length(); i++) {
			enc_pw	+= (char)(pw.charAt(i) * KEY_CODE); 
		}
		System.out.println("���� ��ȣ : "+pw+", enc��ȣ : " + enc_pw);
		return enc_pw;
	}
	
	//��ȣȭ
	public String decrypt(String enc_pw) {
		//String dec_pw; // dec_pw�� null �� ���� �ȴ�. += ������ �� ��, null12345 ������ null���� ����!!!
		String dec_pw = "";  // �������� �ʱ�ȭ�� ���ϸ� null ���� ����! 
		
		for (int i = 0; i < enc_pw.length(); i++) {
			dec_pw += (char)(enc_pw.charAt(i) / KEY_CODE);
		}
		System.out.println("enc��ȣ : "+ enc_pw+", dec��ȣ : "+dec_pw);
		return dec_pw;
	}
	
	//����
	public void init() {
	
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		//���ο� ȸ�� ���� �Է�
		//ȸ�� ���̵� �˻� ��
		User user = null;
		while(true) {
			user = new User();
			
			System.out.println("1. ȸ������\n2. �α���\n3. ����");
			choice = sc.nextInt();
			
			if(choice == 3) break;
			
			switch(choice) {
			case 1: //ȸ������ - id, pw
				//�Է½� ������ �� �� �ִ�(NumberFormatException ��...)
				//�̶�, ���α׷��� �ߴ� �� �� �ֱ⶧����,
				//�̿�, �ߴ��� ������Ű��! -> try catch�� �����Ѵ�!
				try {
					System.out.print("���̵�(����) : ");
					user.setId(sc.next());
					
					System.out.print("��й�ȣ : ");
					user.setPw(sc.next());
					
					//System.out.println(user); // �Է��� �ߵƴ��� �׽�Ʈ��
					
				} catch (Exception e) {
					System.out.println("������ �ٽ� �Է����ּ���");
					continue; //ù �޴����� �ٽ� �����ֱ�
				}
				
				//�Էµ� ������ user ��ü�� ����ִ�.
				//�� ��ü�� join()�� ������ ȸ�� ���� ���� ���θ� �Ǵ�����!
				if(join(user)) {
					System.out.println("ȸ�� ���� ����");
				}else {
					System.out.println(user.getId()+"�� �ߺ� ���̵� �Դϴ�");
				}
				break;
				
			case 2: //�α���
				//id�ϰ� pw�� �Է�
				//list�� ����� �����Ͷ� ���Ѵ�
				//id�ϰ� pw�� login() �޼��忡 ������
				try {
					System.out.print("���̵�(����) : ");
					user.setId(sc.next());
					
					System.out.print("��й�ȣ : ");
					user.setPw(sc.next());
					
					//System.out.println(user); // �Է��� �ߵƴ��� �׽�Ʈ��
					
				} catch (Exception e) {
					System.out.println("������ �ٽ� �Է����ּ���");
					continue; 
				}
				
				if(login(user.getId(), user.getPw())) {
					System.out.println("�α��� ����");
				}else {
					System.out.println("���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ���� �ּ���!");
				}
				break;
			}
			
			
			
		}//end of while
		System.out.println("���α׷� �����մϴ�");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
