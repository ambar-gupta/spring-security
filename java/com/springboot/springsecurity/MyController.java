package com.springboot.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "hello alians";
	}
	
}
