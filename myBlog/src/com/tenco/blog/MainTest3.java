package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest3 {

	public static void main(String[] args) {
		
		// 조회는 모두가, 수정/삭제는 글쓴이만
		
		UserController userController = new UserController();
		BlogController blogController = new BlogController();
		
		// 글 삭제 기능
		
		// 사용자 로그인
		UserDTO loginUser = userController.requestSignIn("티모", "1234");
		System.out.println(loginUser);
		
		// main -> BlogController에 넘겨야 할 값 : 해당 게시글의 PK 값(id), 사용자 정보(userId)
		if (loginUser != null) {
			blogController.reqDeleteBoard(3, loginUser.getId());			
		}
		
	}
	
}
