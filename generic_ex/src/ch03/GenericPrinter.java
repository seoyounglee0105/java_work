package ch03;

// 문법 - how
// 이유 - why
// <> : 다이아몬드 연산자
// -> 안에는 아무 문자나 괜찮지만, 가급적 의미가 있는 약자로 사용하는 편.
public class GenericPrinter<T> {
	
	// 선언 방법

	// T : 대체 문자
	// 대체 문자 : E - element, K - key, V - value(문자열), T - Type
	
	// 제네릭 자료형 선언 : material은 T 자료형으로 선언한 변수이다.
	private T material;   // 접근제어자 대체문자(T) 변수명;
	
	// 제네릭 메서드 정의 : T 자료형을 반환하는 제네릭 메서드이다.
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
}
