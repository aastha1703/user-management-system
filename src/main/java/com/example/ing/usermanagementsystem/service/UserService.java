package com.example.ing.usermanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ing.usermanagementsystem.entity.SingleUserResponse;
import com.example.ing.usermanagementsystem.entity.User;
import com.example.ing.usermanagementsystem.entity.UserResponse;

@Service
public class UserService {
	
	
	private final RestTemplate restTemplate;
	
	private final String url = "https://reqres.in/api/users";
	
	public UserService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public List<User> getAllUsers() {
		return restTemplate.getForObject(url, UserResponse.class).getData();
	}
	
	public User getUserById(int id) {
		return restTemplate.getForObject(url+'/'+id, SingleUserResponse.class).getData();
	}
	
	public void updateUser(int id, User user) {
		restTemplate.put(url+'/'+id, user);
	}
	
	public void deleteUserById(int id) {
		restTemplate.delete(url+'/'+id);
	}

}
