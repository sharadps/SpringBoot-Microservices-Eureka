package com.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	public HelloController() {
		System.out.println("Hello Controller Object is created");
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from HelloController";
	}
}
