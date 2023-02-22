package ex09;

public interface Moveable {

	public abstract void left();
	public abstract void right();
	public abstract void up();
	// +++ default 문법 사용해보기 (인터페이스에도 추상 메서드가 아닌 메서드를 정의할 수 있게 됨)
	// 후크 메서드와 동일 (구현부가 있지만, 실행 코드가 없는 것
	// 필요하다면 재정의해서 사용하고, 필요없다면 재정의하지 않아도 됨.
	default public void down() {};
	
}
