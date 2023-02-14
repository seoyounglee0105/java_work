package starcraft4;

public class Zealot extends Unit implements Attack {
	
	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	@Override
	public void attack(Unit unit) {
		System.out.println(this.name + "이 " + unit.name + "을 무자비하게 찌릅니다.");
		unit.beAttacked(this.power);
	}
	
	
	
}
