public class Chapter6_1 {
	public static void main(String[] args) {
		
	}
}

class SutdaCard {
	private int num;
	private boolean isKwang;
	
	public String info() {
		return num + (isKwang == true ? "K" : "");
	}
	public SutdaCard() {
		this.num = 1;
		this.isKwang = true;
	}
	
	public SutdaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isKwang() {
		return isKwang;
	}

	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
}
