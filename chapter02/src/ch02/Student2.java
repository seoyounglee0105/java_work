package ch02;

public class Student2 {

	// 생성자 (constructor)
	// 객체를 생성할 때 다음과 같은 모양으로 객체를 만들라고 지시하는 것 (강제성 부여)
	// 생성자는 객체를 생성할 때 반드시 존재해야 함
	
	// 상태 (속성)
	String name;
	int grade;
	

	// this : 자기 자신
	
	// 매개변수를 멤버변수의 이름과 같게 하고,
	// 멤버변수는 this를 통해 구분함
	public Student2(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	
}
