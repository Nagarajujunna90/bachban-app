package com.bachpan.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bachpan.demo.dto.UserDTO;
import com.bachpan.demo.model.Role;
import com.bachpan.demo.model.User;
import com.bachpan.demo.repository.RoleRepository;
import com.bachpan.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepositroy;
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void createUser(UserDTO userdto) {
		User user = new User();
		user.setFirstName(userdto.getFirstName());
		user.setLastName(userdto.getLastName());
		user.setFatherName(userdto.getFatherName());
		user.setQualification(userdto.getQualification());
		List<Role> roles = roleRepository.findAll();
		Set<Role> setRoles = new HashSet<>();
		for (Role role : roles) {
			if (userdto.getRoleName().equals(role.getName())) {
				setRoles.add(role);
				user.setRoles(setRoles);
			}
		}

		userRepositroy.save(user);

	}

}
