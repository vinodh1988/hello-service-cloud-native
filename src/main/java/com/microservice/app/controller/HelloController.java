package com.microservice.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
  
	@RequestMapping("/greet")
	public String greet() {
		return "Hi from instance " + System.getenv("HELLOSERVICE_INSTANCE_NAME")+" of hello service";
	}
}   
