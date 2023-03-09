package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		DBClient client = new DBClient();
		Connection conn = client.getConnection();
		try {
			Statement stmt = conn.createStatement();
			
			// 쿼리문 생성, 실행
			String queryStr = "SELECT * FROM student ";
			ResultSet rs = stmt.executeQuery(queryStr); // 결과 집합을 rs에 담음
			
			while (rs.next()) {
				Student student = new Student(rs.getInt("student_id"), rs.getString("student_name"), 
																			rs.getString("grade"), rs.getInt("school_id"));
				
				list.add(student);
				
//				System.out.println(student);  // 원래는 주솟값이 나와야 하지만, toString을 재정의해서 멤버변수 값들이 나오게 됨
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 원래는 get 메서드로 멤버변수들을 가져와야 하지만, toString 메서드를 재정의해두면 편하게 모든 값 확인 가능
			System.out.println(list.get(i).getName());
		}

	} // end of main
	
} // end of class

class Student {
	private int id;
	private String name;
	private String grade;
	private int schoolId;
	
	public Student(int id, String name, String grade, int schoolId) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.schoolId = schoolId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", schoolId=" + schoolId + "]";
	}
	
	
	
	
}