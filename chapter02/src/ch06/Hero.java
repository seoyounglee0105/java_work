package ch06;

public class Hero {
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die;  // boolean : get 메서드를 사용할 때 메서드명을 isDie 이런 식으로 쓰는 경우도 많음.
	
	// get 메서드 만들기 5개 (get은 return 키워드가 있어야 함)
	
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public double getDefense() {
		return this.defense;
	}
	public boolean isDie() {
		return this.die;
	}
	
	// set 메서드 만들기 5개 + 방어적 코드 작성 (set은 기본적으로 return 키워드가 필요 없음)
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		if (hp < 0) {
			return;
		}
		this.hp = hp;
	}
	public void setPower(int power) {
		if (power < 0) {
			return;
		}
		this.power = power;
	}
	public void setDefense(double defense) {
		if (defense < 0) {
			return;
		}
		this.defense = defense;
	}
	public void setDie(boolean die) {
		if ((die != true) || (die != false)) {
			return;
		}
		this.die = die;
	}
	
	public void showInfo() {
		System.out.println("====상태창====");
		System.out.println("이름 : " + this.name);
		System.out.println("생명력 : " + this.hp);
		System.out.println("공격력 : " + this.power);
		System.out.println("방어력 : " + this.defense);
		System.out.println("사망 여부 : " + this.die);		
		System.out.println("=============");
	}
	
}
