package com.mcc.fox.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTest {

	@RequestMapping("/ok")
	public String test() {
		return "ok";
	}
}
