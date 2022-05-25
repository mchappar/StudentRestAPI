package com.springboot.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	//GET HTTP Method 
	//localhost:8080/hello
	
	
	@GetMapping("/hello")
	public String HelloWorld()
	{
		return "Hello World!!";
	}
}
