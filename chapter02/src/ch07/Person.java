package ch07;

public class Person {

	// this를 사용하는 방법 3가지
	// 1. 자기 자신을 가리킴
	// 2. 생성자에서 다른 생성자를 호출할 수 있음
	// 3. 자신의 주소(참조 값, 주소 값)를 반환할 수 있음
	private String name;
	private int age;
	private String phone;
	private String gender;

	public Person(String name, int age) {
		// 1. 자기 자신을 가리키는 this
		this.name = name;
		this.age = age;
	}

	// 생성자는 객체가 메모리에 올라갈 때 가장 먼저 실행되는 코드
	public Person(String name, int age, String phone) {
		// 2. 생성자에서 다른 생성자를 호출하는 this
		this(name, age);  // == new Person(name, age);
										// 호출한 생성자에서 this.name = name;, this.age = age;가
										// 실행되었으므로 현재 생성자에서는 생략 가능
		this.phone = phone;
	}

	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}

	// 자기 자신을 반환하는 this는 디자인 패턴 중 빌더 패턴을 만들어낼 수 있음
	public Person getPerson() {
		// 3. 자기 자신의 주소 값을 반환하는 this
		return this;
	}

	public void showInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
} // end of Person class

// xxx.java 하나의 파일 안에 여러 개의 클래스를 작성할 수 있음
// 단, xxx.java 하나의 파일 안에 public을 가진 클래스는 단 하나만 선언할 수 있음
// default -> 해당 패키지에 존재하는 클래스들은 모두 접근 가능
class PersonMainTest { // public을 가진 클래스와 java 파일명이 다르면 오류

	// static 메인 함수는 잠시 자리를 빌려서 사용함
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 100);
		person1.showInfo();
	} // end of main
} // end of PersonMainTest class
