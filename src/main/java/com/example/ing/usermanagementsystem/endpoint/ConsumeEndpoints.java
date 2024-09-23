//package com.example.ing.usermanagementsystem.endpoint;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import com.example.ing.usermanagementsystem.entity.User;
//import com.example.ing.usermanagementsystem.service.UserService;
//
//@Component
//public class ConsumeEndpoints implements CommandLineRunner{
//	
//	@Autowired
//	private UserService userService;
//	
//	@Override public void run(String... args) throws Exception{
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<User[]> response = 
//				restTemplate.getForEntity("https://reqres.in/api/users", User[].class);
//		User[] users = response.getBody();
//		if(users != null) {
//			for(User user :users) {
//				userService.createUser(user);
//			}
//		}
//	}
//
//}
