package starcraft4;

// 상속 개념을 활용해서 기존 코드를 리팩토링함.

public class Unit {

	// 멤버변수
	protected String name;
	protected int power;
	protected int hp;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	// 기능 : 자기 자신이 공격을 당합니다.  // 자신을 공격하는 대상의 공격력을 매개변수로 지정
	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + "이 사망했습니다.");
			return; // 메서드를 종료시키는 용도
		} 
		System.out.println(this.name + "이 공격을 당합니다");
		this.hp -= power;
	}
	
	// 기능 : 상태 창 확인
	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
		System.out.println("===============");
	}
	
	
	
}
