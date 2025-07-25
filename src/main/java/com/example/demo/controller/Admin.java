package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin {
	
	
	@GetMapping("/test")
	public String test() {
		
		return "Testing...";
	}

}
