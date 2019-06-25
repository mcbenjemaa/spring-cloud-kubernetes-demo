package com.github.medmedchiheb;

import java.net.UnknownHostException;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author benjemaam
 */

/*
 * in dev, forward port of specified pod or kubectl proxy
 * 
 * @FeignClient(name = "get-service", url="http://localhost:8000/")
 */
@FeignClient(name = "get-service")
public interface GetService {

	@GetMapping("/get")
	public GetDTO get();

	@GetMapping("/host")
	public String host() throws UnknownHostException;

	@GetMapping("/user-host")
	public String userHost() throws UnknownHostException;
	
	
}
