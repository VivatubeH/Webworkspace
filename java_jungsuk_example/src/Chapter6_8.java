public class Chapter6_8 {
	public static void main(String[] args) { // args는 지역변수
		// card는 지역 변수
		PlayingCard card = new PlayingCard(1,1);
	}
}

class PlayingCard {
	// 카드마다 다르게 가져야 할 인스턴스 변수
	int kind;
	int num;
	
	// 모든 카드들이 동일하게 가져야 할 클래스 변수
	static int width;
	static int height;
	
	// 생성자.
	PlayingCard(int k, int n) { // k와 n은 지역변수
		kind = k;
		num = n;
	}

}
