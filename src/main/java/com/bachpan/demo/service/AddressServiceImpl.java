package com.bachpan.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bachpan.demo.dto.AddressDTO;
import com.bachpan.demo.dto.UserDTO;
import com.bachpan.demo.model.Address;
import com.bachpan.demo.model.Role;
import com.bachpan.demo.model.User;
import com.bachpan.demo.repository.AddressRepository;
import com.bachpan.demo.repository.RoleRepository;
import com.bachpan.demo.repository.UserRepository;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void createAddress(AddressDTO addressdto) {
		User user = new User();
		user.setUserName(addressdto.getUserName());
		user.setPassword(addressdto.getPassword());
		user.setFirstName(addressdto.getFirstName());
		user.setLastName(addressdto.getLastName());
		user.setFatherName(addressdto.getFatherName());
		user.setQualification(addressdto.getQualification());
		user.setVillage(addressdto.getVillage());
		user.setMandal(addressdto.getMandal());
		user.setDistrict(addressdto.getDistrict());
		user.setState(addressdto.getState());
		user.setCountry(addressdto.getCountry());
		user.setPin(addressdto.getPin());
		List<Role> roles = roleRepository.findAll();
		Set<Role> setRoles = new HashSet<>();
		for (Role role : roles) {
			if (addressdto.getUserName().equals(role.getName())) {
				setRoles.add(role);
				user.setRoles(setRoles);

			}
		}
	}

	@Override
	public void deleteAddress(Integer id) {
		userRepository.deleteById(id);

	}

	@Override
	public void updateAddress(Integer id, AddressDTO addressdto) {
		User user = new User();
		user.setId(id);
		user.setUserName(addressdto.getUserName());
		user.setPassword(addressdto.getPassword());
		user.setFirstName(addressdto.getFirstName());
		user.setLastName(addressdto.getLastName());
		user.setFatherName(addressdto.getFatherName());
		user.setQualification(addressdto.getQualification());
		user.setVillage(addressdto.getVillage());
		user.setMandal(addressdto.getMandal());
		user.setDistrict(addressdto.getDistrict());
		user.setState(addressdto.getState());
		user.setCountry(addressdto.getCountry());
		user.setPin(addressdto.getPin());
		userRepository.save(user);
	}

	@Override
	public User findById(Integer id) {
		User user=userRepository.findById(id).orElse(null);
		return user;

	}
}
