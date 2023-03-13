package com.tenco.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.blog.utils.DBHelper;

public class BlogDAO implements IBlogDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public BlogDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	// 글 저장 기능
	@Override
	public int save(String title, String content, int userId) {
		int resultRowCount = 0;
		String query = " INSERT INTO board(title, content, userId) "
								+ " VALUES (?, ?, ?) ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2,  content);
			pstmt.setInt(3,  userId);
			resultRowCount = pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(">> BlogDao의 save 메서드에서 에러 발생 <<");
			e.printStackTrace();
		}
		return resultRowCount;
	}

	@Override
	public void select() {
		
	}

	@Override
	public void update() {
		
	}

	// 글 삭제 기능
	@Override  
	public void delete(int boardId) {
		String query = " DELETE FROM board WHERE id = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,  boardId);
			pstmt.executeUpdate(); // delete는 0개의 행에 적용되어도 성공으로 출력 
			
		} catch (SQLException e) {
			System.out.println(">> blogDao delete 에러 발생 <<");
			e.printStackTrace();
		}
		
		
	}

	
	
}
