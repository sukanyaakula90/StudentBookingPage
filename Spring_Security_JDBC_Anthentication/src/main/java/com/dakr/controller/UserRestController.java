package com.dakr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	
	@GetMapping("/admin")
	public String adminLogin() {
		return "Admin Login Sucessfully";
	}
	@GetMapping("/user") 
	public String userLogin() {
		return "User Login Sucessfully";
	}
	@GetMapping("/home")
	public String home() {
		return "Welcome to DAKR Solutions";
	}
}
