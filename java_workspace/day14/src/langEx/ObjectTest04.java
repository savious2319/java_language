package langEx;

/*
 	Object 클래스
 	-equals()
 	-hashCode()
 	-toString()
 */
class Member {
	String name;
	long juminbunho; // 생년월일까지만!

	public Member(String name, long juminbunho) {
		super();
		this.name = name;
		this.juminbunho = juminbunho;
	}

	@Override
	public int hashCode() {
		
		return this.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj !=null && obj instanceof Member) {
			return this.name.equals((((Member)obj).name));
			//return this.juminbunho == ((Member)obj).juminbunho;
		} else {
			return false;
		}
	}

}

public class ObjectTest04 {

	public static void main(String[] args) {
		Member m1 = new Member("홍길동", 9010101061234L);
		Member m2 = new Member("이순신", 9010101061234L);

		// m1과 m2는 같은 회원 입니까? 네 같은 회원 입니다. 왜요? 주민번호가 같아요~
		//m2는 이미 정보가 있기 때문에 가입할 수 없어요~
		if (m1.equals(m2)) {
			System.out.println("같은 회원 : 가입할 수 없어요");
		}else {
			System.out.println("회원 정보 없음 : 가입할 수 있습니다");
		
		}

	}

}















