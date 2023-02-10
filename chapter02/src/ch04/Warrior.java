package ch04;

// 전사 클래스 설계하기
public class Warrior {
	
	// 상태
	
	String userName; // 닉네임
	int level; // 레벨
	double exp; // 경험치
	int hp; // 생명력 
	int mp; // 마나
	int gold; // 보유 골드
	
	// 생성자
	public Warrior(String userName) {
		this.userName = userName;
		this.level = 1;
		this.hp = 100;
		this.mp = 50;
	}
	
	// 기능 1 : 상태 창 확인
	public void userInfo() {
		System.out.println("===== 상태창 =====");
		System.err.println("닉네임 : " + this.userName);
		System.err.println("레벨 : " + this.level);
		System.err.println("보유 경험치 : " + this.exp);
		System.err.println("생명력 : " + this.hp);
		System.err.println("마나 : " + this.mp);
		System.err.println("보유 골드 : " + this.gold + "g");
		System.out.println("===== 상태창 =====");
	}
	
	// 기능 2 : 몬스터에게 공격받음
	public void monsterAttack(int damage) {
		System.out.println(damage + " 만큼의 피해를 입었습니다.");
		this.hp -= damage;
		if (this.hp <= 0) {  // 맞아서 hp가 0 이하가 되면 사망하며, 골드/경험치 잃음
			this.exp -= 3;
			this.gold -= 30;
			System.out.println("사망했습니다. 30 골드를 잃어버렸습니다.");
			this.hp = 100;
			if (this.gold < 0) {  // 골드가 음수가 되지 않도록 0으로 초기화
				this.gold = 0;
			}
		} else {
			System.out.println("현재 체력은 " + this.hp + "입니다.");
		}
	}
	
	// 기능 3 : 몬스터를 공격함
	public void userAttack(String skill) {
		if (skill == "베기") {
			if (this.mp < 10) {
				System.out.println("마나가 부족합니다.");
			} else {
				System.out.println(skill + " 스킬을 사용합니다!");
				this.mp -= 10;
			}
		} else if (skill == "내려찍기") {
			if (this.mp < 20) {
				System.out.println("마나가 부족합니다.");
			} else {
				System.out.println(skill + " 스킬을 사용합니다!");
				this.mp -= 20;
			}
		} else if (skill == "평타") {
			System.out.println("그냥 때립니다.");
		}
	}
	
	// 기능 4 : 몬스터를 퇴치함
	public void win(int count) {
		System.out.println("몬스터 " + count + "마리를 잡았습니다!");
		this.exp += 22.2 * count;
		this.gold += 30 * count;
		if (this.exp >= 100) { // 경험치가 100 이상이 되면 레벨업
			this.level++;
			System.out.println("레벨 업! " + this.level + "레벨이 되었습니다.");
			this.exp %= 100; // 100으로 나눈 나머지만 남도록 함
		}
	}
	
} // end of class
