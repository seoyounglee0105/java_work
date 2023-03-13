package com.tenco.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.blog.dto.UserDTO;
import com.tenco.blog.utils.DBHelper;

/**
 * @author 이서영
 * User와 관련된 DB 서버 연결 로직 처리 (그 외 테이블과 관련된 것은 따로 분리)
 * 패키지 이름을 com.tenco.blog라고 쓴 이유 : 회사에서는 루트(?) 패키지명을 com.회사명.서비스명 이런 식으로 많이 사용함
 */

public class UserDAO implements IUserDAO {

	private DBHelper dbHelper;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	// 인터페이스를 만드는 이유 : 표준을 만들고, 가독성을 높이기 위함
	// 사용자 정보를 저장시키는 기능 (회원 가입)
	@Override
	public int saveUser(UserDTO user) {
		int resultRow = 0;
		String query = " INSERT INTO user (userName, password, email, address, userRole, createDate) "
								+ " VALUES (?, ?, ?, ?, ?, now()) ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getUserRole());
			pstmt.setString(5, user.getCreateDate());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("saveUser 함수에서 오류 발생");
			e.printStackTrace();
		} 
		return resultRow;
	}

	// 아이디와 비밀번호 값을 확인해서 사용자 정보를 찾는 기능 (로그인)
	@Override
	public UserDTO selectUserByUsernameAndPassword(String userName, String password) {
		UserDTO resultUser = null;
		
		String query = " SELECT * FROM user "
								+ " WHERE userName = ? AND password = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				// getString 매개변수는 SQL의 결과집합 컬럼명으로
				// 패스워드는 로그인 시 반환하지 말 것 (민감한 정보이므로)
				resultUser = new UserDTO();
				resultUser.setId(rs.getInt("id"));
				resultUser.setUserName(rs.getString("userName"));
				resultUser.setEmail(rs.getString("email"));
			}
			
		} catch (SQLException e) {
			System.out.println("회원 찾기에서 오류 발생");
			e.printStackTrace();
		}
		
		return resultUser;
	}
	
	
	
	
	
	
}
