package ch01;

public class Televison extends HomeAppliances {
	
	@Override
	public void turnOn(){
		System.out.println("TV를 킵니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	

	
}
