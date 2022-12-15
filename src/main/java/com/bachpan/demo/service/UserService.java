package com.bachpan.demo.service;

import java.util.List;

import com.bachpan.demo.dto.UserDTO;
import com.bachpan.demo.model.User;

public interface UserService {

	void createUser(UserDTO userdto);
	void deleteUser(Integer id);
	void updateUser(Integer id, UserDTO userdto);
	public User findByUserId(Integer id);
	List<User> findAllUserDetails();
	

}
