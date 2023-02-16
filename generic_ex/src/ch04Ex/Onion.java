package ch04Ex;

public class Onion extends Food {

	@Override
	public String toString() {
		return "이번 재료는 양파입니다.";
	}
	
	
	@Override
	public void doCooking() {
		System.out.println("냄비에 양파를 넣습니다.");
	
	}
	
}
