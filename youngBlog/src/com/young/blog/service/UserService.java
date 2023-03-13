package com.young.blog.service;

import com.young.blog.dao.UserDAO;
import com.young.blog.dto.UserDTO;

public class UserService {

	private UserDAO userDAO;
	
	public UserService() {
		userDAO = new UserDAO();
	}
	
	public String signUp(UserDTO user) {
		String msg = "";
		
		if (user.getUserName().equals("")) {
			msg = "사용자 이름을 입력해주세요.";
			System.out.println(msg);
			return msg;
		}
		user.setUserRole("USER");
		int resultRow = userDAO.saveUser(user);
		msg = "회원 가입되었습니다.";
		
		return msg;
	}
}
