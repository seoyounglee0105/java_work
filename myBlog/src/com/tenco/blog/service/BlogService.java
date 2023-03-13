package com.tenco.blog.service;

import com.tenco.blog.dao.BlogDAO;
import com.tenco.blog.dto.BlogDTO;

public class BlogService {

	BlogDAO blogDAO;
	
	public BlogService() {
		blogDAO = new BlogDAO();
	}
	
	// 블로그 글 저장 로직 구현
	public int saveBoard(String title, String content, int userId) {
		int resultRowCount = 0;
		
		// 방어적 코드
		if (title.equals("") || content.equals("")) {
			return resultRowCount; // 0 반환
		}
		
		// blogDAO
		resultRowCount = blogDAO.save(title, content, userId);
		return resultRowCount;
	} // end of saveBoard

	// 블로그 글 삭제 로직 구현
	public void deleteByBoardId(int boardId, int userId) {
		// Service에서 글쓴이와 사용자가 동일한지 확인해야 함
		BlogDTO blogDTO = selectByBoardId(boardId);
		
		// 매개변수로 받은 사용자의 id와 해당 게시글의 작성자가 동일하다면 게시글 삭제  
		if (userId == blogDTO.getUserId()) {
			blogDAO.delete(boardId);
		}
	}
	
	// 하나의 게시글을 찾는 로직 구현
	public BlogDTO selectByBoardId(int boardId) {
		BlogDTO blogDTO = null;
		
		// blogDao.select() 호출 예정 -> 응답 ResultSet -> BlogDTO로 클래스화 처리
		return blogDTO;
	}
	
}
