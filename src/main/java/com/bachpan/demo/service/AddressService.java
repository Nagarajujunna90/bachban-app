package com.bachpan.demo.service;

import com.bachpan.demo.dto.AddressDTO;
import com.bachpan.demo.model.User;

public interface AddressService {

	void createAddress(AddressDTO addressdto);

	void deleteAddress(Integer id);

	void updateAddress(Integer id, AddressDTO addressdto);

	public User findById(Integer id);


}
