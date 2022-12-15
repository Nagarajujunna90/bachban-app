package com.bachpan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bachpan.demo.dto.AddressDTO;
import com.bachpan.demo.model.User;
import com.bachpan.demo.service.AddressService;

@RestController
@RequestMapping("/user")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@PostMapping("/createAddress")
	public String createAddress(@RequestBody AddressDTO addressdto) {
		addressService.createAddress(addressdto);
		return "address inserted successfully";

	}

	@DeleteMapping("/deleteAddressById/{id}")
	public String deleteAddress(@PathVariable("id") Integer id) {
		addressService.deleteAddress(id);
		return "delete value successfully";
	}

	@PutMapping("/updateAddress/{id}")
	public String updateAddress(@PathVariable("id") Integer id, @RequestBody AddressDTO addressdto) {
		addressService.updateAddress(id, addressdto);
		return "updatedAddress successfully";
	}

	@GetMapping("/findByAddress/{id}")
	public User findById(@PathVariable("id") Integer id) {
		User user = addressService.findById(id);
		return user;

	}
}
