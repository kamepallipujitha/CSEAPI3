package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/home")
	public String rocks() {
		return "welcome to springboot with jenkins world with github";
	//welcome cse 1
	}
}
