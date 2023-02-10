package ch02;

public class MainTest1 {

	public static void main(String[] args) {
//		Student studentKim = new Student();
//		studentKim.grade = 1;
//		studentKim.name = "홍길동";
//		studentKim.number = 1234;
		
		// 생성자 : 객체를 생성할 때 강제성을 부여하는 것
		Student studentKim = new Student("홍길동", 1234, 1);
		System.out.println(studentKim.name);
		System.out.println(studentKim.grade);
		System.out.println(studentKim.number);
		
		
	} // end of main

} // end of class
