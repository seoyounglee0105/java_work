package starcraft4;

public class Zergling extends Unit implements Attack {
	
	public Zergling(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
	}
	
	@Override
	public void attack(Unit unit) {
		System.out.println(this.name + "이 " + unit.name + "을 날렵하게 벱니다.");
		unit.beAttacked(this.power);
	}
	

	
}
