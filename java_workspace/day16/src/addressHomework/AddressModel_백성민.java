package addressHomework;


class Address {

	String si;
	String gu;
	String dong;
	int bunji;

	public String getSi() {
		return si;
	}

	public String getGu() {
		return gu;
	}

	public String getDong() {
		return dong;
	}

	public int getBunji() {
		return bunji;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public void setGu(String gu) {
		this.gu = gu;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public void setBunji(int bunji) {
		this.bunji = bunji;
	}

	public Address() {

	}

	public Address(String si, String gu, String dong, int bunji) {
		super();
		this.si = si;
		this.gu = gu;
		this.dong = dong;
		this.bunji = bunji;
	}
	
	@Override
	public String toString() {
		return si + " " + gu + " " + dong + " " + bunji;

	}
	
}
