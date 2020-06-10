package inputEx;

import javax.swing.JOptionPane;

/*
 	대화상자를 이용해 값 입력받기
 	
 	문1) 자동차 변수 3개 만들고 출력해 보세요.
 	
 	문2) 사람 정보를 입력받아 보세요
 */
public class InputTest02_2 {

	public static void main(String[] args) {
		String carInfo = "차 정보";
		int price = Integer.parseInt(JOptionPane.showInputDialog(carInfo + "\n" + "차 가격 입력(만원 단위)"));
		System.out.println("차 차격 : "+price +"원");
		String brand = (JOptionPane.showInputDialog("브랜드 입력"));
		System.out.println("차 브랜드 : "+brand);
		String type = (JOptionPane.showInputDialog("차종 입력"));
		System.out.println("차종 : "+type);
		
		
		
		String info = "사람 정보";
		char gender = JOptionPane.showInputDialog(info + "\n" + "성별 입력(남자/여자)").charAt(0);
		System.out.println("성별 : "+ gender);
		int age = Integer.parseInt(JOptionPane.showInputDialog("나이 입력"));
		System.out.println("나이 : "+ age+"살");
//		JOptionPane.showMessageDialog(null, gender);


	}

}
