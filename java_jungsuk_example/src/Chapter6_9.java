public class Chapter6_9 {

}

class Marine {
	int x = 0, y = 0; // 현재 위치
	int hp = 60; // 현재 체력
	
	// 모든 병사들에게 같아야 하는 요소니깐 static으로 한다
	static int weapon = 6; // 공격력
	static int armor = 0; // 방어력
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
