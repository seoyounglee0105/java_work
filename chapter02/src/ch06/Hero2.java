package ch06;

public class Hero2 {
	
	// 많이 실수하는 부분
	
	// 1.  변수 선언에 연산식을 바로 사용할 수 없음
	// -> 메서드 안이나 생성자 안에서 연산 가능
	
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die;  // boolean : get, set 메서드를 사용할 때 메서드명을 isDie 이런 식으로 쓰는 경우도 많음.
	
	// 2. 메서드 선언을 중첩으로 할 수 없음 (메서드 안에 메서드 선언 불가능) -> 중괄호 범위를 잘 확인해야 함
	
//	public String getName() {
//		public void printArticle() {
//			
//		}
//		return this.name;
//	}
	
	// 3. 생성자에는 선언부에 리턴 타입이 없음
	
	/////
	
	// 클래스 스코프 안에 사용할 수 있는 문법 : 변수, 생성자, 메서드, 함수, 내부 클래스

	// 함수 사용 가능 -> 클래스 스코프 범위 밖에는 문법을 작성할 수 없음
	private static int addNumber(int n1, int n2) {
		return n1 + n2;
	}
	
	
	
}
