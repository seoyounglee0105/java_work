package ch03;

// Student와 Subject는 포함 관계
public class Student {

	int studentId; // 학번
	int grade; // 학년
	String name; // 이름
	// 참조 타입
	Subject korea; // 국어
	Subject math; // 수학

	// 생성자 //
	public Student(int studentId, int grade, String name) {
		this.studentId = studentId;
		this.grade = grade;
		this.name = name;
		
		// java.lang.NullPointerException 오류 해결을 위해 클래스 내부에서 초기화
		this.korea = new Subject();
		this.math = new Subject();
	}
		
	// 메서드 //
		public void showInfo() {
			System.out.println("**상태창**");
			System.out.println(this.name + " : 입니다.");
			System.out.println(this.grade + " : 학년입니다.");
			System.out.println(this.studentId + " : 번입니다.");
			System.out.println(this.korea.subjectName + "의 점수는 " + this.korea.score);
			System.out.println(this.math.subjectName + "의 점수는 " + this.math.score);
		}
}
