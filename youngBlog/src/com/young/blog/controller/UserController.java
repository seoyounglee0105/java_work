package com.young.blog.controller;

import com.young.blog.dto.UserDTO;
import com.young.blog.service.UserService;

public class UserController {

	private UserService userService;	
	
	public UserController() {
		userService = new UserService();
	}
	
	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원 가능이 안됩니다.";
		if (host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}
	
}
