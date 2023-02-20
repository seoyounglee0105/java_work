package ch01;

public class Main {

	public static void main(String[] args) {

		// 자바에서 의존 관계란, 
		// 한 클래스가 다른 클래스를 사용하는 관계
		// 자동차 클래스가 엔진 클래스를 사용한다면, 자동차 클래스는 엔진 클래스에 의존한다고 할 수 있다.
		
		Engine engine = new Engine();
		Car car = new Car(engine);
		
		car.start();
		
		
		
	}

}
