package starcraft;

public class Zealot {
	
	private String name;
	private int power;
	private int hp;
	
	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}
	
	// get() 메서드
	public int getPower() {
		return this.power;
	}
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	
	// 기능 1 : 질럿이 저글링을 공격합니다.  // 저글링들 중 누구를 공격할지 매개변수로 지정
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);
	}
	
	// 기능 2 : 질럿이 마린을 공격합니다.  // 마린들 중 누구를 공격할지 매개변수로 지정
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		marine.beAttacked(this.power);
	}
	
	// 기능 3 : 자기 자신이 공격을 당합니다.  // 자신을 공격하는 대상의 공격력을 매개변수로 지정
	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + "이 사망했습니다.");
			return; // 메서드를 종료시키는 용도
		} 
		System.out.println(this.name + "이 공격을 당합니다");
		this.hp -= power;
	}
	
	// 기능 4 : 상태 창 확인
	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
		System.out.println("===============");
	}
	
}
