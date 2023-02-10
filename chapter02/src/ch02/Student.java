package ch02;

public class Student {

	// 생성자 (constructor)
	// 객체를 생성할 때 다음과 같은 모양으로 객체를 만들라고 지시하는 것 (강제성 부여)
	// 생성자는 객체를 생성할 때 반드시 존재해야 함
	
	// 상태 (속성)
	String name;
	int grade;
	int number;
	
	// 생성자 만들어 보기 (사용자 정의 생성자)
	// 생성자는 리턴타입이 없고, 파일 이름과 같음
	// 대문자로 시작하고 있음 : class 이름과 같음
	public Student(String s, int n, int g) {
		name = s;
		number = n;
		grade = g;
	}
	
	// 기본 생성자 : 매개변수가 없음
	// 개발자가 사용자 정의 생성자를 만들지 않았다면,
	// 컴파일러가 자동으로 코드를 넣어줌 
	public Student() {}
	
	
	// 사용자 정의 생성자를 하나라도 만들었다면 컴파일러는 기본 생성자를
	// 만들어주지 않는다
	
	//	 생성자는 여러 개 만들 수 있음
	// ==> 생성자 오버로딩 : 생성자를 여러 개 만들어 두는 기법
	
}
