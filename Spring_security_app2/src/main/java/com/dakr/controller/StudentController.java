package com.dakr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentController {
	
	
	
	@GetMapping("/home")
	 public String home() {
		return "Welcome to Dakr Solutions";
	}
	@GetMapping("/About")
	public String about() {
		return "This is about page";
	}
    @GetMapping("/contact")
    public String cantact() {
    	return "This is contact page";
    	
    }
    @GetMapping("/Display")
    public String display() {
    	return "This is the display page";
    }
    
   
}
