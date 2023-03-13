package com.young.blog.dao;

import com.young.blog.dto.UserDTO;

public interface IUserDAO {

	int saveUser(UserDTO user);
	
}
