package com.springboot.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to 11th class";
	}
	
	@GetMapping("/physics")
	public String physics() {
		return "Welcome to physics class, E=M*(C*C)";
	}
	
	@GetMapping("/chemistry")
	public String chemistry() {
		return "Welcome to chemistry class, H2O = H2 + O2";
	}
	
	@GetMapping("/math")
	public String math() {
		return "Welcome to math class, a2 + b2 = 2ab";
	}
	
	@GetMapping("/biology")
	public String biology() {
		return "Welcome to biology class, Hello Homosapiens";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Hi admin";
	}
	
}
