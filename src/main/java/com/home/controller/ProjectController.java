package com.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	
	@GetMapping("/home")
	public String getHome() {
		
	    return "Welcome Home Rakshu";	
	}

}
