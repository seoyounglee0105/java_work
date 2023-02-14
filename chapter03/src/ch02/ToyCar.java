package ch02;

public class ToyCar implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("장난감 자동차를 킵니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("장난감 자동차를 끕니다.");
		
	}

	
	
}
