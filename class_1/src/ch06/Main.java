package ch06;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// 학생 생성
		Student student1 = new Student(1, "Alice", "alice@example.com");
		Student student2 = new Student(2, "Bob", "BOb@example.com");
		
		// 과정 생성
		Course course1 = new Course(1,  "Math", "introduction to Mathematics");
		Course course2 = new Course(2,  "English", "introduction to English");
		
		// 1번 학생이 Math 과정을 등록함
		Enrollment enrollment1 = new Enrollment(1, student1, course1);
		Enrollment enrollment2 = new Enrollment(2, student2, course2);
		Enrollment enrollment3 = new Enrollment(3, student1, course2);
		
		// 학생의 데이터에 내가 등록한 정보를 저장시킴
//		ArrayList<Enrollment> list = new ArrayList<>();
//		list.add(enrollment1);
//		student1.setEnrollments(list); // 통으로 List 저장
		
		// 학생의 기능 이용
		student1.addEnrollment(enrollment1); // 인덱스 0번
		student1.addEnrollment(enrollment3); // 인덱스 1번
		
		student2.addEnrollment(enrollment2); // 인덱스 0번
		
		// 1. 밥이 신청한 과정의 이름을 화면에 출력하시오.
		System.out.println("밥이 신청한 과정 : ");
		System.out.println(student2.getEnrollments().get(0).getCourse().getName());
		
		// 2. 앨리스가 신청한 과정의 이름을 화면에 출력하시오.
		System.out.println("앨리스가 신청한 과정 : ");
		for (int i = 0; i < student1.getEnrollments().size(); i++) {
			Course course = student1.getEnrollments().get(i).getCourse();
			String courseName = course.getName();
			System.out.println(courseName);
		}		
		// 위 코드는 학생과 과목을 등록 클래스를 통해 연결하는 예제 코드

		// 문제 3
		// enrollment1 학생 정보와 과목 정보를 출력해주세요
		// 학생 이름 : 이름
		// 수강 과목 : 과목 이름

		System.out.println("=====문제3=====");
		String studentName1 = enrollment1.getStudent().getName();
		System.out.println("학생 이름 : " + studentName1);
		String courseName1 = enrollment1.getCourse().getName();
		System.out.println("과목 이름 : " + courseName1);
		System.out.println("==============");
	
		// 문제 4
		// ArrayList를 생성해서 Enrollment 저장해주세요 
		ArrayList<Enrollment> enrollmentArray = new ArrayList<>();
		enrollmentArray.add(enrollment1);
		enrollmentArray.add(enrollment2);
		enrollmentArray.add(enrollment3);
		
		for (Enrollment e : enrollmentArray) {
			System.out.println(e.getStudent().getName());
			System.out.println(e.getCourse().getName());
			System.out.println("=============");
		}
		
		// 문제 5
		// for each 문 써서 앨리스가 수강하고 있는 과목 이름을 다시 출력하시오
		
		System.out.println("앨리스의 수강 과목 : ");
		for (Enrollment e : student1.getEnrollments()) {
			System.out.println(e.getCourse().getName());
		}
		
		
		
	}
	
	

}
