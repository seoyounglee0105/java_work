package ch08;

public class Company {
	// 디자인 패턴 - 싱글톤 패턴 : 객체 생성하는 코드의 사례

	// 1. 생성자를 private으로 선언한다.
	private Company() {

	}

	// 2. private + static 자기 자신의 데이터타입을 선언해 준다,
	private static Company company;

	// 3. 외부에서 접근 가능한 static 메서드를 만들어 둔다.
	public static Company getInstance() { // 코딩 컨벤션 : 싱글톤 패턴일 때 메서드명 getInstance

		// 4. 코드를 구현한다.
		if (company == null) {
			company = new Company();
		}
		return company;
		
	}

}
