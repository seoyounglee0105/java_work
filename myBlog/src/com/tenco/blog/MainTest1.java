package com.tenco.blog;

import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

// 요청 순서 : main -> Controller -> Service -> Dao -> MySQL
// 요청 후 응답 : MySQL -> Dao -> Service -> Controller -> main
public class MainTest1 {

	public static void main(String[] args) {

		// 회원 가입 진행
		UserDTO userDTO = new UserDTO("이순신", "5678", "b@nate.com", "부산");
		
		// main에서는 UserController만 알면 됨
		UserController userController = new UserController();
//		String result = userController.requestSignUp(userDTO, "localhost");
//		System.out.println(result);
		
		
		// 로그인 요청
		UserDTO responseUser = userController.requestSignIn(userDTO.getUserName(), userDTO.getPassword());
		if (responseUser == null) {
			System.out.println("로그인에 실패했습니다.");
		} else {
			System.out.println("당신은 인증된 유저가 맞습니다. 로그인 성공");
		}
	}

}
