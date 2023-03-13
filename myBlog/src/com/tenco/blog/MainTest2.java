package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest2 {

	// 블로그에 글 쓰는 기능을 만들어 보자.
	// 메인 함수
	public static void main(String[] args) {
		
		// UserDTO dto = new UserDTO("홍길동", "1234", "a@naver.com", "부산시 중구");
		
		UserController userController = new UserController();
		
		// 로그인 성공
		UserDTO loginUser = userController.requestSignIn("티모", "1234");
		System.out.println("userID : " + loginUser.getId());
		
		// board의 컬럼 id, title, content, readCount, userId
		// 필요한 것 : title, content, userId
		
		BlogController blogController = new BlogController();
		
		// 로그인된 사용자가 맞다면
		if (loginUser != null) {
			int response = blogController.reqSaveBoard("MVC 패턴의 이해2", "Model-View-Controller", loginUser.getId());
			// 실패하면 0 반환
			if (response == 0) {
				System.out.println("글 쓰기에 실패하였습니다.");
			} else {
				System.out.println("글 쓰기에 성공하였습니다.");
			}
		}
		

	} // end of main

} // end of class
