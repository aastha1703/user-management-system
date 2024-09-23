package com.example.ing.usermanagementsystem.controller;

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

import com.example.ing.usermanagementsystem.entity.SingleUserResponse;
import com.example.ing.usermanagementsystem.entity.User;
//import com.example.ing.usermanagementsystem.entity.User;
import com.example.ing.usermanagementsystem.entity.UserResponse;
import com.example.ing.usermanagementsystem.service.UserService;

@RestController
@RequestMapping("/user")
public class UserDetails {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getuser")
	public List<User> getAllUsers() {
		System.out.println("Inside getuser");
		return userService.getAllUsers();
	}
	
	@GetMapping("/getuserbyid/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);	
	}
	
	@PutMapping("/updateuser/{id}")
	public void updateUser(@PathVariable int id, @RequestBody User user) {
		System.out.println("Inside updateUser");
		userService.updateUser(id,user);
//		userService.
	}
	
	@GetMapping("/createuser")
	public void createUser() {
		System.out.println("Inside updateuser");
		
	}
	
	@DeleteMapping("/deleteuserbyid/{id}")
	public void deleteUserById(@PathVariable int id) {
		System.out.println("Inside deleteuser");
		userService.deleteUserById(id);
	}
	
	

}
