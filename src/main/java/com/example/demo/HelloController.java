package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	

@Value("${app.title}")
private String appTitle;

	@GetMapping("/")
	public String index() {
		
		return "Greetings for you,  "+ appTitle;
		
	}

}