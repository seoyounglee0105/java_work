package com.tenco.blog.service;

import com.tenco.blog.dao.UserDAO;
import com.tenco.blog.dto.UserDTO;

// 흐름 : Controller -> Service -> DAO
public class UserService {

	// Service
	// 사용자와 관련된 로직들을 처리
	
	private UserDAO userDAO;
	
	public UserService() {
		userDAO = new UserDAO();
	}

	// 회원 가입 로직 처리
	public String signUp(UserDTO user) {
		
		String msg = "";
		// 사용자가 입력한 값이 유효한지 확인하는 것 : Validation 처리
		// 사용자가 필수 값을 모두 입력했는지 확인
		// 비밀번호 사이즈 확인
		if (user.getUserName().equals("")) {
			msg = "사용자 이름을 입력해주세요.";
			System.out.println(msg);
			return msg;
		}
		// DAO에게 요청
		// userRole은 사용자가 알 필요가 없으므로, 여기서 지정
		user.setUserRole("USER");
		int resultRow = userDAO.saveUser(user);
		
		return resultRow + ""; // 문자열로 형변환		
	}
	
	// 회원 정보 찾기 - 로그인 로직 처리
	public UserDTO checkUser(String userName, String password) {
		boolean isValid = true;
		if (userName.equals("")) {
			isValid = false;
		} else if (password.equals("")) {
			isValid = false;
		}
		
		UserDTO userDTO = null;
		if (isValid) {
			userDTO = userDAO.selectUserByUsernameAndPassword(userName, password);			
		}
		return userDTO;
	}
	
	
	
}
