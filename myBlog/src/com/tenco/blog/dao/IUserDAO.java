package com.tenco.blog.dao;

import com.tenco.blog.dto.UserDTO;

public interface IUserDAO {

	// public abstract가 생략된 형태
	int saveUser(UserDTO user);
	
	UserDTO selectUserByUsernameAndPassword(String userName, String password);
	
}
