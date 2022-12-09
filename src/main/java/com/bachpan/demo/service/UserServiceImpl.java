package com.bachpan.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bachpan.demo.dto.UserDTO;
import com.bachpan.demo.repository.UserRepository;
@Service
public class UserServiceImpl  implements UserService {
	@Autowired
	private UserRepository userRepositroy;

	@Override
	public void createUser(UserDTO userdto) {
		UserDTO  user=new UserDTO();
     user.setFirstName(userdto.getFirstName());
     user.setLastName(userdto.getLastName());
     user.setFatherName(userdto.getFatherName());
     user.setQualification(userdto.getQualification());
     userRepositroy.save(user);
		
	}

	
}
      