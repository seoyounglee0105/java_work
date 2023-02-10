package ch01;

public class Student {

	// 상태 (속성)
	int studentId;
	String studentName;
	String address;
	double height;
	boolean isMarred;

	// 기능 (메서드)
	
	// 기능 1 : 공부
	public void study() {
		System.out.println(studentName + " 학생이 공부를 합니다.");
	}
	
	// 기능 2 : 휴식
	public void breakTime() {
		System.out.println(studentName + " 학생이 휴식을 합니다.");
	}
	
	public void showInfo() {
		System.out.println("=======상태창=======");
		System.out.println("학생의 ID 값은 : " + studentId);
		System.out.println("학생의 이름은 : " + studentName);
		System.out.println("학생의 주소는 : " + address);
		System.out.println("==================");
	}
	
	// 함수와 메서드의 차이점
	// 메서드 (멤버 함수, Member function) 
	// : 객체의 기능을 구현하기 위해서 클래스 내부에 구현되는 메서드
	
	// 결론> 메서드는 자신의 변수를 활용해서 객체의 기능을 구현하는 것
	// 함수보다 명확하고 구체적임
	
	// -------------------------
	// 학생의 기능(메서드) 3가지 정의해보기
	
	public void homework(){
		System.out.println(studentName + " 학생이 숙제를 합니다.");
	}
	
	public void test() {
		System.out.println(studentName + " 학생이 시험을 칩니다.");
	}
	
	public void clean() {
		System.out.println(studentName + " 학생이 청소를 합니다.");
	}
	
	
} // end of class
