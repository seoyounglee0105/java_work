package ch10;

public class Cal {

	public int sum(int n1, int n2) {
		return n1 + n2;
		
	}


	public int multiply(int n1, int n2) {
		System.out.println("부모 메서드");
		return n1 * n2;
	}

	// 코드 테스트
	public static void main(String[] args) {
		Cal2 cal2 = new Cal2();
		// cal2(자식클래스)에 multiply 메서드가 있는지 먼저 확인함
		// -> cal2(자식클래스)에 해당 메서드가 없다면 부모클래스에 있는 메서드를 확인함
		// 부모의 메서드 multiply를 재정의한다면 오버라이드라고 함
		
		// 부모 클래스가 메모리에 로드되지도 않았는데 부모 메서드가 호출됨
		// -> 생성자가 동작할 때 extends 키워드를 확인하면
		// 상속 관계의 클래스도 함께 자동으로 메모리에 로드함
		System.out.println(cal2.multiply(0, 100));
		
	}
} // end of Cal class

	class Cal2 extends Cal {
		public int minus(int n1, int n2) {
			return n1 - n2;
		}
	
	// 메서드 오버 로딩 : 매개변수의 조합이 다른, 같은 이름의 메서드 여러 개 구현
	
	// 오버 라이드 (!= 오버 로딩)
	// 부모에 있는 메서드를 재정의함
	// 조건 : 메서드 모양이 똑같아야 함

//	public int multiply(int n1, int n2) {
//		System.out.println("자식 메서드");
//		if (n1 == 0 || n2 == 0) {
//			System.out.println("0을 입력했습니다");
//		}
//		return n1 * n2;
//	}
	
	@Override  // 어노테이션 : 주석 + 힌트
	public int sum(int n1, int n2) {
		System.out.println("n1 : " + n1 + "을 입력했습니다.");
		return super.sum(n1, n2);
	}
	
}