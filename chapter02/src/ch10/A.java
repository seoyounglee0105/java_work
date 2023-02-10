package ch10;

public class A {
	String name;
	int height;
	int weight;
	int age;
	int level;
	
	// 코드 테스트
	public static void main(String[] args) {
		C myC = new C();
		myC.age = 100;
		System.out.println(myC.age);
		
	}
	
} // end of A class

class B {
	String name;
	int height;
	int weight;
	int age;
	
	int level;
	String nickName;
	
} // end of B class

// A를 상속받음 (A와 C는 상속 관계)
class C extends A {
	String phone;
	// A에 선언했던 멤버변수들을 C도 가져와서 사용할 수 있음
}
