package com.kaash.hellospringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String printHelloWorld() {
		
		return "Hello SpringBoot...";
	}
}
