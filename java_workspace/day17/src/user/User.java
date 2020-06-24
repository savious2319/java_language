package user;

public class User {
	private String id;
	private String pw;
	public User() {}
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	//final�� Ŭ������ ��� �Ǵ���, �� �޼���� ������ ���� �� ��!
	//public ���� �Ǿ� �ֱ� ������, �ڽ� Ŭ������ super.getId() ������ ������ ���� ����
	
	public final String getId() {
		return id;
	}
	public final String getPw() {
		return pw;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "User [id = " + id + ", pw = " + pw + "]";
	}
	
	
	
	
}
