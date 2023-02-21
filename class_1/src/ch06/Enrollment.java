package ch06;

import java.util.ArrayList;

public class Enrollment {

	// 예시
	// 1
	// 홍길동
	// 수학 1
	
	private int enrollmentId;
	private Student student;
	private Course course;
	
	public Enrollment(int enrollmentId, Student student, Course course) {
		this.enrollmentId = enrollmentId;
		this.student = student;
		this.course = course;
	}

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
}
