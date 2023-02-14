package ch01;

public abstract class HomeAppliances {
	
	int width;
	int height;
	String color;
	
	// 각 전자제품이 구현할 기능이 다를 수 있으므로 추상 메서드로 선언
	
	public abstract void turnOn();
	
	public abstract void turnOff();
	
}
