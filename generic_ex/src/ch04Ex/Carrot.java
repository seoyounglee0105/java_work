package ch04Ex;

public class Carrot extends Food {

	@Override
	public String toString() {
		return "이번 재료는 당근입니다.";
	}
	
	
	@Override
	public void doCooking() {
		System.out.println("냄비에 당근을 넣습니다.");
	
	}

	
	
}
