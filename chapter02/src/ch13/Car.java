package ch13;

// 템플릿 메서드 패턴 구현
// 핵심 : run() 메서드

public abstract class Car {

	// 추상 클래스 : 자식 클래스에서 각자에게 필요한 기능으로 구현하라는 뜻 (부모 클래스에서는 기능 구현 x)
	public abstract void drive();
	public abstract void stop();
	
	private void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	private void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	public abstract void wiper();
	
	// 후크 메서드 : 실행의 흐름에 넣어둘 테니, 필요하면 사용하라
	public void washCar() {
		// 아무 것도 구현하지 않음 -> 일반 메서드
	}
	
	
	// 실행의 흐름을 만들어 둠
	final public void run() {
		// 메서드 앞 final : 해당 메서드를 재정의할 수 없게 만듦
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
