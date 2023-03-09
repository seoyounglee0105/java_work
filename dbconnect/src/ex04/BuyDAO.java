package ex04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO {
	
	// DB에 연결
	DBClient dbClient;
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public BuyDAO() {
		dbClient = DBClient.getInstance(); // DBClient 클래스는 싱글톤 패턴으로 구현함
		
		// 코드 축약하기
		// conn = dbClient.getConnection();을 메서드 내에서 반복하지 않고, 생성자에서 실행
		// DBClient 생성자에 conn = getConnection(); 추가해주면 가능
		conn = dbClient.getConnection(); 
	}
	

	// 전체 조회 기능
	@Override
	public ArrayList<BuyDTO> select() {
		// TIP : 반환할 데이터 타입으로 먼저 지역변수를 만들어 주고, return에 넣기
		ArrayList<BuyDTO> list = new ArrayList<>();
		
		try {
			stmt = conn.createStatement(); 
			rs = stmt.executeQuery("SELECT * FROM buytbl ");
			
			// 레코드 하나씩 반복
			while (rs.next()) {
				String userName = rs.getString("userName");
				String productName = rs.getString("productName");
				int price = rs.getInt("price");
				int amount = rs.getInt("amount");
				
				BuyDTO dto = new BuyDTO(userName, productName, price, amount);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 최근에 사용한 것부터 close()
				rs.close();
				stmt.close();
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	} // end of select method

	// 데이터 추가 기능
	@Override
	public int insert(BuyDTO dto) {
		int rowCount = 0;
		
		String sqlFormat = "INSERT INTO buytbl (userName, productName, price, amount) "
				                        + "VALUES ('%s', '%s', %d, %d) ";
		String sql = String.format(sqlFormat, dto.getUserName(), dto.getProductName(), dto.getPrice(), dto.getAmount());
				
		try {
			stmt = conn.createStatement();
			// DML을 사용할 때는 executeUpdate 메서드임에 유의!
			rowCount = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowCount;
	}

	// 값 갱신 기능
	@Override
	public int update(BuyDTO dto, String targetUserName, String targetProductName) {
		int rowCount = 0;
		
		String sqlFormat = "UPDATE buytbl SET productName = '%s', price = %d, amount = %d "
				                        + "WHERE userName = '%s' AND productName = '%s' ";
		String sql = String.format(sqlFormat, dto.getProductName(), dto.getPrice(), dto.getAmount(),
														targetUserName, targetProductName);
				
		try {
			// DML을 사용할 때는 executeUpdate 메서드임에 유의!
			stmt = conn.createStatement();
			rowCount = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowCount;
	}

	@Override
	public void delete(String targetUserName) {
		
		String sqlFormat = " DELETE FROM buytbl WHERE userName = '%s' ";
		String sql = String.format(sqlFormat, targetUserName);
				
		try {
			// DML을 사용할 때는 executeUpdate 메서드임에 유의!
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
