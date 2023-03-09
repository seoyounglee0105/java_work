package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAO implements IUserDAO {

	// DB에 연결
	private DBClient dbClient;

	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public UserDAO() {
		initData();
	}
	
	private void initData() {
		dbClient = new DBClient();
	}
	
	@Override
	public ArrayList<UserDTO> select() {
		// 반환할 데이터 타입으로 먼저 지역변수를 만들어 주고, return에 넣기
		ArrayList<UserDTO> list = new ArrayList<>();
		
		// 코드 구현
		conn = dbClient.getConnection();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM usertbl "); // 전체 조회라서 format 메서드로 매핑할 필요 없음 
			
			while (rs.next()) {
				String userName = rs.getString("userName");
				String birthYear = rs.getString("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");
				
				UserDTO userDTO = new UserDTO(userName, birthYear, addr, mobile);
				
				list.add(userDTO);
			} // end of while
			
			// DB 연결이 안 되어 있을 수 있어서 예외처리 하기
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	} // end of select method

	// insert하면 MySQL의 DB에도 반영됨
	@Override
	public int insert(UserDTO dto) {
		String sqlFormat = "INSERT INTO usertbl (username, birthyear, addr, mobile) "
				                        + "VALUES ('%s', '%s', '%s', '%s') ";
		String sql = String.format(sqlFormat, dto.getUserName(), dto.getBirthYear(), dto.getAddr(), dto.getMobile());
		
		Connection conn = dbClient.getConnection();
		Statement stmt = null; // 지역변수는 기본값이 없어서, 초기화를 해줘야 함
		
		int resultRowCount = 0;
		
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql); // INSERT된 개수 int를 반환함
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("잘 확인해주세요."); // 빨간 색으로 출력
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return resultRowCount;
	}

	@Override
	public int update(UserDTO dto, String targetUserName) {
		String sqlFormat = "UPDATE usertbl SET birthYear = '%s', addr = '%s', mobile = '%s' "
 				                        + "WHERE userName = '%s' ";
		String sql = String.format(sqlFormat, dto.getBirthYear(), dto.getAddr(), dto.getMobile(), targetUserName);
		
		int resultRow = 0;
		
		// 오토 클로즈
		try (
				// close()가 필요한 변수들을 선언 및 초기화하는 코드만 여기에
				Connection conn = dbClient.getConnection();
				Statement stmt = conn.createStatement();
				) {
				// 구현부
				resultRow = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultRow;
		
	}

	@Override
	public boolean delete(String targetUserName) {
		boolean isOk = true;
		
		String sqlFormat = "DELETE FROM usertbl WHERE userName = '%s' ";
		String sql = String.format(sqlFormat, targetUserName);
		
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			isOk = false;
			
		} catch (Exception e) {
			e.printStackTrace();	
		
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return isOk;
		
	}

}
