package ch11;

public class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		System.out.println("먹이를 먹습니다.");
	}
	
}

// 다형성 : 다
class Human extends Animal {
	
	// 메서드 오버라이드
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	@Override
	public void eating() {
		System.out.println("밥을 먹습니다.");
	}
	
	public void readBooks() {
		System.out.println("책을 읽습니다.");
	}
}

class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걸어요.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	
	
}
