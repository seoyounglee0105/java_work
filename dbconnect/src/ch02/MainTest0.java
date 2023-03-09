package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest0 {

	public static void main(String[] args) {
		
		DBClient client = new DBClient();
		Connection conn = client.getConnection();
		try {
			Statement stmt = conn.createStatement();
			
			// 쿼리문 생성, 실행
			String queryStr = "SELECT * FROM student ";
			ResultSet rs = stmt.executeQuery(queryStr); // 결과 집합을 rs에 담음
			
			while (rs.next()) {
				int id = rs.getInt("student_id");
				String name = rs.getString("student_name");
				String grade = rs.getString("grade");
				int schoolId = rs.getInt("school_id");
				System.out.print("id : " + id + "\t");
				System.out.print("name : " + name + "\t");
				System.out.print("grade : " + grade + "\t");
				System.out.print("schoolId : " + schoolId + "\t");
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	} // end of main

}
