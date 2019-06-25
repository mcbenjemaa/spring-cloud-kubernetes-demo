package com.github.medmedchiheb;

import java.net.UnknownHostException;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author benjemaam
 */

/* in dev, forward port of specified pod or kubectl proxy
 * @FeignClient(name = "user-service", url="http://localhost:8000/")
 */
@FeignClient(name = "user-service")
public interface UserService {

	@GetMapping("/user")
	public String user();

	@GetMapping("/host")
	public String host() throws UnknownHostException;
}
