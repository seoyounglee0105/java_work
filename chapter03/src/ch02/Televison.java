package ch02;

public class Televison extends HomeAppliances implements RemoteController {
	
	@Override
	public void turnOn(){
		System.out.println("TV를 킵니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	

	
}
