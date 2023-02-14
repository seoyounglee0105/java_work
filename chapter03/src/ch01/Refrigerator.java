package ch01;

public class Refrigerator extends HomeAppliances {

	@Override
	public void turnOn(){
		System.out.println("냉장고를 킵니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다.");
	}
	
	
}
