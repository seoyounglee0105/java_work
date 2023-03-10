package ch05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO implements IEmployeeDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt; // Statement와의 차이점 : 속도가 더 빠름 - 질의 성능을 더 높일 수 있음 (캐시 기반 사용), 기능 확장
	private ResultSet rs;
	
	public EmployeeDAO() {
		// 메서드 체이닝 방식
		// dbHelper.getConnection().createStatement().executeQuery(null);
		
		// DBHelper 객체를 가지고 오는 메서드
		dbHelper = DBHelper.getInstance();
		
		// dbHelper에서 connection 객체를 가지고 오는 메서드
		conn = dbHelper.getConnection();
	} // end of 생성자

	@Override
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String title) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		
		String sql = " SELECT e.emp_no, e.first_name, e.last_name, t.title "
								+ " FROM employees AS e "
								+ " INNER JOIN titles AS t "
								+ " ON e.emp_no = t.emp_no "
								+ " WHERE t.title = ? ";  // preparedStatement는 format 대신 ?로 매핑 가능
						 												  // Java에서 쓸 때는 작은따옴표 생략 가능
		
		try {
			pstmt = conn.prepareStatement(sql);
			// 인덱스 X, 1부터 시작
			// PreparedStatement객체.setString(순서, 넣을 값);
			pstmt.setString(1, title); // 첫 번째 ? 자리에 매개변수 값으로 매핑
			rs = pstmt.executeQuery(); // 앞에서 미리 만들었기 때문에 매개변수 없이

			while (rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				// 필요하다면 DTO에 멤버변수를 더 만들어서 사용해도 됨
				// 해당 메서드에서 필요한 컬럼들만 가져오기
				dto.setEmpNo(rs.getString("emp_no"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setTitle(rs.getString("title"));
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	@Override
	public int showSalaryCount(String firstName, String lastName) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		int salaryCount = 0;
		
		String sql = " SELECT * "
								+ " FROM employees AS e "
								+ " INNER JOIN salaries AS s "
								+ " ON e.emp_no = s.emp_no "
								+ " WHERE e.first_name = ? AND e.last_name = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmpNo(sql);
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setSalary(rs.getInt("salary"));
				list.add(dto);
				salaryCount++;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return salaryCount;
	}
	
	
}
