package addressHomework;

/*
 	주소 찾기 예제
 	예전) 배열에 5개의 주소를 입력해 놓고 시작했다!
 	
 	=> 기본 2줄 주소값 입력해 놓기
 		서울시 강남구 강남동 111
 		서울시 서초구 서초동 222
 		
 	=> 3번째 부터는 추가할 수 있다!
 	
 	=> 모델클래스 
 	class Address{
 		String si;
 		String gu;
 		String dong;
 		int bunji;		// 111, 222, 333, 444...
 	
 		// equals(), contains()
 		searchDong(){}		// 입력 : 00동 -> 번지는 몇 번지 입니다!
 		
 		// add()
 		insertDong(){}		// 새로운 주소 추가 -> 시를 입력하세요
 												-> 구를 입력하세요
 												-> 동을 입력하세요
 												-> 번지를 입력하세요
 		// set()										
 		update(){}			// 기존 주소 수정	-> 00시 수정 : 
 												-> 00구 수정 :
 												-> 00동 수정 :
 												-> 00번지 수정 :
 		//remove()										
 		delete(){}			// 기존 주소 삭제
 		
 		//빠른for문 toString() 오버라이딩
 		allAddress(){}		// 모든 주소 보기
 		}
 		
 	=> ArrayList<Address> list = new ArrayList<Address>();
 		list.add(강남구 강남동);
 		list.add(서초구 서초동);
 		
 		
 */


public class AddressMain_백성민 {

	public static void main(String[] args) {
		
		new AddressController().menu();

	}

}
