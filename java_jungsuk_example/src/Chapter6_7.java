class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x, int y) {
		return Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y), 2));
	}
}

public class Chapter6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2, 2));
	}
}
