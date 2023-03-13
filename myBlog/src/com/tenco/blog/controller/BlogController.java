package com.tenco.blog.controller;

import com.tenco.blog.service.BlogService;
import com.tenco.blog.service.UserService;

public class BlogController {

	private BlogService blogService;
	
	public BlogController() {
		blogService = new BlogService();
	}
	
	// 블로그 글 작성 기능 요청
	public int reqSaveBoard(String title, String content, int userId) {
		int resultRowCount = 0;
		
		// 방어적 코드 (id는 1부터 1씩 증가함)
		if (userId <= 0) {
			return resultRowCount; // 0 반환
		}
		
		resultRowCount = blogService.saveBoard(title, content, userId);
		return resultRowCount;
	} // reqSaveBoard
	
	// 블로그 글 삭제 기능 요청
	public void reqDeleteBoard(int boardId, int userId) {
		blogService.deleteByBoardId(boardId, userId);
	}
	
}
