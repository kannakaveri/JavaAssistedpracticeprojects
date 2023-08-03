package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/")
	public String hello() {
		return "Hello! This is the Amazon AWS EC2 App...";
	}

}
