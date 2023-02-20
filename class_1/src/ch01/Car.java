package ch01;

public class Car {
	
	// 엔진은 자동차에 포함됨 (포함 관계)
	// 자동차는 엔진에 의존함 (의존 관계)
	private Engine engine;
	
	// 자동차 클래스는 엔진 클래스에 의존한다.
	// 엔진 클래스가  있어야 자동차 클래스를 생성할 수 있다.
	public Car(Engine engine) {
		
		this.engine = engine;
		
	}
	
	public void start() {
		
		engine.start();
		System.out.println("Car started");
	}
}
