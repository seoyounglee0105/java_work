package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO {
	
	DBClient dbClient;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public BuyDAO() {
		dbClient = new DBClient(); // DBClient 클래스를 싱글톤 패턴으로 만들어보기
		conn = dbClient.getConnection(); // DBClient 생성자에 conn = getConnection(); 추가해주면 가능
		
	}
	

	@Override
	public ArrayList<BuyDTO> select() {
		ArrayList<BuyDTO> list = new ArrayList<>();
		
		try {
			stmt = conn.createStatement(); // 이거는 계속 반복해서 쓰기
			rs = stmt.executeQuery("SELECT * FROM buytbl ");
			
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
		}
		
		return list;
	}

	@Override
	public int insert(BuyDTO dto) {
		int rowCount = 0;
		
		String sqlFormat = "INSERT INTO buytbl (userName, productName, price, amount) "
				                        + "VALUES ('%s', '%s', %d, %d) ";
		String sql = String.format(sqlFormat, dto.getUserName(), dto.getProductName(), dto.getPrice(), dto.getAmount());
		
		conn = dbClient.getConnection();
		
		try {
			stmt = conn.createStatement();
			rowCount = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}

	@Override
	public int update(BuyDTO dto, String targetUserName, String targetProductName) {
		int resultRowCount = 0;
		
		String sqlFormat = "UPDATE buytbl SET productName = '%s', price = %d, amount = %d "
				                        + "WHERE userName = '%s' AND productName = '%s' ";
		String sql = String.format(sqlFormat, dto.getProductName(), dto.getPrice(), dto.getAmount(),
														targetUserName, targetProductName);
		
		conn = dbClient.getConnection();
		
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultRowCount;
	}

	@Override
	public void delete(String targetUserName) {
		
		String sqlFormat = " DELETE FROM buytbl WHERE userName = '%s' ";
		String sql = String.format(sqlFormat, targetUserName);
		
		conn = dbClient.getConnection();
		
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
