package com.tenco.blog.dao;

// DAO는 단순한 기능만을 수행시킬 것  (사용자 확인은 Service에서)
public interface IBlogDAO {

	// 글 저장
	int save(String title, String content, int userId);
	
	// 글 조회
	void select();
	
	// 글 수정
	void update();
	
	// 글 삭제
	void delete(int boardId);
	
}
