package ch11;

public class Hero {
	// 멤버변수
	protected String name; // 같은 패키지 내 클래스 or 자식 클래스들 접근 가능
	int hp;
	
	// 생성자
	public Hero(String name, int hp) {
		System.out.println("Hero 클래스를 생성합니다.");
		this.name = name;
		this.hp = hp;
	}
	
	// 메서드
	void attack() {
		System.out.println(this.name + "가 기본 공격을 합니다.");
	}
	
	public static void main(String[] args) {
		Warrior warrior = new Warrior("야스오", 100);
		warrior.attack();
		warrior.comboAttack();
		
		// 메서드 오버로딩
		//	 System.out.println();도 메서드 오버로딩의 예시임 (매개변수로 다양한 자료형의 값을 받음)		
		Archer archer = new Archer("궁수", 15);
		archer.attack();
		
		Wizard wizard = new Wizard("마법사", 10);
		wizard.attack();
		
	}
	
} // end of Hero class

class Warrior extends Hero {
	
	// super() 는 상속받은 바로 위 클래스의 생성자를 호출하게 됩니다. 
	// super(x, y) 는 this 의 파라미터 넘기는 함수처럼 상속받은 클래스에서 
	// 동일한 파라미터 객체를 가진 함수를 호출합니다
	//---------------------------------------
	// 자식 클래스의 생성자를 구현할 때,
	// 부모 클래스에 사용자 정의 생성자가 있다면
	// 부모 생성자를 반드시 가장 먼저 호출해야 한다
	
	public Warrior(String name, int hp) {
//		System.out.println("1000"); // <- 오류 발생 : 부모 생성자가 있다면, 가장 먼저 호출해야 함
		super(name, hp); // 부모 생성자 호출
		System.out.println("1000"); // <- 오류 x
	}

//	public Warrior() {
//		super("전사", 100);
//	}
	
	public void comboAttack() {
		System.out.println(this.name + "가 콤보 어택 스킬을 씁니다");
	}
}

class Archer extends Hero {
	
	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void fireArrow() {
		System.out.println(this.name + "가 파이어애로우 스킬을 씁니다.");
	}
}

class Wizard extends Hero {
	
	public Wizard(String name, int hp) {
		super(name, hp);
	}

	public void freezing() {
		System.out.println(this.name + "가 프리징 스킬을 씁니다.");
	}
}
