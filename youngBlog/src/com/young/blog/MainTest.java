package com.young.blog;

import com.young.blog.controller.UserController;
import com.young.blog.dto.UserDTO;

public class MainTest {

	// 요청 : 컨트롤러
	// 로직 처리  : 서비스
	// DB 접근 : DAO
	
	public static void main(String[] args) {

		UserDTO userDTO = new UserDTO("이하나", "1234", "a@naver.com", "부산");
		
		UserController userController = new UserController();
		String result = userController.requestSignUp(userDTO, "localhost");
		System.out.println(result);
		
		
	}

}
