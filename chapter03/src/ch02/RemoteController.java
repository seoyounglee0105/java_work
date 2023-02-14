package ch02;

public interface RemoteController {
	// 인터페이스의 모든 변수는 public static final (상수)
	// 인터페이스의 모든 메서드는 추상 메서드
	
	// 인터페이스
	// 구현된 것이 아무 것도 없는, 밑그림만 있는 기본 설계도
	
	// 특성
	// 멤버 변수, 일반 구현 메서드를 가질 수 없고, 오직 추상 메서드와 상수만을 멤버로 가질 수 있음
	// 인터페이스는 표준, 약속(강제성이 있는 규칙)
	// 추상클래스보다 추상화 정도가 더 높음 -> 더 유연하게 코드를 설계할 수 있음

	// 추상 클래스와 인터페이스 중 무엇을 선택할것인지에 대해서는 경험적 지식이 필요함
	// 기능 중심으로 밑그림만 -> 인터페이스 추천
	
	public static final int SERIAL_NUMBER = 100; // 상수
	
	
	// 킨다, 끈다라는 기능의 표준이 정해짐
	
	public abstract void turnOn();
//	public abstract void turnOff();
	
	void turnOff(); // abstract 키워드 생략 가능 : 인터페이스는 항상 추상 메서드를 사용한다고 정해져 있기 때문에, 컴파일러가 알아서 추상 메서드라고 인지함
	
	
}
