package vo;

public class QnaCategory {

	private int no;
	private String name;
	
	public QnaCategory() {}
	
	public QnaCategory(int no) {
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "QnaCategory [no=" + no + ", name=" + name + "]";
	}
	
}
