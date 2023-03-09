package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest2 {

	public static void main(String[] args) {
		
		DBClient dbClient = new DBClient();
		
		// static으로 정의해서, 클래스 이름으로도 접근 가능
		DBClient.setDB_NAME("showdb");
		
		// 자료 구조 선언, 담을 데이터를 클래스로 모델링하기
		ArrayList<Customer> list = new ArrayList<>();
		
		Connection conn = dbClient.getConnection();
		
		try {
			Statement stmt = conn.createStatement();
			
			String queryStr = "SELECT * FROM usertbl";
			ResultSet rs = stmt.executeQuery(queryStr); // SELECT 문을 쓸 때 사용하는 메서드
			// UPDATE, INSERT, DELETE 문을 쓸 때는 executeUpdate() 
			
			while (rs.next()) {
				Customer customer = new Customer(rs.getString("userName"), rs.getInt("birthYear"),
																					rs.getString("addr"), rs.getString("mobile"));
				list.add(customer);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (Customer c : list) {
			System.out.println(c);
		}
		
	} // end of main
	
} // end of class

class Customer {
	private String name;
	private int birthYear;
	private String address;
	private String mobile;
	
	public Customer(String name, int birthYear, String address, String mobile) {
		this.name = name;
		this.birthYear = birthYear;
		this.address = address;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", birthYear=" + birthYear + ", address=" + address + ", mobile=" + mobile
				+ "]";
	}
	
}

