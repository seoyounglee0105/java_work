package ch12;

// 추상 클래스
// 강제성이 생김 : 추상 메서드를 포함하고 있는 클래스는 반드시 추상 클래스가 되어야 함
public abstract class Animal {

	// 추상 클래스란?
	// 하나 이상의 추상 메서드를 포함하거나 abstract 키워드를 가진 클래스
	
	// 일반 메서드
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	
	// 추상 메서드 (중괄호 {}가 없음)
	public abstract void hunt();
	
	
	
}
