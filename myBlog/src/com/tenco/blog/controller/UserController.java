package com.tenco.blog.controller;

import com.tenco.blog.dto.UserDTO;
import com.tenco.blog.service.UserService;

// Controller는 Model-View-Controller(MVC) 아키텍처 패턴에서 사용되는 컴포넌트 
// 웹 애플리케이션에서 클라이언트의 요청(Request)을 받아 적절한 비즈니스 로직을 호출하고
// 결과를 View에 전달하여 응답을 생성함

public class UserController {

	// Main -> UserController 생성 -> 기능 (회원 가입(이름, 이메일 등), 로그인 기능(아이디, 비밀번호))
	// UserController : 사용자와 관련된 요청 코드들을 처리
	
	// 외부에서 요청한 일을 수행하고, 결과를 리턴함
	
	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	// 사용자 정보를 받아 회원가입 처리를 함
	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원 가입이 안됩니다.";
		if (host.equals("localhost")) {
			response = userService.signUp(user);
		} 
		return response;
	}
	
	public UserDTO requestSignIn(String userName, String password) {
		UserDTO responseUserDTO = userService.checkUser(userName, password);
		return responseUserDTO;
	}
	
}
