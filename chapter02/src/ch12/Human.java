package ch12;

// 추상 클래스를 상속받을 때

//public abstract class Human extends Animal {  // 1. 추상 메서드를 포함하게 되면 추상 클래스로 만들어주면 됨 (Animal 부모 클래스로부터 추상 메서드를 상속받음)
public class Human extends Animal {

	// 2. 메서드 오버라이드 : 부모 클래스의 추상 메서드를 자식 클래스에서 일반 메서드로 재정의함
	@Override
	public void hunt() {
//		super.hunt(); 
		System.out.println("아는 사람이야!");
	}



	
	
}
