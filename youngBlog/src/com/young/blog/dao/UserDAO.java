package com.young.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.young.blog.dto.UserDTO;
import com.young.blog.utils.DBHelper;

public class UserDAO implements IUserDAO {

	private DBHelper dbHelper;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public int saveUser(UserDTO user) {
		int resultRow = 0;
		String sql = " INSERT INTO user (userName, password, email, address, userRole, createDate) "
						   + " VALUES (?, ?, ?, ?, ?, NOW()) ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3,  user.getEmail());
			pstmt.setString(4, user.getUserRole());
			pstmt.setString(5, user.getCreateDate());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultRow;
	}
	
	
	
}
