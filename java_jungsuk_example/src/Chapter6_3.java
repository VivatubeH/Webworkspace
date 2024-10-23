public class Chapter6_3 {
	public static void main(String[] args) {
		
	}
}

class Student {
	// 예제 6.4를 위해 public으로..
	public String name; // 학생 이름
	public int ban; // 반
	public int no; // 번호
	public int kor; // 국어 점수
	public int eng; // 영어 점수
	public int math; // 수학 점수
	
	// 기본 생성자
	public Student() {
		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// getter, setter 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// 메서드 추가
	
	// getTotal 메서드 ( 국영수 점수를 모두 더해서 반환 )
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	// getAverage 메서드 ( 총점을 과목수로 나눈 평균 반환 )
	public float getAverage() {
		// 총점을 구한다.
		//  예시: 76.875
		int total = this.math + this.eng + this.kor;
		double avg = total / 3.0;
		return (float)((Math.round(avg*10)/10.0));
	}
	
	// info 메서드
	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," +
				getTotal() + "," + getAverage();
	}
}
