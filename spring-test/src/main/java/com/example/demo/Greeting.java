package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rifat.model.User;

@RestController
public class Greeting {
	
	@RequestMapping("/greeting")
	@ResponseBody
	public String greeting() {
		return "hello";
	}
	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.userName = "mcc";
		user.password = "mccltd";
		return user;
	}
	
	@RequestMapping("/searchUser")
	public User searchUser(@RequestParam(value="userName", defaultValue="mcc") String userName) {
		User user = new User();
		user.userName = userName;
		user.password = "mccltd";
		return user;
	}
}
