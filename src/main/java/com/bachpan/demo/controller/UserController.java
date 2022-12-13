package com.bachpan.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bachpan.demo.dto.UserDTO;
import com.bachpan.demo.model.User;
import com.bachpan.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public String createUser(@RequestBody UserDTO userDto ) {
		userService.createUser(userDto);
		return "user inserted successfully";
	}
	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable ("id") Integer id) {
		userService.deleteUser(id);
		return "user deleted successfully";
	}
	@PutMapping("/updateuser/{id}")
	public String updateUser(@PathVariable("id") Integer id, @RequestBody UserDTO userDto) {
		userService.updateUser(id, userDto);
		return "update details successfully";
		
	}
       @GetMapping  ("/readuser/{id}")
      public User findByUserId(@PathVariable("id") Integer id) {
    	   User user=userService.findByUserId(id);
		return user;
    	   
       }
	@GetMapping("/readAllUsers")
       public List<User> findAllUsers(){
       List<User> userlist=(List<User>) userService.findAllUserDetails();
       return userlist;
	
       }
}
