package com.github.medmedchiheb;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Value("${user-service.name}")
	private String userName;
	
	@Value("${spring.profiles.active}")
	private String profile;
	
	@GetMapping("/")
	public String profile() {
		return profile;
	}
	
	@GetMapping("/user")
	public String user() {
		return userName;
	}
	
	@GetMapping("/host")
	public String host() throws UnknownHostException {
		return InetAddress.getLocalHost().getHostName();
	}
	
	
}
