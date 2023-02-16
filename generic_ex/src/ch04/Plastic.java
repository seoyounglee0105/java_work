package ch04;

public class Plastic extends Material {

	
	
	// Object 클래스의 toString을 오버라이드해서 사용하기
	@Override
	public String toString() {
		return "재료는 플라스틱입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다.");
		
	}
	
}
