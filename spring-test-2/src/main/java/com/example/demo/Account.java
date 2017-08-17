package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Account {

	@RequestMapping("/account/getUser")
	public User getUser() {
		
		User user = new User();
		user.userName="mcc";
		user.password="mccltd";
		System.out.println("Its working ...");
		return user;
	}
}
