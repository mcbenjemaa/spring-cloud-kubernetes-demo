package com.github.medmedchiheb;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	GetService getService;
	

	@Autowired
	Environment env;
	
	@GetMapping("/")
	public String[] profile() {
		return env.getActiveProfiles();
	}
	
	@GetMapping("/result")
	public String result() {
		
		GetDTO dto = getService.get();
		
		return "Hello, "+dto.getUser() + " from "+dto.getProfile();
	}
	
	@GetMapping("/user-host")
	public String userHost() throws UnknownHostException {
		return getService.userHost(); 
	}
	
	@GetMapping("/get-host")
	public String host() throws UnknownHostException {
		return getService.host();
	}
	
	
	
}
