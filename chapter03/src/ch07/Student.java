package ch07;

public class Student {

	// 학번과 이름을 정의
	static int num;
	int studentNumber;
	String name;
	
	// 생성자
	public Student(String name) {
		this.name = name;
		num++;
		this.studentNumber = num;  // 생성되는 순서대로 1, 2, 3, ...의 번호를 부여받음
	}
	
	// toString 메서드를 재정의해주세요
	
	@Override
	public String toString() {
		return "[ " + this.studentNumber + "번, " + this.name + " ]";
	}
	
	// equals 메서드를 재정의해주세요
	// 이름이 같다면 동명이인입니다 라고 출력해주세요
	@Override
	public boolean equals(Object obj) {
		// 방어적 코드
		if (obj instanceof Student) {
			Student targetStudent = (Student) obj;
			if (targetStudent.name == this.name) {
				System.out.println("동명이인입니다.");
				return true;
			}
		}
		return false;
	}
	
	// 해쉬코드 메서드 호출해보세요
	
	
	
}
