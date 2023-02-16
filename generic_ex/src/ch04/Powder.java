package ch04;

public class Powder extends Material {
	
	
	
	// Object 클래스의 toString을 오버라이드해서 사용하기
	@Override
	public String toString() {
		return "재료는 파우더입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 출력합니다.");
		
	}
	
}
