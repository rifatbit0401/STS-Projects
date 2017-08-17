package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/add")
	public String addUser() {
		User user = new User();
		user.setName("mcc");
		user.setEmail("mcc@mcc.com");
		userRepository.save(user);
		return "added";
	}
	
	@RequestMapping("/all")
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@RequestMapping("/get")
	public Iterable<User> getByNameAndEmail(String name, String email) {
		return userRepository.getByNameAndEmail(name, email);
	}
	
	@RequestMapping("/getor")
	public Iterable<User> getByNameOrEmail(String name, String email) {
		return userRepository.getByNameOrEmail(name, email);
	}
	
}
