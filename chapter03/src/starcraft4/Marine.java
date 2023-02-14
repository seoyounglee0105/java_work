package starcraft4;

public class Marine extends Unit implements Attack {
	
	/**
	 * @author 이서영
	 */
		
	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
	}

	@Override
	public void attack(Unit unit) {
		System.out.println(this.name + "이 " + unit.name + "에게 발포합니다.");
		unit.beAttacked(this.power);
	}

}
