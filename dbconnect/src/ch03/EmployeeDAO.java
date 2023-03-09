package ch03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDAO implements IEmployeeDAO {

	// DB 연결 정보
	private DBClient dbClient;
	private Connection conn;
	
	// 테이블명
	private static final String TABLE_NAME = "employees";
	

	public EmployeeDAO() {
		dbClient = new DBClient();
	}
	
	@Override
	public void insert(EmployeeDTO dto) {
		
	}

	@Override
	public ArrayList<EmployeeDTO> select(int empNo) {
		
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		
		 // 문자열을 연결할 때 문법 오류가 날 수 있어서, 항상 마지막에 공백 한 칸을 두자.
		String sqlFormat = "SELECT * FROM %s WHERE emp_no = %d "; 
		String sql = String.format(sqlFormat, TABLE_NAME, empNo); // 문자열 형식
		
		conn = dbClient.getConnection();
		
		// 쿼리문을 만들기 위한 객체
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				// DB에 있는 컬럼명과 get 메서드 내 매개변수명을 동일하게 할 것
				int mEmpNo = rs.getInt("emp_no");
				String birthDate = rs.getString("birth_date");
				String firstName = rs.getString("first_name");
				String gender = rs.getString("gender");
				String hireDate = rs.getString("hire_date");
				
				EmployeeDTO dto = new EmployeeDTO(empNo, birthDate, firstName, "", gender, hireDate);
				
				list.add(dto);
			} // end of while
			
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public ArrayList<EmployeeDTO> select(String lastName) {
		return null;
	}

	@Override
	public void update(String gender) {
		
	}

	@Override
	public void delete(int empNo) {
		
	}

	@Override
	public void delete(String lastName) {
		
	}


}
