public class Chapter6_6 {
	
	// 두 점의 거리를 계산해서 반환하는 메서드
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2)); 
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}
}
